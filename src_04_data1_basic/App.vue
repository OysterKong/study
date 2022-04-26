<template>
  <div id="app">
    부모컴포넌트의 로컬 값 x: {{x}}, y:{{y}} <br>
    <HelloWorld username="홍길동" v-bind:age="10" my-address="서울"/>
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'

export default {
  name: 'App',
  components: {
    HelloWorld
  },
  //로컬상태를 저장하는 data옵션은 반드시 함수로 지정해야 함(arrow함수도 가능)
  data:function(){
    return {x:"홍길동", y:"100"}  //yson object 형태로
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
