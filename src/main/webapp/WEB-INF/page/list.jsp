<%--
  Created by IntelliJ IDEA.
  User: 薄纯鑫
  Date: 2019/5/13
  Time: 9:06
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
    <SCRIPT type="text/javascript">

        function getPage(pa) {
            location.href="list?page="+pa;
        }
        $(function () {
        //全选全不选
            $("#qu").click(function () {
                $(".aa").prop("checked",$("#qu").prop("checked"));
            })
            //反选
            $("#fx").click(function () {
                $(".aa").each(function () {
                    $(this).prop("checked",!$(this).prop("checked"));
                })
            })

            
            //删除
            $("#del").click(function () {
               var ids="";
                $(".aa:checked").each(function () {
                    ids+=","+$(this).val();
                })
                $.post(
                    "del",
                    {"ids":ids},
                    function (obj) {
                        alert(obj);
                       location="list";
                    },
                    "text"
                )

            })
        })

    </SCRIPT>
</head>
<body>
        <TABLE>

            <tr>
                <td colspan="10">
                       <input type="button" value="删除" id="del"/>
                  <A href="toadd"> <input type="button" value="添加"/></A>
                    <FORM action="/list" method="post">
                    商品名:<input type="text" name="name" value="${shop.name}"/>
                    商品描述:<input type="text" name="introl" value="${shop.introl}" />\
                    日期范围:<input type="datetime-local" name="starttime" value="${shop.starttime}" />
                    日期范围:<input type="datetime-local" name="endtime" value="${shop.endtime}" />
                        <input type="submit" value="搜索"/>
                    </FORM>
                </td>
            </tr>
            <tr>
                <td>ID</td>
                <td><input type="checkbox" id="qu"/>全选/全不选
                    <input type="checkbox" id="fx"/>反选
                </td>
                <td>微缩图</td>
                <td>商品名称</td>
                <td>描述</td>
                <td>单价</td>
                <td>创建时间</td>
                <td>更改时间</td>
                <td>发布状态</td>
                <td>操作</td>
            </tr>
            <c:forEach items="${list}" var="e">
                <tr>

                    <td>${e.id}</td>
                    <TD>
                         <input type="checkbox" class="aa" value="${e.id}" />
                    </TD>
                    <td><img src="${pageContext.request.contextPath}/${e.imges}" width="100px"></td>
                    <td>${e.name}</td>
                    <td>${e.introl}</td>
                    <td>${e.money}</td>
                    <td>${e.starttime}</td>
                    <td>${e.endtime}</td>
                    <td>${e.stater==1 ? '已发布':'已下架'}</td>
                    <td>

                    </td>
                </tr>
            </c:forEach>
            <tr>
                <td colspan="10">
                    <button onclick="getPage(${of.startRow})">首页</button>
                    <button onclick="getPage(${of.prePage})" >上一页</button>
                    <button onclick="getPage(${of.nextPage})" >下一页</button>
                    <button onclick="getPage(${of.endRow})" >尾页</button>
                </td>
            </tr>
        </TABLE>

</body>
</html>
