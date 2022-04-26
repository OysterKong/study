import React, { Component } from "react";
import { PersonList } from "./components/PersonList";
class App extends Component {
  //클래스 안에 선언
  persons = [
    //this키워드로 접근
    { name: "홍길동", age: 20 },
    { name: "이순신", age: 30 },
    { name: "유관순", age: 40 },
    { name: "강감찬", age: 50 },
  ];
  render() {
    return (
      <div>
        <table border="1">
          <thead>
            <tr>
              <td>번호</td>
              <td>이름</td>
              <td>나이</td>
            </tr>
          </thead>
          <PersonList xxx={this.persons}></PersonList>
          {/* tbody부분을 자식에서 구현 */}
        </table>
      </div>
    );
  }
}

export default App;
