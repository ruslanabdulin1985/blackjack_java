package BlackJack.model.rules;

import BlackJack.model.Player;

public interface IHitStrategy {
    boolean DoHit(Player a_dealer);
    
    public String accept(BlackJack.model.IVisitor v);
}