<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログインしてください</title>
<link href="<%=request.getContextPath()%>/css/common.css">
</head>
<body>


<div id="id_pass_field">
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