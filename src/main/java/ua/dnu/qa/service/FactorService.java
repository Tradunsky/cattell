package ua.dnu.qa.service;

import ua.dnu.qa.model.Factor;
import ua.dnu.qa.model.impl.FactorImpl;

import java.util.List;
import java.util.Map;

/**
 * @author Tradunsky V.V.
 */
public interface FactorService {
    public void add(Factor newFactor);
    public List<FactorImpl> list();
    public Factor getFactorByName(String factorName);

    void update(Factor factor);

    Map<String, Integer> calculateFactorsScores(List<Integer> userAnswers, List<FactorImpl> factorKeys);
}
