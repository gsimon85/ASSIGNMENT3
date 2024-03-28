<!DOCTYPE html>
<html>
<head>
  <title>dachshund</title>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="stylesheet.css">
</head>
<body>
<h1>Dachshund</h1>
<nav>
  <a href="index.jsp">Home</a>
  <a href="history.jsp">History</a>
  <a href="care.jsp">Care</a>
  <a href="email.jsp">Email Signup</a>
</nav>
<header>

</header>
<main>

  <h2>Sign up for our Monthly Email</h2>

  <form action="emailSignup" method="POST">
    <label>Name:</label>
    <input type="text" name="name"><br>
    <label>Email:</label>
    <input type="email" name="email"><br>
    <label>Phone:</label>
    <input type="phone" name="phone"><br>
    <label>City:</label>
    <input type="city" name="city"><br>
    <input type="submit" value="Submit">
  </form>
  <br>


</main>
<footer>
  &copy; 2024 Greg Simon
</footer>

</body>
</html>