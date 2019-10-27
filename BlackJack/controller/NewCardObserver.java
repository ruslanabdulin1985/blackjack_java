package BlackJack.controller;

import BlackJack.view.IView;

public class NewCardObserver extends Observer {
	public NewCardObserver() {
			
	   }
	
		//
	   @Override
	   public void update() {
		   System.out.println("Yahoo!");
	   }


	public void addListner(IView v) {
		o = v;
	}

	@Override
	public void addListner(Object o) {
		
	}
}
