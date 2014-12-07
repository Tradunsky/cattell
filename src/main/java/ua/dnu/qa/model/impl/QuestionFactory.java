package ua.dnu.qa.model.impl;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import ua.dnu.qa.model.Question;

/**
 * @author Tradunsky V.V.
 */
public class QuestionFactory {

    public static Question createQuestion(Integer num, String question, String[] answers) {
        return new QuestionImpl(num, question, answers);
    }
//    @Document(collection = "questions")
//    public static class QuestionImpl implements Question{
//        @Id
//        String id;
//        String question;
//        String[] answers;
//        Integer rightAnswer;
//
//        public QuestionImpl(String question, String[] answers, Integer rightAnswer) {
//            this.question = question;
//            this.answers = answers;
//            this.rightAnswer = rightAnswer;
//        }
//
//        @Override
//        public String get() {
//            return question;
//        }
//
//        @Override
//        public String[] getAnswers() {
//            return answers;
//        }
//
//        @Override
//        public Integer rightAnswer() {
//            return rightAnswer;
//        }
//
//        @Override
//        public String getId() {
//            return id;
//        }
//    }
}
