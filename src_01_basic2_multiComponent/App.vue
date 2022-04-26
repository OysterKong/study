<template>
  <div >   
    <HelloWorld msg="HelloWorld.vue" test="abc"/>
    <Happy  msg="Happy.vue"/>
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue';
import Happy from './components/Happy.vue';

export default {
  name: 'App',
  components: {
    HelloWorld,
    Happy//추가
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
