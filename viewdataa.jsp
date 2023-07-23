<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registered Data</title>
<style type="text/css">

 body {
    font-family: Arial, sans-serif;
   
  }
  
  h1 {
    color: red;
  }
  
  center {
    margin-top: 20px;
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
  
  
input[type="search"] {
  padding: 6px 10px;
  border: 1px solid #ccc;
  border-radius: 4px;
  font-size: 16px;
  width: 200px;
  display: inline-block;
  
}


input[type="submit"] {
  padding: 6px 12px;
  background-color: #4CAF50;
  color: #fff;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  font-size: 16px;
  
  display: inline-block;
}
  form {
 margin-top: 30px;
   }
  a:hover {
    background-color: yellow;
  }</style>
</head>
<body>
 <center>
<h1>Student Marks Management System</h1>
<a href="/">home</a>
<a href="/addMarks">AddStudent</a>
<a href="/viewallstudentmarks">view All Students</a>
<form action="/search" method="get">
    <input type="search" name="hallTicketNumber">
    <input type="submit" value="Search">
  </form>
</center>

  <h1 style="color:green" align="center"> All Students Marks Here,You can do either Delete/Edit </h1>
 
  <center>
      <table align="center" border="1" width="600px" style="background-color: #D3D3D3; border-collapse: collapse;">
  <tr>
    <th style="padding: 10px;">studentHallTicket</th>
    <th style="padding: 10px;">fullName</th>
    <th style="padding: 10px;">subject1</th>
    <th style="padding: 10px;">subject2</th>
    <th style="padding: 10px;">subject3</th>
    <th style="padding: 10px;">subject4</th>
    <th style="padding: 10px;">subject5</th>
    <th style="padding: 10px;">totalMarks</th>
    <th style="padding: 10px;">avgMarks</th>
    <th style="padding: 10px;">grade</th>
    <th style="padding: 10px;">Delete</th>
    <th style="padding: 10px;">Edit</th>
  </tr>
  
  <c:forEach var="student" items="${student}">
    <tr>
      <td style="padding: 10px;">${student.studentHallTicket}</td>
      <td style="padding: 10px;">${student.fullName}</td>
      <td style="padding: 10px;">${student.subject1}</td>
      <td style="padding: 10px;">${student.subject2}</td>
      <td style="padding: 10px;">${student.subject3}</td>
      <td style="padding: 10px;">${student.subject4}</td>
      <td style="padding: 10px;">${student.subject5}</td>
      <td style="padding: 10px;">${student.totalMarks}</td>
      <td style="padding: 10px;">${student.avgMarks}</td>
      <td style="padding: 10px;">${student.grade}</td>
      <td style="padding: 10px;"><a href="/delete/${student.studentHallTicket}" style="text-decoration: none; color:red">Delete</a></td>
      <td style="padding: 10px;"><a href="/edit/${student.studentHallTicket}" style="text-decoration: none;color:green">Edit</a></td>
    </tr>
  </c:forEach>
 </table>

  </center>
</body>
</html>
