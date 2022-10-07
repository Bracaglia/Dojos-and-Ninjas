<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) -->
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dojos and Ninjas</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<h1><c:out value="${dojo.name}"></c:out></h1>
<table>
    <thead>
    <tr>
        <th>${ninja.firstName}</th>
        <th>${ninja.lastName}</th>
        <th>${ninja.age}</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="ninja" items="${dojo.ninjas}">
            <td>Name: <c:out value="${ninja.firstName}"></c:out></td>
            <td><c:out value="${ninja.lastName}"></c:out></td>
        </tr>
        <tr>
            <td>Age: <c:out value="${ninja.age}"></c:out></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<div>
    <button><a href="/ninjas/new">New Ninja</a></button>
    <button><a href="/dojos/new">Dojos</a></button>
</div>
</body>
</html>































