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

}
