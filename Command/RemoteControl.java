package Command;

public class RemoteControl {

	Command slot;
	
	public void setCommand(Command command) {
		
		slot = command;
		
	}
	
	public void pressButton() {
		
		slot.execute();
	
	}
	
}
