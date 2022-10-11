<template>
  <div class="all">
      <h1 align="center">欢迎登录</h1>
      <div>
        <el-form ref="ruleForm" :model="ruleForm" label-width="500px" status-icon :rules="rules" >
          <el-form-item label="用户名" prop="userName">
            <el-col :span="8">
              <el-input v-model="ruleForm.userName" maxlength="8" type="text" placeholder="请输入用户名"></el-input>
            </el-col>
          </el-form-item>
          <el-form-item label="密码" prop="pass">
            <el-col :span="8">
              <el-input type="password" v-model="ruleForm.pass" maxlength="10" autocomplete="off" placeholder="请输入密码"></el-input>
            </el-col>
          </el-form-item>
          <el-form-item label="验证码：" prop="code">
            <el-col :span="6">
              <el-input type="text" v-model="ruleForm.code" placeholder="点击图片更换验证码"></el-input>
              <img :src="captchaUrl">
            </el-col>
          </el-form-item>
          <el-form-item>
              <el-checkbox v-model="checked">记住我</el-checkbox>
              <el-button type="primary" @click="submitForm">立即登录</el-button>
              <el-button @click="doRegister">注册账号</el-button>
          </el-form-item>
        </el-form>
      </div>
  </div>
</template>

<script>
  export default {
    name: "Login",
    data() {
      return {
        checked:true,
        captchaUrl:'d',
        ruleForm: {
          userName: '',
          pass: '',
          code:''
        },
        rules: {
          userName:[{required:true,message:'请输入用户名',trigger:'blur'}],
          pass:[{required:true,message:'请输入密码',trigger:'blur'}],
          code:[{required:true,message:'请输入验证码',trigger:'blur'}]
        }
      }
    },
    methods: {
      submitForm() {
        this.$refs.ruleForm.validate((valid) => {
          if (valid)
          { if(this.checked=='true')
               {
                 this.$message({
                   message:"登录成功",
                   type:"success"
                 });
                 this.$router.push({name:"home",params:{userName:this.ruleForm.userName}});
               }
             else
            {
              this.$message.error('请勾选记住我');
              return false;
             }
          } else {
            this.$message.error('请输入所有字段');
            return false;
          }
        });
      },
      doRegister(){
        this.$router.push({name:"register"});
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
