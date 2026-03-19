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
        <h1>Welcome to Chatakra Veg Delight</h1>
        <p>Enjoy our food made with love</p>
    </div>

    <div class="slide">
        <h1>Flat ₹175 OFF</h1>
        <p>Use Code: WELCOME175</p>
    </div>

    <div class="slide">
        <h1>Fresh Pure Veg Meals</h1>
        <p>Taste the real Indian flavours</p>
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

    <button class="reserve-btn" onclick="goToReservation()">
        Reserve Table
    </button>

</section>

<div class="category-grid">

    <div class="category-card">
        <img src="images/chinese.jpg">
        <p>Chinese Starter Non-Veg</p>
    </div>

    <div class="category-card">
        <img src="images/soup.jpg">
        <p>Veg Soups</p>
    </div>

    <div class="category-card">
        <img src="images/rice.jpg">
        <p>Veg Rice</p>
    </div>

    <div class="category-card">
        <img src="images/veggie.jpg">
        <p>Veggie Delight</p>
    </div>

    <!-- second row -->

    <div class="category-card">
        <img src="images/friedrice.jpg">
        <p>Fried Rice</p>
    </div>

    <div class="category-card">
        <img src="images/roll.jpg">
        <p>Veg Rolls</p>
    </div>

    <div class="category-card">
        <img src="images/noodles.jpg">
        <p>Veg Noodles</p>
    </div>

    <div class="category-card">
        <img src="images/thali.jpg">
        <p>Veg Thali</p>
    </div>

</div>
<footer class="footer">
    <div class="footer-container">

        <!-- Useful Links -->
        <div class="footer-section">
            <h3>Useful Links</h3>
            <ul>
                <li><a href="#">Shipping Policy</a></li>
                <li><a href="#">Privacy Policy</a></li>
                <li><a href="#">Terms & Conditions</a></li>
                <li><a href="#">Promo Codes</a></li>
                <li><a href="#">Refund Policy</a></li>
            </ul>
        </div>

        <!-- Payment Methods -->
        <div class="footer-section">
            <h3>Payment Methods</h3>
            <div class="payments">
                <span>₹ Cash</span>
                <span>MasterCard</span>
                <span>G Pay</span>
                <span>Paytm</span>
                <span>Visa</span>
                <span>UPI</span>
            </div>
        </div>

        <!-- Address -->
        <div class="footer-section">
            <h3>Address</h3>
            <p>
                📍 90 MG MARG, Aryan Restaurant,<br>
                Mahatma Gandhi Marg, Hazratganj,<br>
                Lucknow, Uttar Pradesh, 226001
            </p>
        </div>

        <!-- Contact -->
        <div class="footer-section">
            <h3>Contact & Connect</h3>
            <p>📧 info@aryanrestaurants.com</p>
            <p>📞 9348348348</p>

            <div class="social">
                <a href="#">🌐</a>
                <a href="#">📸</a>
            </div>
        </div>

        <!-- Admin Section -->
        <div class="footer-section admin">
            <h3>Admin</h3>
            <a href="/admin/login" class="admin-btn">Admin Login</a>
        </div>

    </div>
</footer>


<script src="js/script.js"></script>
<script src="js/register.js"></script>
</body>
</html>