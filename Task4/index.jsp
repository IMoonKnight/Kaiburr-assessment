<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>WebUI</title>
</head>
<body>
<div>
    <form id="myForm" action="/getbyid" method="post" target="_blank">
        <p>
            Name <input type="text" name="ID" required/>
        </p>
        <p>
        <input type="button" value="Submit">
        </p>

    </form>

    <script>

        document.getElementById("myForm").addEventListener("submit", function(event) {
            event.preventDefault();

            // Open a new window or tab with the "done" message
            var newWindow = window.open('', '_blank');
            newWindow.document.write('<html><head><title>Submission Result</title></head><body>');
            newWindow.document.write('123 my centos java spring');
            newWindow.document.write('</body></html>');
            newWindow.document.close();


            this.submit();
        });
    </script>
</div>
</body>
</html>
