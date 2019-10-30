package BlackJack.model;

import BlackJack.model.rules.*;

public class Dealer extends Player {

  private Deck m_deck;
  private INewGameStrategy m_newGameRule;
  private IHitStrategy m_hitRule;
  private IDrawStrategy m_winRule;
 

  public Dealer(RulesFactory a_rulesFactory) {
  
    m_newGameRule = a_rulesFactory.GetNewGameRule();
    m_hitRule = a_rulesFactory.GetHitRule();
    m_winRule = a_rulesFactory.GetWinRule();
    
  }
  
  public boolean NewGame(Player a_player) {
    if (m_deck == null || IsGameOver()) {
      m_deck = new Deck();
      this.ClearHand();
      a_player.ClearHand();
      return m_newGameRule.NewGame(m_deck, this, a_player);   
    }
    return false;
  }
  
  public boolean DealNewCard(Player a_player, boolean isVisible) {
	  Deck m_deck = this.getDeck();
	  Card c = m_deck.GetCard();
	  c.Show(isVisible);
	  a_player.DealCard(c);
	  this.notifyAllObservers();
	  return true;
  }  
  
  public boolean Stand(Player a_player) {
	  if (m_deck != null) {
		  this.ShowHand();

		  while (m_hitRule.DoHit(this)){
			  DealNewCard(this, true);
		  }
		  
		  return true;
	  }
	return false;
  }

  public boolean Hit(Player a_player) {
    if (m_deck != null && a_player.CalcScore() < g_maxScore && !IsGameOver()) {
    	DealNewCard(a_player, true);
    	return true;
    }
    return false;
  }
  
  public Deck getDeck() {
	  return m_deck;
  }

  public boolean IsDealerWinner(Player a_player) {
	return m_winRule.DealerWon(this, a_player);
  }
  
  public boolean IsGameOver() {
    if (m_deck != null && m_hitRule.DoHit(this) != true) {
        return true;
    }
    return false;
  }
  
}