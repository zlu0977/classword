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
		String printString = string;
		int cutoff = 45;
		if(printString.length() > cutoff)
		{
			for(int idx = 0; idx * cutoff < string.length(); idx ++)
			{
				printString += getCut(string, cutoff, idx + 1) + "\n";
			}
		}
		
		System.out.println(printString);
	}
	
	private static String getCut(String string, int cutoff, int cut)
	{
		int cutIndex = cut * cutoff;
		if(cutIndex > string.length())
			cutIndex = string.length();
		
		String currentCut = string.substring((cutIndex - cutoff), cutIndex);
		
		int indexOfLastSpace = currentCut.length() - 1;
		
		for(int idx = currentCut.length() - 1; idx >= 0; idx --)
		{
			String letter = currentCut.substring(idx, idx + 1);
			if(letter.equals(" "))
			{
				indexOfLastSpace = idx;
				break;
			}
		}
		int lastttt = 0;
		if((indexOfLastSpace - cutoff) > 0)
			lastttt = (indexOfLastSpace - cutoff);
		
		return string.substring(lastttt, indexOfLastSpace);
	}

}
