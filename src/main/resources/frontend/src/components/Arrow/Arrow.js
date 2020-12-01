import React, { Component } from 'react';

import './Arrow.css';

class Arrow extends Component {
	render() {
		return (
			<i onClick={this.props.clicked} className={`fas fa-play arrow arrow-${this.props.direccion} ${this.props.disable}`}></i>
		)
	}
}

export default Arrow;
