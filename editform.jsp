<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
  body {
    font-family: Arial, sans-serif;
  }
  
  h2 {
    color: red;
  }
  
  form {
    width: 400px;
    margin: 60px auto;
  }
  
  label {
    display: block;
    margin-bottom: 3px;
  }
  
  input[type="text"],
  input[type="email"],
  input[type="password"],
  select {
    width: 100%;
    padding: 8px;
    border: 1px solid #ccc;
    border-radius: 4px;
  }
  
  input[type="radio"] {
    margin-right: 5px;
  }
  
  input[type="submit"] {
    padding: 10px 20px;
    background-color: #4CAF50;
    color: #fff;
    border: none;
    border-radius: 4px;
    cursor: pointer;
  }
  
  input[type="submit"]:hover {
    background-color: #45a049;
  }
  
    body {
    font-family: Arial, sans-serif;
  }
  
  h1 {
    color: red;
  }
  
  center {
    margin-top: 50px;
  }
  
  a {
    display: inline-block;
    padding: 10px 20px;
    background-color: #4CAF50;
    color: #fff;
    text-decoration: none;
    border-radius: 4px;
    margin-right: 10px;
  }
  
  a:hover {
    background-color: yellow;
  }
  
</style>

</head>
<body>

  <center>
<h1>Student Marks Management System</h1>
<a href="/">home</a>
<a href="/addMarks">Add Student Marks</a>
<a href="/viewallstudentmarks">View All Student Grades</a>
</center>

<div class="container">
    <form:form action="/update" method="post">
        <table class="form-table">
            <tr>
                <td>Enter Student Hall Ticket Number:</td>
                <td><form:input path="studentHallTicket"/></td>
            </tr>
            <tr>
                <td>Enter Student Full Name:</td>
                <td><form:input path="fullName"/></td>
            </tr>
            <tr>
                <td>Enter Student Subject 1 Marks:</td>
                <td><form:input path="subject1"/></td>
            </tr>
            <tr>
                <td>Enter Student Subject 2 Marks:</td>
                <td><form:input path="subject2"/></td>
            </tr>
            <tr>
                <td>Enter Student Subject 3 Marks:</td>
                <td><form:input path="subject3"/></td>
            </tr>
            <tr>
                <td>Enter Student Subject 4 Marks:</td>
                <td><form:input path="subject4"/></td>
            </tr>
            <tr>
                <td>Enter Student Subject 5 Marks:</td>
                <td><form:input path="subject5"/></td>
            </tr>
        </table>
        <div class="form-submit">
            <input type="submit" value="Save">
        </div>
    </form:form>
</div>
</body>
</html>
