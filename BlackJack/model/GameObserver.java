package BlackJack.model;

import BlackJack.view.IView;

public class GameObserver extends Observer {
	public GameObserver(Game o_game) {
			game=o_game;
	   }
	
		//
	   public void update() {
		  
		   IView o_view = (IView)o_subject;
		   o_view.displayHands(game.GetDealerHand(), game.GetDealerScore(), game.GetPlayerHand(), game.GetPlayerScore());
		   
	   }
	   

	@Override
	public void addSubject(IView v) {
		o_subject = v;
	}


}
