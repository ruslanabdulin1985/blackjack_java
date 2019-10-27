package BlackJack.view;

public class SimpleViewUsingObserver implements IView 
{

  public void DisplayWelcomeMessage()
        {
//           
          System.out.println("Dealer : 'We are ready, you can make your move'");
          System.out.println("Type 'p' to Play, 'h' to Hit, 's' to Stand or 'q' to Quit\n");
        }
  
  public void DisplayGreetingMessage() {
	  System.out.println("Welcome to Fancy BlackJack!");
  }
  
  		public boolean DisplayEmptySpace() {
  			for(int i = 0; i < 50; i++) {System.out.print("\n");}
  			return true;
  		}
  		public boolean whantsToPlay(int inp) {
  			return inp == 'p';
  		}
  		
  		public boolean whantsToPHit(int inp) {
  			return inp == 'h';
  		}
  		
  		public boolean whantsToStand(int inp) {
  			return inp == 's';
  		}
  		
  		public boolean whantsToQuit(int inp) {
  			return inp == 'q';
  		}

        public int GetInput()
        {
          try {
            int c = System.in.read();
            while (c == '\r' || c =='\n') {
              c = System.in.read();
            }
            return c;
          } catch (java.io.IOException e) {
            System.out.println("" + e);
            return 0;
          }
        }

        public void DisplayCard(BlackJack.model.Card a_card)
        {
            System.out.println("" + a_card.GetValue() + " of " + a_card.GetColor());
        }

        public void DisplayPlayerHand(Iterable<BlackJack.model.Card> a_hand, int a_score)
        {
            DisplayHand("Player", a_hand, a_score);
        }

        public void DisplayDealerHand(Iterable<BlackJack.model.Card> a_hand, int a_score)
        {
            DisplayHand("Dealer", a_hand, a_score);
        }

        private void DisplayHand(String a_name, Iterable<BlackJack.model.Card> a_hand, int a_score)
        {
            System.out.println(a_name + " Has: ");
            for(BlackJack.model.Card c : a_hand)
            {
                DisplayCard(c);
            }
            System.out.println("Score: " + a_score);
            System.out.println("");
        }

        public void DisplayGameOver(boolean a_dealerIsWinner)
        {
            System.out.println("GameOver: ");
            if (a_dealerIsWinner)
            {
                System.out.println("Dealer Won!");
            }
            else
            {
                System.out.println("You Won!");
            }
            
        }

		@Override
		public boolean Sleep() {
			 try {
				Thread.sleep(2000);
				return true;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
			 
		}

		@Override
		public boolean DisplayPausingMessage() {
			System.out.println("Dealer: 'Hold on a second, I am dealing cards'");
			return false;
		}
    }
