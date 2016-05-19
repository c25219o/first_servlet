<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログインしてください</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css">
</head>
<body>


<div class="centering">
    <span class="error_message">${errorMessage}</span>
    <form action="<%=request.getContextPath()%>/login" method="POST">
        <p>
            <input type="text" name="userId" id="userId" placeholder="USER ID"><br>
            <input type="password" name="pass" id="pass" placeholder="PASSWORD">
        </p>
        <p>
            <input type="submit" value="LOG IN">
        </p>
    </form>
</div>
</body>
</html>