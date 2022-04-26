import React, { Component } from "react";

export class Contact extends Component {
  render() {
    const username = this.props.username; //부모에게서 넘어오는 데이터 속성명으로받기
    return <div>Contact {username}</div>;
  }
}
