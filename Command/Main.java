package Command;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoteControl rc = new RemoteControl();
		Light l = new Light();
		System.out.println(l.getStatus());
		LightOnCommand lightOn = new LightOnCommand(l);
		rc.setCommand(lightOn);
		rc.pressButton();
		System.out.println(l.getStatus());
		
	}

}
