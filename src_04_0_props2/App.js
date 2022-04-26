import React, { Component } from "react";
import { Contact } from "./components/Contact";
import { Contact2 } from "./components/Contact2";
class App extends Component {
  render() {
    //

    return (
      <div>
        <Contact mesg="홍길동" mesg2="10" />
        <Contact2 mesg="이순신" mesg2="20" />
      </div>
    );
  }
}

export default App;
