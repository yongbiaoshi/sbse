<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
</head>
<body>
    <h1>Login page</h1>
    <p>Example user: user / password</p>
    <#if loginError??>
	    <p>Wrong user or password</p>
    </#if>
    <p>${loginUrl!""}</p>
    <form action="/login" method="post">
        <div><label for="username">UserName</label>: <input type="text" id="username" name="username" autofocus="autofocus" /></div>
        <div><label for="password">Password</label>: <input type="password" id="password" name="password" /> <br /></div>
        <input type="submit" value="Log in" />
    </form>
</body>
</html>