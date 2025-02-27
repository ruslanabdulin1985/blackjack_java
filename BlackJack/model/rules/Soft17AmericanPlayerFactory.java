package BlackJack.model.rules;

public class Soft17AmericanPlayerFactory implements IRulesFactory {
	public IHitStrategy GetHitRule() {
	   	return new Soft17HitStrategy();
	  }
	  
	  
	  public INewGameStrategy GetNewGameRule() {
		  return new AmericanNewGameStrategy();
		  
	  }


	public IDrawStrategy GetWinRule() {
			return new PlayerWinsDrawStrategy();
	}

}
