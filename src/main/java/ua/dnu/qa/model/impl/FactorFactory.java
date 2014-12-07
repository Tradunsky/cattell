package ua.dnu.qa.model.impl;

import ua.dnu.qa.model.Factor;
import ua.dnu.qa.model.QuestionKey;
import ua.dnu.qa.model.impl.FactorImpl;

import java.util.ArrayList;

/**
 * @author Tradunsky V.V.
 */
public class FactorFactory {

    public static Factor createFactor(Integer num, String factorName) {
        return new FactorImpl(factorName, new ArrayList<QuestionKey>());
    }
}
