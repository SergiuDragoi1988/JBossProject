<%@tag description= "login"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:choose>
    <c:when test="${user!=null}">
        Hello<c:out value="${user.userName}"/>
        <a href="">Log out</a>
     </c:when>
     <c:otherwise>
     <a href="">Log in</a>
     </c:otherwise>
</c:choose>

