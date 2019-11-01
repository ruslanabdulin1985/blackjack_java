package BlackJack.model.rules;

import BlackJack.model.Deck;
import BlackJack.model.IVisitor;
import BlackJack.model.Dealer;
import BlackJack.model.Player;

class AmericanNewGameStrategy implements INewGameStrategy {

  public boolean NewGame(Deck a_deck, Dealer a_dealer, Player a_player) {
    
    a_dealer.DealNewCard(a_player, true);
    
    a_dealer.DealNewCard(a_dealer, true);

    a_dealer.DealNewCard(a_player, true);
    
    a_dealer.DealNewCard(a_dealer, false);

    return true;
  }
  public String accept(IVisitor v) {
		return "American Strategy";
	}
	
}