package BlackJack.model;

import BlackJack.view.IView;

public abstract class Observer {
	protected Object o_subject;
	protected Game game;
	public abstract void update();
	public abstract void addSubject(IView v);
}
