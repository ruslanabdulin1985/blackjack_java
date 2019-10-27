package BlackJack;

import BlackJack.model.Game;
import BlackJack.model.rules.RulesFactory;
import BlackJack.view.*;
import BlackJack.controller.*;
import BlackJack.model.rules.RulesOptions;

public class Program
{

  public static void main(String[] a_args)
  {
	
	RulesFactory f = new RulesFactory(RulesOptions.HitRules.soft17, RulesOptions.WinRules.playerTakesDraw, RulesOptions.GameRules.AmericanGame);
    
    IView v = new SimpleView(); //new SwedishView();

    Game g = new Game(f);
    Observer obs = new GameObserver(g);
    
	  
    PlayGame ctrl = new PlayGame();
    
    obs.addSubject(v);
	g.attachObservers(obs);
	  

    
    while (ctrl.Play(g, v));
  }
}