<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>boardWrite</title>
</head>
<body>
    <table>
        <div class="write-container">
            <table class="write-table">
                <form:form action="boardWritePost" method="post" modelAttribute="boardVO" enctype="multipart/form-data">
                    <tr>
                        <td>제목</td>
                        <td><form:input type="text" path="boardTitle" name="boardTitle"/></td>
                        <td>내용</td>
                        <td><form:input type="text" path="boardContent" name="boardContent"/></td>
                        <td>dd</td><td><form:input path="file" id="file" name="file" type="file"/></td>
                        <td><form:button type="submit">전송</form:button></td>
                    </tr>
                </form:form>
            </table>
        </div>
    </table>
</body>
</html>
