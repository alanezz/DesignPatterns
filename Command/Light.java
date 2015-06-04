package Command;

public class Light {

	boolean isOn = false;
	public void on() {
		
		isOn = true;

	}
	public void off() {

		isOn = false;

	}
	public boolean getStatus() {
		
		return this.isOn;
		
	}

}
