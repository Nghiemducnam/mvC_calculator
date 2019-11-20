
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <form action="/calculate" method="post">
    <tr>
        <td><input type="text" name="operand1"/></td>
        <td><input type="text" name="operand2"/></td>
    </tr>

    <tr>
        <td><button type="submit" name="operator" value="+">cộng</button> </td>
        <td><button type="submit" name="operator" value="-">trừ</button> </td>
        <td><button type="submit" name="operator" value="*">nhân</button> </td>
        <td><button type="submit" name="operator" value="/">chia</button> </td>
    </tr>
    <div>=======> The result is: ${result}</div>
    </form>
</table>
</body>
</html>
