<template>
  <div class="all">
    <div align="center"><h1>欢迎注册</h1>
    </div>
    <div>
    <el-form ref="ruleForm"  :model="ruleForm" label-width="500px" status-icon :rules="rules" class="demo-ruleForm">
      <el-form-item label="用户名" prop="userName">
        <el-col :span="8">
          <el-input v-model="ruleForm.userName" maxlength="8"></el-input>
        </el-col>
      </el-form-item>
      <el-form-item label="密码" prop="pass">
        <el-col :span="8">
        <el-input type="password" v-model="ruleForm.passWord" maxlength="10" autocomplete="off"></el-input>
        </el-col>
      </el-form-item>
      <el-form-item label="确认密码" prop="checkPass">
        <el-col :span="8">
        <el-input type="password" v-model="ruleForm.checkPass" maxlength="10" autocomplete="off"></el-input>
        </el-col>
      </el-form-item>
      <el-form-item label="注册">
          <el-button :plain="true" @click="submitForm('ruleForm')" type="'primary">立即注册</el-button>
<!--        <el-button type="success" icon="el-icon-check" circle v-on:click="register('ruleForm')" :plain="true"></el-button>-->
<!--        <el-button @click="resetForm('ruleForm')">重置</el-button>-->
      </el-form-item>
      <el-form-item label="重置">
        <el-button @click="resetForm('ruleForm')">重置</el-button>
      </el-form-item>
    </el-form>
    </div>
  </div>
</template>

<script>
  export default {
    name: "Register",
    data() {
      var validateUserName = (rule, value, callback) => {
        if (value === '')
        {
          return callback(new Error('用户名不能为空'));
        }
        else
        {
          callback();
        }
      };
      var validatePass = (rule, value, callback) => {
        if (value === '')
        {
          callback(new Error('请输入密码'));
        }
        else
        {
          if (this.ruleForm.checkPass !== '')
          {
            this.$refs.ruleForm.validateField('checkPass');
          }
          callback();
        }
      };
      var validatePass2 = (rule, value, callback) => {
        if (value === '')
        {
          callback(new Error('请再次输入密码'));
        }
        else if (value !== this.ruleForm.passWord)
        {
          callback(new Error('两次输入密码不一致!'));
        }
        else
        {
          callback();
        }
      };
      return {
        ruleForm: {
          userName: '',
          passWord: '',
          checkPass: ''
        },
        rules: {
          userName: [
            {validator: validateUserName, trigger: 'blur'}
          ],
          passWord: [
            {validator: validatePass, trigger: 'blur'}
          ],
          checkPass: [
            {validator: validatePass2, trigger: 'blur'}
          ]
        }
      }
    },
    methods: {
      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            this.$message({
              message:"注册成功",
              type:"success"
            });
            this.$router.push({name:"login",params:{userName:this.ruleForm.userName}});
          } else {
            console.log('error register!!');
            return false;
          }
        });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }
    }
  }
</script>

<style scoped>
  .all{
    background-image: url("../../image/1.jpg");
    animation-name: login-animation; /*添加动画名称*/
    animation-duration: 10s; /*动画执行时间*/
    animation-delay:2s; /*动画延时时间*/
    animation-iteration-count: infinite; /*动画播放次数*/
    animation-play-state: running;
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

  /*添加动画属性*/
  @keyframes login-animation {
    0%{background: url("../../image/1.jpg")}
    35%{background: url("../../image/2.jpg")}
    60%{background: url("../../image/3.jpg")}
    100%{background:url("../../image/4.jpg")}
  }
</style>
