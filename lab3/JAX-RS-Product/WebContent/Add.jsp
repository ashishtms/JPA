<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Page</title>
</head>
<body>
	<form name="frm" method="post" action="rest/products">
		Enter Product id:<input type="text" name="txtId" /><br> Enter
		Product name:<input type="text" name="txtName" /><br> Enter
		Product price:<input type="text" name="txtPrice" /><br> <input
			type="submit" value="Add Product" />
	</form>
</body>
</html>