package co.kr;

public class AirconRemocon implements Remocon {
	private int temperature = 0;

	@Override
	public void turnOn() {
		System.out.println("에어컨을 킵니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("에어컨을 끕니다.");

	}

	@Override
	public void volumeUp() {
		System.out.println("지원하지 않는 기능입니다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("지원하지 않는 기능입니다.");
	}

	@Override
	public void Up() {
		System.out.println("온도 : " + (++temperature));
	}

	@Override
	public void Down() {
		if (temperature != 16) {
			System.out.println("온도 : " + (--temperature));
		} else {
			System.out.println("온도 : " + 16);
		}
	}

	@Override
	public void left() {
		System.out.println("풍향이 왼쪽으로 바뀌었습니다.");

	}

	@Override
	public void right() {
		System.out.println("풍향이 오른쪽으로 바뀌었습니다.");
	}

}
