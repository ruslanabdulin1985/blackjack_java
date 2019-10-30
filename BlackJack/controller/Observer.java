package BlackJack.controller;

import BlackJack.view.IView;
import BlackJack.model.Game;

public abstract class Observer {
	protected Object o_subject;
	protected Game game;
	public abstract void update();
	public abstract void addSubject(IView v);
}
