<template>
  <div>
    <h1> HelloWorld {{msg}}, {{test}}</h1>

  </div>
</template>

<script>
export default {
  name:'HelloWorld',
  props:{
    msg:String,
    test:String,
  }
}
</script>

<style>

</style>