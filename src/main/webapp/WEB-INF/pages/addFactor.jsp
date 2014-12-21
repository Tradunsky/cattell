<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<%@include file="head.jsp" %>
  <body>
  <script type="text/javascript" src="/static/flat_design/js/addFactor.js"></script>
    <%@include file="menu.jsp" %>
    <div class="clearfix">
      <!--START: answers container-->
      <div id="skills" class="container">
      <form id="question_form" action="addFactor" method="POST">
        <h2 id="question-text">
            <input type="text" name="num" placeholder="№" style="width: 50px;">
            <select name="factorName" style="height: 36px;">
              <option>A</option>
              <option>B</option>
              <option>C</option>
              <option>E</option>
              <option>F</option>
              <option>G</option>
              <option>H</option>
              <option>I</option>
              <option>L</option>
              <option>M</option>
              <option>N</option>
              <option>O</option>
              <option>Q1</option>
              <option>Q2</option>
              <option>Q3</option>
              <option>Q4</option>
            </select>
        </h2>
        <div class="row">
          <div class="span3">
            <div class="ps">
              <h3>A</h3>
            </div>
          </div>
          <div class="span5">
            <h3 id="var_a"><input type="checkbox" name="keys" value="true" checked="true"></h3>
          </div>
        </div>
        <div class="row">
          <div class="span3">
            <div class="ai">
              <h3>Б</h3>
            </div>
          </div>
          <div class="span5">
            <h3 id="var_b"><input type="checkbox" name="keys" value="false" checked="false"></h3>
          </div>
        </div>
        <div class="row">
          <div class="span3">
            <div class="html">
              <h3>В</h3>
            </div>
          </div>
          <div class="span5">
            <h3 id="var_c"><input type="checkbox" name="keys" value="false" checked="false"></h3>
          </div>
        </div>
        </form>
        <input id="add_q" class="hire-me" type="button" value="Добавить ключ">
      </div>
      <!--END: answers container-->
    </div>
    <%@include file="footer.jsp" %>
  </body>
</html>
