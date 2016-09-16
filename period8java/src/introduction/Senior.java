package introduction;

public class Senior extends Student {
	
	private int credits;
	
	public Senior(String name, int credits)
	{
		super(name); //constructs a student first
		this.credits = credits;
	}
	
	public void talk()
	{
		super.talk();
		System.out.println("and I am a senior");
		
		if(credits < 20)
			System.out.println("I cannot graduate");
		else
			System.out.println("I can graduate");
	}
}
