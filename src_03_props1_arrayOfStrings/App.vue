<template>
  <div id="app">
    <HelloWorld username="홍길동" age="20" my-address="서울"/>
    <!-- my-address같은 케밥표기법으로 넘기면 반드시 받는 쪽은 myAddress같은 
    카멜 표기법으로 받아야하마-->
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'

export default {
  name: 'App',
  components: {
    HelloWorld
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
