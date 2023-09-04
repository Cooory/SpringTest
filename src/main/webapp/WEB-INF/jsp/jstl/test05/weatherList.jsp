<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>종합문제 1</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"><link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<link rel="stylesheet" href="/jstl/css/style.css" type="text/css">
</head>
<body>


<div id="wrap">
	<section class="contents d-flex">
		<aside class="left-contents bg-primary col-2 pt-3">
			<div class="logo d-flex justify-content-center"> 
				<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/Emblem_of_the_Government_of_the_Republic_of_Korea.svg/800px-Emblem_of_the_Government_of_the_Republic_of_Korea.svg.png" width="25" height="25">
				<span class="text-white font-weight-bold ml-2">기상청</span>
			</div>
			<nav class="nav">
				<ul class="nav flex-column">
					<li class="nav-item font-weight-bold"><a href="#" class="nav-link text-white">날씨</a></li>
					<li class="nav-item font-weight-bold"><a href="#" class="nav-link text-white">날씨입력</a></li>
					<li class="nav-item font-weight-bold"><a href="#" class="nav-link text-white">테마날씨</a></li>
					<li class="nav-item font-weight-bold"><a href="#" class="nav-link text-white">관측 기후</a></li>
				</ul>
			</nav>
		</aside>
		<div class="right-contents col-10 container ml-3">
			<h1>과거 날씨</h1>
			
			<table class="table text-center">
				<thead>
					<tr>
						<th>날짜</th>
						<th>날씨</th>
						<th>기준</th>
						<th>강수량</th>
						<th>미세먼지</th>
						<th>풍속</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var= "day" items="${ }" >
					<tr>
						<td>202020</td>
						<td>ads</td>
						<td>ads</td>
						<td>ads</td>
						<td>ads</td>
						<td>ads</td>
					</tr>
					<tr>
						<td>202020</td>
						<td>ads</td>
						<td>ads</td>
						<td>ads</td>
						<td>ads</td>
						<td>ads</td>
					</tr>
				</tbody>
			</table>
		</div>
	</section>
	<footer class="d-flex align-items-center">
		<div class="footer-logo pl-3 col-2">
			<img src="https://www.weather.go.kr/w/resources/image/foot_logo.png" width="120">
		</div>
		<div>
			<div class="pl-3 text-secondary">(07062) 서울시 동작구 여의대방로16길 61 <br>
					Copyright@2023 KMA. All Rights RESERVED.</div>
		</div>
	</footer>
	
</div>











<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>