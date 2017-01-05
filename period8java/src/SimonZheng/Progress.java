package SimonZheng;

import guiPackage.components.TextLabel;

public class Progress extends TextLabel implements ProgressInterface {
	
	private int round;
	private int sequenceLength;
	
	public Progress(int x, int y, int width, int height, String text, int round, int sequenceLength) {
		super(x, y, width, height, text);
		this.round = round;
		this.sequenceLength = sequenceLength;
		
		setText("Round : " + round + ", " + "Sequence Length : " + sequenceLength);
	}

	@Override
	public void setRound(int round) {
		this.round = round;
	}

	@Override
	public void setSequenceLength(int sequenceLength) {
		this.sequenceLength = sequenceLength;
	}


}
