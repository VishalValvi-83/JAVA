<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Greet</title>
<style>
body {
	font-family: 'Segoe UI';
	background: linear-gradient(to right, #a18cd1, #fbc2eb);
	color: #333;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	margin: 0;
}

.container {
	background-color: white;
	padding: 40px;
	border-radius: 20px;
	box-shadow: 0 8px 20px rgba(0, 0, 0, 0.2);
	text-align: center;
	width: 400px;
}

h1 {
	color: #6a1b9a;
	margin-bottom: 20px;
}

form {
	margin-bottom: 20px;
}

label {
	display: block;
	margin-bottom: 10px;
	font-size: 18px;
	font-weight: semibold;
	color: #4a148c;
}

input[type="text"] {
	width: 100%;
	padding: 10px;
	border-radius: 10px;
	border: 1px solid #ccc;
	outline: none;
	margin-bottom: 15px;
	font-size: 16px;
}

input[type="submit"] {
	background-color: #6a1b9a;
	color: white;
	padding: 10px 20px;
	border: none;
	border-radius: 10px;
	cursor: pointer;
	font-size: 16px;
	transition: background-color 0.3s;
}

input[type="submit"]:hover {
	background-color: #8e24aa;
}

.result {
	font-size: 30px;
	color: #4a148c;
}
</style>
</head>
<body>
	<div class="container">
		<h1>Welcome</h1>
		<form action="Index.jsp" method="get">
			<label for="name">Enter your name:</label> <input type="text"
				id="name" name="name" required> <input type="submit"
				value="Greet">
		</form>
		<div class="result">
			<%
			String name = request.getParameter("name");
			if (name != null && !name.isEmpty()) {
				out.println("Hello, " + name + "!");
			} else if (request.getParameter("name") != null) {
				out.println("Hello, Guest!");
			}
			%>
		</div>
	</div>
</body>
</html>
