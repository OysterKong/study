<template>
  <div>
    <h1>{{msg}}</h1>
    <h1>{{username}}, {{age}}</h1>
    함수호출정보 {{sayEcho()}}<br>
    함수호출정보 {{test()}}<br>

  </div>
</template>

<script>
export default {
  props:{
    msg:String
  },
  data:function(){//로컬 데이터는 function으로 작성
    return{
      username:'홍길동',
      age:20
    }
  },
  ///////////////////////////////////////함수 작성
  methods:{
    sayEcho:function() {
      console.log("sayEcho실행=====");
      return this.username+"\t"+this.age;
    },
    test:function(){
       console.log("test=====");
       return this.username+"\t"+this.age;
    }
  }


}
</script>

<style>
  h3 {
    margin: 40px 0 0;
  }
  ul {
    list-style-type: none;
    padding: 0;
  }
  li {
    display: inline-block;
    margin: 0 10px;
  }
  a {
    color: #42b983;
  }
</style>