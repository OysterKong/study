<template>
<div>
    <h1>Happy{{msg}}</h1> <!--데이터의 사용 -->
</div>
  
</template>

<script>
export default {
   name:'Happy',
   props:{
       msg:String   //부모에서 넘겨오는 데이터 
   }
}
</script>

<style>

</style>