package com.laonda.nextia.dto;

public class CreditLimit {
    private String currency;
    private float amount;

    public CreditLimit(String currency, float amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public float getAmount() {
        return amount;
    }
}
