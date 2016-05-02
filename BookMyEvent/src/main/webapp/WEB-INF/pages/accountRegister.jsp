<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
<style type="text/css">
.errMsg{
	color: red;
	font-size: 14px;
	font-weight: bold;
}
</style>

</head>
<body>
<form:form action="saveAccount" method="post" commandName="account">
	<h1 align="center">Account Registration Form</h1>
	
	<table>
		<tr>
			<td>Account No:</td>
			<td><form:input path="accountNo"/></td>
			<td>
			
			</td>
		</tr>
		
		<tr>
			<td>Account Name:</td>
			<td><form:input path="accountName"/></td>
			<td>
			
			</td>
		</tr>
		
		<tr>
			<td>Account Type:</td>
			<td>
				<form:select path="accountType">
					<c:if test="${!empty acctype }">
						<c:forEach items="${acctype}" var="ctype">
							<form:option value="${ctype}">${ctype}</form:option>
						</c:forEach>
					
					</c:if>
				
				</form:select>
			</td>
			<td>
			
			</td>
		</tr>
		
		<tr>
			<td>OPening Date:</td>
			<td><form:input path="openDate"/></td>
			<td>
			
			</td>
		</tr>
		
		<tr>
			<td>Amount:</td>
			<td><form:input path="amount"/></td>
			<td>
			
			</td>
		</tr>
		
		<tr>
			<td>Date of Birth:</td>
			<td><form:input path="accountDob"/></td>
			<td>
			
			</td>
		</tr>
		
		<tr>
			<td>Gender:</td>
			<td>
			
				<form:radiobutton path="gender" value="Male"/>Male
				<form:radiobutton path="gender" value="Female"/>Female
			
			</td>
			<td>
			
			</td>
		</tr>
		
		<tr>
			<td></td>
			<td>
				<input type="submit" value="Save"/>
			</td>
			<td>
			
			</td>
		</tr>
		
	</table>
	<div>
	
		<form:errors path="*" cssClass="errMsg"></form:errors>
	</div>
	

</form:form>

<div>
	<h3 align="center">Account Details</h3>

<c:if test="${!empty accounts }">
	<table>
		<tr>
			<th>Account No</th>
			<th>Account Name</th>
			<th>Account Type</th>
			<th>Opening Date</th>
			<th>Amount</th>
			<th>Date of Birth</th>
			<th>Gender</th>
			<th>Edit</th>
		</tr>
		
		<c:forEach items="${accounts }" var="acc">
			<tr>
				<td>${acc.accountNo }</td>
				<td>${acc.accountName }</td>
				<td>${acc.accountType }</td>
				<td>${acc.openDate }</td>
				<td>${acc.amount }</td>
				<td>${acc.accountDob }</td>
				<td>${acc.gender }</td>
				<td>
					<a href="delete/${acc.accountNo}">Delete</a>
					</td>
					<td>
					<a href="update/${acc.accountNo}">update</a>
				</td>
			</tr>
			
		</c:forEach>
	
	</table>


</c:if>

</div>






















</body>
</html>