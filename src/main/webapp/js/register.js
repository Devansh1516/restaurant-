function goToReservation() {
    window.location.href = "/register";
}
function submitForm(event) {

    event.preventDefault();
	let rawTime = document.getElementById("time").value;
	let formattedTime = convertTo24Hour(rawTime);

    let data = {
        name: document.getElementById("name").value,
        people: document.getElementById("people").value,
        number: document.getElementById("number").value,
        resevation: document.getElementById("date").value,
         ti: formattedTime
    };
	console.log(data);

    fetch("http://localhost:8080/reserve", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data)
    })
    .then(res => res.text())
    .then(() => {
        alert("Reservation Successful!");
        window.location.href = "/index";
    });
}
function convertTo24Hour(time12h) {

    let [time, modifier] = time12h.split(' ');
    let [hours, minutes] = time.split(':');

    if (modifier === "PM" && hours !== "12") {
        hours = parseInt(hours) + 12;
    }

    if (modifier === "AM" && hours === "12") {
        hours = "00";
    }

    return `${hours.toString().padStart(2, '0')}:${minutes}:00`;
}