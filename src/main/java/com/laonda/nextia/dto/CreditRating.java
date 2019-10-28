package com.laonda.nextia.dto;

public class CreditRating {
    private String rating;
    private String source;

    public CreditRating(String rating, String source) {
        this.rating = rating;
        this.source = source;
    }

    public String getRating() {
        return rating;
    }

    public String getSource() {
        return source;
    }
}
