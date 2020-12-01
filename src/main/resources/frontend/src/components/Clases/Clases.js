import React, { Component } from 'react';
import { Link } from 'react-router-dom'

import './Clases.css';

class Clases extends Component {
	state = {
		temas: []
	}

	componentDidMount() {
		fetch('http://localhost:8080/edukt/CTA1G')
			.then(res => res.json())
			.then(data => {
				const { temaCTAPrimerGradoes } = data._embedded;
				console.log(temaCTAPrimerGradoes)
				this.setState({ ...this.state, temas: [...temaCTAPrimerGradoes] });
			})
			.catch(error => error);
	}

	render() {
		if (!this.state.temas.length) {
			return <div className="container"><h3>Cargando...</h3></div>;
		}

		return (<div className="container">
			<h3 className="mb-4">Clases</h3>

			<div className="cards-contenedor">
			{this.state.temas.map((tema, index) => (
				<div key={index} className="card">
					<div className="card-body">
						<h5 className="card-title">{tema.titulo}</h5>
						<p className="card-text">{tema.descripcion}</p>
						<Link to={{pathname: `/clases/clase/${index}`, contenido: tema.secciones, siguienteId: (index + 1)}} className="card-link">Ir a la clase</Link>
					</div>
				</div>
			))}
			</div>
		</div>
		)
	}
}

export default Clases
