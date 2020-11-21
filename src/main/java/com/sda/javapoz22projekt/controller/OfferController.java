package com.sda.javapoz22projekt.controller;

import com.sda.javapoz22projekt.service.OfferService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class OfferController {

    private OfferService offerService;

    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    @GetMapping("/offers/{id}")
    public ModelAndView offerById(@PathVariable("id") Long id) {
        ModelAndView modelAndView = new ModelAndView("offer");
        modelAndView.addObject("offer", offerService.getById(id));
        return modelAndView;
    }

    @GetMapping("/offers")
    public ModelAndView findAll() {
        ModelAndView modelAndView = new ModelAndView("offers");
        System.out.println("hello world");
        modelAndView.addObject("offers", offerService.findAll());
        return modelAndView;
    }

    @GetMapping("/test")
    public ModelAndView dd() {
        ModelAndView modelAndView = new ModelAndView("test");
        modelAndView.addObject("form", new Blabla());
        return modelAndView;
    }

    @PostMapping("/test")
    public ModelAndView test(@ModelAttribute Blabla blabla) {

        System.out.println("tutaj breakpoint");
        ModelAndView modelAndView = new ModelAndView("test");
        modelAndView.addObject("form", blabla);
        return modelAndView;
    }

    static class Blabla {
        private LocalDate dateFrom;
        private LocalDate dateTo;

        public Blabla(@DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dateFrom, @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dateTo) {
            this.dateFrom = dateFrom;
            this.dateTo = dateTo;
        }

        public LocalDate getDateFrom() {
            return dateFrom;
        }

        public LocalDate getDateTo() {
            return dateTo;
        }
    }
}
