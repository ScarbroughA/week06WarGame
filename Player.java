package warWeek06Final;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand;
    int score;
    String name;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.score = 0;
    }

    public void describe() {
        System.out.println("Player: " + name + ", Score: " + score);
        System.out.println("Hand:");
        for (Card card : hand) {
            card.describe();
        }
    }

    public Card flip() {
        if (!hand.isEmpty()) {
            return hand.remove(0);
        }
        return null;
    }

    public void draw(Deck deck) {
        if (deck != null) {
            Card drawnCard = deck.draw();
            if (drawnCard != null) {
                hand.add(drawnCard);
            }
        }
    }

    public void incrementScore() {
        score++;
    }

    public String getName() {
        return name;
    }

	public void win() {
		// TODO Auto-generated method stub
		
	}
}