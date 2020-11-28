package com.sda.javapoz22projekt.controller;

import java.util.List;

import com.sda.javapoz22projekt.service.random.RandomQuote;
import com.sda.javapoz22projekt.service.random.RandomQuoteClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomQuoteController {

    private RandomQuoteClient randomQuoteClient;

    public RandomQuoteController(RandomQuoteClient randomQuoteClient) {
        this.randomQuoteClient = randomQuoteClient;
    }

    @GetMapping("quote")
    public List<RandomQuote> randomQuote() {
        return randomQuoteClient.fetchRandomQuote();
    }
}

