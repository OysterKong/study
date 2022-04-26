<template>
  <div>
    <h1>username:{{username}}</h1>
    <h1>age:{{age+20}}</h1>
    <h1>myAddress:{{myAddress}}</h1>

  </div>
</template>

<script>

export default {
  props:{
    username:String,
    age:Number,
    myAddress:String
  }
}
</script>

<style>

</style>