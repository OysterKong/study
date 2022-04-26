<template>
    <div>
      <h1>username: {{username}}</h1>
      <h1>age: {{age+10}}</h1>
      <h1>myAddress: {{myAddress}}</h1>
      <h1>isMarried: {{isMarried}}</h1>
      <h1>isMarried2: {{isMarried2}}</h1>
      <h1>phones: {{phones[0]}}</h1>
      <h1>author: {{author.name}}</h1>
    </div>
</template>

<script>
export default {


 props:{
   username:String,
   age:Number,
  //  my-address:String   //카멜표기를 사용해야 함
  myAddress:String,
  isMarried:Boolean,
  isMarried2:Boolean,//주의
  phones:Array, //배열
  author:Object //객체
  }
}
</script>

<style>

</style>