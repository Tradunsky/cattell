package ua.dnu.qa.model;

import ua.dnu.qa.model.impl.QuestionKeyImpl;

import java.util.List;

/**
 * @author Tradunsky V.V.
 */
public interface Factor {
    public String getId();
    public String getFactorName();
    public List<QuestionKeyImpl> getKeys();
    public void addKeys(List<QuestionKeyImpl> keys);
}
