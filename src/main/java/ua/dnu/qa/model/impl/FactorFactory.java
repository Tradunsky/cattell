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
        return new FactorImpl(factorName, new ArrayList<QuestionKeyImpl>());
    }

    public static Factor createFactor(final Integer num, String factorName, final Boolean[] keys) {
        if ("B".equalsIgnoreCase(factorName))
            return new FactorImpl(factorName, new ArrayList<QuestionKeyImpl>() {{
                add(new QuestionKeyImpl(num, new ArrayList<Integer>() {{
                    add(1);
                    add(1);
                    add(1);
                }}));
            }});
        else
            return new FactorImpl(factorName, new ArrayList<QuestionKeyImpl>(1) {{
                add(new QuestionKeyImpl(num, keys));
            }});
    }
}
