package BlackJack.model.rules;

import BlackJack.model.Player;

public interface IDrawStrategy {
	public boolean DealerWon(Player a_dealer, Player a_player);
}
