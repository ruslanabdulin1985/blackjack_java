package BlackJack.model.rules;

import BlackJack.model.Player;

public class Soft17HitStrategy implements IHitStrategy{
	
	private final int g_hitLimit = 17;
	
	private boolean Soft17(Player a_dealer) {
		return a_dealer.CalcScore()==g_hitLimit & a_dealer.HasAce();
	}

	
	public boolean DoHit(Player a_dealer) {
		
	    return (a_dealer.CalcScore() < g_hitLimit) || this.Soft17(a_dealer);  
		}
		
//		return false;
}


