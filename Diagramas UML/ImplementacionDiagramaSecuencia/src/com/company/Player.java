package com.company;

public class Player {
    private String name;
    private String coinOption;

    public Player(){

    }

    public String getCoinOption(){
        return coinOption;
    }

    public void setCoinOption(String opponentFlip) {
        if (opponentFlip.equals("heads"))
            coinOption="tails";
        else
            coinOption="heads";
    }

    public String getRandCoinOption(){
        int flip = (int) (Math.random() * 2)+1;
        if (flip==1)
            coinOption="heads";
        else if (flip==2)
            coinOption="tails";
        String playersPick=coinOption;
        return playersPick;
    }

    public void didPlayerWin(String winningFlip){
        if (coinOption==winningFlip)
            System.out.println("You win");
        else
            System.out.println("You lose");

    }
}
