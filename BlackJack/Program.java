package BlackJack;

import BlackJack.model.Game;
import BlackJack.model.GameObserver;
import BlackJack.model.Observer;
import BlackJack.model.rules.BasicAmericanDealerFactory;
import BlackJack.model.rules.IRulesFactory;
import BlackJack.view.*;
import BlackJack.controller.*;
import BlackJack.model.rules.RulesOptions;

public class Program
{

  public static void main(String[] a_args)
  {
	
	IRulesFactory f = new BasicAmericanDealerFactory();
    
    IView v = new SimpleView(); //new SwedishView();

    Game g = new Game(f);
    Observer obs = new GameObserver(g);
    
	  
    PlayGame ctrl = new PlayGame();
    
    obs.addSubject(v);
	g.attachObservers(obs);
	  

    
    while (ctrl.Play(g, v));
  }
}