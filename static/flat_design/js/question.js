$(document).ready(function(){
    bindEvents();
});

function bindEvents(){
    $('.span3').bind('click', function(){
        printDebug("variant of answer click");
        var num = $('#num_q').text();
        printDebug("Question num: "+num);
        var answer = $(this).attr("id");
        printDebug("Question answer: "+answer);
        $.ajax({
           type: "POST",
           url: "answer",
           data:{
               "num":num,
               "answer":answer
           },
           success: function(data){
               printDebug('success question add: '+data);
               clearValues('#question_form :input');
               progress(num);
           }
        });
    });
}

function clearValues(form){
    $(form).each(function(){
        this.value = '';
    });
}

function progress(questionNum){
    var progress = 100*questionNum/187;
    $('#curr_q').text(questionNum);
    $('.ps2').width(progress);
}

function successMsg(text){
    notif({
      msg: "<b>Успешно:</b> "+text,
      type: "success"
    });
}

function printDebug(msg){
    console.log('DEBUG question.js :: '+msg);
}