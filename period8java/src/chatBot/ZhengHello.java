package chatBot;

public class ZhengHello implements Chatbot {
	
	private String helloResponse;
	private boolean inHelloLoop;
	
	private String[] calmResponses = {"You already said hello dude. Lets talk about something.", "Did you forget that you said hello?"};
	private String[] angryResponses = {"IUETHIEWH HEFEH HFPWU", "Yo stop repeating yourself. What is wrong with you?!?!?", "Stop it dude!"};
	
	private int helloCount;
	
	public ZhengHello()
	{
		helloCount = 0;
	}
	
	public void talk() {
		inHelloLoop = true;
		while(inHelloLoop)
		{
			helloCount ++;
			printResponse();
			helloResponse = ZhengMain.promptInput();
			
			if(!isTriggered(helloResponse))
			{
				inHelloLoop = false;
				ZhengMain.promptForever();
			}
		}
	}
	
	private void printResponse()
	{
		if(helloCount > 4)
		{
			int responseSelection = (int)(Math.random() * angryResponses.length);
			ZhengMain.syso(angryResponses[responseSelection]);
		}
		else
		{
			int responseSelection = (int)(Math.random() * calmResponses.length);
			ZhengMain.syso(calmResponses[responseSelection]);
		}
	}
	
	public boolean isTriggered(String userInput) {		
		String[] triggers = {"hello", "hi", "hey"};
		
		for(int i = 0; i < triggers.length; i ++)
			if(ZhengMain.findKeyword(userInput, triggers[i], 0) >= 0)
				return true;
		
		return false;
	}

}
