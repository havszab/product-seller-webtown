<%@ page import="java.util.List" %>
<%@ page import="com.codecool.havszab.model.Product" %><%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2019. 04. 14.
  Time: 9:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" --%>
<html>
<head>
    <title>Vásárlás</title>
</head>

<body>
    <table>
        <th>Megnevezés</th>
        <th>Ár</th>
        <th>Mennyiség</th>
        <tbody>
        <tr>
            <td>
                Fogkrém
            </td>
            <td>
                1195
            </td>
            <td>
                ${toothpaste}
            </td>
        </tr>
        <tr>
            <td>
                Pomelo
            </td>
            <td>
                349
            </td>
            <td>
                ${pomelo}
            </td>
        </tr>
        <tr>
            <td>
                Lazacfilé
            </td>
            <td>
                1290
            </td>
            <td>
                ${salmon}
            </td>
        </tr>
        <tr>
            <td>
                Gomolya sajt
            </td>
            <td>
                2290
            </td>
            <td>
                ${cheese}
            </td>
        </tr>
        <tr>
            <td>
                Papírtörlő
            </td>
            <td>
                449
            </td>
            <td>
                ${towel}
            </td>
        </tr>
        <tr>
            <td>
                Mikulás csomag
            </td>
            <td>
                1499
            </td>
            <td>
                ${pack}
            </td>
        </tr>
        <tr>
            <td>
                Tej
            </td>
            <td>
                289
            </td>
            <td>
                ${milk}
            </td>
        </tr>
        <tr>
            <td>
                Joghurt
            </td>
            <td>
                329
            </td>
            <td>
                ${joghurt}
            </td>
        </tr>
        <tr>
            <td>
                Száraztészta
            </td>
            <td>
                599
            </td>
            <td>
                ${pasta}
            </td>
        </tr>
        </tbody>
    </table>
    <p>Eredeti ár: ${defaultPrice} Ft</p>
    <p>Kedvezményes ár: ${discountedPrice} Ft</p>
    <p>Kedvezmény típusa: ${type} </p>
</body>
</html>
