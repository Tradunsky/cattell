package ua.dnu.qa.model.impl;

import ua.dnu.qa.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Tradunsky V.V.
 */
public class UserFactory {
    public static User createUser(int answerCount){
        return new UserImpl(answerCount);
    }

    public static Class<UserImpl> getImplClass(){
        return UserImpl.class;
    }

    private static class UserImpl implements User {
//        List<Integer> answers;
        Integer[] answers;

        private UserImpl(int answerCount){
            answers = new Integer[answerCount];
        }

        @Override
        public void setAnswer(Integer num, Integer answer) {
            answers[num]= answer;
        }

        @Override
        public List<Integer> getAnswers() {
            return Arrays.asList(answers);
        }
    }
}
