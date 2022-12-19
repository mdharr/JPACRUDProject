<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Added Game</title>
<%@ include file="../bootstrapHead.jsp" %>

</head>
<body>

<ul>
	<li><a href="home.do">Home</a></li>
	<li><a href="create.do">Create</a></li>
</ul>

<div>
<h2><strong>Game Added</strong></h2>
</div>
<div>
 <c:choose>
    <c:when test="${! empty game}">
      <ul style="list-style-type: square;">
      
        <li><img alt="" src="${game.imageUrl}"></li>
      	<li>Game ID: ${game.id } </li>
        <li>Game Title: ${game.title}</li>
        <li>Genre: ${game.genre}</li>
        <li>Rating: ${game.rating}</li>
        <li>Developer: ${game.developer}</li>
        <li>Publisher: ${game.publisher}</li>
        <li>Metascore: ${game.metascore}</li>
        <li>User Score: ${game.userScore}</li>
        <li><blockquote>${game.description}</blockquote></li>
        
      </ul>
    </c:when>
    <c:otherwise>
      <p>No game found</p>
    </c:otherwise>
  </c:choose>
</div>

<%@ include file="../bootstrapFoot.jsp" %>

</body>
</html>