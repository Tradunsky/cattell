package ua.dnu.qa.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import ua.dnu.qa.dao.FactorDao;
import ua.dnu.qa.model.Factor;
import ua.dnu.qa.model.impl.FactorImpl;

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
    public void update(Factor newFactor) {
//        try {
            Factor factor = getFactorByName(newFactor.getFactorName());
//        }catch (Exception e){}
        if (factor==null){
            mongoOperations.save(newFactor);
        }else {
//            factor.addKeys(newFactor.getKeys());
            Update update = new Update();
            update.addToSet("keys", newFactor.getKeys().get(0));
            mongoOperations.updateMulti(Query.query(Criteria.where("factorName").is(newFactor.getFactorName())), update, FACTORS);
        }
    }

    @Override
    public Factor getFactorByName(String factorName) {
        return mongoOperations.findOne(Query.query(Criteria.where("factorName").is(factorName)), FactorImpl.class, FACTORS);
    }

    @Override
    public List<FactorImpl> list() {
        return mongoOperations.findAll(FactorImpl.class, FACTORS);
    }
}
