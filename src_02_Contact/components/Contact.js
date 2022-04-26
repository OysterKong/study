import React, { Component } from "react";

export class Contact extends Component {
  render() {
    //render부분은 화면에 뿌려지는 template 임
    return <div>Contact Component 홈페이지 </div>; //""없이 사용
  }
}

export class Contact2 extends Component {
  info() {
    return <h2>Contact2 Component 홈페이지 </h2>;
  }
  render() {
    return this.info();
  }
}
//두 컴포넌트를 app.js에서 임포트 화면에 추가
//export default Contect;
