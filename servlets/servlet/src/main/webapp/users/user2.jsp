<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<%@ page import="DAO.User" %>
<%@ page import="facades.UserFacade" %>
       <%@ page import="java.util.List" %>

       <%
       List<User> users = new UserFacade().getUsers();
       pageContext.setAttribute("users",users);
       %>

       <html>
       <body>
          The users are more than you think:
          <br/>
          <c:forEach var = "user" items="${users}">
          <li> <c:out value="${user.name}"/> </li>
          </c:forEach>
       </body>
       </html>