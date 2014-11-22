package ua.dnu.qa.dao.impl;

import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import ua.dnu.qa.dao.QuestionDao;
import ua.dnu.qa.model.Question;
import ua.dnu.qa.model.impl.QuestionFactory;
import ua.dnu.qa.model.impl.QuestionImpl;

import java.util.List;

/**
 * @author Tradunsky V.V.
 */
@Component
public class QuestionDaoImpl implements QuestionDao {
    private static final Logger LOG = LoggerFactory.getLogger(QuestionDaoImpl.class);
    @Autowired
    @Qualifier("mongoOperations")
    private MongoOperations mongoOperations;
    private static final String QUESTIONS = "questions";

    public void add(Question question) {
        mongoOperations.insert(question, QUESTIONS);
//        mongoOperations.save(question);
    }

    @Override
    public List<Question> list() {
        return mongoOperations.findAll(Question.class, QUESTIONS);
    }

    @Override
    public Boolean checkAnswerToQuestion(String id, Integer answer) {
        Question question = mongoOperations.findOne(
                Query.query(Criteria.where("_id").is(id)),
                QuestionFactory.QuestionImpl.class
                ,QUESTIONS
        );
//        Question question = mongoOperations.findById(id, Question.class, QUESTIONS);
        LOG.info("Question is {} by id: {}", question, id);
        if (question == null)
            return null;
        return question.rightAnswer().equals(answer);
    }
}
