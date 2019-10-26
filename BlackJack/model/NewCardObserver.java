package BlackJack.model;

public class NewCardObserver extends Observer {
	public NewCardObserver(Player o_player) {
		this.a_player = o_player;
	    this.a_player.attach(this);
	    System.out.println("Observer attached");
	   }

	   @Override
	   public void update() {
	      System.out.println( "PLAYER GOT A NEW CARD!"); 
	   }
}
