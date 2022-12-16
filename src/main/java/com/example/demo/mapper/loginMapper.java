package com.example.demo.mapper;

import com.example.demo.entity.login;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface loginMapper {

    @Select("select * from admin where username=#{username} and password=#{password}")
    login enter(String username, String password);

}
