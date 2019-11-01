package BlackJack;

import BlackJack.model.Game;
import BlackJack.model.GameObserver;
import BlackJack.model.IVisitor;
import BlackJack.model.Observer;
import BlackJack.model.StrategyVisitor;
import BlackJack.model.rules.BasicAmericanDealerFactory;
import BlackJack.model.rules.IRulesFactory;
import BlackJack.view.*;
import BlackJack.controller.*;
import BlackJack.model.rules.RulesOptions;
import BlackJack.model.rules.Soft17AmericanPlayerFactory;

public class Program
{

  public static void main(String[] a_args)
  {
	
	IRulesFactory f = new Soft17AmericanPlayerFactory();
    
    IView v = new SimpleView(); //new SwedishView();

    IVisitor vis = new StrategyVisitor();
	;
    
	v.displayStrategy(vis.visitHitStrategy(f.GetHitRule()), vis.visitWinStrategy(f.GetWinRule()), vis.visitGameStrategy(f.GetNewGameRule()));
	
    Game g = new Game(f);
    Observer obs = new GameObserver(g);
    
	  
    PlayGame ctrl = new PlayGame();
    
    obs.addSubject(v);
	g.attachObservers(obs);
	  

    
    while (ctrl.Play(g, v));
  }
}