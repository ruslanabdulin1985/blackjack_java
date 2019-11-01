package BlackJack.model.rules;

import BlackJack.model.Deck;
import BlackJack.model.IVisitor;
import BlackJack.model.Dealer;
import BlackJack.model.Player;

public interface INewGameStrategy {
    boolean NewGame(Deck a_deck, Dealer a_dealer, Player a_player);
    
    public String accept(IVisitor vis);
}