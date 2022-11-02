import Button from './Button.jsx';
import React, {useState} from 'react';
import SelectDropDown from './SelectDropDown';
import {Routes, Route, useNavigate, useLocation} from 'react-router-dom';



const FlighReservation = () => {
    const location = useLocation()
    return(<div>
        <h1> Welcome to Flight Reservation page</h1>
        <p>{location.state}</p>
    </div>)
}

export default FlighReservation;