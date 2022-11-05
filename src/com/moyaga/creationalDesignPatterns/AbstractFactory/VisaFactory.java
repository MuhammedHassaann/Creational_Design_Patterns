package com.moyaga.creationalDesignPatterns.AbstractFactory;

public class VisaFactory extends CreditCardFactory{
    public CreditCard getCreditCard(CardType cardType){
        switch (cardType){
            case PLATINUM:{
                return new VisaPlatinumCreditCard();
            }
            case GOLD:{
                return new VisaGoldCreditCard();
            }
            default: return null;
        }
    }
}
