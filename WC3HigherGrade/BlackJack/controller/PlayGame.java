package BlackJack.controller;

import BlackJack.view.IView;
import BlackJack.model.Game;

public class PlayGame {
	
	
	

	
  public boolean Play(Game a_game, IView g_view) {
	  
	g_view.DisplayWelcomeMessage();

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

    
    return !g_view.whantsToQuit(input);

  }
  
  public void updateView(Game a_game){
	  
  }
  
}