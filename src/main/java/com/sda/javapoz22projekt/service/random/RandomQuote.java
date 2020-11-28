package com.sda.javapoz22projekt.service.random;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RandomQuote {
    private String type;
    private Value value;

    @JsonCreator
    public RandomQuote(@JsonProperty("type") String type, @JsonProperty("value") Value value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public Value getValue() {
        return value;
    }

    static class Value {
        private Long id;
        private String quote;

        @JsonCreator
        public Value(@JsonProperty("id") Long id, @JsonProperty("quote") String quote) {
            this.id = id;
            this.quote = quote;
        }

        public Long getId() {
            return id;
        }

        public String getQuote() {
            return quote;
        }
    }
}
