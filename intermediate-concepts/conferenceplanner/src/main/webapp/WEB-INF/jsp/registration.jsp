<%--
  Created by IntelliJ IDEA.
  User: patrick
  Date: 27/09/2020
  Time: 9:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--jsp tags for forms--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <title>Registration</title>
    <form:form modelAttribute="registration">
        <table>
            <tr>
                <td>Name:</td>
                <td><form:input path="name"/></td>
            </tr>
            <td colspan="2">
                <input type="submit" value="Add Registration">
            </td>
            <tr>
            </tr>
        </table>
    </form:form>


</head>
<body>

<h1>${message}</h1>

</body>
</html>
