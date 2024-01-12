package chap02;

interface TV{
	
	// 상수
	public int MIN_VOLUME = 0;
	public int MAX_VOLUME = 99;
	
	// 추상메서드 >> 
	public void turnOn();
	public void turnOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
}

class FhdTV implements TV{
	@Override
	public void turnOn() {
	System.out.println("Life is Good");	
	}
	
	@Override
	public void turnOff() {
	System.out.println("Life is Bad");			
	}
	
	@Override
	public void changeVolume(int volume) {
		System.out.println(volume+"으로 볼륨을 조절합니다");
	}
	@Override
	public void changeChannel(int channel) {
		System.out.println(channel+"으로 채널을 조절합니다");
		
	}
	
}

public class Ex01 {
	public static void main(String[] args) {
		TV tv = new FhdTV();  // 인터페이스명 객체참조변수명 = new 클래스명( ) ;
		tv.turnOn();
		tv.changeVolume(10);
		tv.turnOff();
	}
}
