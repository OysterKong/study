import React, { Component } from "react";

export class Contact extends Component {
  render() {
    //const username = this.props.username; //부모에게서 넘어오는 데이터 속성명으로받기
    let mesg2 = this.props.mesg2;
    return (
      <div>
        Contact <br />
        이름 : {this.props.mesg}
        <br />
        나이 : {mesg2}
        <br />
        <hr />
      </div>
    );
  }
}
