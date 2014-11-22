package ua.dnu.qa.service;

import ua.dnu.qa.model.Question;

import java.util.List;

/**
 * @author Tradunsky V.V.
 */
public interface QuestionService {
    void add(Question question);

    List<Question> listQuestions();

    Boolean checkAnswerToQuestion(String id, Integer answer);
}
