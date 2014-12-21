<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.Map" %>
<% Map<String, Integer> factors = (Map<String, Integer>) request.getAttribute("factors"); %>
<html>
<%@include file="head.jsp" %>
  <body>
    <script type="text/javascript" src="/static/flat_design/js/profile.js"></script>
    <!--<%@include file="menu.jsp" %>-->
    <div class="factors">
      <div id="A-" class="factor">
        <div class="title"><h2>"Шизофрения"</h2></div>
        <div class="text">
          <p>Скрытый, обособленный, критичный, неприклонный, отчужденный, необщительный, замкнутый, без участный.</p>
          <p>Критичный; отстаивает свои идеи; холодный, отчуждённый; точный, объектиый; недоверчивый, скептичный; неприклонный; холодный (жесткий); сердитый, мрачный.</p>
        </div>
      </div>
      <div id="A+" class="factor">
        <div class="title"><h2>"Аффектотимия"</h2></div>
        <div class="text">
          <p>Сердечный, добрый, беспечный, общительный, открытый, естественный, непринуждённый.</p>
          <p>Добродушный, беспечный; готов к содружеству, предпочитает присоединятся; внимательный к людям; мягкосердечный, небрежный; доверчивый; легкоприспасабливается, идет на поводу; сердечный, веселый.</p>
        </div>
      </div>
      <div id="B-" class="factor">
        <div class="title"><h2>"Низкий интеллект"</h2></div>
        <div class="text">
          <p>Несобранный, тупой; конкретность, регидность мышления; эмоциональная дезорганизация мышления.</p>
          <p>Низкие умственные способности; не может решить абстрактных задач.</p>
        </div>
      </div>
      <div id="B+" class="factor">
        <div class="title"><h2>"Высокий интелект"</h2></div>
        <div class="text">
          <p>Собранный, сообразительный; наблюдается абстрактность мышления</p>
          <p>Высокие общие умственные способности; проницательный, быстросхватывающий; интеллектульано приспосабливается; существует некоторая связь с уровнем вербальной культуры и эрудицией.</p>
        </div>
      </div>
      <div id="C-" class="factor">
        <div class="title"><h2>"Слабость Я"</h2></div>
        <div class="text">
          <p>Слабость, эмоциональная не устойчевость; находится под влиянием чувств; легко расстраивается, переменчив.</p>
          <p>При растройствах теряет равновесие духа; переменчив в отношенияхи не устойчив в интересах; легко растраивается, беспокойный; уклоняется от ответственности, имеет тенденцию уступать, отказывается от работы; не вступает в споры в проблематичных ситуациях; невротические симптомы; ипохондрия, утомляемость.</p>
        </div>
      </div>
      <div id="C+" class="factor">
        <div class="title"><h2>"Сила Я"</h2></div>
        <div class="text">
          <p>Сила, эмоциональная устойчивость; выдержанность; спокойный, флегматичный, трезво смотрит на вещи, работоспособный, реалистически настроенный.</p>
          <p>Эмоционально зрелый; имеет постоянные интересы; спокойный; реально оценивает обстановку, управляет ситуацией, избегает трудностей. Может иметь место эмоциональная регидность, не чувствительность.</p>
        </div>
      </div>
      <div id="E-" class="factor">
        <div class="title"><h2>"Конформность"</h2></div>
        <div class="text">
          <p>Мягкий, кроткий, послушный, услужливый, любезный; застенчивый, уступчивый, зависимый; берет вину на себя, безропотный, пассивный.</p>
          <p>Покорный, подчиняющийся, тактичный, дипломатичный; экспрессивный, легко выводится из равновесия авторитетным руководством, властями; скромный</p>
        </div>
      </div>
      <div id="E+" class="factor">
        <div class="title"><h2>"Доминантность"</h2></div>
        <div class="text">
          <p>Доминирование, властность; неуступчивый, самоуверенный, напористый, агрессивный; упрямый, возможно до агрессивности; конфликтный, своенравный.</p>
          <p>Не устойчивый; независимый; грубый, враждебный; мрачный; непослушный, бунтарь; неприклонный; требует восхищения.</p>
        </div>
      </div>
      <div id="F-" class="factor">
        <div class="title"><h2>"Десургенсия, сдержанность"</h2></div>
        <div class="text">
          <p>Озабоченный, спокойный, молчаливый, серьезный, неразговорчивый, благоразумный, рассудительный.</p>
          <p>Молчаливый, с самоанализом; заботливый, задумчивый; необщительный; медлительный, осторожный; склонен усложнять, песиместичен в восприятии действительности. Безпокоится о будущем, ожидает неудачу, окружающим кажется скучным, вялым, чёпорным.</p>
        </div>
      </div>
      <div id="F+" class="factor">
        <div class="title"><h2>"Сургенсия, эксгоессивность"</h2></div>
        <div class="text">
          <p>Беззаботный, восторженный, невнимательный, небрежный, беспечный.</p>
          <p>Жизнерадостный, веселый, импульсивный, подвижный, энергичный; разговорчивый, откровенный, экспресивный, живой, проворный. Отмечается значимость социальных контактов. Искренен в отношениях; эмоционален. Динамичен в общении. Часто становится лидером, энтузиастом; верит в удачу.</p>
        </div>
      </div>
      <div id="G-" class="factor">
        <div class="title"><h2>"Низкое супер-эго"</h2></div>
        <div class="text">
          <p>Подверженность чувствам, не согласие с общепринятыми моральными нормами, стандартами.</p>
          <p>Непостоянный, переменчивый, гибкий, вызывает недоверие; потворствует своим желаниям; небрежный, ленивый; независимый, игнорирует обязаности. Подвержен влиянию случая и обстоятельств. Безпринципность, неорганизованность, безответственность. Возможно антисоциальное поведение.</p>
        </div>
      </div>
      <div id="G+" class="factor">
        <div class="title"><h2>"Высокое супер-эго"</h2></div>
        <div class="text">
          <p>Высокая нормативность, сильный характер; добросовестный, настойчевый, моралист, степенный, уравновешенный, ответственный.</p>
          <p>Упорный, стойкий, решительный; достойный доверия; эмоционально дисциплинирован, собранный; совестливый, имеет чувство долга; соблюдает моральные стандарты и правила. Настойчивость в достижении цели; точность, деловая направленность.</p>
        </div>
      </div>
      <div id="H-" class="factor">
        <div class="title"><h2>"Тректия"</h2></div>
        <div class="text">
          <p>Робость, нерешительность, застенчивость, сдержанность, боязливость.</p>
          <p>Смущается в присутствии других; эмоционален; сдержанный; озлобленный, раздраженный; ограниченынй, строго придерживается правил, быстро реагирует на опасность, отличается повышенной чувствительностью к угрозе; деликатный, внимательный к другим. Не уверен в своих силах; предпочитает находится в тени; большому обществу предпочитает одного-двух друзей.</p>
        </div>
      </div>
      <div id="H+" class="factor">
        <div class="title"><h2>"Пармия"</h2></div>
        <div class="text">
          <p>Смелость, предприимчивость, социальная смелость, толстокожость.</p>
          <p>Авантюристичность, склонный к риску, общительный; активный, явный интерес к другому полу; чувствительный, отзывчивый; добродушный; импульсивный; растарможенный, держится свободно; эмоциональный, артистические интересы; беззаботный, непонимает опасности.</p>
        </div>
      </div>
      <div id="I-" class="factor">
        <div class="title"><h2>"Харрия"</h2></div>
        <div class="text">
          <p>Низкая чувствительность, толстокожость, суровость, не верит в иллюзии, рассудочность, реалистичность суждений, практичность, некоторая жестокость.</p>
          <p>Не сентиминтальный, ожидает малого от жизни; мужественный, самоуверенный, берет на себя ответственность; суровый (до цинизма), черственый в отношениях; не значительные артистические наклонности, без утраты чувства вкуса, не фантазёр; действует практично и логично; постоянный; не обращает внимания на физические недомогания.</p>
        </div>
      </div>
      <div id="I+" class="factor">
        <div class="title"><h2>"Премсия"</h2></div>
        <div class="text">
          <p>Мягкосердечия, нежность, чувствительность; зависимость, сверхосторожность, стремление к покровительству.</p>
          <p>Неугомонный, суетливый, беспокойный, ожидает внимания от окружающих, навязчивый, не надёжный, ищет помощи и симпатии; способный к эмпатии, сочувствию, сопереживанию, пониманию; добрый, мягкий, терпимый к себе и окружающим; напыщенный, претворный, артистичный, женственный; фантазирует в беседе и на едине с собой, склонный к романтизму, художественность восприятия мира; действует по интуиции; изменчивый, ветренный; ипохондрик, беспокоится о состоянии своего здоровься.</p>
        </div>
      </div>
      <div id="L-" class="factor">
        <div class="title"><h2>"Алексия"</h2></div>
        <div class="text">
          <p>Доверчивость, внутренния расслабленность, соглашается с условиями, откровенный.</p>
          <p>Чувство собственной не значимости; жалуется на перемены; не подозрительный, свободный от зависимости; легко забывает трудности, понимает, прощает; терпимый, благожелательный по отношению к другим, уживчивый, не брежно относится к замечаниям; покладистый, легко ладтит с людьми, хорошо работает в коллективе.</p>
        </div>
      </div>
      <div id="L+" class="factor">
        <div class="title"><h2>"Протенсия"</h2></div>
        <div class="text">
          <p>Подозрительность, ревнивость "защита" и внутренее напряжение.</p>
          <p>Ревнивый, завистливый; большое самомнение; догматичность, подозрительность; задерживает свое внимание на неудачех; тиран. Требует от окружающих нести отвественность за ошибки; раздражительный. Его интересы, обращены на самого себя, осторожен в своих поступках, эгоцентричен.</p>
        </div>
      </div>
      <div id="M-" class="factor">
        <div class="title"><h2>"Проксерния"</h2></div>
        <div class="text">
          <p>Практичность, земные принципы, преземленность стремлений, маловоображения.</p>
          <p>Быстро решает практические вопросы; занят своими интересами; прозаичен, избегает всего необычного; следует общепринятым нормам; руководствуется объективной реальностью, надёжен в практическом суждении; честный, добросовестный, беспокойный, но не твердый. Ему свойственно некоторая ограниченность, излишняя внимательность к мелочам.</p>
        </div>
      </div>
      <div id="M+" class="factor">
        <div class="title"><h2>"Аутия"</h2></div>
        <div class="text">
          <p>Мечтательность, идеалистичность, багатое воображение, богемность, рассеяность.</p>
          <p>Поглащен своими идеями; интересуется искуством, теорией, основными верованиями; увлечен внутренними иллюзиями; высокий творческий потенциал. Ккапризный, легко отступает от здравого смысла. Легко приводится в восторг, неуравновешенный.</p>
        </div>
      </div>
      <div id="N-" class="factor">
        <div class="title"><h2>"Прямолинейность"</h2></div>
        <div class="text">
          <p>Наивность, простоватость. Прямой, откровенный, естественный, непосредственный.</p>
          <p>Прямой, но бестактный в общении. Имеет не конкретный ум. Общительный, не сдержан эмоционально. Простые вкусы. Отсутствие проницательности. Не опытен в анализе мотивировок. Довольствуется имеющимся. Слепо верит в человечускую сущность.</p>
        </div>
      </div>
      <div id="N+" class="factor">
        <div class="title"><h2>"Дипломатичность"</h2></div>
        <div class="text">
          <p>Проницательность, хитрость. Опытный, искушенный, расчетливый, разумный.</p>
          <p>Изысканный, умеет вести себя в обществе. Имеет точный ум. Эмоционально выдержан. Искуственный. Естетически изощрен. Проницателен по отношению к окружающим. Чистолюбивый, возможно ненадёжен. Осторожен, "срезает углы".</p>
        </div>
      </div>
      <div id="O-" class="factor">
        <div class="title"><h2>"Гипертимия"</h2></div>
        <div class="text">
          <p>Беспечность, самоуверенность, самонадеянность, спокойствие, безмятежность, благодушее, хладнокровие.</p>
          <p>Веселый, жизнерадостный. Нераскрывающийся, безмятежный, спокойный. Не чувствителен к одобрению или порицанию окружающих. Беспечен. Энергичен. Небоязливый. Бездумный.</p>
        </div>
      </div>
      <div id="O+" class="factor">
        <div class="title"><h2>"Гипотемия"</h2></div>
        <div class="text">
          <p>Чувство вины; полен страха, тривоги, предчувствий; самобечивание, не уверенность в себе, обеспокоенность.</p>
          <p>Депрессивыный, падавлен, легко плачет. Легко раним, находится в власти настроений, впечатлительный. Сильное чувство долга, чувствительный к реакциям окружающих. Скурпулёзный, суетливый. Ипохондрик. Симптомы страха. Одинокий, погружен в мрачные раздумья, ранимый.</p>
        </div>
      </div>
      <div id="Q1-" class="factor">
        <div class="title"><h2>"Консерватизм"</h2></div>
        <div class="text">
          <p>Почтенный, имеет установившиеся взгляды, идеи; терпим к традиционным трудностям; принимает только испытанное временем; подозрительность к новым людям. С сомнением относится к новым идеям, склонен к марализации и нравоучениям.</p>
        </div>
      </div>
      <div id="Q1+" class="factor">
        <div class="title"><h2>"Радиколизм"</h2></div>
        <div class="text">
          <p>Экспериментатор, либерал, свободо мыслящий, аналитик, хорошая информированность, терпимость к неудобствам. Критически настроен; характеризуется наличием интеллектуальных интересов, аналитичность мышления. Не доверяет авторитетам, на веру ничего не принимает.</p>
        </div>
      </div>
      <div id="Q2-" class="factor">
        <div class="title"><h2>"Зависимость от группы"</h2></div>
        <div class="text">
          <p>Социабильность, несамостоятельность; последовательность, нуждается в групповой поддержке, принимает решения вместе с другими; следует за общественным мнением, ориентируется на социальное одобрения, безинициативен.</p>
        </div>
      </div>
      <div id="Q2+" class="factor">
        <div class="title"><h2>"Самодостаточность"</h2></div>
        <div class="text">
          <p>Групповая независимость, самостоятельность, находчивость, самостоятельно принимает решения; может господствовать, не нуждается в поддержке других людей, независим.</p>
        </div>
      </div>
      <div id="Q3-" class="factor">
        <div class="title"><h2>"Низкое самомнение"</h2></div>
        <div class="text">
          <p>Плохо контролируем, небрежный, неточный, следует своим побуждениям, не считается с общественными правилами, не внимателен и не делекатен, недисциплинирован; внутреняя конфликтность представлений о себе.</p>
        </div>
      </div>
      <div id="Q3+" class="factor">
        <div class="title"><h2>"Высокое самомнение"</h2></div>
        <div class="text">
          <p>Самолюбие, самоконтроль, точный, волевой, может подчинить себе, действует по осознанному плану, эффективный лидер, принимает социальные нормы, контролирует свои эмоции и повидение, доводит дело до конца, целенаправлен.</p>
        </div>
      </div>
      <div id="Q4-" class="factor">
        <div class="title"><h2>"Низкая эго-напряженность"</h2></div>
        <div class="text">
          <p>Расслабленный, спокойный, вялый, апатичный, сдержанный, не фрустрирующий; низкая мотивация, леность, излишняя удовлетворенность, невозмутимость.</p>
        </div>
      </div>
      <div id="Q4+" class="factor">
        <div class="title"><h2>"Высокое эго-напряженность"</h2></div>
        <div class="text">
          <p>Собранный, энергичный, возбуждённый, раздражительный, повышенная мотивация; активен, несмотря на утомляемость, раздражительный, слабое чувство порядка.</p>
        </div>
      </div>
      <div><p>Вторичные факторы:</p>
        <div id="F1-" class="factor">
          <div class="title"><h2>"Низкая тревожность"</h2></div>
          <div class="text">
            <p>Жизнь в целом удовлетворяет, сопсобен достичь желаемого, но слабая мотивация и отсуда неспособность к достижению трудных целей.</p>
          </div>
        </div>
        <div id="F1+" class="factor">
          <div class="title"><h2>"Высокая тревожность"</h2></div>
          <div class="text">
            <p>Не обязательно невротик, т.к. тривога может быть ситуационной; возможно, плохая приспособляемость, недовлетворенность достигнутым. Очень высокая тривога, обычно нарушает деятельсноть.</p>
          </div>
        </div>
        <div id="F2-" class="factor">
          <div class="title"><h2>"Интраверт"</h2></div>
          <div class="text">
            <p>Робость, застенчивость, "достаточно себя", подавляем в межличностных конфликтах. Не обязательно застенчивость, может быть сдержанность, скрытность.</p>
          </div>
        </div>
        <div id="F2+" class="factor">
          <div class="title"><h2>"Экстраверт"</h2></div>
          <div class="text">
            <p>Хорошо устанавливает и поддерживает социальные контакты.</p>
          </div>
        </div>
        <div id="F3-" class="factor">
          <div class="title"><h2>"Сензитивность"</h2></div>
          <div class="text">
            <p>Хрупкая эмоциональность, чувствительность к тонкостям, может быть художественная мягкость, спокойствие, вежливость; трудности в принятии решения из-за избытка раздумый.</p>
          </div>
        </div>
        <div id="F3+" class="factor">
          <div class="title"><h2>"Реактивная уравновешенность"</h2></div>
          <div class="text">
            <p>Стабильность, жизнерадостность, решительность, предприимчивость, склонность не замечать тонкостей жизни. Ориентирован на очевидное, явное. Трудности из-за слишком поспешных действий, без достаточного взвешивания.</p>
          </div>
        </div>
        <div id="F4-" class="factor">
          <div class="title"><h2>"Конформность"</h2></div>
          <div class="text">
            <p>Подчинение, зависимость, пассивность, сдержанность. Нуждается в поддержке и ищет её у людей. Склонность ориентироватся на групповые нормы.</p>
          </div>
        </div>
        <div id="F4+" class="factor">
          <div class="title"><h2>"Независимость"</h2></div>
          <div class="text">
            <p>Агрессивность, смелость, хваткость, сообразительность, быстрота.</p>
          </div>
        </div>
      </div>
    <% if (factors == null) {%>
      <div>
        <p>Недостаточное количество ответов для вычисления фактора личности</p>
      </div>
    <%}else{%>
      <script type="text/javascript">
      <%for (Map.Entry<String, Integer> entry: factors.entrySet()) {%>
        document.getElementById('<%=entry.getKey().toString()%>').style.display = 'block';
      <%}%>
      </script>
    <%}%>
    </div>
    <%@include file="footer.jsp" %>
  </body>
</html>
