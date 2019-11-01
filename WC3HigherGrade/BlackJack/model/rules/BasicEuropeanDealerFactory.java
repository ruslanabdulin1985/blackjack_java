package BlackJack.model.rules;

public class BasicEuropeanDealerFactory implements IRulesFactory {
	public IHitStrategy GetHitRule() {
	   	return new BasicHitStrategy();
	  }
	  
	  
	  public INewGameStrategy GetNewGameRule() {
		  return new InternationalNewGameStrategy();
		  
	  }


	public IDrawStrategy GetWinRule() {
			return new DealerWinsDrawStrategy();
	}

}
