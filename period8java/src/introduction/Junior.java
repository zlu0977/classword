package introduction;

public class Junior extends Student {

	private String major;
	public Junior(String name, String major) {
		super(name);
		this.major = major;
	}
	
	public void talk()
	{
		super.talk();
		System.out.println("and I am a junior");
		System.out.println("I am in the " + major + " major.");
	}
	
	public void juniorTalk()
	{
		System.out.println("Hi");
	}
}
