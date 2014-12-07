package ua.dnu.qa.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import ua.dnu.qa.dao.FactorDao;
import ua.dnu.qa.model.Factor;

import java.util.List;

/**
 * @author Tradunsky V.V.
 */
public class FactorDaoImpl implements FactorDao {
    @Autowired
    @Qualifier("mongoOperations")
    private MongoOperations mongoOperations;
    private static final String FACTORS = "factors";

    @Override
    public void add(Factor newFactor) {
        mongoOperations.insert(newFactor, FACTORS);
    }

    @Override
    public Factor getFactorByName(String factorName) {
        return mongoOperations.findOne(Query.query(Criteria.where("name").is(factorName)), Factor.class, FACTORS);
    }

    @Override
    public List<Factor> list() {
        return mongoOperations.findAll(Factor.class, FACTORS);
    }
}
