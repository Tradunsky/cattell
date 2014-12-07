package ua.dnu.qa.model;

import java.util.List;

/**
 * @author Tradunsky V.V.
 */
public interface User {
    String SESSION_KEY = "UK";

    void setAnswer(Integer num, Integer answer);

    List<Integer> getAnswers();
}
