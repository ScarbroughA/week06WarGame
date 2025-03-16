package warWeek06Final;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Deck.printdeck();
			deck.shuffleDeck();
			
        		Player p1 = new Player("Pistol Pete");
        		Player p2 = new Player("Shotgun Blast");
        		
System.out.println("Pistol Pete vs Shotgun Blast");
System.out.println("****************************");
        	
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
            		p1.getHand().add(deck.draw());
            } else {
            	p2.getHand().add(deck.draw());
            }
        }

       
    for (int i = 0; i < 26; i++) {
            Card c1 = p1.flip(), c2 = p2.flip();
        System.out.println(p1.getName() + " plays " + c1.getName());
        		System.out.println(p2.getName() + " plays " + c2.getName());
          
            if (c1.getValue() > c2.getValue()) {
                p1.incrementScore();
                System.out.println(p1.getName() + " wins the round!");
            } else if (c1.getValue() < c2.getValue()) {
                p2.incrementScore();
                System.out.println(p2.getName() + " wins the round!");
            } else {
                System.out.println("It's a tie! No points awarded.");
            }
       System.out.println("Score: " + p1.getName() + " " + p1.getScore() + " - " + p2.getName() + " " + p2.getScore());
       System.out.println("***********************************************");
       System.out.println();
       System.out.println("***********************************************");
        }

     
    				System.out.println("Final Scores: " + p1.getName() + " " + p1.getScore() + " - " + p2.getName() + " " + p2.getScore());
        if (p1.getScore() > p2.getScore()) {
            System.out.println(p1.name + " wins the game!");
    } else if (p1.getScore() < p2.getScore()) {
            System.out.println(p2.getName() + " wins the game!");
    			} else {
            	System.out.println("It's a tie! No points awarded.");
        }
    }
}
