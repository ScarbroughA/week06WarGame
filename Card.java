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

    public Card() {
		// TODO Auto-generated constructor stub
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static String[] getSuits() {
		return SUITS;
	}
}
