package com.sda.javapoz22projekt.service.random;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class RandomQuoteClient {

    private RestTemplate randomQuoteRestTemplate;

    public RandomQuoteClient(RestTemplate randomQuoteRestTemplate) {
        this.randomQuoteRestTemplate = randomQuoteRestTemplate;
    }

    public List<RandomQuote> fetchRandomQuote() {
        return Stream.of(new Integer[3])
                .map(a -> randomQuoteRestTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", RandomQuote.class))
                .collect(Collectors.toList());
    }
}
