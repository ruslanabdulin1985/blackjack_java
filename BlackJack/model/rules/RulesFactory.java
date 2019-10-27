package BlackJack.model.rules;

public class RulesFactory {
	  private RulesOptions.HitRules hitRules;
	  private RulesOptions.WinRules winRules;
	  private RulesOptions.GameRules gameRules;
	  
	
	public RulesFactory() { // default rules factory
		  this.hitRules = RulesOptions.HitRules.soft17;
		  this.winRules = RulesOptions.WinRules.playerTakesDraw;
		  this.gameRules = RulesOptions.GameRules.InternationalGame;
	}
	
	public RulesFactory(RulesOptions.HitRules f_HitRules, RulesOptions.WinRules f_WinRules, RulesOptions.GameRules f_GameRules) {
		this.hitRules = f_HitRules;
		  this.winRules = f_WinRules;
		  this.gameRules = f_GameRules;
	
		
	}
	
	

  public IHitStrategy GetHitRule() {
    if (hitRules == RulesOptions.HitRules.soft17){
    	
	  return new Soft17HitStrategy();
    }
    System.out.println("BasicHitStrategy in run");
   	return new BasicHitStrategy();
  }
  
  public INewGameStrategy GetNewGameRule() {
	  if (gameRules == RulesOptions.GameRules.AmericanGame)
		  return new AmericanNewGameStrategy();
	  else
		  return new InternationalNewGameStrategy();
  }


public IDrawStrategy GetWinRule() {
	if (winRules == RulesOptions.WinRules.dealerTakesDraw)
		return new DealerWinsDrawStrategy();
	else
		return new PlayerWinsDrawStrategy();
}
}