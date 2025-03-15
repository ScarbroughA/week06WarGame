package warWeek06Final;

class Card {
    private String suit;
    private int rank;
	public String name;
	public int value;
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANK_NAMES = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};

    public Card(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

     @Override
    public String toString() {
        return RANK_NAMES[rank - 2] + " of " + suit;
    }

	public void describe() {
		
	}

	public static String[] getSuits() {
		return SUITS;
	}
}
