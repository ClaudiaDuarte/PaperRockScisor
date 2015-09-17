package org.academiadecodigo.cadet;

/**
 * Created by cadet on 17/09/15.
 */
public class Player {

    //variables
    String name;
    Options hand;
    int score;


    //constructor
    public Player (String name, Options hand, int score){
        this.name = name;
        this.hand = hand;
        this.score = score;
    }

    
    //hand random method
    public void getHand (){

        if (Math.random() < 0.33){
            hand = Options.PAPPER;
        } else if (0.33 <= Math.random() && Math.random() <= 0.66){
            hand = Options.ROCK;
        } else {
           hand = Options.SCISORS;
        }
    }

}
