package com.infotech.petclinicapp.controllers;

import com.infotech.petclinicapp.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/vets")
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping(value = {"", "/", "/index", "/index.html"})
    public String vetPage(Model model){
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}