<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/registration.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet"
 href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
 integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
 crossorigin="anonymous">

</head>

</head>
<body>
 <div class="container">
 <hr>
  <div class="row col-md-10 col-md-offset-3"> 
   
   <div class="card card-body">
   
    <h2>User Register Form</h2>
    <div class="col-md-8 col-md-offset-3">

     <form action="<%=request.getContextPath()%>/register" method="post">

      <div class="form-group">
       <label for="uname">prenom:</label> <input type="text"
        class="form-control" id="uname" placeholder="prenom"
        name="prenom" required>
      </div>

      <div class="form-group">
       <label for="uname">nom:</label> <input type="text"
        class="form-control" id="uname" placeholder="nom"
        name="nom" required>
      </div>
      <div class="form-group">
       <label for="uname">telephone:</label> <input type="text"
        class="form-control" id="uname" placeholder="telephone"
        name="telephone" required>
      </div>

      <div class="form-group">
       <label for="uname">email:</label> <input type="text"
        class="form-control" id="username" placeholder="email"
        name="email" required>
      </div>
        <div class="form-group">
       <label for="uname">adresse:</label> <input type="text"
        class="form-control" id="username" placeholder="adresse"
        name="adresse" required>
         </div>
      <div class="form-group">
       <label for="uname">mot de passe:</label> <input type="password"
        class="form-control" id="password" placeholder="Password"
        name="password" required>
      </div>
      <button type="submit" class="btn btn-primary">Submit</button>
     </form>
    </div>
   </div>
  </div>
 </div>
</body>
</html>