package BlackJack.view;

public interface IView
{
  void DisplayWelcomeMessage();
  boolean whantsToPlay(int inp);
  boolean whantsToPHit(int inp);
  boolean whantsToStand(int inp);
  boolean whantsToQuit(int inp);
  boolean displayHands(Iterable<BlackJack.model.Card> dealer_hand, int dealer_score, Iterable<BlackJack.model.Card> player_hand, int player_score);
  //public void DisplayGreetingMessage();
  //boolean DisplayEmptySpace();
//  boolean Sleep();
  //boolean DisplayPausingMessage();
  public int GetInput();
  void DisplayCard(BlackJack.model.Card a_card);
  //void DisplayPlayerHand(Iterable<BlackJack.model.Card> a_hand, int a_score);
  //void DisplayDealerHand(Iterable<BlackJack.model.Card> a_hand, int a_score);
  void DisplayGameOver(boolean a_dealerIsWinner);
}