package BlackJack.model.rules;

public class RulesOptions {
	
		public enum HitRules{
			basic,
			soft17
		}
		
		public enum WinRules{
			playerTakesDraw,
			dealerTakesDraw
		}
		
		public enum GameRules{
			AmericanGame,
			InternationalGame
		}
}
