package BlackJack.model.rules;

import BlackJack.model.IVisitor;
import BlackJack.model.Player;

class BasicHitStrategy implements IHitStrategy {
    private final int g_hitLimit = 17;

    public boolean DoHit(Player a_dealer) {
      return a_dealer.CalcScore() < g_hitLimit;  
    }

	@Override
	public String accept(IVisitor v) {
		return "Basic Hit Strategy";
		
	}
}