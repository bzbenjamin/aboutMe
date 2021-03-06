<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>



<html>
<head>
<meta name="viewport" content="width=device-width,initial-scale=1">
<title>Welcome</title>
<jsp:include page="imports.jsp" />
</head>
<body>
	<jsp:include page="header.jsp" />


	<div class="container table-responsive bio_intro content">

		<div id="dashboard" class="main">
			<div id="gallery"><a href="resources/img/small/IMG_1197.JPG" rel="gallery" title="moon scene"><img src="resources/img/small/IMG_1197.JPG" width="70" height="70"
				></a>
				<a href="resources/img/small/IMG_1208.JPG" rel="gallery" title="capsule"> <img src="resources/img/small/IMG_1208.JPG"
				width="70" height="70" > </a>
				<a href="resources/img/small/IMG_1226.JPG" rel="gallery" title="future robot"><img
				src="resources/img/small/IMG_1226.JPG" width="70" height="70"
				></a>
				<a href="resources/img/small/IMG_1227.JPG" rel="gallery" title="space chamber"> <img src="resources/img/small/IMG_1227.JPG"
				width="70" height="70" ></a>
				<a href="resources/img/small/IMG_1232.JPG" rel="gallery" title="rocket engine"> <img
				src="resources/img/small/IMG_1232.JPG" width="70" height="70"
				></a>
				<a href="resources/img/small/IMG_1233.JPG" rel="gallery" title="rocket selfie"> <img src="resources/img/small/IMG_1233.JPG"
				width="70" height="70" ></a>
			</div>
		</div>

		<div class="jumbotron table-responsive">

			<img src="resources/img/suit_headshot.jpg" alt=""
				class="image-responsive img-circle" height="140" width="120" />

			<h2 class="blackquote">Hi, I'm Benjamin.I am a web application
				developer based out of Philadelphia.</h2>
			<p>This application was written using Java Spring, Bootstrap Css,
				Jquery and hosted on Amazon Web Service Elastic Beanstalk. I am
				looking to experiment with different web technologies, including,
				but not limited to Python Django, Ruby on Rails, AngularJS, and
				PHP/WordPress.</p>
		</div>
	
	</div>

	<jsp:include page="footer.jsp" />

</body>
</html>
