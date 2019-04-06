package co.kr;

public class TVRemocon implements Remocon {
	private boolean isOn = false;
	private int volume = 0;
	
	@Override
	public void turnOn() {
		isOn = true;
		System.out.println("TV를 킵니다.");

	}

	@Override
	public void turnOff() {
		isOn = false;
		System.out.println("TV를 끕니다.");

	}

	@Override
	public void volumeUp() {
		if(isOn) {
			System.out.println("볼륨 : " + (++volume));
		}

	}

	@Override
	public void volumeDown() {
		if(volume!=0) {
		System.out.println("볼륨 : " + (--volume));
		}else {
			System.out.println("볼륨 : " + volume);
		}
	}

	@Override
	public void Up() {
		System.out.println("지원하지 않는 기능입니다.");

	}

	@Override
	public void Down() {
		System.out.println("지원하지 않는 기능입니다.");

	}

	@Override
	public void left() {
		System.out.println("지원하지 않는 기능입니다.");

	}

	@Override
	public void right() {
		System.out.println("지원하지 않는 기능입니다.");

	}

}
