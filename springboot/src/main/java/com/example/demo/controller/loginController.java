package com.example.demo.controller;


import com.example.demo.entity.ApiResult;
import com.example.demo.entity.login;
import com.example.demo.serviceimpl.loginServiceimpl;
import com.example.demo.util.ApiResultHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {
    @Autowired
    private loginServiceimpl loginServiceimpl;


    @PostMapping("/login")
    public ApiResult en(@RequestBody login Login)
    {
        String username=Login.getUsername();
        String password=Login.getPassword();
        login result=loginServiceimpl.enter(username,password);
        if(result!=null)
        {
            System.out.println("访问成功！");
            return ApiResultHandler.buildApiResult(200,"请求成功",result);
        }
        else
        {
            System.out.println("访问失败!");
            return ApiResultHandler.buildApiResult(400,"请求失败",null);
        }
    }
}
