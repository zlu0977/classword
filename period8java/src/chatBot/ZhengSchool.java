package chatBot;

public class ZhengSchool implements Chatbot {
	
	private boolean inSchoolLoop;
	static String schoolResponse;
	
	public void talk() {
		inSchoolLoop = true;
		while(inSchoolLoop)
		{
			schoolResponse = ZhengMain.promptInput();
			ZhengMain.syso("lolz");
			
			if(schoolResponse.indexOf("quit") >= 0)
				inSchoolLoop = false;
				ZhengMain.promptForever();
		}
	}

	public boolean isTriggered(String userInput) {
		String[] triggers = {"school", "teacher", "class"};
		
		for(int i = 0; i < triggers.length; i ++)
			if(ZhengMain.findKeyword(userInput, triggers[i], 0) >= 0)
				return true;
		
		return false;
	}

}
