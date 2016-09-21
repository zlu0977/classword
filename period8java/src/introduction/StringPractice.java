package introduction;

public class StringPractice {

	public static void main(String[] args) {
		String text1 = new String("Hello World");
		String text2 = "Hello World";
		
		if(text1.equals(text2))
			syso("These Stringsss areerrr euqla");
		
		syso(text1);
		syso(text2);
		
		String word1 = "AAAAAA";
		String word2 = "ZZZZZZZ";
		//-1 = before, 0 = equals, 1 = after
		if(word1.compareTo(word2) < 0)
			syso("word1 comese beofre word 2");
		
		
		
		
		
		
	}
	
	public static void syso(String string)
	{
		System.out.println(string);
	}

}
