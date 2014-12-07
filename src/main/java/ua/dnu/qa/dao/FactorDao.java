package ua.dnu.qa.dao;

import ua.dnu.qa.model.Factor;

import java.util.List;

/**
 * @author Tradunsky V.V.
 */
public interface FactorDao {
    void add(Factor newFactor);

    Factor getFactorByName(String factorName);

    List<Factor> list();

}
