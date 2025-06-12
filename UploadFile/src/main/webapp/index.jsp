<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<form action="upload" method="post" enctype="multipart/form-data">
    <input type="file" name="files" placeholder="upload your file" multiple>
    <input type="submit">

</form>
</body>
</html>