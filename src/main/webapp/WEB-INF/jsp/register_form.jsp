<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JoinQuiz</title>
</head>
<body>
<div align="center">
<h2>Participants please enter details</h2>
<form:form action="/joinQuiz" method="post" modelAttribute="user">
<form:label path="quizId">Quiz# &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</form:label>
<form:input path="quizId"/><br/><br/>
<form:label path="fullName">Full Name</form:label>
<form:input path="fullName"/><br/><br/>
<form:button>submit</form:button>

</form:form>
</div>
</body>
</html>