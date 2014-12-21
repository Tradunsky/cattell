package ua.dnu.qa.model.impl;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import ua.dnu.qa.model.Factor;
import ua.dnu.qa.model.QuestionKey;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tradunsky V.V.
 */
@Document(collection = "factors")
public class FactorImpl implements Factor {
    @Id
    String id;
    String factorName;
    List<QuestionKeyImpl> keys;

    public FactorImpl(){
        keys = new ArrayList<>();
    }

    public FactorImpl(String factorName, List<QuestionKeyImpl> keys) {
        this.factorName = factorName;
        this.keys = keys;
    }

    public List<QuestionKeyImpl> getKeys() {
        return keys;
    }

    @Override
    public void addKeys(List<QuestionKeyImpl> keys) {
        for (QuestionKeyImpl q: keys) {
            this.keys.add(q);
        }
    }

    @Override
    public String getId() {
        return id;
    }

    public String getFactorName() {
        return factorName;
    }
}
