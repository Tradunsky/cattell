package ua.dnu.qa.model;

/**
 * @author Tradunsky V.V.
 */
public interface Question {
    public String getId();
    public Integer getNum();
    public String getQuestion();
    public String[] getAnswers();
//    public Integer[] rightAnswer();
}
