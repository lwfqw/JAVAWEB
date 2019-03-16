package com.servlet;

import Dao.SqlDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "Servletchangemenu")
public class Servletchangemenu extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           String no= (String) request.getSession().getAttribute("no");
           Date date= (Date) request.getSession().getAttribute("date");
           new SqlDao().changeZhuangtai(date,no);
           request.getRequestDispatcher("diancanzhuye.jsp").forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doPost(request,response);
    }
}
