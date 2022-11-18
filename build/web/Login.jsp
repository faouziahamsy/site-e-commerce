<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
 href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
 integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
 crossorigin="anonymous">
<link href="css/login.css" rel="stylesheet" type="text/css"/>
</head>
<body>

 <div class="container col-md-8 col-md-offset-3" style="overflow: auto">
      <div class="text"> Se connecter</div>
       <form method="post" action="<%=request.getContextPath()%>/Login">
   <div class="form-group">
    <label for="uname">Email:</label> <input type="text"
     class="form-control" id="email" placeholder="nom@gmail.com"
     name="email" required>
   </div>
   <div class="form-group">
    <label for="uname">Mot de passe:</label> <input type="password"
     class="form-control" id="password" placeholder="Mot de passe "
     name="password" required>
   </div>
   <button type="submit" class="btn btn-primary">Se connecter </button>
   <div class="signup-link">  nouveau membre? <a href="registration.jsp">S'inscrire</a>  </div>    
  </form>
 </div>
</body>
</html>