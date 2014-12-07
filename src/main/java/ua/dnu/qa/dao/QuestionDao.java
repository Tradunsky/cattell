package ua.dnu.qa.dao;

import ua.dnu.qa.model.Question;
import ua.dnu.qa.model.impl.QuestionImpl;

import java.util.List;

/**
 * @author Tradunsky V.V.
 */
public interface QuestionDao {
    public void add(Question question);

    List<Question> list();

    Question get(Integer num);

//    Boolean checkAnswerToQuestion(String id, Integer answer);
}
