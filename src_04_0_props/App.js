import React, { Component } from "react";
import { Contact } from "./components/Contact";
class App extends Component {
  render() {
    var name = "홍길동";
    //

    return (
      <div>
        <br />
        <Contact username={name} />
        <br />
      </div>
    );
  }
}

export default App;
