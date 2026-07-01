<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Admin Dashboard</title>
    <link rel="stylesheet" href="css/admin.css">
</head>

<body>


<div class="container">

    <h1>Admin Dashboard</h1>
    
 <div class="option-area">
    <select onchange="changePage(this.value)">
        <option value="admin" selected>Pending Reservations</option>
        <option value="all">All Reservations</option>
    </select>
</div>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Phone</th>
            <th>People</th>
            <th>Date</th>
            <th>Time</th>
            <th>Status</th>
            <th>Action</th>
        </tr>
        <c:forEach var="res" items="${list}">
            <tr>
                <td>${res.id}</td>
                <td>${res.name}</td>
                <td>${res.number}</td>
                <td>${res.people}</td>
                <td>${res.resevation}</td>
                <td>${res.ti}</td>

                <td class="status ${res.sta}">
                    ${res.sta}
                </td>

                <td>
                    <a href="approve?tempid=${res.tempid}" class="btn approve">Approve</a>
                    <a href="reject?tempid=${res.tempid}" class="btn reject">Reject</a>
                </td>
            </tr>
        </c:forEach>

    </table>

</div>
<script src="js/script.js"></script>
</body>
</html>