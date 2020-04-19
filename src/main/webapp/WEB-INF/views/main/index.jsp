<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<title>WebSocket Chat Application</title>
<script type="text/javascript" src="./assets/jquery/jquery-3.4.1.js"></script>
<script src="./assets/js/app.js"></script>
</head>
<body>
	<div id="main-content" class="container">
			<jsp:include page="/WEB-INF/views/includes/header.jsp" />
		<div class="row">
			<div class="col-md-8">
				<form class="form-inline">
					<div class="form-group">
						<label for="connect">Chat Application:</label>
						<button id="connect" type="button">Start New Chat</button>
						<button id="disconnect" type="button" disabled="disabled">End
							Chat</button>
						<button id="login" type="button">login</button>

					</div>
				</form>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<table id="chat">
					<thead>
						<tr>
							<th>Welcome user. Please enter you name</th>
						</tr>
					</thead>
					<tbody id="helloworldmessage">
					</tbody>
				</table>
			</div>
			<div class="row">

				<div class="col-md-6">
					<form class="form-inline">
						<div class="form-group">
							<textarea id="user" placeholder="Write your message here..."
								required></textarea>
						</div>
						<button id="send" type="submit">Send</button>
					</form>
				</div>
			</div>
		</div>

	</div>
</body>
</html>