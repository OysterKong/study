<template>
    <div>
      <h1>username: {{username}}</h1>
      <h1>age: {{age}}</h1>
      <h1>myAddress: {{myAddress}}</h1>
    </div>
</template>

<script>
export default {
 // props:["username", "age", "myAddress"],
 props:{
   username:String,
   age:String,
  //  my-address:String   //카멜표기를 사용해야 함
  myAddress:String
  }
}
</script>

<style>

</style>