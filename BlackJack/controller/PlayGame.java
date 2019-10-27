package BlackJack.controller;

import BlackJack.view.IView;
import BlackJack.model.Game;
import BlackJack.model.NewCardObserver;
import BlackJack.model.Observer;

public class PlayGame {
	
	private IView g_view;
	
	
	public PlayGame(IView v) {
		g_view = v;
	}
	
  public boolean Play(Game a_game) {
	  
	  g_view.DisplayWelcomeMessage();
    
    
	  g_view.DisplayDealerHand(a_game.GetDealerHand(), a_game.GetDealerScore());
	  g_view.DisplayPlayerHand(a_game.GetPlayerHand(), a_game.GetPlayerScore());

    if (a_game.IsGameOver())
    {
    	g_view.DisplayGameOver(a_game.IsDealerWinner());
    }

    int input = g_view.GetInput();
    
    if (g_view.whantsToPlay(input)) {
    	a_game.NewGame();
    }
//    
    else if (g_view.whantsToPHit(input))
    {
        a_game.Hit();
    }
    
    else if (g_view.whantsToStand(input))
    {
    	 a_game.Stand();
    }
//    else if (input == 'h')
//    {
//        a_game.Hit();
//    }
//    else if (input == 's')
//    {
//       
//    }
//
    
    return !g_view.whantsToQuit(input);
//    	return input != 'q';
  }
  
  public void NeedsUpdateScreen() {
	  System.out.println("NeedsUpdateScreen"); 
  }
  
  public void updateView(Game a_game){
	  g_view.DisplayDealerHand(a_game.GetDealerHand(), a_game.GetDealerScore());
	  g_view.DisplayPlayerHand(a_game.GetPlayerHand(), a_game.GetPlayerScore());
  }
  
}