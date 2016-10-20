package introduction;

import java.util.Scanner;

public class Quiz1 {
	//1 points for: visibility, data type declaration, correct method, comparing strings, asking username once, use waitForEntry correctly
	//.5 points for: Max 3 tries, printing invalid password, triesremaining changes, print correct triesleft
	static Scanner input = new Scanner(System.in);
	
	private static String username = "test_user";
	private static String password = "test";
	private static String userInput;
	
	public static String waitForEntry()
	{
		return input.nextLine();
	}
	
	public static void main(String[] args)
	{
		System.out.println("Username pls");
		userInput = waitForEntry();
		
		if(userInput.equals(username))
			askPassword();
		else
			System.out.println("Unokwn username. Contact administrator.");
	}

	private static void askPassword() {
		boolean inLoop = true;
		int triesRemaining = 3;
		
		while(inLoop)
		{
			System.out.println("password pls");
			userInput = waitForEntry();
			
			if(userInput.equals(password))
			{
				System.out.println("GOOD JOB");
				inLoop = false;
			}
			else
			{
				triesRemaining --;
				if(triesRemaining == 0)
				{
					System.out.println("INVALID");
					inLoop = false;
				}
				else
					System.out.println("You have " + triesRemaining + " attempt(s) left.");
			}
		}
	}
}
