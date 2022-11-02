import Button from './Button.jsx';
import React, {useState} from 'react';
import SelectDropDown from './SelectDropDown';
import {Routes, Route, useNavigate} from 'react-router-dom';



const ApiCall = () => {
    const [apiResponse, setApiResponse] = useState(null)
    const [origin, setOrigin] = useState(null)
    const [destination, setDestination] = useState(null)
    const [countryList, setCountryList] = useState([])
    const [price, setPrice] = useState(null)

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

    const loadSecondApi = () => {
        
    fetch(`http://localhost:8080/price?origin=${origin["label"]}&destination=${destination["label"]}`)
    .then(response => response.json())
        .then(data => {
            setPrice(data)
        })

    navigate("/flightReservation", {state:{origin: origin, destination:destination}})
    };
 
    return (

        
        <div>
            <Button content = 'Origin' functionToRun = {loadApi} buttonText = 'Load Origins'></Button>
            <div>
                <p>Select your origin</p>
                <div className='dropDown'>
                <SelectDropDown content = 'Origin' functionToRun = {setOrigin} dropdownList = {countryList}></SelectDropDown>
            </div>
                 
            </div>
            
           
            <p>Select your destination</p>
            <div className='dropDown'>
                <SelectDropDown content = 'Destination' functionToRun = {setDestination} dropdownList = {countryList}></SelectDropDown>
            </div>
            <p>
            </p>
            <div>
                 <Button content = 'Destination' functionToRun = {loadSecondApi} buttonText = 'Reservation'></Button>
            </div>
        </div>
    )
}

export default ApiCall;