import React, { Component } from "react";

export class Contact2 extends Component {
  render() {
    let { mesg, mesg2 } = this.props; //부모에게서 넘어오는 데이터를 한번에 받기
    return (
      <div>
        Contact2 <br />
        이름 : {mesg}
        <br />
        나이 : {mesg2}
        <br />
        <hr />
      </div>
    );
  }
}
