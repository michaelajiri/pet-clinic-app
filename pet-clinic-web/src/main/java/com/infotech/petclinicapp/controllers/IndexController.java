package com.infotech.petclinicapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = {"", "/", "index", "index.html"})
    public String indexPage(){
        return "index";
    }
}