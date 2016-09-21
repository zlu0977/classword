package introduction;

public class CardDraw {

	public static void main(String[] args) {
		for(int idx = 0; idx < 10; idx ++)	
			System.out.println(randomCard());
	}

	public static String randomCard()
	{
		String[] suits = {"Diamonds", "Hearts", "Spades", "Clubs"};
		String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
		return "The " + values[(int)(values.length * Math.random())] + " of " + suits[(int)(suits.length * Math.random())];
	}
}
