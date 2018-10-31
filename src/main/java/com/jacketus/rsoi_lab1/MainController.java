package com.jacketus.rsoi_lab1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller

public class MainController {
/*
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String indexPage(ModelMap model) {
        //model.addAttribute("my_body", "Hello world!");
        return "index";
    }
*/
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloPage(ModelMap model) {
        model.addAttribute("my_body", "Hello world!");
        return "hello.jsp";
    }

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hiPage(ModelMap model) {
        model.addAttribute("my_body", "Hi world!");
        return "hello.jsp";
    }
}