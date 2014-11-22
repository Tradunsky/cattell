<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>Add question</title>
    </head>
    <body>
        <form action="add" method="POST">
        	<input type="text" name="question" placeholder="Type a question"/><br/>        	
        	<input type="text" name="answers" placeholder="Type a answer"/>
        	<input type="text" name="answers" placeholder="Type a answer"/>
        	<input type="text" name="answers" placeholder="Type a answer"/>
        	<input type="text" name="rightAnswer" value="0"/>
        	<input type="submit" value="add question">
        </form>
    </body>
</html>