package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
    private String agent;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*String str1=request.getMethod() ;
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
        }*/
        String agent = request.getHeader("user-agent");
        if (agent.contains("Chrome")) {
            System.out.println("google");

        } else if(agent.contains("UC")){
                System.out.println("UC");
        }
        String refer=request.getHeader("referer");
        response.setContentType("text/html;charset=utf-8");
        if (refer!=null){
        if (refer.contains("localhost:8080/Test")){
            System.out.println("正常访问连接");
            response.getWriter().write("正常访问来源");
                }else {
            System.out.println("非法访问来源!!");
            response.getWriter().write("非法访问来源");

        }
            }
        }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
