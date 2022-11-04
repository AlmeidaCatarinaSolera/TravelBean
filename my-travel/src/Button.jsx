import React, {useState, setState} from 'react'
import styled from "styled-components";

const Button = (props) => {
    const StyledButton = styled.button`
  background-color: lightblue;
  color: black;
  font-size: 20px;
  padding: 10px 60px;
  border-radius: 5px;
  margin: 10px 0px;
  cursor: pointer;
`;
    return (<StyledButton onClick={props.functionToRun}>{props.buttonText}</StyledButton>) 

}

export default Button; 