<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>

the student is confirmed: ${student.firstName}  ${student.lastName}

<br><br>
Country: ${student.country}
<br><br>
Favorite Language: ${student.favoriteLanguage}
 
 Operating systems 
 <ul>
 <c:forEach var ="temp" items="${student.operationSystems}">
 <li>${temp}</li>>
 </c:forEach>
 
 
 </ul>
</body>
</html>