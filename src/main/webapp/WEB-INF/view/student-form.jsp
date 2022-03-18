<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Student Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First Name: <form:input path="firstName"/>
		<br><br>
		
		Last Name: <form:input path="lastName"/>
		<br><br>
		
		<form:select path="country">
			<form:options items="${student.countryOptions}"/>
		</form:select>
		<br><br>
		
		Operating Systems:
		<br>
		<form:checkboxes items="${student.operatingSystemOptions}" path="operatingSystems"/>
		<br><br>
		
		Favorite Language:
		<br><br>
		<form:radiobuttons items="${student.favoriteLanguageOptions}" path="favoriteLanguage"/>
		
		<br><br>
		<input type="submit" value="submit">
	</form:form>
</body>
</html>