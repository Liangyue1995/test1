<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
 <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>   
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=basePath%>/SSMActiviti/user/UserfindAll" method="post">
 <table>
   <tr>
    <td>id</td>
    <td>username</td>
    <td>password</td>
    <td>nickname</td>
    <td>ispass</td>
   </tr>
 <c:forEach var="u" items="${list}">
  <tr>
    <td>${id}</td>
    <td>${username}</td>
    <td>${password}</td>
    <td>${nickname}</td>
    <td>${ispass}</td>
   </tr>
 </c:forEach>
 </table>
</form>

</body>
</html>