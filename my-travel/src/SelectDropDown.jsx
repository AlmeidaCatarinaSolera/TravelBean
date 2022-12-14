import React, { Component } from 'react';
import Select from 'react-select';


class SelectDropDownNumbers extends React.Component {
 
    render() {
      return (
        <div className="container">
          <div className="row">
            <div className="col-md-3"></div>
            <div className="col-md-6">
            <Select
            onChange={this.props.functionToRun}
        defaultValue={{label:"Click Load Origins", value: 1}}
        options={this.props.dropdownList.map((origin) => ({label: origin, value: 1}))}
        theme={(theme) => ({
         ...theme,
        borderRadius: 10,
        colors: {
         ...theme.colors,
         primary25: 'hotpink',
         primary: 'black',
      },
    })}
  />
            </div>
            <div className="col-md-4"></div>
          </div>
        </div>
      );
    }
   
  }

  export default SelectDropDownNumbers;