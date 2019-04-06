package co.kr;

public class Person {

	private Remocon remocon;

	public void useRemocon(Remocon remocon) {
		this.remocon = remocon;
	}

	public void useRemocon() {
		remocon.turnOn();
		remocon.volumeUp();
		remocon.volumeDown();
		remocon.Down();
		remocon.Up();
		remocon.left();
		remocon.right();
		remocon.turnOff();
	}

}
