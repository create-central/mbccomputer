<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>input</title>
</head>
<body>

	<h1>input</h1>
	
		<form action="/test_Prj/UploadReg" method="post" enctype="multipart/form-data">
	
			<table border="">
			
			<tr>
				<td>이름</td>
				<td><input type="text" name="pname" /></td>
			</tr>
			
			<tr>
				<td>전화번호</td>
				<td><input type="number" name="pnum" /></td>
			</tr>
			
			<tr>
				<td>생년월일</td>
				<td><input type="number" name="pday" /></td>
			</tr>
			
			<tr>
				<td>주소</td>
				<td><input type="text" name="paddr" /></td>
			</tr>
			
			<tr>
				<td>사진</td>
				<td><input type="file" name="up1" /></td>
			</tr>
			
			<tr>
				<td>포트폴리오</td>
				<td><input type="file" name="up2" multiple /></td>
			</tr>
			
			
			
			<tr>
				<td colspan="2" align="center">
				<input type="submit" value="작성" />
				</td>
			</tr>
			
			
			
			</table>
	
	
		</form>
	

</body>
</html>