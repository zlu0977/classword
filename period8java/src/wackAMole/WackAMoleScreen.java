package wackAMole;

import java.util.ArrayList;

import guiPackage.ClickableScreen;
import guiPackage.components.Action;
import guiPackage.components.TextLabel;
import guiPackage.components.Visible;

public class WackAMoleScreen extends ClickableScreen implements Runnable{
	
	private ArrayList<MoleInterface> moles;
	 private PlayerInterface player;
	 private TextLabel label;
	 private TextLabel timeLabel;
	 private double timeLeft;
	
	public WackAMoleScreen(int width, int height) {
		super(width, height);
		timeLeft = 40.0;
		Thread play = new Thread(this);
		play.start();
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		moles = new ArrayList<MoleInterface>();
		player = getAPlayer();
		label = new TextLabel(getWidth()/2 - 100, getHeight()/2 - 75, 100, 75, "Ready...");
		timeLabel = new TextLabel(30, 30, 100, 75, "");

		viewObjects.add(player);
		viewObjects.add(label);
		viewObjects.add(timeLabel);
	}
	
	private PlayerInterface getAPlayer() {
		return new Player(20,20);
	}

	private MoleInterface getAMole() {
		Mole mole = new Mole((int)(Math.random() * getWidth() - Mole.moleWidth), (int)(Math.random() * getHeight() - Mole.moleHeight));
		mole.setTime(500 + (int)(Math.random() * 2000));
		mole.setAction(new Action(){
			public void act()
			{
				player.increaseScore(1);
				remove(mole);
				moles.remove(mole);
			}
		});
		addObject(mole);
		return mole;
	}
	
	private void changeText(String s)
	{
		try {
			Thread.sleep(1000);
			label.setText(s);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Override
	public void run() {
		changeText("Set...");
		changeText("GO!");
		changeText("");
		while(timeLeft > 0)
		{			
			try {
				Thread.sleep(100);
				timeLeft -= 0.1;
				timeLabel.setText("" + (int)(timeLeft*10)/(double)10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			removeMole();
			addMole();
			
			try {
				Thread.sleep(100);
				moles.add(getAMole());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void addMole() {
		double probability = .1 + .1 * (40.0 - timeLeft) / 30;
		if(Math.random() < probability)
		{
			moles.add(getAMole());
		}
	}

	private void removeMole() {
		for(int i = 0; i < moles.size(); i++)
		{
			MoleInterface mole = moles.get(i);
			mole.setTime(mole.getTime() - 100);
			
			if(mole.getTime() <= 0)
			{
				remove(mole);
				moles.remove(i);
				i--;
			}
		}
	}
}
