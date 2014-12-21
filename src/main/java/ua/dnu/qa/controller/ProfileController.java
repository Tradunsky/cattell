package ua.dnu.qa.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ua.dnu.qa.model.User;
import ua.dnu.qa.model.impl.UserFactory;
import ua.dnu.qa.service.FactorService;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Tradunsky V.V.
 */
@Controller
@RequestMapping("profile")
public class ProfileController {
    public static final Logger LOG = LoggerFactory.getLogger(ProfileController.class);
    public static final Integer QUESTION_COUNT = 187;

    @Autowired
    @Qualifier("factorService")
    private FactorService factorService;

    @ResponseBody
    @RequestMapping("progress")
    public User userProgress(HttpSession session) {
        User user = (User) session.getAttribute(User.SESSION_KEY);
        LOG.info("User progress: {}", user);
        return user;
    }

    @ResponseBody
    @RequestMapping("test")
    public User test(HttpSession session) {
        User user = (User) session.getAttribute(User.SESSION_KEY);
        if (user == null) {
            user = UserFactory.createUser(QUESTION_COUNT);
        }
        for (int i = 0; i < QUESTION_COUNT; i++) {
            user.setAnswer(i, 0);
        }
        session.setAttribute(User.SESSION_KEY, user);
        LOG.info("User progress: {}", user);
        return user;
    }

    @ResponseBody
    @RequestMapping
    public Map<String, Integer> calculateFactors(HttpSession session, HttpServletResponse resp) throws IOException {
        User user = (User) session.getAttribute(User.SESSION_KEY);
        LOG.info("Profile by user: {}", user);

        if (user != null) {
            List<Integer> answers = user.getAnswers();
            if (answers != null && answers.size() == QUESTION_COUNT) {
                return factorService.calculateFactorsScores(answers, factorService.list());
            }
        }

        resp.sendError(HttpServletResponse.SC_PRECONDITION_FAILED);
        return null;
    }

    @ResponseBody
    @RequestMapping("html")
    public ModelAndView profile(HttpSession session) throws IOException {
        Map<String, Integer> graph = null;
        Map<String, Integer> factors = null;
        ModelAndView modelAndView = new ModelAndView("profile");
        User user = (User) session.getAttribute(User.SESSION_KEY);
        LOG.info("Profile by user: {}", user);
        if (user != null) {
            List<Integer> answers = user.getAnswers();
            if (answers != null && answers.size() == QUESTION_COUNT) {
                graph = factorService.calculateFactorsScores(answers, factorService.list());
            }
            factors = importantScore(graph);
        }
        modelAndView.addObject("factors", factors);
        return modelAndView;
    }

    private Map<String, Integer> importantScore(Map<String, Integer> graph) {
        Map<String, Integer> score = new HashMap<>();
        for (Map.Entry<String, Integer> factor: graph.entrySet()) {
            if (factor.getValue()>=1 && factor.getValue()<=3){
                score.put(factor.getKey()+"-", factor.getValue());
            }else if (factor.getValue()>=8 && factor.getValue()<=10){
                score.put(factor.getKey()+"+", factor.getValue());
            }
        }
        return score;
    }


}
