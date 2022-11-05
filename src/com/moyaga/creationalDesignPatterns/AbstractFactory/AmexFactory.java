package com.moyaga.creationalDesignPatterns.AbstractFactory;

public class AmexFactory extends CreditCardFactory{
    public CreditCard getCreditCard(CardType cardType){
        switch (cardType){
            case GOLD:{
                return new AmexGoldCreditCard();
            }
            case PLATINUM:{
                return new AmexPlatinumCreditCard();
            }
            default: return null;
        }
    }

}
