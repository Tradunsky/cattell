<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<%@include file="head.jsp" %>
  <body>
  <script type="text/javascript" src="/static/flat_design/js/addQuestion.js"></script>
    <%@include file="menu.jsp" %>
    <div class="clearfix">
      <!--START: answers container-->
      <div id="skills" class="container">
      <form id="question_form" action="addQuestion" method="POST">
        <h2 id="question-text">
            <input type="text" name="num" placeholder="№" style="width: 50px;">
            <input type="text" name="question" placeholder="Введите вопрос">
        </h2>
        <div class="row">
          <div class="span3">
            <div class="ps">
              <h3>A</h3>
            </div>
          </div>
          <div class="span5">
            <h3 id="var_a"><input type="text" name="answers" placeholder="Введите вариант ответа"/></h3>
          </div>
        </div>
        <div class="row">
          <div class="span3">
            <div class="ai">
              <h3>Б</h3>
            </div>
          </div>
          <div class="span5">
            <h3 id="var_b"><input type="text" name="answers" placeholder="Введите вариант ответа"/></h3>
          </div>
        </div>
        <div class="row">
          <div class="span3">
            <div class="html">
              <h3>В</h3>
            </div>
          </div>
          <div class="span5">
            <h3 id="var_c"><input type="text" name="answers" placeholder="Введите вариант ответа"/></h3>
          </div>
        </div>
        <!--<div class="row">
          <div class="span3">
            <div class="css">
              <h3>Г</h3>
            </div>
          </div>
          <div class="span5">
            <h3 id="var_d">Возможно</h3>
          </div>
        </div>-->
        </form>
        <!--<a id="add_q" class="hire-me">Добавить вопрос</a>-->
        <input id="add_q" class="hire-me" type="button" value="Добавить вопрос">
      </div>
      <!--END: answers container-->
    </div>
    <%@include file="footer.jsp" %>
  </body>
</html>
