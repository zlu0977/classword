package arrays;

public class ArrayPractice {

	
	static boolean[] boos3;
	static String[] someStrings;
	
	public static void main(String[] args) {                                                       
		int[] fiftyNumbers = new int[50];
		populate(fiftyNumbers);
		print(fiftyNumbers);
		randomize(fiftyNumbers);
		print(fiftyNumbers);
		rollDice(fiftyNumbers);
		countResult(fiftyNumbers);
	}
	
	private static void countResult(int[] fiftyNumbers) {
		// TODO Auto-generated method stub
		
	}

	private static void rollDice(int[] fiftyNumbers) {
		// TODO Auto-generated method stub
		
	}

	private static void randomize(int[] fiftyNumbers) {
		// TODO Auto-generated method stub
		
	}

	private static void populate(int[] fiftyNumbers) {
		// TODO Auto-generated method stub
		
	}

	public static void lesson2()
	{
		long start = System.currentTimeMillis();
	
		someStrings = new String[1000];
		standardPopulate(someStrings);
		makeSpecial(999);
		print(someStrings);
		
		
		
		long end = System.currentTimeMillis();

		System.out.println("Took : " + (end - start) + " ms.");
	}
	
	private static void print(String[] s) {
		for(int i = 0; i < s.length; i ++)
			System.out.println(s[i]);
	}
	
	private static void print(int[] s) {
		for(int i = 0; i < s.length; i ++)
			System.out.println(s[i]);
	}

	private static void makeSpecial(int i) {
		someStrings[i] = "SPECIAL";
	}

	public static void initializeArray()
	{
		boolean[] boos1 = new boolean[3];
		boolean[] boos2 = {true, false, true};
		boos3 = new boolean[2];
		
		/*for(int i = 0; i < boos2.length; i ++)
		{
			System.out.println(boos2[i]);
		}
		
		for(boolean boo : boos2)
		{
			System.out.println(boo);
		}*/
		
		String[] someStrings1 = new String[3];
		someStrings1[0] = "a";
		
		String[] someStrings2 = {"a", "b", "c"};
		
		for(int i = 0; i < someStrings1.length; i ++)
		{
			someStrings1[i] = "a new string";
		}
		
		for(String s : someStrings1)
		{
			System.out.println(s);
		}
	}
	
	private static void standardPopulate(String[] s)
	{
		for(int i = 0; i < s.length; i ++)
		{
			s[i] = "String number " + (i + 1);
		}
	}
}
