package ua.dnu.qa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Tradunsky V.V.
 */
@Controller
@RequestMapping("/auth")
public class AuthController {

    @RequestMapping("/hi")
    public ModelAndView getMainPage(){
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("message", "Hello from auth");
        return modelAndView;
    }
}
