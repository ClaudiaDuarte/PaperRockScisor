package org.academiadecodigo.cadet;

/**
 * Created by cadet on 17/09/15.
 */
public class Main {

	public static void main(String[] args){
		Player player1 = new Player("Claudia", Options.NONE, 0);
		Player player2 = new Player("Zeca", Options.NONE, 0);

		Game game = new Game();
	
		game.playGame(player1, player2);
		
		game.compare(player1, player2);
		
		

	}
	

}
