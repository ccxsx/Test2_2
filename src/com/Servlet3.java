package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/Servlet3")
public class Servlet3 extends HttpServlet {
    private String agent;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedReader br=request.getReader();
        String str1=null;
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("safe❤");

        while ((str1=br.readLine())!=null){
//            Boolean str2=br.read();
            System.out.println("safe");
            response.getWriter().write("safe❤"+str1);
            System.out.println(str1);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
