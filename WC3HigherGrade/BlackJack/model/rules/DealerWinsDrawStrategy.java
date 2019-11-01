package BlackJack.model.rules;

import BlackJack.model.IVisitor;
import BlackJack.model.Player;

public class DealerWinsDrawStrategy implements IDrawStrategy {
	public boolean DealerWon(Player a_dealer, Player a_player) {
		if (a_player.CalcScore() > a_player.getMaxScore()) {
		      return true;
		    } else if (a_dealer.CalcScore() > a_dealer.getMaxScore()) {
		      return false;
		    }
		    return a_dealer.CalcScore() >= a_player.CalcScore();
	}

	@Override
	public String accept(IVisitor v) {
		return "Dealer Wins Draw Strategy";
	}
	
	
	 
}
