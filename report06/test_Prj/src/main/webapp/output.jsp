<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>입력 결과</h1>
	
	<table border="1">
        <tr>
            <th>항목</th>
            <th>내용</th>
        </tr>
        <tr>
            <td>이름</td>
            <td><%= request.getAttribute("pname") %></td>
        </tr>
        <tr>
            <td>전화번호</td>
            <td><%= request.getAttribute("pnum") %></td>
        </tr>
        <tr>
            <td>생년월일</td>
            <td><%= request.getAttribute("pday") %></td>
        </tr>
        <tr>
            <td>주소</td>
            <td><%= request.getAttribute("paddr") %></td>
        </tr>
        
        <tr>
			<td>사진</td>
			<td>
			<img src="<%= request.getAttribute("imgUrl") %>" alt=""  style="width: 33%; height: 33%;">
			<br>
			<%= request.getAttribute("fname") %>
			</td>
		</tr>
		<tr>
			<td>포트폴리오</td>
			<td> </td>
		</tr>
        
        
        
    </table>
	

</body>
</html>