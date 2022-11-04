import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import ApiCall from './ApiCall';
import FlightReservation from './FlightReservation';
import React from 'react';
import { BrowserRouter as Router, Routes, 
  Route, Navigate, Link, Navigation} from "react-router-dom";
import airplane from './airplane.png'
import PassengerForm from './PassengerForm';

function App() {
  

  return (
    <Router>
    <div className="TravelBA">

      <header className="App-header">
      <img src={airplane} height="100"></img>
        <div>
          <h2 className='AppName'> Travel Bean</h2> 
          <h5> Flights to Europe </h5>
        </div>
       <div className="Api">
       <Routes>
       <Route path={"/"} exact element={<ApiCall />} />
       <Route path="/flightReservation" exact element={<FlightReservation />} />
       <Route path="/passenger" exact element={<PassengerForm />} />
       </Routes>
        </div>
        
      </header>
    </div>
    </Router>
  );
}

export default App;
