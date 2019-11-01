package BlackJack.model.rules;

import BlackJack.model.IVisitor;
import BlackJack.model.Player;

public interface IDrawStrategy {
	public boolean DealerWon(Player a_dealer, Player a_player);
	
	public String accept(IVisitor v);
}
