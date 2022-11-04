import Button from './Button.jsx';
import React, {useState} from 'react';
import SelectDropDown from './SelectDropDown';
import SelectDropDownNumbers from './SelectDropDownNumbers';
import {Routes, Route, useNavigate, useLocation, useParams} from 'react-router-dom';
import './App.css';



const FlighReservation = () => {

    const navigate = useNavigate();   
    const location = useLocation();
    let flightPrices = location.state.flightPrices;
    let flightOrigin = location.state.flightOrigin;
    let flightPassengers = location.state.flightPassengers;
    let flightLuggage = location.state.flightLuggage;
    let flightDestination = location.state.flightDestination;

const changeToForm = () => {
    navigate(`/passenger`)
};
    
    

    return(

    <div>
        
        <h1> Welcome to Flight Reservation page</h1>
        
        <p></p>
        {flightPrices.map((price) => (
            <Button buttonText = {`${price}€` } functionToRun = {changeToForm} key = {price}></Button>
        ))}

    </div>
    )}

export default FlighReservation;