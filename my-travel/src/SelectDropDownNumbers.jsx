import React, { Component } from 'react';
import Select from 'react-select';


class SelectDropDown extends React.Component {
 
    render() {
      return (
        <div className="container">
          <div className="row">
            <div className="col-md-3"></div>
            <div className="col-md-6">
            <Select
            onChange={this.props.functionToRun}
        defaultValue={{label:"Not Set", value: 1}}
        options={[0,1,2,3,4,5].map((number) => ({label: number, value: 1}))}
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

  export default SelectDropDown;