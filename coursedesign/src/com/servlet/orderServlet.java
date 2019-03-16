package com.servlet;

import Dao.SqlDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * @author 51915
 */
@WebServlet(name = "orderServlet")
public class orderServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String []arr=request.getParameterValues("boxes");
        Date date=new Dao.SqlDao().getSqlTime();
        String no1= (String) request.getSession().getAttribute("no");
        request.getSession().setAttribute("date",date);
        SqlDao sqlDao=new SqlDao();
        sqlDao.order(arr,no1);
        request.getSession().setAttribute("my",arr);
        request.getRequestDispatcher("diancanzhuye.jsp").forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
    }
}
