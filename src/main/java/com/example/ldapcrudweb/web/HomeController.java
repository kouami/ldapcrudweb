package com.example.ldapcrudweb.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
public class HomeController {

    @RequestMapping("/index")
    public ModelAndView index() {

        String message = "Hello World";

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message", message);
        return modelAndView;
    }

    @RequestMapping("/login")
    public ModelAndView login(Principal principal) {
        ModelAndView modelAndView = new ModelAndView("login");
       // System.out.println(principal.toString());
        //modelAndView.addObject("message", message);
        return modelAndView;
    }

    @RequestMapping("/welcome")
    public ModelAndView welcome() {

        String message = "Welcome, You have a successful Login";

        ModelAndView modelAndView = new ModelAndView("welcome");
        modelAndView.addObject("message", message);
        return modelAndView;
    }
}
