// Restaurant Coordinates
const restaurant = [26.94060640241157, 80.94216177494135];

// Create Map
const map = L.map('map').setView(restaurant,16);

// Load OpenStreetMap
L.tileLayer(
'https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png',
{
    attribution:'© OpenStreetMap Contributors'
}
).addTo(map);

// Restaurant Marker
const marker = L.marker(restaurant).addTo(map);

// Popup
marker.bindPopup(`
<h3>🍽️ Vision Restaurant</h3>
<p>Click for Directions</p>
`);

// Click Marker
marker.on("click",function(){

    window.open(
        "https://www.google.com/maps/place/Chatkara+Veg+Delight/@26.9404295,80.9392972,17z/data=!3m1!4b1!4m6!3m5!1s0x39995700034dc85f:0xb9500cb7e398b7e3!8m2!3d26.9404247!4d80.9418721!16s%2Fg%2F11yqym8954?entry=ttu&g_ep=EgoyMDI2MDYyNC4wIKXMDSoASAFQAw%3D%3D",
		"_blank"
    );

});