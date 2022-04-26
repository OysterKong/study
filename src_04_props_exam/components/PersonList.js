import React, { Component } from "react";

export class PersonList extends Component {
  persons; //class안에 위치 this키로 접근
  render() {
    this.persons = this.props.xxx;
    return (
      <tbody>
        {this.persons.map(function (row, idx) {
          return (
            <tr key={idx}>
              <td>{idx + 1}</td>
              <td>{row.name}</td>
              <td>{row.age}</td>
            </tr>
          );
        })}
      </tbody>
    );
  }
}

//export default PersonList;
