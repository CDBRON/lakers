<template>
  <div class="orderbackground">
    <h1>订单管理</h1>
    <router-link to="add">添加订单</router-link>
    <router-link to="edit">修改订单</router-link>
    <router-link to="delete">删除订单</router-link>
    <router-view></router-view>
    <input type="text" v-model:value="userName">
    <el-button icon="el-icon-search" circle></el-button>
    <el-button type="primary" icon="el-icon-edit" circle></el-button>
    <el-button type="success" icon="el-icon-check" @click="onDeleteOrder" circle></el-button>
    <el-button type="info" icon="el-icon-message" circle></el-button>
    <el-button type="warning" icon="el-icon-star-off" circle></el-button>
    <el-button type="danger" icon="el-icon-delete" @click="onDeleteOrder" circle></el-button>
  </div>
</template>

<script>
  export default {
    name: "OrderManager",
    data:function(){
      return{
        userName:""
      }
    },
    methods:{
      onDeleteOrder:function () {
            this.$message({
              message:"修改成功",
              type:"success"
            });
            // this.$router.push("/")
            this.$router.push({name:"home",params:{userName:this.userName}})
      }
    }
  }
</script>

<style scoped>
  .el-row {
    margin-bottom: 20px;
  }
  .el-col {
    border-radius: 4px;
  }
  .bg-purple-dark {
    background: #99a9bf;
  }
  .bg-purple {
    background: #d3dce6;
  }
  .bg-purple-light {
    background: #e5e9f2;
  }
  .grid-content {
    border-radius: 4px;
    min-height: 36px;
  }
  .row-bg {
    padding: 10px 0;
    background-color: #f9fafc;
  }
  .orderbackground{
    background-image: url("../../image/3.jpg");
    position:fixed;
    top: 0;
    left: 0;
    width:100%;
    height:100%;
    min-width: 1000px;
    z-index:-10;
    zoom: 1;
    background-color: #fff;
    background-repeat: no-repeat;
    background-size: cover;
    -webkit-background-size: cover;
    -o-background-size: cover;
    background-position: center 0;
  }
</style>
