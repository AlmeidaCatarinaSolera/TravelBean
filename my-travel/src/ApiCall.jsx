import Button from './Button.jsx';
import React, {useState} from 'react';
import SelectDropDown from './SelectDropDown';
import SelectDropDownNumbers from './SelectDropDownNumbers';
import {Routes, Route, useNavigate} from 'react-router-dom';
import './App.css';



const ApiCall = () => {
    const [apiResponse, setApiResponse] = useState(null)
    const [origin, setOrigin] = useState(null)
    const [destination, setDestination] = useState(null)
    const [passengers, setPassengers] = useState(0)
    const [luggage, setLuggage] = useState(0)
    const [countryList, setCountryList] = useState([])
    const [price, setPrice] = useState([])
    const [routeText, setRouteText] = useState('')
    const[submitting, setSubmitting] = useState(false);

    const navigate = useNavigate();

    const loadApi = () => {
            
        const url = "http://localhost:8080/origins" 
        fetch(url)
        .then (response => response.json())
        .then (data => {
            setCountryList(data)
        })
        .then (() => {
            console.log(countryList);
        return apiResponse;
    })
};


    const handleSubmit = event => {
        fetch(`http://localhost:8080/price?origin=${origin["label"]}&destination=${destination["label"]}`)
        .then(response => response.json())
        .then(data => {
            setPrice(data)
        })
        .then(() => {
            console.log(price)
        }
        )

        event.preventDefault();
        setSubmitting(true);
        setTimeout(() => {
        setSubmitting(false);
        }, 4000)
    }; 

    const navigateToReservation = () => {
        navigate(`/flightReservation`, {
            state: {
              flightPrices: price.map((eachPrice) => (eachPrice.split(",")[0] + " flight - " + parseFloat(parseFloat(eachPrice.split(",")[1]) * parseFloat(passengers["label"]) + parseFloat(50) * parseFloat(luggage["label"])))),
              flightOrigin: origin["label"],
              flightDestination: destination["label"],
              flightPassengers: passengers,
              flightLuggage: luggage
            }
          })
    }
 
    return (

        
        <div className='Home'>
            <div className='buttons'>
            <Button content = 'Origin' functionToRun = {loadApi} buttonText = 'Load Origins'></Button>
            </div>
            <div>
                <p></p>
                <p>Select your origin</p>
            <div className='dropDown'>
                 <SelectDropDown content = 'Origin' functionToRun = {setOrigin} dropdownList = {countryList}></SelectDropDown>
             </div>
                 
            </div>
                <p>Select your destination</p>
            <div className='dropDown'>
                <SelectDropDown content = 'Destination' functionToRun = {setDestination} dropdownList = {countryList}></SelectDropDown>
            </div>

            <p> Number of passengers</p>
            <div className='dropDown'>
                <SelectDropDownNumbers content = 'Destination' functionToRun = {setPassengers} dropdownList = {countryList}></SelectDropDownNumbers>
            </div>

            <p> Additional luggage</p>
            <div className='dropDown'>
                <SelectDropDownNumbers content = 'Destination' functionToRun = {setLuggage} dropdownList = {countryList}></SelectDropDownNumbers>
            </div>
                <br></br>
            <div className='buttons'>
                 <Button content = 'Destination' functionToRun = {handleSubmit} buttonText = 'Confirm Route'></Button>
                 <div className='buttons'>
                    <br></br>
                 <Button content = 'Reservation' functionToRun = {navigateToReservation} buttonText = 'Find Flights'></Button>
                 </div>

                 {submitting && 
        <div>Searching flights...</div>
          }
                 
            </div>
            
        </div>
    )}

export default ApiCall;