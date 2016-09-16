package introduction;

public class Freshmen extends Student {

	private String middleSchool;
	
	public Freshmen(String name, String middleSchool) {
		super(name);
		this.middleSchool = middleSchool;
	}
	
	public void talk()
	{
		super.talk();
		System.out.println("and I am a freshmen");
		System.out.println("I came from " + middleSchool);
	}

}
