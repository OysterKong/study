<template>
  <div>
    <h1>username:{{username}}</h1>
    <h1>age:{{age+20}}</h1>
    <h1>myAddress:{{arr[0]}}</h1>

  </div>
</template>

<script>

export default {
  props:{
    username:String,
    age:Number,
    arr:Array
  }
}
</script>

<style>

</style>