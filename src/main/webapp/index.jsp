<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>展示书籍</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
</head>
<body>
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="rightheader">
                <p>
                    2009/11/20
                    <br />
                </p>
            </div>
            <div id="topheader">
                <h1 id="title">
                    <a href="#">main</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                Welcome!
            </h1>
            <form method="post" action="${pageContext.request.contextPath}/deleteMany.do">
                <table class="table">
                    <tr class="table_header">
                        <td>
                            全选
                        </td>
                        <td>
                            ID
                        </td>
                        <td>
                            账号
                        </td>
                        <td>
                            密码
                        </td>
                        <td>
                            操作
                        </td>
                    </tr>
                    <c:forEach items="${requestScope.list }" var="b">
                        <tr>
                            <td>
                                <input type="checkbox" name="ids" value="${b.id}"/>
                            </td>
                            <td>${b.id}</td>
                            <td>${b.name}</td>
                            <td>${b.pwd}</td>
                            <td>
                                <a href="delete.do?id=${b.id }">删除</a>&nbsp;
                                <a href="selectOne.do?id=${b.id }">修改</a>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
                <input type="submit" value="删除勾选项"/>
            </form>
            <p>
                <a href="add.jsp">添加书籍</a>
            </p>
        </div>
    </div>
    <div id="footer">
        <div id="footer_bg">
            ABC@126.com
        </div>
    </div>
</div>
</body>
</html>
