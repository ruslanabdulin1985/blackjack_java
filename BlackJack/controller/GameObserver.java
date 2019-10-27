package BlackJack.controller;

import BlackJack.view.IView;
import BlackJack.view.SimpleView;
import BlackJack.model.Player;
import BlackJack.model.Game;

public class GameObserver extends Observer {
	public GameObserver(Game o_game) {
			game=o_game;
	   }
	
		//
	   public void update() {
		  
		  IView o_view = (IView)o_subject;
		  o_view.DisplayPausingMessage();
		  o_view.Sleep();
		  o_view.DisplayEmptySpace();
		  o_view.DisplayDealerHand(game.GetDealerHand(), game.GetDealerScore());
		  o_view.DisplayDealerHand(game.GetPlayerHand(), game.GetPlayerScore());
		  
	   }
	   

	@Override
	public void addSubject(IView v) {
		o_subject = v;
	}


}
