package BlackJack.view;

public interface IView
{
  void DisplayWelcomeMessage();
  boolean whantsToPlay(int inp);
  boolean whantsToPHit(int inp);
  boolean whantsToStand(int inp);
  boolean whantsToQuit(int inp);
  boolean displayHands(Iterable<BlackJack.model.Card> dealer_hand, int dealer_score, Iterable<BlackJack.model.Card> player_hand, int player_score);
  public int GetInput();
  void DisplayCard(BlackJack.model.Card a_card);
  void DisplayGameOver(boolean a_dealerIsWinner);
}