package ua.dnu.qa.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ua.dnu.qa.model.Question;
import ua.dnu.qa.model.User;
import ua.dnu.qa.model.impl.QuestionFactory;
import ua.dnu.qa.model.impl.UserFactory;
import ua.dnu.qa.service.QuestionService;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author Tradunsky V.V.
 */
@Controller
@RequestMapping("question")
public class QuestionController {
    private static final Logger LOG = LoggerFactory.getLogger(QuestionController.class);
    public static final int QUESTION_COUNT = 187;

    @ResponseBody
    @RequestMapping("add")
    public ModelAndView addQuestionForm() {
        return new ModelAndView("addQuestion");
    }

    @Autowired
    @Qualifier("questionService")
    private QuestionService questionService;

    @RequestMapping
    @ResponseBody
    public ModelAndView index(HttpSession session) {
        User user = UserFactory.createUser(QUESTION_COUNT);
        session.setAttribute(User.SESSION_KEY, user);
        ModelAndView model = new ModelAndView("question");
        Question question = questionService.get(1);
        model.addObject("question", question);
        return model;
    }

    @ResponseBody
    @RequestMapping("answer")
    public String answerToQuestion(@RequestParam Integer num,
                                 @RequestParam Integer answer,
                                 HttpSession session,
                                 HttpServletResponse resp) {
        User user = (User) session.getAttribute(User.SESSION_KEY);
        user.setAnswer(num-1, answer);
        session.setAttribute(User.SESSION_KEY, user);
        return "{\"result\":\"OK\", \"num\":\""+num+"\", \"answer\":\""+answer+"\"}";
    }

    @ResponseBody
    @RequestMapping("{num}")
    public ModelAndView question(@PathVariable("num") Integer num) {
        if (LOG.isDebugEnabled())
            LOG.debug("Question: {}", num);
        ModelAndView modelAndView = new ModelAndView("question");
        Question question = questionService.get(num);
        if (LOG.isDebugEnabled())
            LOG.debug("Question from db: {}", question);
        modelAndView.addObject("question", question);
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("get/{num}")
    public Question getQuestion(@PathVariable("num") Integer num) {
        return questionService.get(num);
    }

    @ResponseBody
    @RequestMapping("addQuestion")
    public Question addQuestion(@RequestParam Integer num,
                                @RequestParam String question,
                                @RequestParam String[] answers) {
        Question newQuestion = QuestionFactory.createQuestion(num, question, answers);
        LOG.info("Add new question: " + newQuestion);
        questionService.add(newQuestion);
        return newQuestion;
    }

    @ResponseBody
    @RequestMapping("list")
    public List<Question> listQuestion() {
        return questionService.listQuestions();
    }
}
