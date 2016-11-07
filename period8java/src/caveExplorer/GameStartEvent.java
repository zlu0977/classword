package caveExplorer;

public class GameStartEvent implements Playable {

	private static final String[] SEQUENCE_1 = {"HELLOOOOOOOOOOOOOOO", "HOWS IT GOING", "COME SOLVE ME PUZZLES"};
	private static final String[] SEQUENCE_2 = {"U ARE GOING TO HAVE SOOOOOOOOOO MUCH FUN", "TAKE THIS MAP YO"};
	
	public GameStartEvent() {
		// TODO Auto-generated constructor stub
	}

	public void play() {
		readSequence(SEQUENCE_1);
		while(CaveExplorer.in.nextLine().toLowerCase().indexOf("yes") < 0)
			System.out.println("JUST SAY YES");
		
		readSequence(SEQUENCE_2);
		CaveExplorer.inventory.setHasMap(true);
		System.out.println("HERES A MAP");
	}
	
	public static void readSequence(String[] seq)
	{
		for(String line: seq)
		{
			System.out.println(line);
			System.out.println("--- press enter ---");
			CaveExplorer.in.nextLine();
		}
	}

}
