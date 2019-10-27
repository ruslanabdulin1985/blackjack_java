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
    Game g = new Game(f);
    IView v = new SimpleView(); //new SwedishView();
    PlayGame ctrl = new PlayGame();
    while (ctrl.Play(g, v));
  }
}