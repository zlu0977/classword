package guiPackage.sampleGames;

public class ThreadExample implements Runnable{
	
	private int number; 
	private int sleepTime;
	
	public static void main(String[] args)
	{
		Thread one = new Thread(new ThreadExample(1));
		Thread two = new Thread(new ThreadExample(2));
		Thread three = new Thread(new ThreadExample(3));
		
		one.start();
		two.start();
		three.start();
	}
	
	public ThreadExample(int x) {
		number = x;
		sleepTime = (int) (Math.random() * 1000);
	}

	@Override
	public void run() {
		System.out.println("Thread Num " + number + " preparing to sleep for " + sleepTime + " milliseconds");
		try {
			Thread.sleep(sleepTime);
			System.out.println("Thread #" + number + " woke up");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
