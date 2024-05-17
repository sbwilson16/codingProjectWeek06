package codingProjectWeek06;

public class App {
	public static void main(String[] args) {
		Deck deck = new Deck();
		Player player1 = new Player("player 1");
		Player player2 = new Player("player 2");
		
		deck.shuffle();
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
			player1.getHand().add(deck.draw());
			} else {
			player2.getHand().add(deck.draw());
			}
				
		}
	
	for (int i = 0; i < 26; i++) {
		Card card1 = player1.flip();
		Card card2 = player2.flip();
		
		System.out.println("\nTurn " + (i + 1) + ":");
		System.out.println("Player 1 flipped: " + card1.getName());
		//card1.describe();
		System.out.println("Player 2 flipped: " + card2.getName());
		//card2.describe();
		if (card1.getValue() > card2.getValue()) {
			player1.incrementScore();
			System.out.println("Player 1 gets a point!");
		} else if (card1.getValue() < card2.getValue()) {
			player2.incrementScore();
			System.out.println("Player 2 gets a point!");
		} else {
			System.out.println("It's a draw!");
		}
	}
	System.out.println("\n Final Score:");
	System.out.println("Player 1: " + player1.getScore());
	System.out.println("Player 2: " + player2.getScore());
		

     if (player1.getScore() > player2.getScore()) {
    	 System.out.println("Player 1 Wins!");
    	 
     } else if (player1.getScore() < player2.getScore()) {
    	 System.out.println("Player 1 Wins!");
     } else {
    	 System.out.println("It's a Draw!");
     }
	}
}
