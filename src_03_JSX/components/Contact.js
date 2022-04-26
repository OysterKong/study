import React, { Component } from "react";
import "./Contact.css"; //css임포트
/* 
  export와 exportDefault의 차이
  1. exportDefault는 모듈에서반드시 하나만 사용
    import시  import Contact from './Contact'
  2. export는 모듈에서 여러클래스 사용가능
    import 시 {Contact, Contact2} from './Contact'

*/
//1. jsx에서 변수값 선언은 함수 안, 태그에서 사용시 {}이용 , 반드시 root태그가 있어야 한다.
//""사용 안함
//rcc
export class Contact extends Component {
  render() {
    var mesg = "world "; //위치가 함수 안
    return (
      <div>
        <h1>
          {"Hello"}
          {mesg}&nbsp;{100}
        </h1>
      </div>
    );
  } //end render
} //end class

//2. jsx에서 자바스크립시 사용시 {}이용
export class Contact2 extends Component {
  render() {
    var myArr = ["A", "B", "c"];
    return (
      <div>
        <ul>
          {myArr.map(function (ele, idx) {
            console.log(ele, "\t", idx);
            return <li key={idx}>{ele}</li>;
          })}
        </ul>
      </div>
    );
  }
}
//2-1. 자바스크립트코드가 render밖에 있기 때문에 다양한 작업이 가능함
var myArr = ["A", "B", "C"]; //클래스 밖에 선언
function my() {
  return myArr.map(function (ele, idx) {
    return <li key={idx}>{ele}</li>;
  });
}
export class Contact21 extends Component {
  render() {
    return (
      <div>
        <ul>
          concat21 <br />
          {
            //자바스크립스 사용시 {} 사용
            my()
          }
        </ul>
      </div>
    );
  }
}
////////////////////////////
//3. jsx에서 spread연산자의 사용
export class Contact3 extends Component {
  render() {
    //변수 선언
    var attr = {
      href: "https://www.daum.net",
      target: "_blank",
    };
    return (
      <div>
        Contact3 <br />
        <a {...attr}>daum: {attr.href}</a>
      </div>
    );
  }
}
///////////////////////////////////////////
//4. jsx에서 멀티 node의 사용
export class Contact4 extends Component {
  render() {
    //변수 선언
    var multi = [<span key="_1">Hello1</span>, <span key="_2">Hello2</span>];
    return <div>{multi}</div>;
  }
}
////////////////////////////////////////////////
//5. jsx에서 이벤트 처리시 camel표기법 필수임
function myok() {
  //클래스 바깥에 선언 되고 this가 없이 사용 가능함
  console.log("myOk=======");
}
export class Contact5 extends Component {
  myok2() {
    console.log("Contact5.myok2()==========");
  }
  render() {
    return (
      <div>
        {/* 이벤트 처리시 카멜 표기법 준수 */}
        <button onClick={myok}>myok</button> &nbps;
        <button onClick={this.myok2}>myok2</button>
        {/* 클래스안의 함수는 this키 사용 */}
      </div>
    );
  }
}
////////////////////////////
//6. jsx에서 css는 className 속성명을 사용함  labe For => label htmlFor 속성명사용
export class Contact6 extends Component {
  render() {
    return (
      <div>
        <p className="xyz">hello-css 적용됨</p>
        <label htmlFor="myInput">hello2</label>
        <input type="text" name="myInput"></input>
      </div>
    );
  }
}
////////////////////////////////
//7. jsx에서는 style이 객체로 처리됨
//backgroundColor, fontSize, textAlign 같은 카멜 표기법 사용
export class Contact7 extends Component {
  render() {
    var myStyle = { fontSize: "50px", backgroundColor: "yellow" }; //함수내 사용
    return (
      <div>
        <p style={myStyle}>myStyle적용됨 1</p>
        <p style={{ fontSize: "30px", backgroundColor: "red" }}>
          style 직접 적용시킴
        </p>
      </div>
    );
  }
}
////////////////////////////////
//8. jsx주석은 {/*  */} 형식으로 사용
//반드시 container root태그 안에서 사용해야 함

export class Contact8 extends Component {
  render() {
    //root 태그 밖의 주석
    var myStyle = { fontSize: "50px", backgroundColor: "yellow" }; //함수내 사용
    return (
      <div>
        {/* ctrl k,c 이용 jsx 안의 주석임 */}
        <p style={myStyle}>myStyle적용됨 1</p>
        <p style={{ fontSize: "30px", backgroundColor: "red" }}>
          style 직접 적용시킴
        </p>
      </div>
    );
  }
}

//export default Contact;
