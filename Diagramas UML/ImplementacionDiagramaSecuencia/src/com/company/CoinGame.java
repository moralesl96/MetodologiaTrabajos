package com.company;
import java.util.Scanner;
public class CoinGame {
    public Player players[]= new Player[2];
    public Coin theCoin;
    public CoinGame(){
        startGame();
    }

    void startGame(){
       players[0]=new Player();
       players[1]= new Player();
       theCoin= new Coin();
       boolean flipAgain=true;
       while (flipAgain)
       {
           int initialplayer= (int) (Math.random() * 2)+1;
           switch (initialplayer){
               case 1:
                   System.out.println("Inicia jugador 1");
                   players[0].setCoinOption(players[0].getRandCoinOption());
                   players[1].setCoinOption(players[0].getCoinOption());
                   break;
               case 2:
                   System.out.println("Inicia jugador 2");
                   players[1].setCoinOption(players[1].getRandCoinOption());
                   players[0].setCoinOption(players[1].getCoinOption());
                   break;
               default:
                   break;
           }
           String winningFlip= theCoin.getCoingOption();
           System.out.println("Player 1:");
           players[0].didPlayerWin(winningFlip);
           System.out.println("Player 2:");
           players[1].didPlayerWin(winningFlip);
           System.out.println("You want to play again? (Y/N)");
           Scanner option= new Scanner(System.in);
           String entradaTeclado= option.nextLine();
           if(entradaTeclado.equals("n"))
               flipAgain=false;
       }
    }
}
