package codingProjectWeek06;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	public class Deck {
	private List<Card> cards;

	public Deck() {
		cards = new ArrayList<>();
		Deck2();
		
			
		}
		private void Deck2() {
			String[] suits = {"Clubs", "Diamonds", "Spades", "Hearts"};
			String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
			
			for (String suit : suits) {
				for(int i = 2; i <= 14; i++) {
					String cardName = names[i - 2] + " of " + suit;
					cards.add(new Card(i, cardName));
					
				}
			}
		}
		public void shuffle() {
			Collections.shuffle(cards);
			
		}
		public Card draw() {
			if (!cards.isEmpty()) {
				return cards.remove(0);
				
			} else {
				return null; 
			}
		}
}

