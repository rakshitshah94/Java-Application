<%-- 
    Document   : adminHome
    Created on : Jan 7, 2016, 6:39:10 PM
    Author     : master
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modal.Logininfo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Admin Home!</h1>
        <%
            ArrayList<Logininfo> ali = (ArrayList<Logininfo>)request.getAttribute("AllStud");
            for(int i=0;i<ali.size();i++)
            {
                String un = ali.get(i).getUname();
        %>
                <%=un%>
                </br>
        <%
            }
        %>
    </body>
</html>
