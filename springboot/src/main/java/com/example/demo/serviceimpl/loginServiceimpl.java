package com.example.demo.serviceimpl;

import com.example.demo.entity.login;
import com.example.demo.mapper.loginMapper;
import com.example.demo.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginServiceimpl implements loginService {

    @Autowired
    private loginMapper loginMapper;
    @Override
    public login enter(String username, String password) {
        return loginMapper.enter(username,password);
    }
}
