import React, { Component } from "react";
import { Contact } from "./components/Contact";
class App extends Component {
  render() {
    const persons = [
      { name: "홍길동", age: "10" },
      { name: "이순신", age: "20" },
      { name: "강감찬", age: "30" },
    ];
    //1. arrow사용안함
    var personTag = persons.map(function (row, idx) {
      return (
        <div key={idx}>
          {row.name}:{row.age}
        </div>
      );
    });
    var personTag2 = persons.map((row, idx) => {
      return (
        <div key={idx + 11}>
          {row.name}:{row.age}
        </div>
      );
    });

    return (
      <div>
        <Contact />
        <br />
        {personTag}
        <br />
        {personTag2}
      </div>
    );
  }
}

export default App;
