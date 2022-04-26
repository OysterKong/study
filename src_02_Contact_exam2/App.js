import React, { Component } from "react";
import { Contact } from "./components/Contact"; //////////////
import { ContactList } from "./components/ContactList"; //////////////
class App extends Component {
  render() {
    return (
      <div>
        <Contact />
        <ContactList />
      </div>
    );
  }
}

export default App;
