package com.controller;



import com.util.StudentUtil;



import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "DeleteServlet",urlPatterns = "/DeleteServlet")

public class DeleteServlet extends HttpServlet {

    @Override

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String sno= req.getParameter("sno");

        StudentUtil.map.remove(sno);

        req.getRequestDispatcher("studentInfo.jsp").forward(req,resp);

    }



    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        doPost(req, resp);

    }

}