<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Reservation - Chatkara</title>

<link rel="stylesheet" href="css/register.css">
</head>

<body>
<jsp:include page="navbar.jsp" />

<div class="reservation-container">

    <form class="reservation-form" onsubmit="submitForm(event)">
        <h2>Reserve Your Table</h2>

        <!-- Name -->
        <input type="text" id="name" placeholder="Full Name" required>
        

        <!-- Number of People -->
        <select  id="people" required>
            <option value="">Select People</option>
            <option>1</option>
            <option>2</option>
            <option>3</option>
            <option>4</option>
            <option>5</option>
            <option>6</option>
            <option>7</option>
            <option>8</option>
        </select>

        <!-- Phone -->
        <input type="tel" id="number" placeholder="Phone Number" required>

        <!-- Date -->
        <input type="date" id="date" required>

        <!-- Time -->
        <select id ="time" required>
    <option value="">Select Time Slot</option>
    <option>4:00 PM</option>
    <option>5:00 PM</option>
    <option>6:00 PM</option>
    <option>6:30 PM</option>
    <option>7:00 PM</option>
    <option>7:30 PM</option>
    <option>8:00 PM</option>
    <option>8:30 PM</option>
    <option>9:00 PM</option>
    <option>9:30 PM</option>
    <option>10:00 PM</option>
</select>

        <button type="submit">Book Table</button>

    </form>

</div>
<script src="js/register.js"></script>
</body>
</html>