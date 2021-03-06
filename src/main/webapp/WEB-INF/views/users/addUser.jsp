<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 24/08/2021
  Time: 12:21 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../common/header.jsp" />

<html>
<head>
    <title>Title</title>
    <style type="text/css">
        .error {
            color: #ff0000;
        }
        .errorblock {
            color: #000;
            background-color: #ffEEEE;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>
</head>
<body>
    <c:choose>
        <c:when test="${errorMsg != null}" >
            <div class="alert alert-danger" role="alert">
                <p>error msg</p>
                    ${errorMsg}

            </div>
        </c:when>
        <c:when test="${error != null}" >
            <div class="alert alert-danger" role="alert">
                <p>error</p>
                ${error}

            </div>
        </c:when>
        <c:otherwise>
            you are good to go!

        </c:otherwise>
    </c:choose>


    <form:errors path="user.*" cssClass="error" />

    <form:form action="${pageContext.request.contextPath}/users/add"
               modelAttribute="user">

<%--        <form:errors path="*" cssClass="errorblock" element="div" />--%>

        <form:input path="id" hidden="true"/>

        <label>Name:</label>
        <form:input path="name"/>
<%--        <form:errors path="name" cssClass="error" />--%>

        <input type="submit" name="submit" value="Add User">

    </form:form>
</body>
</html>

<jsp:include page="../common/footer.jsp" />