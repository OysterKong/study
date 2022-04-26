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
    var personTag = persons.map((row, idx) => {
      return <li key={`tl_${idx}`}>{row.name}</li>;
      //유일한 키값을 `` 이용 조합하여 문자열로 생성
    });
    var personTag2 = persons.map((row, idx) => {
      return <li key={idx}>{row.name}</li>;
    });
    return (
      <div>
        <Contact username="test" />
        <ul>{personTag}</ul>
        <hr />
        <ul>{personTag2}</ul>
      </div>
    );
  }
}

export default App;
