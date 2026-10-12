
<!DOCTYPE html>
<html>
<head>
    <title>Student Marks</title>
</head>
<body>
    <h2>Student Mark Details</h2>

    <%!
        int mark1 = 80;
        int mark2 = 75;
        int mark3 = 90;

        int calculateTotal() {
            return mark1 + mark2 + mark3;
        }

        double calculateAverage() {
            return calculateTotal() / 3.0;
        }
    %>

    <p>Mark 1: <%= mark1 %></p>
    <p>Mark 2: <%= mark2 %></p>
    <p>Mark 3: <%= mark3 %></p>

    <p>Total Marks: <%= calculateTotal() %></p>
    <p>Average Marks: <%= calculateAverage() %></p>

</body>
</html>
