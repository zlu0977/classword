package introduction;

import java.util.Scanner;

public class StringPractice {
	
	static Scanner input;
	static String user;
	
	public static void main(String[] args) {
		createFields();
		promptName();
		promptForever();
	}
	
	public static void createFields()
	{
		input = new Scanner(System.in);
		user = "";
	}
	
	public static void promptName()
	{
		syso("Enter your name");
		user = input.nextLine();
		syso("glad to meet u " + user + "For the rest of time, I will call u bob. you may call me computer. we should become friends");
	}
	
	public static void promptInput()
	{
		syso("plz type somthin " + user);
		String userInput = input.nextLine();
		syso("u wrote " + userInput);
	}
	
	public static void promptForever()
	{	
		while(true)
			promptInput();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void demonstrateStringMethods()
	{
		String text1 = new String("Hello World");
		String text2 = "Hello World";
		
		if(text1.equals(text2))
			syso("These Stringsss areerrr euqla");
		
		syso(text1);
		syso(text2);
		
		String word1 = "AAAAAA";
		String word2 = "ZZZZZZZ";
		//-1 = before, 0 = equals, 1 = after
		if(word1.compareTo(word2) < 0)
			syso("word1 comese beofre word 2");
	}
	
	public static void syso(String string)
	{
		String printString = "";
		int cutoff = 35;
		
		while(string.length() > 0)
		{
			String nextWord = "";
			String cut = "";
			
			while(cut.length() + nextWord.length() < cutoff && string.length() > 0)
			{
				cut += nextWord;
				
				string = string.substring(nextWord.length());
				
				
				int endOfWord = string.indexOf(" ");
				if(endOfWord < 0)
					endOfWord = string.length() - 1;
				
				nextWord = string.substring(0, endOfWord + 1);
			}
			
			printString += cut + "\n";
		}
		
		System.out.println(printString);
	}

}
