package ua.dnu.qa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ua.dnu.qa.dao.FactorDao;
import ua.dnu.qa.model.Factor;
import ua.dnu.qa.model.impl.FactorImpl;
import ua.dnu.qa.model.impl.QuestionKeyImpl;
import ua.dnu.qa.service.FactorService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Tradunsky V.V.
 */
@Service
public class FactorServiceImpl implements FactorService {
    @Autowired
    @Qualifier("factorDao")
    private FactorDao factorDao;

    public void add(Factor newFactor) {
        factorDao.add(newFactor);
    }

    public List<FactorImpl> list() {
        return factorDao.list();
    }

    public Factor getFactorByName(String factorName) {
        return factorDao.getFactorByName(factorName);
    }

    @Override
    public void update(Factor factor) {
        factorDao.update(factor);
    }

    @Override
    public Map<String, Integer> calculateFactorsScores(List<Integer> userAnswers, List<FactorImpl> factorKeys) {
        Map<String, Integer> scores = new HashMap<>();
        for (Factor factor : factorKeys) {
            for (QuestionKeyImpl questionKey : factor.getKeys()) {
                Integer answer = userAnswers.get(questionKey.getQuestionNumber());
                List<Integer> answers = questionKey.getAnswers();
                if (answers != null) {
                    Integer rating = answers.get(answer);
                    Integer prevFactorScore = scores.get(factor.getFactorName());
                    if (prevFactorScore == null) {
                        prevFactorScore = 0;
                    }
//                    if (LOG.isDebugEnabled()) {
//                        LOG.debug("userAnswers: {}, factorKeys: {}", userAnswers, factorKeys);
//                        LOG.debug("rating: {}, factorScore: {}", rating, factorScore);
//                    }
                    scores.put(factor.getFactorName(), prevFactorScore + rating);
                }
            }
        }
        return scores;
    }
}
