<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Game Details</title>
<%@ include file="../bootstrapHead.jsp" %>

</head>
<body>
<ul>
	<li><a href="home.do">Home</a></li>
	<li><a href="create.do">Create</a></li>
</ul>

<h1>Game Details</h1>

<div>
  <img alt="" src="${game.imageUrl}">
  <br>
  <h5>${game.title}</h5>
  <h6>Genre: ${game.genre}</h6>
  <h6>Rating: ${game.rating}</h6>
  <h6>Developer: ${game.developer} </h6>
  <h6>Publisher: ${game.publisher}</h6>
  <h6>Metascore: ${game.metascore}</h6>
  <h6>User Score: ${game.userScore}</h6>
  <blockquote>${game.description}</blockquote>
</div>
<%@ include file="../bootstrapFoot.jsp" %>

</body>
</html>