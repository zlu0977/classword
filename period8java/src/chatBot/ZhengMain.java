package chatBot;

import java.util.Scanner;

public class ZhengMain {
	static String response;
	static Scanner input = new Scanner(System.in);
	static String user;
	static boolean inMainLoop;
	
	static ZhengSchool school = new ZhengSchool();
	
	public static void main(String[] args) {

	}
	
	public static String promptInput()
	{
		String userInput = input.nextLine();
		return userInput;
	}
	
	public static void promptForever()
	{	
		inMainLoop = true;
		while(inMainLoop)
		{
			System.out.println("Hi, how are you?");
			response = promptInput();
			
			if(findKeyword(response, "good", 0) >= 0)
				System.out.println("Thats wonderful.");
			else if(response.indexOf("school") >= 0)
			{
				System.out.println("school. is cool like a pool filled with drool");
				inMainLoop = false;
				school.talk();
			}
			else
				System.out.println("idk");
		}
	}
	
	public static int findKeyword(String searchString, String keyword, int startPosition) {
		
		searchString = searchString.trim().toLowerCase();
		keyword = keyword.toLowerCase();
		int psn = searchString.indexOf(keyword);
		while(psn >= 0)
		{
			String before = " ";
			String after = " ";
			
			if(psn > 0)
				before = searchString.substring(psn - 1, psn);
			
			if(psn + keyword.length() < searchString.length())
				after = searchString.substring(psn + keyword.length(), psn + keyword.length() + 1);
			
			if(before.compareTo("a") < 0 && after.compareTo("a") < 0)
				return psn;
			else
				psn = searchString.indexOf(keyword, psn + 1);
		}
		
		return -1;
	}

	public static void syso(String string)
	{
		System.out.println(string);
	}
}
