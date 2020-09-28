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
<%--jsp tag for I18N--%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Registration</title>

    <style>
        .error{
            color: #ff0000;
        }
        .errorblock{
            color: #000;
            background-color: #ffEEEE;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>

    <form:form modelAttribute="registration">
        <form:errors path="*" cssClass=".errorblock" element="div"/>
        <table>
            <tr>
                <td>
                    <spring:message code="name"/>
                </td>
                <td><form:input path="name"/></td>

                <td>
                    <form:errors path="name" cssClass="error"/>
                </td>

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
