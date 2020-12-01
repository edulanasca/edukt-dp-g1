import React, { Component } from 'react'

import './Clase.css';
import Arrow from '../Arrow/Arrow';

import GIF01 from '../../assets/GIF01.gif'
import GIF02 from '../../assets/GIF02.gif'
import GIF03 from '../../assets/GIF03.gif'
import GIF04 from '../../assets/GIF04.gif'
import GIF05 from '../../assets/GIF05.gif'
import GIF06 from '../../assets/GIF06.gif'
import GIF07 from '../../assets/GIF07.gif'
import GIF08 from '../../assets/GIF08.gif'
import GIF09 from '../../assets/GIF09.gif'
import GIF10 from '../../assets/GIF10.gif'
import GIF11 from '../../assets/GIF11.gif'
import GIF12 from '../../assets/GIF12.gif'
import GIF13 from '../../assets/GIF13.gif'
import GIF14 from '../../assets/GIF14.gif'

class Clase extends Component {
	state = {
		contenido: [],
		counter: 0,
		images: [GIF01, GIF02, GIF03, GIF04, GIF05, GIF06, GIF07, GIF08, GIF09, GIF10, GIF11, GIF12, GIF13, GIF14]
	}

	componentDidMount() {
		if (this.props.location.contenido) {
			this.setState({ ...this.state, contenido: [...this.props.location.contenido] });
		} else {
			this.props.history.push('/clases');
		}
	}

	handleNextSeccion = () => {
		if (this.state.counter < 14) {
			this.setState({ ...this.state, counter: this.state.counter + 1 });
		}
	}

	handlePrevSeccion = () => {
		if (this.state.counter > 0) {
			this.setState({ ...this.state, counter: this.state.counter - 1 });
		}
	}

	handleNextClass = () => {
		this.props.history.push(`/clases`)
	}

	render() {
		if (!this.state.contenido.length) {
			return (<h1>Cargando</h1>);
		}

		return (
			<div className="container">
				<div className='clase'>
					{this.state.counter === 14 ? (<div className="congrats-container"><p className="texto congrats">🎉🎉 FELICIDADES FINALIZASTE LA CLASE 🎉🎉</p></div>) : (<div className="infoContainer">
						{this.state.counter < 14 && <div className="container-img mb-4 "><img src={this.state.images[this.state.counter]} alt="" /></div>}

						<p className="texto">{this.state.contenido[this.state.counter].contenido}</p>
					</div>)}


					<Arrow clicked={this.handlePrevSeccion} direccion="left" disable={this.state.counter === 0 ? 'disable' : ''} />
					<Arrow clicked={this.handleNextSeccion} direccion="right" disable={this.state.counter === 14 ? 'disable' : ''} />

					{this.state.counter === 14 ?
						<button className="btn btn-outline-primary next" onClick={this.handleNextClass}>Regresar a todas las clases</button>
						: null}
				</div>

			</div>
		)
	}
}

export default Clase
