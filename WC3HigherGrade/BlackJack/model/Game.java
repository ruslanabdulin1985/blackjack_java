package BlackJack.model;

import BlackJack.model.rules.BasicAmericanDealerFactory;
import BlackJack.model.rules.IRulesFactory;

public class Game {

  private Dealer m_dealer;
  private Player m_player;
  

  public Game(IRulesFactory f)
  {
	
    m_dealer = new Dealer(f);
    m_player = new Player();
   
  }
   
  public void attachObservers(Observer o){
	  m_dealer.attach(o);
  }
    
  public boolean IsGameOver()
  {
    return m_dealer.IsGameOver();
  }
  
  public boolean IsDealerWinner()
  {
    return m_dealer.IsDealerWinner(m_player);
  }
  
  public boolean NewGame()
  {
    return m_dealer.NewGame(m_player);
  }
  
  public boolean Hit()
  {
    return m_dealer.Hit(m_player);
  }
  
  public boolean Stand()
  {
	return m_dealer.Stand(m_player); 
  }
  
  public Iterable<Card> GetDealerHand()
  {
    return m_dealer.GetHand();
  }
  
  public Iterable<Card> GetPlayerHand()
  {
    return m_player.GetHand();
  }
  
  public int GetDealerScore()
  {
    return m_dealer.CalcScore();
  }
  
  public int GetPlayerScore()
  {
    return m_player.CalcScore();
  }
    
  
}