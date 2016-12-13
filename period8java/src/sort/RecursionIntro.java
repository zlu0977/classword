package sort;

public class RecursionIntro {

	public static void main(String[] args) {
		/*System.out.println("USING FOR LOOP");
		for(int i=0;i<5;i++)
			System.out.println("ELLO WORLD " + i);
		
		System.out.println("NOT FOR LOOP");
		forLoop(5,new Action() {
			
			private int value = 0;
			
			public void act() {
				System.out.println("ELLO WORLD " + value);
				value++;
			}
		})
		
		int factorialNum = 4;
		
		int value = 1;
		for(int i = 1; i <= factorialNum; i++)
			value = value * i;
		
		System.out.println(value);
		
		System.out.println(factorial(factorialNum));*/
		
		//hanoiSolution(5, "A", "B", "C");
		
		int n = 6;
		System.out.println("the " + n + "th Fibonacco is " + fibonacci(n));
	}
	private static int fibonacci(int n) {
		if(n <= 1)
			return 1;
		
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	private static int count = 1;
	public static void print(String s)
	{

		System.out.println("Move #" + count + ":" + s);
	}
	
	private static int factorial(int i) {
		if(i > 1)
			return i * factorial(i - 1);
		
		return i;
	}

	public static void forLoop(int loop, Action action)
	{
		if(loop <= 0)
			return;
		else
		{
			action.act();
			forLoop(loop - 1, action);
		}
	}
	
	public static void hanoiSolution(int disks, String start, String mid, String end)
	{
		if(disks <= 1)
			print("Move " + start + " to " + end );
		else
		{
			System.out.println("In order to move " + disks + " over to peg " + end + " we must move " + (disks - 1) + " over to peg " + mid + " first.");
			hanoiSolution(disks - 1, start, end, mid);
			hanoiSolution(1, start, mid, end);
			hanoiSolution(disks - 1, mid, start, end);
		}
	}
	
	
}
