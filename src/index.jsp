<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Foodie's Restaurant</title>

    <!-- Connect CSS -->
  <link rel="stylesheet" href="<%= request.getContextPath() %>/css/style.css">
</head>

<body>

<header class="header">
    <div class="container">

        <div class="logo-section">
            <img src="<%= request.getContextPath() %>/images/logo.png" 
                 alt="Logo" 
                 class="logo">
            <h1 class="title">Foodie's Restaurant</h1>
        </div>

        <nav class="navbar">
            <ul>
                <li><a href="#">Order</a></li>
                <li><a href="#">Reservation</a></li>
                <li><a href="#">Location</a></li>
            </ul>
        </nav>

    </div>
</header>

</body>
</html>