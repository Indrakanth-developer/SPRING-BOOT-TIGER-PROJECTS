<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>@@sOlO vIEw@@</title>

<!-- CSS LINK -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<!-- Font Awesome Icon Library -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

</head>
<BODY>
	<!-- Container Starts here -->
	<div class="container">
		<div class="card">
			<!-- Card header Starts here -->
			<div class="card-header bg bg-dark text-white">
				<h3 class="font-weight-bolder font-italic text-center">Mail
					Compose and Send UI</h3>
			</div>

			<!-- Card Body starts here -->
			<div class="card-body bg bg-light">


				<!-- Form head starts here -->
				<form:form action="sendmail" method="post"
					enctype="multipart/form-data" modelAttribute="mailMessage">


					<!-- ROW 1: TO ADDRESS starts here -->
					<div class="row">
						<div class="col-3">
							<label for="to"
								class="label-control font-weight-bolder font-italic">TO:</label>
						</div>
						<div class="col-3">
							<form:input path="to"
								cssClass="form-control font-weight-bold font-italic"></form:input>
						</div>
						<!-- cc STARTS HERE -->
						<div class="col-3">
							<label for="cc"
								class="label-control font-weight-bolder font-italic">CC:</label>
						</div>
						<div class="col-3">
							<form:input path="cc"
								cssClass="form-control font-weight-bold font-italic"></form:input>
						</div>

					</div>
					
					
						<!-- ERROR ROW TO AND CC STARTS HERE -->
					<div class="row">
						<div class="col-6">
							<form:errors path="to"
								cssClass="form-control font-weight-bold font-italic text-danger"></form:errors>
						</div>
						
						<!-- cc STARTS HERE -->
						<div class="col-6">
							<form:errors path="cc"
								cssClass="form-control font-weight-bold font-italic  text-danger"></form:errors>
						</div>

					</div>
					<br />


					<!-- ROW 2: SUBJECT starts here -->
					<div class="row">
						<div class="col-3">
							<label for="subject"
								class="label-control font-weight-bolder font-italic">SUBJECT:</label>
						</div>
						<div class="col-3">
							<form:input path="subject"
								cssClass="form-control font-weight-bold font-italic"></form:input>
						</div>
						<!-- BCC starts here -->
												<div class="col-3">
							<label for="bcc"
								class="label-control font-weight-bolder font-italic">BCC</label>
						</div>
						<div class="col-3">
							<form:input path="bcc"
								cssClass="form-control font-weight-bold font-italic"></form:input>
						</div>
					</div>
					<br />
						<!-- ERROR ROW SUBJECT AND BCC STARTS HERE -->
					<div class="row">
						<div class="col-6">
							<form:errors path="subject"
								cssClass="form-control font-weight-bold font-italic  text-danger"></form:errors>
						</div>
						
						<!-- cc STARTS HERE -->
						<div class="col-6">
							<form:errors path="bcc"
								cssClass="form-control font-weight-bold font-italic  text-danger"></form:errors>
						</div>

					</div>
					<br />

					<!-- ROW 3:  TEXT BODY starts here -->
					<div class="row">
						<div class="col-4">
							<label for="text"
								class="label-control font-weight-bolder font-italic">TEXT BODY:</label>
						</div>
						<div class="col-6">
							<form:textarea path="text"
								cssClass="form-control font-weight-bold font-italic"></form:textarea>
						</div>
					</div>
					<br />

						<!-- ERROR ROW TEXT BODY STARTS HERE -->
					<div class="row">
						<div class="col-6">
							<form:errors path="text"
								cssClass="form-control font-weight-bold font-italic  text-danger"></form:errors>
						</div>
						
					</div>
					<br />

					<!-- ROW 6: FILE NAME starts here -->
					<div class="row">
						<div class="col-4">
							<label for="attachment"
								class="control-label font-weight-bolder font-italic">Add
								Attachment:</label>
						</div>
						<div class="col-6">
							<input type="file" name="attachment" />
						</div>
					</div>

					<div class="row">
						<button class="btn btn-primary">
							<span class="spinner-grow spinner-grow-sm"></span>Send Email!! <span
								class="spinner-grow spinner-grow-sm"></span>
						</button>
					</div>

				</form:form>
				<!-- FORM ENDS HERE -->

			</div>

			<!-- CARD FOOTER STARTS HERE -->
			<div
				class="card-footer bg bg-dark text-white text-center font-italic font-weight-bolder">
				Mail Status: ${message } <br />
			</div>




		</div>
		<br />
	</div>
</BODY>
</html>