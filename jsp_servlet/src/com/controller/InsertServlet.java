package com.controller;



import com.entity.Student;

import com.util.StudentUtil;



import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "InsertServlet",urlPatterns = "/InsertServlet")

public class InsertServlet extends HttpServlet {

    @Override

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String sno=req.getParameter("sno");

        String password=req.getParameter("password");

        String name=req.getParameter("name");

        StudentUtil.map.put(sno,new Student(sno,password,name));

        req.getRequestDispatcher("studentInfo.jsp").forward(req,resp);

    }



    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        doPost(req, resp);

    }

}