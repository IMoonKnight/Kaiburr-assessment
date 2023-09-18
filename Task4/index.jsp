<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>WebUI</title>
</head>
<body>
<div>
    <form id="myForm" action="/add" method="post" target="_blank">
        <p>
            ID <input type="number" name="ID" required/>
        </p>
        <p>
            Name <input type="text" name="name" required/>
        </p>
        <p>
            Language <input type="text" name="lang" required/>
        </p>
        <p>
            Framework <input type="text" name="frame" required/>
        </p>
        <p>
            <input type="submit" value="Submit"/>
        </p>
    </form>

    <script>
        // You can add any necessary form validation here before submitting.
        // For simplicity, we'll assume the form is always valid.
        document.getElementById("myForm").addEventListener("submit", function(event) {
            event.preventDefault(); // Prevent the form from submitting normally

            // Open a new window or tab with the "done" message
            var newWindow = window.open('', '_blank');
            newWindow.document.write('<html><head><title>Submission Result</title></head><body>');
            newWindow.document.write('<h1>Done</h1>'); // Display "done" in the new window
            newWindow.document.write('</body></html>');
            newWindow.document.close(); // Close the document for writing

            // Submit the form
            this.submit();
        });
    </script>
</div>
</body>
</html>
