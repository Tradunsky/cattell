package ua.dnu.qa.service;

import ua.dnu.qa.model.Factor;

import java.util.List;

/**
 * @author Tradunsky V.V.
 */
public interface FactorService {
    public void add(Factor newFactor);
    public List<Factor> list();
    public Factor getFactorByName(String factorName);
}
