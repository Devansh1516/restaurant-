<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Check Reservation - Chatkara</title>
<link rel="stylesheet" href="css/check.css">
</head>

<body>
<jsp:include page="navbar.jsp" />

<div class="check-container">

    <form class="check-form" action="checkByPhone" method="get">
        <h2>Check Your Reservation</h2>

        <input type="tel" name="phone" placeholder="Enter Phone Number" required>

        <button type="submit">Check Status</button>
    </form>

</div>

</body>
</html>