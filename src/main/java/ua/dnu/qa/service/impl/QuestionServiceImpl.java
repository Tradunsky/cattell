package ua.dnu.qa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ua.dnu.qa.dao.QuestionDao;
import ua.dnu.qa.model.Question;
import ua.dnu.qa.service.QuestionService;

import java.util.List;

/**
 * @author Tradunsky V.V.
 */
@Service
public class QuestionServiceImpl implements QuestionService{
    @Autowired
    @Qualifier("questionDao")
    public QuestionDao questionDao;

    public void add(Question question){
        questionDao.add(question);
    }

    @Override
    public List<Question> listQuestions() {
        return questionDao.list();
    }

    @Override
    public Question get(Integer num) {
        return questionDao.get(num);
    }

//    @Override
//    public Boolean checkAnswerToQuestion(String id, Integer answer) {
//        return questionDao.checkAnswerToQuestion(id, answer);
//    }
}
