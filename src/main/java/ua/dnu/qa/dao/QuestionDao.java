package ua.dnu.qa.dao;

import ua.dnu.qa.model.Question;

import java.util.List;

/**
 * @author Tradunsky V.V.
 */
public interface QuestionDao {
    public void add(Question question);

    List<Question> list();

    Boolean checkAnswerToQuestion(String id, Integer answer);
}
