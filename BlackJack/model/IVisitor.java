package BlackJack.model;

import BlackJack.model.rules.IDrawStrategy;
import BlackJack.model.rules.IHitStrategy;
import BlackJack.model.rules.INewGameStrategy;

public interface IVisitor {
public String visitHitStrategy(IHitStrategy hitStr);
public String visitWinStrategy(IDrawStrategy winStr);
public String visitGameStrategy(INewGameStrategy gameStr);

}
