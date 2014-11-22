package ua.dnu.qa.model.impl;

import org.springframework.data.mongodb.core.mapping.Document;
import ua.dnu.qa.model.QuestionKey;

import java.util.List;

/**
 * @author Tradunsky V.V.
 */
@Document(collection = "questionKeys")
public class QuestionKeyImpl implements QuestionKey {
    Integer questionNumber;
    List<Boolean> keys;

    public QuestionKeyImpl(Integer questionNumber, List<Boolean> keys){
        this.questionNumber = questionNumber;
        this.keys = keys;
    }

    @Override
    public Integer getQuestionNumber() {
        return questionNumber;
    }

    @Override
    public List<Boolean> getKeys() {
        return keys;
    }
}
