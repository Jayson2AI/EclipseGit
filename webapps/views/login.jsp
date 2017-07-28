<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login.jsp</title>
  </head>
  
  <body>
    <div style="margin:0 auto; padding-top:100px;" align="center">
      <form action="doLogin" method="post">
        <p>
       	     用户名 :
       	  <input name="username" type="text"></input><br/>
          <font color="red">${error_username}</font>
        </p>
        <p>
       	     密&nbsp;&nbsp;&nbsp;&nbsp;码 :
       	  <input name="password" type="password"></input><br/>
          <font color="red">${error_password}</font>
        </p>
        <p>
          <input type="submit"></input>
        </p>
        <font color="red">${error}</font>
      </form>
    </div>
  </body>
  
</html>