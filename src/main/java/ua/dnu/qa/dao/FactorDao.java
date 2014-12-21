package ua.dnu.qa.dao;

import ua.dnu.qa.model.Factor;
import ua.dnu.qa.model.impl.FactorImpl;

import java.util.List;

/**
 * @author Tradunsky V.V.
 */
public interface FactorDao {
    void add(Factor newFactor);

    void update(Factor newFactor);

    Factor getFactorByName(String factorName);

    List<FactorImpl> list();

}
