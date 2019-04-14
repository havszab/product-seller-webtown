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
<form action="/products" method="get">
    <table>
        <th>Megnevezés</th>
        <th>Ár</th>
        <th>2=3</th>
        <th>Megapack</th>
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
                X
            </td>
            <td>

            </td>
            <td>
                <input type="number" min="0" name="Fogkrém">
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
                X
            </td>
            <td>

            </td>
            <td>
                <input type="number" min="0" name="Pomelo">
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
                X
            </td>
            <td>

            </td>
            <td>
                <input type="number" min="0" name="Lazacfilé">
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

            </td>
            <td>
                X
            </td>
            <td>
                <input type="number" min="0" name="Gomolya sajt">
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

            </td>
            <td>
                X
            </td>
            <td>
                <input type="number" min="0" name="Papírtörlő">
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

            </td>
            <td>
                X
            </td>
            <td>
                <input type="number" min="0" name="Mikulás csomag">
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

            </td>
            <td>

            </td>
            <td>
                <input type="number" min="0" name="Tej">
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

            </td>
            <td>

            </td>
            <td>
                <input type="number" min="0" name="Száraztészta">
            </td>
        </tr>
        </tbody>
    </table>
    <button type="submit">Buy items</button>
</form>
</body>
</html>
