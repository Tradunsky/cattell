package ua.dnu.qa.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ua.dnu.qa.model.Factor;
import ua.dnu.qa.model.QuestionKey;
import ua.dnu.qa.model.impl.FactorFactory;
import ua.dnu.qa.model.impl.QuestionKeyImpl;
import ua.dnu.qa.service.FactorService;
import ua.dnu.qa.service.impl.FactorServiceImpl;

import java.util.List;

/**
 * @author Tradunsky V.V.
 */
@Controller
@RequestMapping("factor")
public class FactorController {
    private static final Logger LOG = LoggerFactory.getLogger(FactorController.class);

    @Autowired
    @Qualifier("factorService")
    private FactorService factorService;

    @ResponseBody
    @RequestMapping("add")
    public Factor addQuestion(@RequestParam Integer num,
                              @RequestParam String factorName,
                              @RequestParam Boolean[] keys) {
        Factor factor = factorService.getFactorByName(factorName);
        if (factor == null)
            factor = FactorFactory.createFactor(num, factorName);
        QuestionKey questionKey = new QuestionKeyImpl(num, keys);
        factor.getKeys().add(questionKey);
        LOG.info("Add new factor: " + factor);
        factorService.add(factor);
        return factor;
    }

    @ResponseBody
    @RequestMapping("list")
    public List<Factor> list() {
        return factorService.list();
    }
}
