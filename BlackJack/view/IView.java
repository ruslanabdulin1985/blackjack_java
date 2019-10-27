package BlackJack.view;

public interface IView
{
  void DisplayWelcomeMessage();
  boolean whantsToPlay(int inp);
  boolean whantsToPHit(int inp);
  boolean whantsToStand(int inp);
  boolean whantsToQuit(int inp);
  public void DisplayGreetingMessage();
  boolean DisplayEmptySpace();
  boolean Sleep();
  boolean DisplayPausingMessage();
  public int GetInput();
  void DisplayCard(BlackJack.model.Card a_card);
  void DisplayPlayerHand(Iterable<BlackJack.model.Card> a_hand, int a_score);
  void DisplayDealerHand(Iterable<BlackJack.model.Card> a_hand, int a_score);
  void DisplayGameOver(boolean a_dealerIsWinner);
}