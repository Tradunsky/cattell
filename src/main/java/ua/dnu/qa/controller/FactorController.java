package ua.dnu.qa.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ua.dnu.qa.model.Factor;
import ua.dnu.qa.model.QuestionKey;
import ua.dnu.qa.model.impl.FactorFactory;
import ua.dnu.qa.model.impl.FactorImpl;
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
    public ModelAndView addFactorPage() {
        return new ModelAndView("addFactor");
    }

    //TODO: need entity and validator
    @ResponseBody
    @RequestMapping("addFactor")
    public String addFactor(@RequestParam Integer num,
                            @RequestParam String factorName,
                            @RequestParam Boolean[] keys) {
        LOG.info("num: {}, factorName: {}, keys: {}", num, factorName, keys);
        if (keys==null || keys.length<2){
            throw new IllegalArgumentException("keys must be 3");
        }
        Factor factor = FactorFactory.createFactor(num, factorName, keys);
        LOG.info("Add new factor: " + factor);
        factorService.update(factor);
        return "{\"result\":\"OK\"}";
    }

    @ResponseBody
    @RequestMapping("list")
    public List<FactorImpl> list() {
        return factorService.list();
    }
}
