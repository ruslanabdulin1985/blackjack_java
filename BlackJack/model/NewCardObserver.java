package BlackJack.model;

import BlackJack.controller.PlayGame;


public class NewCardObserver extends Observer {
	public NewCardObserver(PlayGame playGame) {
			this.pg = playGame;
	   }
	
		//
	   @Override
	   public void update() {
		  pg.NeedsUpdateScreen(); 
	   }
}
