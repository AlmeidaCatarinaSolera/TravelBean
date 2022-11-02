import React, {useState, setState} from 'react'

const Button = (props) => {
    return (<button onClick={props.functionToRun}>{props.buttonText}</button>) 

}

export default Button; 