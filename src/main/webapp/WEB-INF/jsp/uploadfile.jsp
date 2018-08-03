
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示页面</title>

</head>
<body>
<form id="userForm" name="userForm" method="post" enctype="multipart/form-data"
      action="${pageContext.request.contextPath }/boot/index">
    <div>
        <label for="name">用户姓名：</label>
        <input type="text" name="name" id="name" value="">
        <!-- 放置提示信息 -->
        <font color="red"></font>
    </div>
    <div>
        <label for="age">用户年龄：</label>
        <input type="text" name="age" id="age" value="">
        <!-- 放置提示信息 -->
        <font color="red"></font>
    </div>
    <div>
        <input type="hidden" id="errorinfo" value="${uploadFileWpError}">
        <label for="a_idPicPath">上传图片：</label>
        <input name="attachs" id="a_idPicPath" type="file">
        <font color="red"></font>
    </div>

    <div class="providerAddBtn">
        <input type="submit" name="add" id="add" value="保存" >
        <input type="button" id="back" name="back" value="返回" >
    </div>
</form>
</body>
</html>
