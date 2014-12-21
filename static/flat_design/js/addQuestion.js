$(document).ready(function(){
    bindEvents();
    $('#question-text :input')[0].focus();
});

function bindEvents(){
    $('#add_q').bind('click', function(){
        printDebug("add_q click");
         $.ajax({
            type: "POST",
            url: "addQuestion",
            data: $('#question_form').serialize(), // serializes the form's elements.
            success: function(data){
                printDebug('success question add: '+data);
                clearValues('#question_form :input');
                successMsg("Вопрос добавлен");
                $('#question-text :input')[0].focus();
            }
         });
    });
}

function clearValues(form){
    $(form).each(function(){
        this.value = '';
    });
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