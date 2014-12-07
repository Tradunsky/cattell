package ua.dnu.qa.model.impl;

import org.springframework.data.mongodb.core.mapping.Document;
import ua.dnu.qa.model.QuestionKey;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tradunsky V.V.
 */
@Document(collection = "questionKeys")
public class QuestionKeyImpl implements QuestionKey {
    Integer questionNumber;
    List<Integer> keys;

    public QuestionKeyImpl(Integer questionNumber, List<Integer> keys){
        this.questionNumber = questionNumber;
        this.keys = keys;
    }

    public QuestionKeyImpl(Integer questionNumber, final Boolean[] keys){
        this.questionNumber = questionNumber;
        List<Integer> scores = new ArrayList<Integer>(3){
            {
                add(0, (keys[0])?2:0);
                add(1, (keys[1])?1:0);
                add(2, (keys[2])?2:0);
            }
        };
        this.keys = scores;
    }

    @Override
    public Integer getQuestionNumber() {
        return questionNumber;
    }

    @Override
    public List<Integer> getAnswers() {
        return keys;
    }
}
