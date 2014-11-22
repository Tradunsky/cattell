package ua.dnu.qa.model.impl;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import ua.dnu.qa.model.Question;

import java.util.Arrays;

/**
 * @author Tradunsky V.V.
 */
@Document(collection = "questions")
public class QuestionImpl implements Question {
    @Id
    String id;
    String question;
    String[] answers;
//    Integer rightAnswer;

    public QuestionImpl(String question, String[] answers, Integer rightAnswer) {
        this.question = question;
        this.answers = answers;
//        this.rightAnswer = rightAnswer;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getQuestion() {
        return question;
    }

    @Override
    public String[] getAnswers() {
        return answers;
    }

//    @Override
//    public Integer rightAnswer() {
//        return rightAnswer;
//    }

    public String toString(){
        return "{Question:{id:"+id+",question:"+question+", answers:{"+ Arrays.toString(answers)+"}}";
    }
}
