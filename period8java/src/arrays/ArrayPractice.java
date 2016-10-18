package arrays;

public class ArrayPractice {

	
	static boolean[] boos3;
	static String[] someStrings;
	
	public static void main(String[] args) {                                                       
		int[] fiftyNumbers = new int[50];
		populate(fiftyNumbers);
		//print(fiftyNumbers);
		randomize(fiftyNumbers, 50);
		//print(fiftyNumbers);
		rollDice(fiftyNumbers);
		//print(fiftyNumbers);
		countResult(fiftyNumbers);
	}
	
	private static void countResult(int[] fiftyNumbers) {
		int[] percentages = new int[11];
		
		for(int i = 0; i < fiftyNumbers.length; i++)
		{
			if(fiftyNumbers[i] == 2)
				percentages[0] ++;
			if(fiftyNumbers[i] == 3)
				percentages[1] ++;
			if(fiftyNumbers[i] == 4)
				percentages[2] ++;
			if(fiftyNumbers[i] == 5)
				percentages[3] ++;
			if(fiftyNumbers[i] == 6)
				percentages[4] ++;
			if(fiftyNumbers[i] == 7)
				percentages[5] ++;
			if(fiftyNumbers[i] == 8)
				percentages[6] ++;
			if(fiftyNumbers[i] == 9)
				percentages[7] ++;
			if(fiftyNumbers[i] == 10)
				percentages[8] ++;
			if(fiftyNumbers[i] == 11)
				percentages[9] ++;
			if(fiftyNumbers[i] == 12)
				percentages[10] ++;
		}
		
		for(int i = 0; i < percentages.length; i++)
		{
			double percentage = ((int)(percentages[i] / (double)fiftyNumbers.length * 10000))/100.0;
			System.out.println((i + 2) + " appreared " + percentage + "%");
		}
		
	}

	private static void rollDice(int[] fiftyNumbers) {
		
		for(int i = 0; i < fiftyNumbers.length; i++)
		{
			int roll1 = ((int)(Math.random() * 6) + 1);
			int roll2 = ((int)(Math.random() * 6) + 1);
			
			fiftyNumbers[i] = roll1 + roll2;
		}
	}

	private static void randomize(int[] fiftyNumbers, int max) {
		for(int i = 0; i < fiftyNumbers.length; i++)
		{
			int randNum = ((int)(Math.random() * max) + 1);
			fiftyNumbers[i] = randNum;
		}
	}

	private static void populate(int[] fiftyNumbers) {
		for(int i = 0; i < fiftyNumbers.length; i++)
			fiftyNumbers[i] = i + 1;
		
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
