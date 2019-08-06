<%--
  Created by IntelliJ IDEA.
  User: 薄纯鑫
  Date: 2019/5/13
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <%-- <script  src="https://code.jquery.com/jquery-1.8.2.min.js"></script> --%>
    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery/jquery-1.8.2.js"></script>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/css.css"/>
</head>
<body>

        <form action="add" method="post" enctype="multipart/form-data">
            <table>
                <tr>
                    <td>商品名称 <input type="text" name="name"/></td>
                </tr>
                <tr>
                    <td>商品描述 <input type="text" name="introl"/></td>
                </tr>
                <tr>
                    <td>商品单价 <input type="text" name="money"/></td>
                </tr>
                <tr>
                    <td>微缩图
                            <input type="file" name="fileName"/>
                    </td>
                </tr>
                <tr>

                    <td>类别
                        <select name="tid">
                            <c:forEach items="${list}" var="e">
                                <option value="${e.tid}">${e.tname}</option>
                            </c:forEach>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td colspan="1">
                        <input type="submit" value="提交"/>
                    </td>
                </tr>
            </table>
        </form>
</body>
</html>
