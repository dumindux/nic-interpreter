<%@page import="cse.maven.sample.NICInformation"%>
<%@page import="org.joda.time.DateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
       <!-- <h1>Hello World!</h1>-->
        <h1 align="center"><u>NIC information</u></h1>
        <h4 align="center">
        <%
            try{
                String date=request.getParameter("NIC");
                NICInformation nicInfo=new NICInformation(date);
                DateTime birthday=nicInfo.birthday();
                out.println("Birthday: "+birthday.getDayOfMonth()+"\\"+birthday.getMonthOfYear()+"\\"+birthday.getYear());
            
          //  out.println(
        %>
        <br>
        <%
            boolean isMale=nicInfo.isMale();
            if(isMale)
                out.println("Gender: Male");
            else
                out.println("Gender: Female");
        %>
        <br>
        <%
            boolean isVoter=nicInfo.isVoter();
            if(isVoter)
                out.println("Is voter: Yes");
            else
                out.println("Is voter: No");
            }
            catch(Exception e)
            {
                out.println("Enter a valid NIC number");
            }
        %></h4>
    </body>
</html>
