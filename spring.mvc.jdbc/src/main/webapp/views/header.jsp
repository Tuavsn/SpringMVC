<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Option 1: Include in HTML -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
<!-- Header -->
<nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
	<div class="container">
		<a class="navbar-brand" href="index.jsp">Shop bán quần áo</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarsExampleDefault"
			aria-controls="navbarsExampleDefault" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse justify-content-end"
			id="navbarsExampleDefault">
			<ul class="navbar-nav m-auto">
				<li class="nav-item">
					<a class="nav-link" href="home">
						<i class="bi bi-house-door" style="font-size: 21px"></i>
						Trang chủ
						<span class="sr-only">(current)</span>
					</a>
				</li>
				<li class="nav-item dropdown">
			 		<a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
				 		<i class="bi bi-bookmark-plus-fill" style="font-size: 21px"></i>
				 		Danh mục
			 		</a>
					<ul class="dropdown-menu">
						<c:forEach items="${allcategory}" var="category">
							<li><a class="dropdown-item" href="#">${category.categoryName}</a></li>
						</c:forEach>
					</ul>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="contact">
						<i class="bi bi-person-lines-fill" style="font-size: 21px"></i>
						Liên hệ
					</a>
				</li>
			</ul>

			<form class="form-inline my-2 my-lg-0">
				<div class="input-group input-group-sm">
					<input type="text" class="form-control" placeholder="Tìm sản phẩm...">
					<div class="input-group-append">
						<button type="button" class="btn btn-secondary btn-number">
							<i class="fa fa-search"></i>
						</button>
					</div>
				</div>
				<a class="btn btn-success btn-sm ml-3" href="cart"> <i
					class="fa fa-shopping-cart"></i> Giỏ hàng <span
					class="badge badge-light">3</span>
				</a>
			</form>
		</div>
	</div>
</nav>