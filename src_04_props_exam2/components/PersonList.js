import React, { Component } from "react";
import { Person } from "./Person"; /////////////////////////
export class PersonList extends Component {
  persons; //class안에 위치 this키로 접근
  render() {
    this.persons = this.props.xxx;
    return (
      <tbody>
        {this.persons.map(function (row, idx) {
          return <Person key={idx} yyy={row} yyy2={idx} />;
        })}
      </tbody>
    );
  }
}

//export default PersonList;
