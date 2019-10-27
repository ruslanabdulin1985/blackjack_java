package BlackJack.model;

import BlackJack.controller.PlayGame;

public abstract class Observer {
	protected PlayGame pg;
	public abstract void update();
	
}
