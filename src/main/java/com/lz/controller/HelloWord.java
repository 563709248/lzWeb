package com.lz.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Maven on 2016/2/17.
 */
@Component
@RequestMapping(value = "/helloWord")
public class HelloWord {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView index(Model model) {
        ModelAndView mv = new ModelAndView("/index");
        mv.addObject("title", "Spring MVC And Freemarker");
        mv.addObject("content", " Hello world ， test my first spring mvc ! ");
        return mv;
    }
}
