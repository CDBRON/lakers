package com.controller;



import com.util.StudentUtil;



import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "UpdateServlet",urlPatterns = "/UpdateServlet")

public class UpdateServlet extends HttpServlet {

    @Override

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String sno=req.getParameter("sno");

        String password=req.getParameter("password");

        String name=req.getParameter("name");

        StudentUtil.map.get(sno).setName(name);

        StudentUtil.map.get(sno).setPassword(password);

        req.getRequestDispatcher("studentInfo.jsp").forward(req,resp);

    }



    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        doPost(req, resp);

    }

}