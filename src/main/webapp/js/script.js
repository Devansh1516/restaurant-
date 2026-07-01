let slides = document.querySelectorAll(".slide");
let dots = document.querySelectorAll(".dot");

let index = 0;

function showSlide(i){

    slides.forEach(slide => slide.classList.remove("active"));
    dots.forEach(dot => dot.classList.remove("active"));

    slides[i].classList.add("active");
    dots[i].classList.add("active");

    index = i;
}

/* Click on dots */

dots.forEach((dot,i)=>{
    dot.addEventListener("click", ()=>{
        showSlide(i);
    });
});

/* Auto slide */

setInterval(()=>{
    index++;

    if(index >= slides.length){
        index = 0;
    }

    showSlide(index);

},5000);
function changePage(page) {

    if (page === "all") {
        window.location.href = "/EmployeeManagementSystem/all";
    } else if (page === "admin") {
        window.location.href = "/EmployeeManagementSystem/admin";
    }

}
function changeStatus(value){

    if(value == "all"){
        window.location.href = "/EmployeeManagementSystem/all";
    }
    else if(value == "approved"){
        window.location.href = "/EmployeeManagementSystem/approved";
    }
    else if(value == "rejected"){
        window.location.href = "/EmployeeManagementSystem/rejected";
    }

}