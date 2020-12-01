import React, { Component } from 'react';
import { Switch, Route } from 'react-router-dom';

import './App.css';
import Navbar from './components/Navbar/Navbar';
import Clases from './components/Clases/Clases';
import Clase from './components/Clase/Clase';
import Foro from './components/Foro/Foro';

class App extends Component {

  render() {
    return (
      <div>
        <Navbar />

        <Switch>
          <Route path="/clases" component={Clases} />
          <Route path="/clases/clase/:id" component={Clase} />
          <Route path="/sabias-que" />
          <Route path="/foro" component={Foro} />
          <Route path="/" />
        </Switch>
      </div>
    )
  };
}

export default App;
