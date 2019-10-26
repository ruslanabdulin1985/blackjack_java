package BlackJack.model.rules;

public class Rules {
		enum HitRules{
			basic,
			soft17
		}
		
		enum WinRules{
			playerTakesDraw,
			dealerTakesDraw
		}
		
		enum GameRules{
			AmericanGame,
			InternationalGame
		}
}
