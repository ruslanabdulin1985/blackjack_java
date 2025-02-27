package BlackJack.model.rules;

import BlackJack.model.IVisitor;
import BlackJack.model.Player;

public class PlayerWinsDrawStrategy implements IDrawStrategy {
	public boolean DealerWon(Player a_dealer, Player a_player) {
		if (a_player.CalcScore() > a_player.getMaxScore()) {
		      return true;
		    } else if (a_dealer.CalcScore() > a_dealer.getMaxScore()) {
		      return false;
		    }
		    return a_dealer.CalcScore() > a_player.CalcScore();
	}
	
	public String accept(IVisitor v) {
		return "Player Wins Draw Strategy";
	}
	
}
