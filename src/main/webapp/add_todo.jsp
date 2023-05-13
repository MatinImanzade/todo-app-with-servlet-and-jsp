<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 07.05.2023
  Time: 01:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Todo</title>
    <%@include file="component/all_css.jsp" %>
</head>
<body style="background-color: #f0f1f2">
<%@include file="component/navbar.jsp" %>

<div class="container">
    <div class="row p-4">
        <div class="col-md-6 offset-md-3">
            <div class="card">
                <div class="card-body">
                    <h3 class="text-center text-success">Add Todo</h3>
                    <form action="add_todo" method="post">

                        <div class="mb-3">
                            <label for="exampleInputEmail1" class="form-label">Name</label>
                            <input type="text" class="form-control" id="enterName"
                                   aria-describedby="emailHelp" placeholder="Enter your name" name="username">
                            <div id="Name" class="form-text"></div>
                        </div>

                        <div class="mb-3">
                            <label for="exampleInputEmail1" class="form-label">TODO</label>
                            <input type="text" class="form-control" id="exampleInputEmail1"
                                   aria-describedby="emailHelp" placeholder="Enter your to do" name="todo">
                            <div id="emailHelp" class="form-text"></div>
                        </div>
                        <div class="form-group">
                            <label for="inputState"></label>
                            <select class="form-control" id="inputState" name="status">
                                <option value="Select">--Select--</option>
                                <option value="Pending">Pending</option>
                                <option value="Complete">Complete</option>
                            </select>

                        </div>
                        <br>
                        <div class="text-center">
                            <button type="submit" class="btn btn-primary">Add</button>
                        </div>

                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
