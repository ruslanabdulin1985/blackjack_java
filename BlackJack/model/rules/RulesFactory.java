package BlackJack.model.rules;

public class RulesFactory {

  public IHitStrategy GetHitRule(String HitRule) {
    if (HitRule.equals("Soft17HitStrategy")){
    	System.out.println("Soft17Strategy in run");
	  return new Soft17HitStrategy();
    }
    System.out.println("BasicHitStrategy in run");
   	return new BasicHitStrategy();
  }
  

  public INewGameStrategy GetNewGameRule() {
    return new AmericanNewGameStrategy();
  }
}