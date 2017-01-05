package SimonZheng;

public class Move implements MoveInterface {
	
	private ButtonInterface button;
	
	public Move(ButtonInterface button) {
		this.button = button;
	}

	@Override
	public ButtonInterface getButton() {
		return button;
	}

}
