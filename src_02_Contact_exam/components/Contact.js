import React, { Component } from "react";
import { ContactList } from "./ContactList";

export class Contact extends Component {
  render() {
    //render부분은 화면에 뿌려지는 template 임
    return (
      <div>
        <h1>Contact Component 홈페이지</h1>
        <ContactList />
      </div>
    );
  }
}
