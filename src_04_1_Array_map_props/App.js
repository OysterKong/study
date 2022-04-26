import React, { Component } from "react";
import { Contact } from "./components/Contact";
class App extends Component {
  render() {
    const persons = [
      { name: "홍길동", age: "10" },
      { name: "이순신", age: "20" },
      { name: "강감찬", age: "30" },
    ];
    //
    var personTag = persons.map((row) => {
      return <Contact username={row.name} />;
    });

    return (
      <div>
        <br />
        {personTag}
        <br />
      </div>
    );
  }
}

export default App;
