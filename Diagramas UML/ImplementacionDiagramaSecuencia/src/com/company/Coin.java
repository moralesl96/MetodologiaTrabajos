package com.company;

public class Coin {
    private String coinOption;
    public Coin(){

    }
    public String getCoingOption(){

        int flip = (int) (Math.random() * 2)+1;
        if (flip==1)
            coinOption="heads";
        else if (flip==2)
            coinOption="tails";
        String winningFlip=coinOption;
        return winningFlip;

    }
}
