<%--
  Created by IntelliJ IDEA.
  User: AcY
  Date: 2018/7/17
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<from>
<input type="hidden" name="id" value="${Dub.id }"/>

<div class="">
    <label for="name">姓名：</label>
    <input type="text" name="name" id="name" value="${Dub.name}"/>
</div>
    <div class="">
        <label for="age">年龄：</label>
        <input type="text" name="age" id="age" value="${Dub.age}"/>
    </div>
    <div class="">
        <label for="imgpath">图片：</label>
        <input type="text" name="imgpath" id="imgpath" value="${Dub.imgpath}"/>
        <%--<img src="${Dub.imgpath}}">--%>
    </div>
</from>
</body>
</html>
