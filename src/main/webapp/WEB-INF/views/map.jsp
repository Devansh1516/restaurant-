<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Restaurant Location</title>

<link rel="stylesheet" href="${pageContext.request.contextPath}/css/map.css">
<link rel="stylesheet"
href="https://unpkg.com/leaflet@1.9.4/dist/leaflet.css"/>
</head>

<body>

<div class="map-container">

    <div class="map-card">

        <h2>📍 Find Our Restaurant</h2>

        <p>

           7/16, <br> 
           opposite Delhi Public School, Sector 7, Jankipuram,<br>
            Lucknow, Uttar Pradesh 226021

        </p>

        <div id="map"></div>

        <div class="btn-group">

            <a href="https://www.google.com/maps/place/Chatkara+Veg+Delight/@26.9404295,80.9392972,17z/data=!3m1!4b1!4m6!3m5!1s0x39995700034dc85f:0xb9500cb7e398b7e3!8m2!3d26.9404247!4d80.9418721!16s%2Fg%2F11yqym8954?entry=ttu&g_ep=EgoyMDI2MDYyNC4wIKXMDSoASAFQAw%3D%3D"
               target="_blank">

                <button class="direction-btn">

                    🚗 Get Directions

                </button>

            </a>

            <a href="${pageContext.request.contextPath}/">

                <button class="home-btn">

                    🏠 Home

                </button>

            </a>

        </div>

    </div>

</div>

<script src="https://unpkg.com/leaflet@1.9.4/dist/leaflet.js"></script>

<script src="${pageContext.request.contextPath}/js/map.js"></script>

</body>

</html>