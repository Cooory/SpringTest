<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AJAX로 submit 대신 웹 요청하기</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"><link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>

	<div class="container">
		<h1>즐겨 찾기 추가하기</h1>
		
		<div>
			<label>제목</label>
			<input type="text" id="titleInput" class="form-control">
		</div>
		
		<div>
			<label>주소</label>
			<div class="d-flex">
				<input type="text" id=addressInput class="form-control mr-2">
				<button type="button" id="confirmBtn" class="btn btn-primary">중복확인</button>
			</div>
		</div>
		
		<button type="button" id="addBtn" class="btn btn-success btn-block mt-3">추가</button>
	</div>
	
	
	 <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
  <!-- <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script> -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>


	<script>
		$(document).ready(function() {
			
			$("#confirmBtn").on("click", function() {
				var url = $("#url").val().trim();
				if (url == "") {
					alert("검사 할 url을 입력해주세요.");
				}
				
				$.ajax({
					type: "post"
					, url: "/ajax/duplicate-url"
					, data:{"title"}
					
				});
			});
			
			
			$("#addBtn").on("click", function() {
				// 사용자가 입력한 사이트 이름,주소를 얻어 와서
				// create api 호출
				let title = $("#titleInput").val();
				let address = $("#addressInput").val();
				
				// 유효성 검사
				if (title == "") {
					alert("제목을 입력하세요");
					return ;
				}
				
				if (address == "") {
					alert("주소를 입력하세요");
					return ;
				}
				
				// 주소가 http:// https:// 로 시작하지 않으면
				// 주소가 http:// 로 시작하지 않고, https://로도 시작하지 않으면
				if (!address.startsWith("http://") && !address.startsWith("https://")) {
					alert("주소 형식을 확인 해 주세요");
					return ;
				}
				
				$.ajax({
					type:"post"
					, url:"/ajax/create"
					, data:{"name":title, "url":address}
					, success:function(data) {
						// 성공  : {"result":"success"}
						// 실패 : {"result":"fail"}
						if (data.result = "success") {
							location.href="/ajax/list"
						} else {
							alert("추가 실패")
						}
					}
					, error:function() {
						alert("추가 에러!!");
					}
				});
			})
		});
	</script>
</body>
</html>