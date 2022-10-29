<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>お問い合わせフォーム</title>
</head>
<body>
	<form action="/example/requestform" method="post">
	<div style="text-align: center">
		<h1><font color="black">お問い合わせフォーム</font></h1><br>
		名前：<input type="text" name="name"><br> 
		男<input 	type="radio" name="gender" value="0">
		 女<input type="radio" name="gender" value="1"> <br>
		 電話番号:<input type="text" name="call"><br> 
		 お問い合わせの種類:
		<select 　name="qtype">
			<option value="security">セキュリティ</option>
			<option value="product">商品</option>
			<option value="use">使い方</option>
			<option value="paper">書類</option>
		</select><br>
		 詳細: <textarea name="body"></textarea><br> 
		 <input	type="submit">
		 </div>
</form>
</body>
</html>