# 🍽️ Restaurant Reservation System

A full-stack Restaurant Reservation System built using **Java, Spring MVC, Hibernate, JSP, MySQL, Redis, Docker, Maven, and Tomcat**. The system enables customers to reserve tables online while providing administrators with a dashboard to manage reservations efficiently.

---

# ✨ Features

## 👤 Customer

- Reserve a table online
- Select reservation date and time
- Choose the number of guests
- Enter contact information
- Prevent booking for past dates
- View restaurant location through Google Maps

---

## 👨‍💼 Admin

- View Pending Reservations
- Approve Reservations
- Reject Reservations
- View All Reservations
- Filter reservations by:
  - All
  - Approved
  - Rejected
- Update reservation details
- Delete reservations

---

# 🛠️ Tech Stack

## Backend

- Java
- Spring MVC
- Hibernate ORM
- Maven

## Frontend

- JSP
- HTML
- CSS
- JavaScript
- JSTL

## Database

- MySQL

## In-Memory Storage

- Redis

## Server

- Apache Tomcat 9

## Tools

- Docker
- Git
- GitHub
- Eclipse IDE

---

# 📂 Project Structure

```
Restaurant-Reservation-System
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── controller
│   │   │   ├── dao
│   │   │   ├── service
│   │   │   ├── entity
│   │   │   └── config
│   │   │
│   │   ├── resources
│   │   │
│   │   └── webapp
│   │       ├── WEB-INF
│   │       │   └── views
│   │       ├── css
│   │       ├── js
│   │       └── images
│
├── pom.xml
├── docker-compose.yml
└── README.md
```

---

# ⚙️ System Workflow

### Customer

1. Open the website.
2. Fill in the reservation form.
3. Reservation is stored in **Redis** with **Pending** status.
4. Admin reviews the reservation.

### Admin

- View Pending Reservations
- Approve Reservation
- Reject Reservation
- When approved, the reservation is stored permanently in **MySQL**.
- View All Reservations
- Update Reservation
- Delete Reservation

---

# 🗄️ Database Schema

| Column | Type |
|---------|------|
| id | INT |
| name | VARCHAR |
| number | BIGINT |
| people | INT |
| reservation | DATE |
| ti | TIME |
| sta | VARCHAR |

---

# 🚀 Installation

## Clone Repository

```bash
git clone https://github.com/Devansh1516/restaurant-.git
```

---

## Start Docker

```bash
docker compose up -d
```

This starts:

- MySQL
- Redis

---

## Configure Database

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/resturent
spring.datasource.username=root
spring.datasource.password=your_password
```

---

## Run the Project

Deploy the project on **Apache Tomcat 9**.

Open:

```
http://localhost:8080/EmployeeManagementSystem/
```

---

# 📌 Modules

### Customer Module

- Home Page
- Reservation Form
- Location Page

### Admin Module

- Pending Reservations
- All Reservations
- Approved Reservations
- Rejected Reservations
- Update Reservation
- Delete Reservation

---

# 🔄 Reservation Flow

```
Customer
      │
      ▼
Submit Reservation
      │
      ▼
Store in Redis (Pending)
      │
      ▼
Admin Reviews
      │
 ┌────┴────┐
 │         │
 ▼         ▼
Approve   Reject
 │         │
 ▼         ▼
Save to   Remove / Mark Rejected
MySQL
```

---

# 🌟 Future Enhancements

- User Authentication
- Admin Login
- Email Confirmation
- SMS Notifications
- Table Availability
- Reservation History
- Payment Gateway Integration
- Dashboard Analytics
- Mobile Responsive UI

---

# 📚 Concepts Learned

- Spring MVC
- Hibernate ORM
- MVC Architecture
- CRUD Operations
- JSP & JSTL
- Java Collections
- Redis Integration
- MySQL Database
- Docker Containers
- Git & GitHub
- Maven Project Structure

---

# 👨‍💻 Author

**Devansh**

GitHub:
https://github.com/Devansh1516

---
