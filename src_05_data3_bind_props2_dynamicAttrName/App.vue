<template>
  <div id="app">
    부모컴포넌트의 로컬 값 x: {{x}}, y:{{y}},z:{{z}} <br>
   
<!-- 자식에게 로컬 data 값을 전달하기 위해 v-bind를 사용함 
  v-bind:속성명="변수명"
-->
   자식컴포넌트 <HelloWorld  v-bind:[attributeName]="x" v-bind:age="y" :arr="z"
   
   />
  <!-- <HelloWorld v-bind:username="x"   v-bind:age="y" :arr="z"/>  와동일 -->
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue';
export default {
  name: 'App',
  components: {
    HelloWorld
  },
  data:function(){
    return {
      x: "홍길동",
      y:20,
      z:[100,200,300],
      attributeName:"username"//속성명으로 사용추가,
          }
  }

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
