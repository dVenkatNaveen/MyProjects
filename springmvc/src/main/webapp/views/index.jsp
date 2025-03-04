<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Hello World JSP</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <h1>Hello, World!</h1>
    <p>Current Time: <%= new java.util.Date() %></p>

      <form action="add">
                    <label for="num1">Enter 1st Number :</label>
                    <input type="text" id=num1" name="num1"><br>
                    <label for="num2">Enter 2nd Number :</label>
                    <input type="text" id="num2" name="num2"><br>
                    <input type="submit" value="Submit">
                </form>

                <form action="addStudent">
                                    <label for="rollno">Enter Rollno :</label>
                                    <input type="text" id=rollno" name="rollno"><br>
                                    <label for="name">Enter Name :</label>
                                    <input type="text" id="name" name="name"><br>
                                    <input type="submit" value="Submit">
                                </form>
</body>
</html>
