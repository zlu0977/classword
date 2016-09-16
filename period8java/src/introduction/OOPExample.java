package introduction;

public class OOPExample {
	public static void main(String[] args){
		Student jillian = new Senior("Jillian", 19);
		Student joe = new Freshmen("Joe", "day care");
		Student john = new Junior("John", "Software");
		
		jillian.talk();
		System.out.println("");
		joe.talk();
		System.out.println("");
		john.talk();
		((Junior) john).juniorTalk();
	}
}