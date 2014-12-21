$(document).ready(function(){
    bindEvents();
    $('#question-text :input')[0].focus();
});

function bindEvents(){
    $('#add_q').bind('click', function(){
        printDebug("add_q click");
        var form = $('#question_form').mySerialize();
        printDebug("Serialized: "+form);
         $.ajax({
            type: "POST",
            url: "/cattell/factor/addFactor",
            data: form, // serializes the form's elements.
            dataType: "json",
            success: function(data){
                printDebug('success factor add: '+data);
                clearValues('#question_form :input');
                successMsg("Ключ добавлен");
                $('#question-text :input')[0].focus();
            }
         });
    });
}

$.fn.mySerialize = function(options) {
    var settings = {
        on: 'true',
        off: 'false'
    };
    if (options) {
        settings = $.extend(settings, options);
    }
    var $container = $(this).eq(0),
        $checkboxes = $container.find("input[type='checkbox']").each(function() {
            $(this).attr('value', this.checked ? settings.on : settings.off).attr('checked', true);
        });
    var s = ($container.serialize());
    $checkboxes.each(function() {
        var $this = $(this);
        $this.attr('checked', $this.val() == settings.on ? true : false);
    });
    return s;
};

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