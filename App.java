package warWeek06Final;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck = new Deck();
        Player p1 = new Player("Player 1"), p2 = new Player("Player 2");

        	for (int i = 0; i < 26; i++) { p1.draw(deck); p2.draw(deck); }

     
        
        			for (int i = 0; i < 26; i++) {
        					Card c1 = p1.flip(), c2 = p2.flip();
        					System.out.println(p1.name + " plays " + c1.name + " | " + p2.name + " plays " + c2.name);
            	if (c1.value > c2.value) p1.win();
            else if (c1.value < c2.value) p2.win();
        }

        			System.out.println("Final Scores: " + p1.name + " " + p1.score + " - " + p2.name + " " + p2.score);
        System.out.println((p1.score > p2.score) ? p1.name + " wins!" : (p1.score < p2.score) ? p2.name + " wins!" : "It's a tie!");
    
	}

}
