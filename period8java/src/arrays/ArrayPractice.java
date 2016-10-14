package arrays;

public class ArrayPractice {

	
	static boolean[] boos3;
	
	public static void main(String[] args) {                                                       
			
		boolean[] boos1 = new boolean[3];
		boolean[] boos2 = {true, false, true};
		boos3 = new boolean[2];
		
		/*for(int i = 0; i < boos2.length; i ++)
		{
			System.out.println(boos2[i]);
		}
		
		for(boolean boo : boos2)
		{
			System.out.println(boo);
		}*/
		
		String[] someStrings1 = new String[3];
		someStrings1[0] = "a";
		
		String[] someStrings2 = {"a", "b", "c"};
		
		for(int i = 0; i < someStrings1.length; i ++)
		{
			someStrings1[i] = "a new string";
		}
		
		for(String s : someStrings1)
		{
			System.out.println(s);
		}
	}
}
