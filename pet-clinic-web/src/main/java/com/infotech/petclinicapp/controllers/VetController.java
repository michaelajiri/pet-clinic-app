package com.infotech.petclinicapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/vets")
public class VetController {

    @RequestMapping(value = {"", "/", "/index", "/index.html"})
    public String vetPage(){
        return "vets/index";
    }
}