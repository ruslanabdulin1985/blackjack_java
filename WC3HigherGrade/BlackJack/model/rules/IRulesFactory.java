package BlackJack.model.rules;

public interface IRulesFactory {
		
	  public IHitStrategy GetHitRule();
	  
	  public INewGameStrategy GetNewGameRule();

	  public IDrawStrategy GetWinRule();
}
