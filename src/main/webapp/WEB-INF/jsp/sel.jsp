<%--
  Created by IntelliJ IDEA.
  User: AcY
  Date: 2018/7/16
  Time: 17:13
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>姓名</td>
        <td>年龄</td>
        <td>图片地址</td>
        <td>操作</td>
    </tr>


    <c:forEach items="${list}" var="item" varStatus="vs">
        <tr>
            <td>
                    ${item.name}
            </td>
            <td>${item.age}</td>
            <td>${item.imgpath}</td>
                <%--<td><a href="javascript:" class="ssd" id="${item.id}"></a> </td>--%>
            <td><a href="javascript:" class="ssd" id="${item.id}">删除</a></td>
            <td><a href="/boot/uupdub?id=${item.id}">更新</a></td>

        </tr>
    </c:forEach>
</table>

</body>
<script type="text/javascript" src="/statics/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
    $(".ssd").on("click", function () {
        var obj = $(this);
        if (confirm("确定要删除吗")) {
            $.ajax({
                type: "GET",
                url: "/boot/DelDub",
                data: {id: obj.attr("id")},
                dataType: "json",
                success: function (data) {
                    if (data.messag == "1") {//删除成功：移除删除行
                        alert("删除成功");
                        location.reload();
                    } else if (data.messag == "0") {//删除失败
                        alert("对不起删除失败");
                    }
                },
                error: function (data) {
                    alert("对不起，删除失败");
                }
            });
        }
    });
//    $(function() {
//        $(".uup").on("click",function(){
//            var obj = $(this);//当前对象
//            window.location.href="/boot/uupdub/"+ obj.attr("id");
//        });
//    })
</script>

</html>
