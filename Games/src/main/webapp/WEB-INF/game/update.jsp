<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Game</title>
<%@ include file="../bootstrapHead.jsp" %>

</head>
<body>

<ul>
	<li><a href="home.do">Home</a></li>
</ul>

<div>
<h2><strong>Update Game Info</strong></h2>
</div>
<div>
    
    <form action="update.do" method="POST">
   	<input id="gameId" type="hidden" name="gameId" value="${game.id}"> 
   	
   	  <div>
      <label for="title"><strong>Title:</strong></label>
      <input type="text" name="title">
      </div>
   	
      <div>
      <label for="description"><strong>Description:</strong></label>
      <input type="text" name="description">
      </div>
      
      <div>
      <label for="imageUrl"><strong>Image URL:</strong></label>
      <input type="text" name="imageUrl">
      </div>
      
      <div>
	<h6><strong>Rating:</strong></h6>
    <div>
      <input type="radio" id="1" name="rating" value="E"
             checked>
      <label for="rating">E</label>
    </div>

    <div>
      <input type="radio" id="2" name="rating" value="E10+">
      <label for="rating">E10+</label>
    </div>

    <div>
      <input type="radio" id="3" name="rating" value="T">
      <label for="rating">T</label>
    </div>
        <div>
      <input type="radio" id="4" name="rating" value="M"
             checked>
      <label for="rating">M</label>
    </div>
      </div>

      <div>
      <label for="genre"><strong>Genre:</strong></label>
      <input type="text" name="genre">
      </div>
      
      <div>
      <label for="developer"><strong>Developer:</strong></label>
      <input type="text" name="developer">
      </div>
      
      <div>
      <label for="publisher"><strong>Publisher:</strong></label>
      <input type="text" name="publisher">
      </div>
      
      <div>
      <label for="metascore"><strong>Metascore:</strong></label>
      <input type="text" name="metascore">
      </div>
      
      <div>
      <label for="userScore"><strong>User Score:</strong></label>
      <input type="text" name="userScore">
      </div>
      
      <div>
	  <button style="margin-left: 10px; "type="submit" class="btn btn-outline-warning">Submit</button>    
      </div>
	  </form>
</div>

<%@ include file="../bootstrapFoot.jsp" %>

</body>
</html>

