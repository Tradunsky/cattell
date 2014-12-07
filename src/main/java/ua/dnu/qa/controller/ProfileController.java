package ua.dnu.qa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ua.dnu.qa.model.Factor;
import ua.dnu.qa.model.QuestionKey;
import ua.dnu.qa.model.User;
import ua.dnu.qa.service.FactorService;
import ua.dnu.qa.service.impl.FactorServiceImpl;

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
    public static final Integer QUESTION_COUNT = 187;

    @Autowired
    @Qualifier("factorService")
    private FactorService factorService;

    @ResponseBody
    @RequestMapping
    public Map<String, Integer> calculateFactors(HttpSession session, HttpServletResponse resp) throws IOException {
        User user = (User) session.getAttribute(User.SESSION_KEY);

        if (user!=null){
            List<Integer> answers = user.getAnswers();
            if (answers != null && answers.size() == QUESTION_COUNT) {
                return calculateFactorsScores(answers, factorService.list());
            }
        }

        resp.sendError(HttpServletResponse.SC_PRECONDITION_FAILED);
        return null;

    }

    private Map<String, Integer> calculateFactorsScores(List<Integer> userAnswers, List<Factor> factorKeys) {
        Map<String, Integer> scores = new HashMap<>();
        for (Factor factor : factorKeys) {
            for (QuestionKey questionKey : factor.getKeys()) {
                Integer answer = userAnswers.get(questionKey.getQuestionNumber());
                Integer rating = questionKey.getAnswers().get(answer);
                Integer factorScore = scores.get(factor.getName());
                scores.put(factor.getName(), factorScore + rating);
            }
        }
        return scores;
    }
}
