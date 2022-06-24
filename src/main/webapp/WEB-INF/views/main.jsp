<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.example.jpabasics.domain.Member"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Main</title>
</head>
<body>
    <%
    List<Member> allmember = (List<Member>) request.getAttribute("allmember");
    %>
    
    <h1>로그인에 성공하셨습니다</h1>
        <table>
            <%
            for (Member am : allmember) {
            %>

            <tr class="children_table_body">
                <td><%=am.getMemberid()%></td>
                <td><%=am.getMemberpw()%></td>
                <td><%=am.getMemberbirth()%></td>
                <td><%=am.getMembernumber()%></td>
            </tr>
            <%
            }
            %>
        </table>
</body>
</html>

