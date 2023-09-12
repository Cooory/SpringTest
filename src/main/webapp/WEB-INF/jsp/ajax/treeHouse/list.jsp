<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List page</title>
<link rel="stylesheet" href="/ajax/css/style.css" type="text/css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

</head>
<body>


	<div id="wrap" >
       <header class="mt-4">
           <div class="text-center display-4">통나무 팬션</div>
           <nav class="mt-4">
               <ul class="nav nav-fill">
                   <li class="nav-item"><a class="nav-link" href="#">팬션소개</a></li>
                   <li class="nav-item"><a class="nav-link" href="#">객실보기</a></li>
                   <li class="nav-item"><a class="nav-link" href="#">예약안내</a></li>
                   <li class="nav-item"><a class="nav-link" href="#">커뮤니티</a></li>
               </ul>
           </nav>
       </header>

       <section class="banner">
           
           <h1 class="text-center">예약 목록 보기</h1>
           
           <table class="table">
           		<thead>
           			<tr>
           				<th>이름</th>
           				<th>예약날짜</th>
           				<th>숙박일수</th>
           				<th>숙박인원</th>
           				<th>전화번호</th>
           				<th>예약상태</th>
           				<th></th>
           			</tr>
           		</thead>
           		<tbody>
           			<c:forEach var="booking" items="${ }">
           			<tr>
           				<td>김인규</td>
           				<td>2021년</td>
           				<td>2</td>
           				<td>4</td>
           				<td>010254215251</td>
           				<td>대기중</td>
           				<td><button class="btn btn-danger">삭제</button></td>
           			</tr>
           			 <tr>
           				<td>김인규</td>
           				<td>2021년</td>
           				<td>2</td>
           				<td>4</td>
           				<td>010254215251</td>
           				<td>대기중</td>
           				<td><button class="btn btn-danger">삭제</button></td>
           			</tr>
           		</tbody>
           </table>
       </section>
       <section class="d-flex">
           <article class="reservation d-flex justify-content-center align-items-center">
               <div class="display-4">
                   실시간 <br>
                   예약 하기 
               </div>
           </article>
           <article class="reservation-confirm">
               <div class="m-4">
                   <div class="d-flex align-items-end">
                       <h3 class="mr-4">예약 확인</h3>
                   
                       <label>회원
                       <input type="radio" name="type" value='member' checked></label>
                       <label class="ml-3">비 회원
                       <input type="radio" name="type" value="nonMemeber"></label>
                   </div>
                   <div class="member-input mt-3" id="member">
                       <div class="input-gorup form-inline">
                           <label class="input-label">아이디 :</label>
                           <input type="text" class="form-control text-input" id="id">
                       </div>
                       <div class="input-gorup form-inline mt-3">
                           <label class="input-label">비밀번호 :</label>
                           <input type="password" class="form-control text-input" id="password">
                       </div>

                   </div>

                   <div class="no-member-input mt-3 d-none" id="nonMember">
                       <div class="input-gorup form-inline">
                           <label class="input-label">이름 </label>
                           <input type="text" class="form-control text-input" id="name">
                       </div>
                       <div class="input-gorup form-inline mt-3">
                           <label class="input-label">전화번호 </label>
                           <input type="text" class="form-control text-input" id="phoneNumber">
                       </div>
                       <div class="input-gorup form-inline mt-3">
                           <label class="input-label">날짜 </label>
                           <input type="text" class="form-control text-input" id="date">
                       </div>

                   </div>
                   <div class="d-flex justify-content-end">
                       <button class="btn btn-success mt-3 mr-5" id="lookupBtn">조회 하기</button>
                   </div>
               </div>
           </article>
           <article class="reservation-call d-flex justify-content-center align-items-center">
               <div>
                   <h3>예약문의 : </h3>
                   <h1>010-</h1>
                   <h1>000-1111</h1>
               </div>
           </article>
       </section>

       <footer class="mt-3 ml-4">
           <address>
               제주특별자치도 제주시 애월읍  <br>
               사업자등록번호: 111-22-255222 / 농어촌민박사업자지정 / 대표:김통목 <br>
               Copyright 2025 tongnamu All right reserved
           </address>

       </footer>


   </div>

<body>
    
        







	<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>        
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>

</body>
</html>