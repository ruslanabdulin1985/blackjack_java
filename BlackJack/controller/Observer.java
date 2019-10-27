package BlackJack.controller;

import BlackJack.view.IView;
import BlackJack.model.Game;

public abstract class Observer {
	
	protected PlayGame pg;
	protected Object o;
	public abstract void update();
	public abstract void addListner(Object o);
}
