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
    Integer num;

    public QuestionImpl(Integer num, String question, String[] answers) {
        this.num = num;
        this.question = question;
        this.answers = answers;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String getQuestion() {
        return question;
    }

    @Override
    public String[] getAnswers() {
        return answers;
    }

    public String toString(){
        return "{Question:{id:"+id+",question:"+question+", answers:{"+ Arrays.toString(answers)+"}}";
    }
}
