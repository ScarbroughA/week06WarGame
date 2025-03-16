package warWeek06Final;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (int i = 0; i < values.length; i++) {
             //   cards.add(new Card(values[i] + " of " + suit, i + 2));
             Card c = new Card();
             c.setValue(i + 2);
				c.setName(values [i] + " of " + suit);
				cards.add(c);
            }
        }
    }

  public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    Card draw() { return cards.remove(0);
    }

    public List<Card> getCards() {
        return cards;
    }

	public static void printdeck() {
		
		
	}
}