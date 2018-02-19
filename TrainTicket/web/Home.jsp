<%@page import="java.util.*" %>
<%session.setAttribute("UserName", "ram");%>

<script>
function go() {
window.location.replace("Logout.jsp",'window','toolbar=1,location=1,directories=1,status=1,menubar=1,scrollbars=1,resizable=1');
self.close()
}
</script>
<head>
  <meta charset="UTF-8">
  <title>Simple, CSS only, responsive menu</title>
  
  <link rel="stylesheet" href="css/reset.min.css">

  
      <link rel="stylesheet" href="css/style.css">

  
</head>

<body>
  <head>
  <meta name="viewport" content="width=device-width">
</head>

<form>
<div class="wrap">
<span class="decor"></span>
<nav>
  <ul class="primary">
    <li>
      <a href="Home.jsp">Home</a>
    </li>
    <li>
      <a href="">Courses</a>
      <ul class="sub">
        <li><a href="">CSE</a></li>
        <li><a href="">EEE</a></li>
        <li><a href="">Mech</a></li>
      </ul>
    </li>
    <li>
      <a href="">Faculty</a>
      <ul class="sub">
        <li><a href="">B.Tech</a></li>
        <li><a href="">MBA</a></li>
      </ul>  
    </li>
    <li>
      <a href="">Students</a>
      <ul class="sub">
        <li><a href="">B.Tech</a></li>
        <li><a href="">ASCOM</a></li>
        <li><a href="">MBA</a></li>
      </ul>  
    </li>
    <li>
      <a href="">Contact us</a>
      <ul class="sub">
        <li><a href="">Phone</a></li>
        <li><a href="">Email</a></li>
        <li><a href="">Address</a></li>
      </ul>  
    </li>
    
   
  </ul>
</nav>
</div>

<div class="imgcontainer">
  <img src="css\Login.jpg" alt="Avatar" class="avatar" >
</div>

</form>

  
</body>


<% if (session.getAttribute("UserName").equals("")){%>
<a href="Login.jsp"><b>Login </b></a>
<%}
else{%>
<a href="javascript:go()"><b>Logout</b></a>
<%}
%>