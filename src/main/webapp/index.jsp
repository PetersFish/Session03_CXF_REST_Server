<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<script type="application/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
<script type="application/javascript" src="${pageContext.request.contextPath}/js/jquery.validate.js"></script>
<script type="application/javascript" src="${pageContext.request.contextPath}/js/messages_zh.js"></script>

<body>
用户信息查询：<input type="text" name="id" id="id"/>
<button onclick="checkUser()">查询</button>
</body>
<script>
    function checkUser() {
        location.href="${pageContext.request.contextPath}/user/"+$("#id").val()
    }
</script>
</html>
