import Button from './Button.jsx';
import React, {useState} from 'react';
import {Routes, Route, useNavigate, useLocation, useParams} from 'react-router-dom';
import './App.css';


const PassengerForm = () => {

    const location = useLocation();
    const {origin} = useParams();
    const[submitting, setSubmitting] = useState(false);
    const[clientName, setname] = useState(null);
    const[clientSurName, setsurName] = useState(null);
    const[clientNationality, setnationality] = useState(null);
    const[clientNif, setnif] = useState(null);
    const[clientAge, setage] = useState(null);


    const handleSubmit = event => {
        event.preventDefault();
        setSubmitting(true);
        setTimeout(() => {
        setSubmitting(false);
        }, 4000)
    };

    const passengerForm = () => {
            
        const url = "http://localhost:8095/passenger" 
        
        fetch(url, { 
          method: 'POST',  
          headers: {'Content-Type':'application/json'},
          body: JSON.stringify({
          'name': clientName,
          'surName': clientSurName,
          'nationality': clientNationality,
          'nif': clientNif,
          'age': clientAge}) 
          })
};


    return(

    <div>
        <h1> Passenger Information</h1>
        <p>{location.state}</p>

        <div className='wrapper'>
        <h5>Fill this form with your personal data to proceeed with the reservation</h5>
          {submitting && 
        <div>Submitting Form...</div>
          }
        <form onSubmit={handleSubmit}>
          <fieldset>
            <label>
              <p>Name</p>
              <input name = "name" onChange={setname}></input>
              <p></p>
              <p>Surname</p>
              <input name = "surName" onChange={setsurName}></input>
              <p></p>
              <p>Nationality</p>
              <input name = "nationality" onChange={setnationality} ></input>
              <p></p>
              <p>NIF</p>
              <input name = "nif" onChange={setnif}></input>
              <p></p>
              <p>Age</p>
              <input name = "age" onChange={setage}></input>
            </label>
          </fieldset>
          <Button type='submit' buttonText = 'Submit form' functionToRun = {passengerForm}></Button>
        </form>
       </div>


    </div>
    )}

    export default PassengerForm;





    
