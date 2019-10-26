package BlackJack.model.rules;

public class RulesFactory {
	
  //private Rules.HitRules hitRules = Rules.HitRules.basic;
  private Rules.HitRules hitRules = Rules.HitRules.soft17;
  private Rules.WinRules winRules = Rules.WinRules.playerTakesDraw;
  
  public IHitStrategy GetHitRule() {
    if (hitRules == Rules.HitRules.soft17){
    	System.out.println("Soft17Strategy in run");
	  return new Soft17HitStrategy();
    }
    System.out.println("BasicHitStrategy in run");
   	return new BasicHitStrategy();
  }
  

  public INewGameStrategy GetNewGameRule() {
    return new AmericanNewGameStrategy();
  }


public IDrawStrategy GetWinRule() {
	if (winRules == Rules.WinRules.dealerTakesDraw)
		return new DealerWinsDrawStrategy();
	else
		return new PlayerWinsDrawStrategy();
}
}