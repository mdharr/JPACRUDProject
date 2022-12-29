<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Games</title>
<%@ include file="bootstrapHead.jsp" %>
</head>
<body>

<div class="container-fluid">
<h1 id="watchme">Games</h1>

<form action="getGame.do" method="GET">
  Find by ID: <input type="text" name="gameId" required/>
  <input id="btnDisplay" class="btn" type="submit" value="Show Game"/>
</form>

<form action="delete.do" method="POST">
  Delete by ID: <input type="text" name="gameId" required/>
  <input id="btnDelete" class="btn" type="submit" value="Delete Game"/>
</form>

<form action="editGameById.do" method="GET">
  Update by ID: <input type="text" name="gameId"/>
  <input id="btnUpdate" class="btn" type="submit" value="Update Game"/>
</form>

<form action="create.do" method="GET">
  Create a Game <input id="btnCreate" class="btn" type="submit" value="Create Game">
</form>

<c:choose>

	<c:when test="${empty games}">
	<h2>No games found</h2>
	</c:when>
	<c:otherwise>
		<table class="table table-striped table-hover">
			<thead>
				<tr>
					<th>ID</th>
					<th>Title</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="game" items="${games}">
			<tr>
				<td>${game.id}</td>
				<td><a href="getGame.do?gameId=${game.id}">${game.title}</a></td>
			</tr>
			</c:forEach>
			</tbody>
		</table>
	</c:otherwise>
</c:choose>
<%@ include file="bootstrapFoot.jsp" %>

</div>
</body>
</html>