<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="ua.dnu.qa.model.Question" %>

<% Question question = (Question) request.getAttribute("question"); %>

<html>
<%@include file="head.jsp" %>
  <body>
  <script type="text/javascript" src="/static/flat_design/js/question.js"></script>
    <%@include file="menu.jsp" %>
    <div class="clearfix">
      <!--START: answers container-->
      <div id="skills" class="container">

        <h2 id="question-text"><span id="num_q"><%=question.getNum() %></span>. ${question.getQuestion()}:</h2>
        <div class="row">
          <div class="span3" id="0">
            <div class="ps">
              <h3>A</h3>
            </div>
          </div>
          <div class="span5">
            <h3 id="var_a">${question.getAnswers()[0]}</h3>
          </div>
        </div>
        <div class="row">
          <div class="span3" id="1">
            <div class="ai">
              <h3>Б</h3>
            </div>
          </div>
          <div class="span5">
            <h3 id="var_b">${question.getAnswers()[1]}</h3>
          </div>
        </div>
        <div class="row">
          <div class="span3" id="2">
            <div class="html">
              <h3>В</h3>
            </div>
          </div>
          <div class="span5">
            <h3 id="var_c">${question.getAnswers()[2]}</h3>
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
      </div>
      <!--END: answers container-->
    </div>
    <%@include file="footer.jsp" %>
  </body>
</html>