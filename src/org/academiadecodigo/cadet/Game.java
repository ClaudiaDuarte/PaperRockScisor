package org.academiadecodigo.cadet;

/**
 * Created by cadet on 17/09/15.
 */
public class Game {

    //variables
    int numberOfRounds = 10;
    
    //Contructor
    public Game(){
    	
    }



    // Game method
    public void playGame(Player player1, Player player2){
    	
    	for (int i = 0; i<numberOfRounds; i++){
    		player1.getHand();
    		player2.getHand();

    		if(player1.hand == player2.hand){
    			continue;
    			
    		} else if(player1.hand == Options.PAPPER && player2.hand == Options.ROCK){
    			player1.score++;
    			
    		}else if(player1.hand == Options.ROCK && player2.hand == Options.PAPPER){
    			player2.score ++;
    			
    		}else if(player1.hand == Options.ROCK && player2.hand == Options.SCISORS){
    			player1.score++;
			
    		}else if(player1.hand == Options.SCISORS && player2.hand == Options.PAPPER){
    			player1.score++;
    			
			}else if(player1.hand == Options.SCISORS && player2.hand == Options.ROCK){
				player2.score ++;
			}else{
				player2.score ++;
			}
    	}
		
    }

 
    //Compare method
    
    public void compare(Player player1, Player player2){
    	if (player1.score > player2.score){
    		System.out.println("The winner is Player 1 with "+player1.score + " points!");
    		
    	} else if (player1.score < player2.score){
    		System.out.println("The winner is Player 2 with "+player2.score + " points!");
    	} else {
    		System.out.println("There is a tie! No winners");
    	}
    }
}
