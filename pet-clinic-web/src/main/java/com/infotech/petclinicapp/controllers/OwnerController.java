package com.infotech.petclinicapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/owners")
public class OwnerController {

    @RequestMapping(value = {"", "/", "/index", "/index.html"})
    public String ownersPage() {
        return "owners/index";
    }
}
