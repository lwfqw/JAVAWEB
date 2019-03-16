package com.servlet;

import Dao.SqlDao;
import Dao.order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 51915
 */
@WebServlet(name = "HistoryServlet")
public class HistoryServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        SqlDao sqlDao=new SqlDao();
        List<order> o=
                new ArrayList<>(sqlDao.getHistory((String) request.getSession().getAttribute("no")));
       request.setAttribute("history",o);
       request.getRequestDispatcher("Historydisplay.jsp").forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             doPost(request,response);
    }
}
