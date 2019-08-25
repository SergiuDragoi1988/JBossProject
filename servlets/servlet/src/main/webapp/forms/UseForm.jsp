<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/styles/styles.css"/>
</head>
       <body>
       <p>Add new user</p>
       <br/>
       <form action="${pageContext.request.contextPath}/f" method="POST">
       Name: <input type = "text" name="name"/>
       Email:<input type = "text" name="email"/>


       <input name="insert" type="submit" value="Add user"/>
       </form>



        The users are more than you think:

        <table>
                <c:forEach var = "user" items="${users}">
                        <tr>
                            <form action="${pageContext.request.contextPath}/f" method="POST">
                              <td>
                                    <button name="delete" class="delButtonStyle" type="submit" value="${user.id}"/>
                             </td>
                             <td>
                                    <c:out value="${user.name}"/>
                            </td>
                          </form>
                        </tr>
                 </c:forEach>
            </table>
          </body>
       </html>


