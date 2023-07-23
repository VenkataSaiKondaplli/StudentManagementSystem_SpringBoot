
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>add user</title>
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
 
  <form action="/save" method="post">
  <h2 style="color:red" align="center">Add Student Marks</h2>
  <h3 style="color:blue" align="center"> ${success}</h3>
    <label for="no">Enter Hall Ticket Number:</label>
    <input type="text" id="no" name="studentHallTicket" required><br><br>
    
    <label for="fname">Enter your First name:</label>
    <input type="text" id="fname" name="firstName" required><br><br>
    
    <label for="lname">Enter your Last name:</label>
    <input type="text" id="lname" name="lastName" required><br><br>
    
    <label for="sub1">Enter Subject1 Marks:</label>
    <input type="text" id="sub1" name="subject1" required><br><br>
    
    <label for="sub1">Enter Subject2 Marks:</label>
    <input type="text" id="sub1" name="subject2" required><br><br>
    <label for="sub1">Enter Subject3 Marks:</label>
    <input type="text" id="sub1" name="subject3" required><br><br>
    
    <label for="sub1">Enter Subject4 Marks:</label>
    <input type="text" id="sub1" name="subject4" required><br><br>
    
    <label for="sub1">Enter Subject5 Marks:</label>
    <input type="text" id="sub1" name="subject5" required><br><br>
    
    <input type="submit" value="addUser">
    
  </form>
</body>
</html>
