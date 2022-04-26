<template>
  <div>
  <h1>username:{{username}}</h1>
  <h1>age:{{age}}</h1>
  <h1>myAddress:{{myAddress}}</h1>
 

  </div>
</template>

<script>
export default {
props:{
  username:String,
  age:{
    type:Number,
    default:100
  },
  myAddress:{
    type:String,
    default:"제주"
  }
}
}
</script>

<style>

</style>