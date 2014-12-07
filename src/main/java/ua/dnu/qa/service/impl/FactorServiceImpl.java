package ua.dnu.qa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ua.dnu.qa.dao.FactorDao;
import ua.dnu.qa.model.Factor;
import ua.dnu.qa.service.FactorService;

import java.util.List;

/**
 * @author Tradunsky V.V.
 */
@Service
public class FactorServiceImpl implements FactorService {
    @Autowired
    @Qualifier("factorDao")
    private FactorDao factorDao;

    public void add(Factor newFactor) {
        factorDao.add(newFactor);
    }

    public List<Factor> list() {
        return factorDao.list();
    }

    public Factor getFactorByName(String factorName) {
        return factorDao.getFactorByName(factorName);
    }
}
