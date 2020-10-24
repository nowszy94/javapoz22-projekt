package com.sda.javapoz22projekt.controller;

import com.sda.javapoz22projekt.service.OfferService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OfferController {

    private OfferService offerService;

    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    @GetMapping("/offer/{id}")
    public ModelAndView offerById(@PathVariable("id") Long id) {
        ModelAndView modelAndView = new ModelAndView("offer");
        modelAndView.addObject("offer", offerService.getById(id));
        return modelAndView;
    }
}
