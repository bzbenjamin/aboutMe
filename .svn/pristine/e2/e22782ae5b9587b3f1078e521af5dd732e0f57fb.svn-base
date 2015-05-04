<!DOCTYPE HTML>


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<html>
<head>

<title>Contact</title>
<jsp:include page="imports.jsp" />
</head>

<body>

	<jsp:include page="header.jsp" />



	<!-- <div class="container table-responsive">
		<div class="jumbotron table-responsive">
			<h2>Drop us a line</h2>
			<form method="POST" action="/aboutMe/contact" id="contact">
				<div>
					<input type="text" value="Name" name="name" id="contact_name"
						onclick="if(this.value == 'Name'){this.value ='';}"
						onblur="if(this.value == ''){this.value = 'Name';}"> <span
						class="error">This field is required</span>
				</div>


				<div>
					<input type="text" value="Email" name="emailAddress"
						id="contact_email"
						onclick="if(this.value == 'Email'){this.value ='';}"
						onblur="if(this.value == ''){this.value = 'Email';}"> <span
						class="error">A valid email address is required</span>
				</div>

				<div>
					<input type="text" value="Phone" name="phoneNumber"
						id="contact_phone"
						onclick="if(this.value=='Phone'){this.value='';}"
						onblur="if(this.value==''){this.value= 'Phone';}" /> <span
						class="error">A valid phone number is required</span>
				</div>

				<div>
					<input type="text" value="Subject" name="subject"
						id="contact_subject"
						onclick="if(this.value=='Subject'){this.value='';}"
						onblur="if(this.value==''){this.value='Subject';}" /> <span
						class="error">Please enter a valid subject</span>
				</div>
				<div>

					<textarea name="message" id="contact_message"
						onClick="if(this.value == 'Message'){this.value ='';}"
						onBlur="if(this.value == ''){this.value = 'Message';}">Message</textarea>
				</div>

				<div id="contact_submit">
					<input type="submit" value="submit" />
				</div>
			</form>
		</div>
	</div> -->

	<!-- 	<div class="container responsive">
<div class="jumbotron responsive">
		<h1>Form</h1>
		<form method="POST" action="/aboutMe/contact">
			<table>
				<tr>
					<td><input type="text" value="Email" name="emailAddress"
						onclick="if(this.value == 'Email'){this.value ='';}"
						onblur="if(this.value == ''){this.value = 'Email';}"></td>
				</tr>
				<tr>

					<td><input type="text" value="Phone" name="phoneNumber"
						onclick="if(this.value=='Phone'){this.value='';}"
						onblur="if(this.value==''){this.value= 'Phone';}" /></td>
				</tr>

				<tr>
					<td><input type="text" value="Subject" name="subject"
						onclick="if(this.value=='Subject'){this.value='';}"
						onblur="if(this.value==''){this.value='Subject';}" /></td>
				</tr>
				<tr>
					<td><input type="text" value="Message" name="message"
						onclick="if(this.value=='Message'){this.value='';}"
						onblur="if(this.value==''){this.value='Message';}" /></td>
				</tr>

				<tr>
					<td colspan="2"><input type="submit" value="submit" /></td>
				</tr>
			</table>
		</form>
	</div>
	</div> -->

	<div class="container table-responsive">
		<div class="jumbotron table-responsive">

			<div class="container">
				<h2>Drop us a line</h2>
				Email:
				<br>
				<a href="mailto:benjamin.h.zheng@gmail.com">benjamin.h.zheng@gmail.com</a>
				<br>
				Github:
				<br>
				<a href="https://github.com/bzbenjamin/">https://github.com/bzbenjamin/</a>
				<br>
				
				
				<form name="contactForm" method="POST"
					action="${pageContext.request.contextPath}/contact" id="contact"
					class="form-horizontal">
					<div>
						<label for="contact_name">Name:&nbsp;</label> <input type="text"
							name="name" id="contact_name"></input> <span class="error">This
							field is required</span>
					</div>


					<div>
						<label for="contact_email">Email:</label> <input type="email"
							name="email" id="contact_email"></input> <span class="error">A
							valid email address is required</span>
					</div>

					<!-- <div>
					<label for="contact_phone">Phone:</label> <input type="text"
						name="phoneNumber" id="contact_phone" /></input> <span class="error">phone
						number is not in valid format</span>
				</div> -->

					<div>
						<label for="contact_subject">Subject:</label> <input type="text"
							name="subject" id="contact_subject" /></input> <span class="error">Please
							enter a valid subject</span>
					</div>
					<div>
						<label for="contact_message">Message:</label>
						<textarea name="message" id="contact_message"></textarea>
					</div>
					
				<!-- 	<div>
						<label for="contact_checkbox">click here to fill out a survey:</label>
						<input type="checkbox" id="contact_checkbox" name="display_survey" 
						onClick="mycheck(this)"></input>
					</div>
					<div id="contact_hidden" style="display: none;">
						<div>
							<label for="contact_feedback">feedback:</label>
							<textarea name="feedback" id="contact_feedback" class="cf">suggestion for the site?</textarea>
						</div>

					</div> -->

					<div id="contact_submit">
						<input type="submit" value="submit"></input>
					</div>
				</form>
			</div>
		</div>

	</div>

	<jsp:include page="footer.jsp" />
</body>
</html>