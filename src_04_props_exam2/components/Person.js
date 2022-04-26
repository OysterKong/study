import React, { Component } from "react";

export class Person extends Component {
  person; //this키로 접근
  render() {
    this.person = this.props.yyy;
    return (
      <tr key={this.props.yyy2}>
        <td>{this.props.yyy2 + 1}</td>
        <td>{this.person.name}</td>
        <td>{this.person.age}</td>
      </tr>
    );
  }
}

//export default Person;
