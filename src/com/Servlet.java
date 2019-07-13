package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String str1=request.getMethod() ;
        System.out.println(str1);
        str1=request.getContextPath();
        System.out.println(str1);
        str1=request.getServletPath();
        System.out.println(str1);
        str1=request.getQueryString();
        System.out.println(str1);
        str1=request.getRequestURI();
        System.out.println(str1);
        StringBuffer str2=request.getRequestURL();
        System.out.println(str2);
        str1=request.getProtocol();
        System.out.println(str1);
        str1=request.getRemoteAddr();
        System.out.println(str1);
        Enumeration<String> headerNames=request.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String name=headerNames.nextElement();
            request.getHeader(name);
            System.out.println("value=  "+name);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
