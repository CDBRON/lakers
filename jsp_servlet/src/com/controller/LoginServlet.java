package com.controller;


import com.entity.Student;
import com.util.StudentUtil;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet",urlPatterns = "/LoginServlet")

public class LoginServlet extends HttpServlet {

    @Override

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String sno=req.getParameter("sno");

        String password=req.getParameter("password");

        Student s=new Student(sno,password,null);

        boolean b=StudentUtil.log(s);

        if(b==true)
        {       ServletContext a=this.getServletContext();
                Object o=a.getAttribute("count");
               if(o==null)
               {
                   a.setAttribute("count",1);
               }
               else
                   {
                   int count=Integer.parseInt(o.toString());
                   a.setAttribute("count",count+1);
               }
               HttpSession se=req.getSession();
               se.setAttribute("sno",sno);
               req.setAttribute("sno",sno);
               req.getRequestDispatcher("studentInfo.jsp").forward(req,resp);
        }
        else
            { req.getRequestDispatcher("error.jsp").forward(req,resp);
            }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}