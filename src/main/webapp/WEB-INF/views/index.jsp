<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>CHATKARA</title>
<link rel="stylesheet" href="css/style.css">
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap" rel="stylesheet">
</head>

<body>
<jsp:include page="navbar.jsp" />

<section class="hero">
    <h1>Welcome to Chatakra Veg Delight</h1>
    <p>Enjoy our food made with love!</p>
</section>
<section class="offer-slider">

    <div class="slide active">
    <img src="images/welcome page .png">
        <h1>Welcome to Chatakra Veg Delight</h1>
        <p>Enjoy our food made with love</p>
         
    </div>
<div class="slide second-slide">
        <h1>Flat ₹175 OFF</h1>
        <p>Use Code: WELCOME175</p>
         <img src="images/welcome.png">
    </div>

    <div class="slide">
        <h1>Fresh Pure Veg Meals</h1>
        <p>Taste the real Indian flavours</p>
         <img src="images/wel.png">
    </div>
 <!-- dots -->
    <div class="dots">
        <span class="dot active"></span>
        <span class="dot"></span>
        <span class="dot"></span>
    </div>
</section>

<section class="reservation-bar">

    <div class="restaurant-select">
        <p class="small-text">make a reservation</p>
        <h3>And dine in</h3>
    </div>

    <a href="${pageContext.request.contextPath}/register" class="reserve-btn">
    Reserve Table
</a>

</section>

<div class="category-grid">

    <div class="category-card">
        <img src="images/pasta.png">
        <p>Pasta</p>
    </div>

    <div class="category-card">
        <img src="images/fired momos.png">
        <p>Fried Momos</p>
    </div>

    <div class="category-card">
        <img src="images/sand.png">
        <p>Sandwich</p>
    </div>

    <div class="category-card">
        <img src="images/chola.png">
        <p>Chola</p>
    </div>

    <!-- second row -->

    <div class="category-card">
        <img src="images/aaluu.png">
        <p>Aallu Paratha</p>
    </div>

    <div class="category-card">
        <img src="images/rajma .png">
        <p>Rajma Chawal</p>
    </div>

    <div class="category-card">
        <img src="images/noodles.png">
        <p>Veg Noodles</p>
    </div>

    <div class="category-card">
        <img src="images/coffee.png">
        <p>Coffee</p>
    </div>

</div>
<footer class="footer">
    <div class="footer-container">

        <!-- Useful Links -->
        <div class="footer-section">
            <h3>Useful Links</h3>
            <ul>
                <li><a href="#">Privacy Policy</a></li>
                <li><a href="#">Terms & Conditions</a></li>
                <li><a href='#'>about us</a></li>
            </ul>
        </div>

        

        <!-- Address -->
        <div class="footer-section">
            <h3>Address</h3>
            <p>
             7/16, <br> 
           opposite Delhi Public School, Sector 7, Jankipuram,<br>
            Lucknow, Uttar Pradesh 226021
            </p>
        </div>

        <!-- Contact -->
        <div class="footer-section">
            <h3>Contact & Connect</h3>
            <p> email- chakara69@gmail.com</p>
            <p>phone- 9125031713</p>

            <div class="social">
                <a href="#"></a>
                <a href="#"></a>
            </div>
        </div>

      
    </div>
</footer>


<script src="js/script.js"></script>
<script src="js/register.js"></script>
</body>
</html>