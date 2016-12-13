package arrays;

public class ArrayPractice {

	
	static boolean[] boos3;
	static String[] someStrings;
	
	public static void main(String[] args) {                                                       
		int[] fiftyNumbers = new int[100];
		int numberOfDice = 4;
		
		populate(fiftyNumbers);
		//print(fiftyNumbers);
		randomize(fiftyNumbers, 20);
		print(fiftyNumbers);
	//	rollDice(fiftyNumbers, numberOfDice);
		//print(fiftyNumbers);
		//countResult(fiftyNumbers, numberOfDice);
	}
	
	private static void countResult(int[] fiftyNumbers, int numberOfDice) {
		int min = 1 * numberOfDice;
		int max = 6 * numberOfDice;
		
		int[] percentages = new int[max - min + 1];
		
		for(int i : fiftyNumbers)
			percentages[i - min] ++;
		
		for(int i = 0; i < percentages.length; i++)
		{
			double percentage = ((int)(percentages[i] / (double)fiftyNumbers.length * 10000))/100.0;
			System.out.println((i + min) + " appreared " + percentage + "%");
		}
		
	}

	private static void rollDice(int[] fiftyNumbers, int numberOfDice) {
		for(int i = 0; i < fiftyNumbers.length; i++)
		{
			int sum = 0;
			for(int a = 0; a < numberOfDice; a++)
				sum += ((int)(Math.random() * 6) + 1);

			fiftyNumbers[i] = sum;
		}
	}

	private static void randomize(int[] fiftyNumbers, int max) {
		for(int i = 0; i < fiftyNumbers.length; i++)
		{
			int randNum = ((int)(Math.random() * max) + 1);
			fiftyNumbers[i] = randNum;
		}
	}
	
	public static void randomize(double[] fiftyNumbers, int max) {
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
	
	public static void print(int[] s) {
		for(int i = 0; i < s.length; i ++)
			System.out.println(s[i]);
	}
	
	public static void print(double[] s) {
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
