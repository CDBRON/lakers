<template>
  <div>
    <el-container>
      <el-header><p align="right">用户名：{{this.$route.params.userName}}</p></el-header>
    </el-container>
    <div align="center">
      <h1>MainPage</h1>
    </div>
  </div>
</template>

<script>
    export default {
        name: "MainPage"
    }
</script>

<style scoped>
  .el-header{
    background-color: gold;
    color: #333;
    text-align: center;
    line-height: 10px;
  }
</style>
