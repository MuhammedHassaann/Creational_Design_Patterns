package com.moyaga.creationalDesignPatterns.AbstractFactory;

public abstract class CreditCard {
    protected int cardNumberLength;
    protected int ccNumber;

    public int getCardNumberLength() {
        return cardNumberLength;
    }

    public void setCardNumberLength(int cardNumberLength) {
        this.cardNumberLength = cardNumberLength;
    }

    public int getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(int ccNumber) {
        this.ccNumber = ccNumber;
    }
}
