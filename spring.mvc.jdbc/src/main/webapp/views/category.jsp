<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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

	<%@ include file="header.jsp"%>
	
	<!-- end header -->
	<section class="jumbotron text-center">
		<div class="container">
			<h1 class="jumbotron-heading">Danh mục sản phẩm</h1>
			<p class="lead text-muted mb-0">Tổng hợp tất cả sản phẩm theo từng danh mục</p>
		</div>
	</section>
	<div class="container">
		<div class="row">
			<div class="col">
				<nav aria-label="breadcrumb">
					<ol class="breadcrumb">
						<li class="breadcrumb-item"><a href="index.html">Trang chủ</a></li>
						<li class="breadcrumb-item"><a href="category.html">Danh mục sản phẩm</a></li>
					</ol>
				</nav>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-12 col-sm-3">
				<div class="card bg-light mb-3">
					<div class="card-header bg-primary text-white text-uppercase">
						<i class="fa fa-list"></i> Categories
					</div>
					<ul class="list-group category_block">
						<c:forEach items="${allcategory}" var="category">
							<a href="category?cid=${category.categoryID}">
								<li class="list-group-item ${categorytag == category.categoryID ? "active" : ""}">${category.categoryName}</li>
							</a>
						</c:forEach>
					</ul>
				</div>
				<div class="card bg-light mb-3">
					<div class="card-header bg-success text-white text-uppercase">Last product</div>
					<div class="card-body">
						<img class="card-img-top" src="${lastproduct.imageLink}" alt="Card image cap">
						<h4 class="card-title">
							<a href="product.html" title="View Product">${lastproduct.productName}</a>
						</h4>
						<p class="card-text">${lastproduct.description}</p>
						<div class="row">
							<div class="col">
								<p class="btn btn-danger btn-block">
									<fmt:setLocale value="vi_VN" />
									<fmt:formatNumber value="${lastproduct.price}" type="currency" />
								</p>
							</div>
							<div class="col">
								<a href="#" class="btn btn-success btn-block">Add to cart</a>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col">
				<div class="row">
					<c:forEach items="${product}" var="p">
						<div class="col-12 col-md-6 col-lg-4 mb-3">
							<div class="card">
								<img class="card-img-top"
									src="${p.imageLink}"
									alt="Card image cap">
								<div class="card-body">
									<h4 class="card-title">
										<a href="product?pid=${p.productID}" title="View Product">${p.productName}</a>
									</h4>
									<p class="card-text">${p.description}</p>
									<div class="row">
										<div class="col">
											<p class="btn btn-danger btn-block">
												<fmt:setLocale value="vi_VN" />
												<fmt:formatNumber value="${p.price}" type="currency" />
											</p>
										</div>
										<div class="col">
											<a href="#" class="btn btn-success btn-block">Add to cart</a>
										</div>
									</div>
								</div>
							</div>
						</div>
					</c:forEach>
					
					<div class="col-12">
						<nav aria-label="...">
							<ul class="pagination">
								<li class="page-item disabled"><a class="page-link"
									href="#" tabindex="-1">Previous</a></li>
								<li class="page-item"><a class="page-link" href="#">1</a></li>
								<li class="page-item active"><a class="page-link" href="#">2
										<span class="sr-only">(current)</span>
								</a></li>
								<li class="page-item"><a class="page-link" href="#">3</a></li>
								<li class="page-item"><a class="page-link" href="#">Next</a>
								</li>
							</ul>
						</nav>
					</div>
				</div>
			</div>

		</div>
	</div>

	<!-- Footer -->
	<footer class="text-light">
		<%@ include file="footer.jsp"%>
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
