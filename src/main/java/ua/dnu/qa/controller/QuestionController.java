package ua.dnu.qa.controller;

import com.mongodb.util.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ua.dnu.qa.model.Question;
import ua.dnu.qa.model.impl.QuestionFactory;
import ua.dnu.qa.service.QuestionService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Tradunsky V.V.
 */
@Controller
@RequestMapping("question")
public class QuestionController {
    private static final Logger LOG = LoggerFactory.getLogger(QuestionController.class);


    @RequestMapping(value = "/")
    public ModelAndView addQuestionPage(HttpServletRequest req, HttpServletResponse resp){
        return new ModelAndView("add");
    }

    @Autowired
    @Qualifier("questionService")
    private QuestionService questionService;

//    @ResponseBody
//    @RequestMapping("add")
//    public Question addQuestion(@RequestParam String question,
//                            @RequestParam String[] answers,
//                            @RequestParam Integer rightAnswer) {
//        Question newQuestion = QuestionFactory.createQuestion(question, answers, rightAnswer);
//        LOG.info("Add new question: "+newQuestion);
//        questionService.add(newQuestion);
//        return newQuestion;
//    }

    @ResponseBody
    @RequestMapping("add")
    public Question addQuestion(@RequestParam String question,
                                @RequestParam String[] answers,
                                @RequestParam Integer rightAnswer) {
        Question newQuestion = QuestionFactory.createQuestion(question, answers, rightAnswer);
        LOG.info("Add new question: "+newQuestion);
        questionService.add(newQuestion);
        return newQuestion;
    }

    @RequestMapping("index")
    @ResponseBody
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @ResponseBody
    @RequestMapping(value = "all", method = RequestMethod.GET)
    public List<Question> allQuestion(){
        List<Question> questions = questionService.listQuestions();
        return questions;
    }

    @RequestMapping("answer")
    @ResponseBody
    public Map answerToQuestion(@RequestParam String id,
                                   @RequestParam Integer answer) {
        Boolean answerIsRight = questionService.checkAnswerToQuestion(id, answer);
        Map<String, Boolean> result = new HashMap<>();
        result.put("AnswerIs", answerIsRight);
        return result;
    }
}
