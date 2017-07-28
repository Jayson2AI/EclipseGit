<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Register.jsp</title>
  </head>
  
  <body>
    <div style="margin:0 auto; padding-top:100px;" align="center">
      <form action="doRegister" method="post">
        <p>
       	     用户名 :
       	  <input name="username" type="text"></input><br/>
        </p>
        <p>
       	     密&nbsp;&nbsp;&nbsp;&nbsp;码 :
       	  <input name="password" type="password"></input><br/>
        </p>
        <p>
       	     年&nbsp;&nbsp;&nbsp;&nbsp;龄 :
       	  <input name="age" type="text"></input><br/>
        </p>
        <p>
       	     姓&nbsp;&nbsp;&nbsp;&nbsp;名 :
       	  <input name="realname" type="text"></input><br/>
        </p>
        <p>
       	     邮&nbsp;&nbsp;&nbsp;&nbsp;箱 :
       	  <input name="email" type="text"></input><br/>
        </p>
        <p>
          <input type="submit" value="注    册"></input>
        </p>
      </form>
    </div>
  </body>
  
</html>