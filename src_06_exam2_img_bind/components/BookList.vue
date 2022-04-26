<template>
    <div>
        <h1>도서목록 {{bookList.length}}</h1>
        <ul>
            <li v-for="book in bookList" v-bind:key="book.name">
                <!--v-bind:key="유일값" -->
                <img v-bind:src="require(`@/assets/image/${book.img}.jpg`)" />
                <!-- ` ` 주의 -->
            </li>
        </ul>
        <hr>

    </div>
</template>

<script>
export default {
    props:{
        bookList:Array //주의
    }
}
</script>

<style>

</style>