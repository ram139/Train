<%-- 
    Document   : Validation
    Created on : Feb 19, 2018, 4:54:14 PM
    Author     : Rameshver
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.sql.*" %>
<%
  String str1=request.getParameter("uname");
  String str2=request.getParameter("psw");
  
%>  

<%
  if(str1.equals("ram") && str2.equals("eshver"))
  {
      response.sendRedirect("Home.jsp");
      
  }
  else
  {
      response.sendRedirect("Invalid.html");
  }
%>
