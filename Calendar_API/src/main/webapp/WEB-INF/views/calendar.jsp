<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="./dist/fullcalendar-5.10.2/lib/main.css" />
<link rel="stylesheet" href="./dist/datetimepicker/jquery.datetimepicker.css">
<script src="https://unpkg.com/@popperjs/core@2/dist/umd/popper.js"></script>
<script src="https://unpkg.com/tippy.js@6"></script>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script type="text/javascript" src="./dist/datetimepicker/jquery.datetimepicker.full.min.js"></script>
<script type="text/javascript" src="./dist/fullcalendar-5.10.2/lib/main.min.js"></script>
<script type="text/javascript" src="./js/cal.js"></script>
<script type="text/javascript" src="./js/datatime.js"></script>
<style type="text/css">
  body { 
        margin: 40px 10px; 
        padding: 0; 
        font-family: "Lucida Grande",Helvetica,Arial,Verdana,sans-serif; 
        font-size: 14px; 
    } 

#calendar {
  max-width: 800px;
  height: 400px;
  margin: 40px auto;
}
    
    .koHolidays{
    	pointer-events: none;
    }
    
</style>
</head>
<body>
	<div class="container">
		<form method="post" id="frm">
			<div>
				<b>작성자 : </b>
				<input type="text" id="writer" name="writer">
				<b>일정명 : </b>
				<input type="text" id="title" name="title">
				<b>내용 : </b>
				<input type="text" id="content" name="description">
			</div>
			
			<div style="margin-top: 10px;">
				<b>그룹 : </b>
				<input type="number" id="groupid" name="groupid">
				<!-- datetimepicker -->
				<b>일정 시작일 : </b>
				<input type="text" name="start" id="datetimepicker1" readonly="readonly" ondblclick="return false"><img src="./imges/reply.png" id="imagebutton">
				<!-- datetimepicker -->
				<b>일정 종료일 : </b>
				<input type="text" name="end" id="datetimepicker2" readonly="readonly"><img src="./imges/reply.png" id="imagebutton2">
			</div>
			<div>
				<input type="button" onclick="insertAjax()" value="전송">
			</div>
		</form>
	</div>
	<div id="calendar"></div>
</body>
</html>