<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="fr">
<head>
<!-- Site meta -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Free Bootstrap 4 Ecommerce Template</title>
<!-- CSS -->
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" type="text/css">
<link
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link href="//fonts.googleapis.com/css?family=Open+Sans:400,300,600"
	rel="stylesheet" type="text/css">
<link href="<c:url value="/template/css/style.css"/>" rel="stylesheet"
	type="text/css">
</head>
<body>

	<!-- header -->
	
	<%@ include file="header.jsp" %>
	
	<!-- end header -->
	
	<section class="jumbotron text-center">
		<div class="container">
			<h1 class="jumbotron-heading">Liên hệ</h1>
			<p class="lead text-muted mb-0">Hãy gửi thông tin liên hệ tới chúng tôi nếu bạn cần sự trợ giúp!!!</p>
		</div>
	</section>
	<div class="container">
		<div class="row">
			<div class="col">
				<nav aria-label="breadcrumb">
					<ol class="breadcrumb">
						<li class="breadcrumb-item"><a href="index.html">Home</a></li>
						<li class="breadcrumb-item active" aria-current="page">Contact</li>
					</ol>
				</nav>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<div class="col">
				<div class="card">
					<div class="card-header bg-primary text-white">
						<i class="fa fa-envelope"></i> Liên hệ chúng tôi.
					</div>
					<div class="card-body">
						<form>
							<div class="form-group">
								<label for="name">Tên</label> <input type="text"
									class="form-control" id="name" aria-describedby="emailHelp"
									placeholder="Enter name" required>
							</div>
							<div class="form-group">
								<label for="email">Địa chỉ Email</label> <input type="email"
									class="form-control" id="email" aria-describedby="emailHelp"
									placeholder="Enter email" required> <small
									id="emailHelp" class="form-text text-muted">Chúng tôi sẽ không chia sẻ thông tin này đến bất kỳ ai</small>
							</div>
							<div class="form-group">
								<label for="message">Tin nhắn</label>
								<textarea class="form-control" id="message" rows="6" required></textarea>
							</div>
							<div class="mx-auto">
								<button type="submit" class="btn btn-primary text-right">Gửi thông tin</button>
							</div>
						</form>
					</div>
				</div>
			</div>
			<div class="col-12 col-sm-4">
				<div class="card bg-light mb-3">
					<div class="card-header bg-success text-white text-uppercase">
						<i class="fa fa-home"></i> Địa chỉ cửa hàng
					</div>
					<div class="card-body">
						<p>3 rue des Champs Elysées</p>
						<p>75008 PARIS</p>
						<p>France</p>
						<p>Email : email@example.com</p>
						<p>Tel. +33 12 56 11 51 84</p>

					</div>

				</div>
			</div>
		</div>
	</div>

	<!-- Footer -->
	<footer class="text-light">
		<%@ include file="footer.jsp" %>
	</footer>

	<!-- JS -->
	<script src="//code.jquery.com/jquery-3.2.1.slim.min.js"
		type="text/javascript"></script>
	<script
		src="//cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		type="text/javascript"></script>
	<script
		src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		type="text/javascript"></script>

</body>
</html>
