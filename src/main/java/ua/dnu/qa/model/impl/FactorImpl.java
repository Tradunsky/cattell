package ua.dnu.qa.model.impl;

import ua.dnu.qa.model.Factor;
import ua.dnu.qa.model.QuestionKey;

import java.util.List;

/**
 * @author Tradunsky V.V.
 */
public class FactorImpl implements Factor {
    String name;
    List<QuestionKey> keys;

    public FactorImpl(String name, List<QuestionKey> keys) {
        this.name = name;
        this.keys = keys;
    }

    public List<QuestionKey> getKeys() {
        return keys;
    }

    public String getName() {
        return name;
    }
}
