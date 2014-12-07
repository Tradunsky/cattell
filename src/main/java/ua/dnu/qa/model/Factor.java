package ua.dnu.qa.model;

import java.util.List;
import java.util.Map;

/**
 * @author Tradunsky V.V.
 */
public interface Factor {
    String getName();
    List<QuestionKey> getKeys();
}
