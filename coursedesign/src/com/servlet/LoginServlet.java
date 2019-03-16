package com.servlet;

import Dao.SqlDao;
import org.apache.catalina.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * @author 51915
 */
@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    public LoginServlet(){
        super();
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;" + "charset=UTF-8");
        String no=request.getParameter("no");
        String pass=request.getParameter("password");
        SqlDao sqlDao=new SqlDao();
        PrintWriter out=response.getWriter();
        try {
            if(sqlDao.getSelect(no,pass)){
                out.write("<h1>success</h1>");
                out.println("正在进入主页.......");
                request.getSession().setAttribute("no",no);
                if(sqlDao.getWorkSelect(no,pass)){
                    request.getRequestDispatcher("Work.jsp").forward(request,
                            response);
                }else{
                request.getRequestDispatcher("diancanzhuye.jsp").forward(request,
                        response);}
            }else {
                out.write("<h1>fail</h1>");
                response.sendRedirect("index.jsp");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
               doPost(request,response);
    }
}
