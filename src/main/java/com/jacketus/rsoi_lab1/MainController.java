package com.jacketus.rsoi_lab1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class MainController {
/*
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String indexPage(ModelMap model) {
        //model.addAttribute("my_body", "Hello world!");
        return "index";
    }
*/
    @RequestMapping(value = "/sha256", method = RequestMethod.GET)
    public String hashPage(@RequestParam(value = "string", required = false, defaultValue = "NULL") String string, ModelMap model){
        String hashed = Worker.getSHA256Hash(string);

        model.addAttribute("orig_str", string);
        model.addAttribute("hashed_str", hashed);
        return "sha256";
    }
}