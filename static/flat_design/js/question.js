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
           dataType: 'json',
           success: function(data){
               printDebug('success question add: '+data);
               getNextQuestion(data);
               clearValues('#question_form :input');
               progress(num);
           }
        });
    });
}

function getNextQuestion(jsonData){
    var nextNum = ++jsonData.num;
    printDebug('nextNum: '+nextNum);
    if (nextNum<188){
        $.ajax({
               type: "POST",
               url: "get/"+nextNum,
               dataType: 'json',
               success: function(data){
                   printDebug('success get next ('+nextNum+') question add: '+data);
                   showQuestion(data);
                   progress(nextNum);
               }
            });
    } else {
        window.location.replace("/cattell/profile/");
    }
}

function showQuestion(data){
    $('#num_q').html(data.num);
    $('#text_q').text(data.question);
    $('#var_a').text(data.answers[0]);
    $('#var_b').text(data.answers[1]);
    $('#var_c').text(data.answers[2]);
}

function clearValues(form){
    $(form).each(function(){
        this.value = '';
    });
}

function progress(questionNum){
    var progress = 100*questionNum/187;
    $('#curr_q').text(questionNum);
    $('.ps2').width(progress+"%");
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