<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>update Book</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
	</head>

	<body>
		<%-- <s:property value="user.name"/>===<br/> --%>
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
								<a href="#">Main</a>
							</h1>
						</div>
						<div id="navigation">
						</div>
					</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						update Book info:
					</h1>
					<form action="${pageContext.request.contextPath}/update.do" method="post">
						<table cellpadding="0" cellspacing="0" border="0" class="form_table">
							<tr>
								<td valign="middle" align="right">
									账号:
								</td>
								<td valign="middle" align="left">
									<input type="hidden" class="inputgri"  name="id" value="${user.id}" />
									<input type="text" class="inputgri" name="name" value="${user.name}"/>
								`</td>
								
							</tr>
							<tr>
								<td valign="middle" align="right">
									密码:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="pwd" value="${user.pwd}"/>
								</td>
							</tr>
						</table>
						<p>
							<input type="submit" class="button" value="修改" />
						</p>
					</form>
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
