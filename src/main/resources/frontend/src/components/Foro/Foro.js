import React, { Component } from "react";

import "./Foro.css";

class Foro extends Component {
  state = {
    author: "Big Dickson",
    commentText: "",
    cursoComment: "",
  };

  handleInputChange = (e) => {
    const target = e.target;
    const name = target.name;
    const value = target.value;

    this.setState({ ...this.state, [name]: value });
  };

  handleFormSubmit = (e) => {
    e.preventDefault();

    const data = { ...this.state };

		console.log(data);

    fetch("http://localhost:8080/edukt/publicaciones", {
			method: "POST",
      body: JSON.stringify(data),
    })
      .then((res) => res.json())
      .then((data) => {
        console.log(data);

        this.setState({ ...this.state, commentText: "", cursoComment: "" });
      })
      .catch((error) => console.log(error));
  };

  render() {
    return (
      <div className="container">
        <div className="mb-4">
          <div className="form-row mb-4">
            <div className="col-md-8 has-search">
              <span className="fa fa-search form-control-feedback"></span>
              <input
                type="text"
                className="form-control"
                placeholder="Buscar"
              />
            </div>

            <div className="col-md-2">
              <select name="" id="" className="form-control">
                <option value="">Grado</option>
              </select>
            </div>

            <div className="col-md-2">
              <select name="" id="" className="form-control">
                <option value="">Curso</option>
              </select>
            </div>
          </div>

          <table className="table table-bordered">
            <thead>
              <tr>
                <th scope="col">Pregunta</th>
                <th scope="col">Grado</th>
                <th scope="col">Curso</th>
                <th scope="col">Autor</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <th>¿Por qué el cielo es azul?</th>
                <td>1°</td>
                <td>CTA</td>
                <td>Karthus</td>
              </tr>
            </tbody>
          </table>
        </div>

        <form action="" onSubmit={this.handleFormSubmit}>
          <input type="hidden" value={this.state.author} />

          <div className="form-row justify-content-end">
            <div className="form-group col-md-12">
              <label htmlFor="comment-area" className="h4 mb-3">
                Pregunta algo 😁
              </label>
              <textarea
                className="form-control"
                name="commentText"
                id="comment-area"
                onChange={this.handleInputChange}
                rows="3"
                value={this.state.commentText}
              ></textarea>
            </div>

            <div className="col-md-3">
              <select
                name="cursoComment"
                className="form-control"
                onChange={this.handleInputChange}
                value={this.state.cursoComment}
              >
                <option value="" disabled>
                  Seleccione un curso
                </option>
                <option value="cta">Ciencia, Tecnología y Ambiente</option>
                <option value="ciencias_sociales">Ciencias Sociales</option>
                <option value="comunicacion">Comunicación</option>
                <option value="inglés">Inglés</option>
                <option value="matematicas">Matemáticas</option>
              </select>
            </div>

            <button type="submit" className="btn btn-primary">
              Publicar
            </button>
          </div>
        </form>
      </div>
    );
  }
}

export default Foro;
