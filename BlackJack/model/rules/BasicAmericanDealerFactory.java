package BlackJack.model.rules;


public class BasicAmericanDealerFactory implements IRulesFactory {
	
	

  public IHitStrategy GetHitRule() {
   	return new BasicHitStrategy();
  }
  
  
  public INewGameStrategy GetNewGameRule() {
	  return new AmericanNewGameStrategy();
	  
  }


public IDrawStrategy GetWinRule() {
		return new DealerWinsDrawStrategy();
}

}