<%@ page import="java.sql.Connection" %>
<%@ page import="az.todo.db.DBConnect" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 06.05.2023
  Time: 18:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>To Do App</title>
    <%@include file="component/all_css.jsp" %>

</head>
<body>
<%@include file="component/navbar.jsp" %>
<h1 class="text-center text-success">TODO - APP</h1>

<div class="container">

    <table class="table table-striped" style="border: 1px">

            <thead class="bg-success text-white">
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Name</th>
                <th scope="col">ToDo</th>
                <th scope="col">Status</th>
                <th scope="col">Action</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <th scope="row">1</th>
                <td>Matin</td>
                <td>Java Tutorial</td>
                <td>Pending</td>
                <td>
                    <a href="" class="btn btn-sm btn-success">Edit</a>
                    <a href="" class="btn btn-sm btn-danger">Delete</a>
                </td>
            </tr>
            </tbody>
        </table>


</div>

</body>
</html>
