
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>

<html>
<head>
    <title>JSTL Demo</title>
</head>
<body>

    <h2>JSTL Tag Library Demonstration</h2>

    <c:set var="studentName" value="Abhishek" />
    <c:set var="marks" value="85" />

    <h3>1. c:if - Condition</h3>
    <c:if test="${marks >= 40}">
        <p>Status: Pass</p>
    </c:if>

    <h3>2. c:choose, c:when and c:otherwise</h3>
    <c:choose>
        <c:when test="${marks >= 90}">
            <p>Grade: A+</p>
        </c:when>
        <c:when test="${marks >= 75}">
            <p>Grade: A</p>
        </c:when>
        <c:when test="${marks >= 40}">
            <p>Grade: B</p>
        </c:when>
        <c:otherwise>
            <p>Grade: Fail</p>
        </c:otherwise>
    </c:choose>

    <h3>3. c:forEach - Iteration</h3>
    <c:forEach var="i" begin="1" end="5">
        <p>Subject ${i}</p>
    </c:forEach>

    <h3>4. Formatting using fmt</h3>
    <c:set var="average" value="85.567" />
    <p>Average:
        <fmt:formatNumber value="${average}"
                          maxFractionDigits="2" />
    </p>

</body>
</html>
