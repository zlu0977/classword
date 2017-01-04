package SimonZheng;

import java.awt.Color;
import java.util.ArrayList;

import guiPackage.ClickableScreen;
import guiPackage.components.TextLabel;
import guiPackage.components.Visible;

public class SimonScreenZheng extends ClickableScreen implements Runnable {
	
	public ArrayList<ButtonInterface> buttonList;
	public ArrayList<MoveInterface> moveList;
	public ProgressInterface progress;
	public TextLabel turn;
	public int round;
	public int sequenceLength;
	
	public SimonScreenZheng(int width, int height) {
		super(width, height);
		round = 0;
		sequenceLength = 2;
		
		Thread play = new Thread(this);
		play.start();
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		buttonList = new ArrayList<ButtonInterface>();
		moveList = new ArrayList<MoveInterface>();
		getButtons();
		
		turn = new TextLabel(0, 0, getWidth(), 200, "");
		progress = getProgress();
		moveList.add(getAMove());
		moveList.add(getAMove());
		

	}

	private void getButtons() {
		ButtonInterface button1 = getAButton(Color.red);
		ButtonInterface button2 = getAButton(Color.blue);
		ButtonInterface button3 = getAButton(Color.yellow);
		ButtonInterface button4 = getAButton(Color.green);
		
		buttonList.add(button1);
		buttonList.add(button2);
		buttonList.add(button3);
		buttonList.add(button4);
		
		add(button1);
		add(button2);
		add(button3);
		add(button4);
	}
	
	private void changeText(String s)
	{
		try {
			Thread.sleep(1000);
			turn.setText(s);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		
		round ++;
		sequenceLength ++;
		changeText("Simon's Turn");
		changeText("");
		moveList.add(getAMove());
		showMoves();
		
		changeText("Your Turn");
		playerTurn();
		
	}
	
	
	private void playerTurn() {
		ArrayList<MoveInterface> playerMoves = new ArrayList<MoveInterface>();
		boolean gettingPlayerMoves = true;
		
		while(gettingPlayerMoves)
		{
			
		}
		
	}

	private void showMoves() {
		for(MoveInterface move: moveList)
		{
			try {
				move.getButton().blink();
				Thread.sleep(1000/round);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	private ButtonInterface getAButton(Color color) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private MoveInterface getAMove() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private ProgressInterface getProgress() {
		// TODO Auto-generated method stub
		return null;
	}
}
