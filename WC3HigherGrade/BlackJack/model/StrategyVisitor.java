package BlackJack.model;

import BlackJack.model.rules.IDrawStrategy;
import BlackJack.model.rules.IHitStrategy;
import BlackJack.model.rules.INewGameStrategy;

public class StrategyVisitor implements IVisitor{

	@Override
	public String visitHitStrategy(IHitStrategy hitStr) {
		return hitStr.accept(this);
	}

	@Override
	public String visitWinStrategy(IDrawStrategy winStr) {
		return winStr.accept(this);
	}

	@Override
	public String visitGameStrategy(INewGameStrategy gameStr) {
		return gameStr.accept(this);
	}
	
}
