<template>
  <div id="app">
    부모컴포넌트의 로컬 값 x: {{x}}, y:{{y}} <br>
    data z: {{z[0]}}<br>
    data k: {{k.aa}}<br>
    data p.username: {{p.getUsername()}}<br>
    data p.age: {{p.getAge()+1}}<br>

   자식컴포넌트 <HelloWorld username="홍길동" v-bind:age="10" my-address="서울"/>
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue';
import {Person} from "./components/Person";
export default {
  name: 'App',
  components: {
    HelloWorld
  },
  //로컬상태를 저장하는 data옵션은 반드시 함수로 지정해야 함(arrow함수도 가능)
  data:function(){
    return {
      x:"홍길동", 
      y:"100",
      z:[10,20,30],
      k:{aa:"hong", bb:30},
      p:new Person("aaa", 20)//Person.js import
      
      }  //yson object 형태로
  }
  // data:()=>{
  //   return {x:"홍길동", y:"100"}
  // }
}

</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
