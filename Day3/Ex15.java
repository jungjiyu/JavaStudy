package chap02;

class Char1{
	int speed;
	public void setSpeed(int speed) { // setter
		this.speed = speed;
	}
}

class Char2 extends Char1{
	public int getSpeed() {//getter
		return speed;
	}
	
}

class Char7 extends Char2{
	// 오버라이딩
	public  int getSpeed() { // print 기능 추가하여 기존 메서드를 업그레이드
		System.out.println(speed+" :~)");
		return speed;
	}
	
	//메서드 오버로딩  << 오버라이딩한 메서드를 클래스 내에서 오버로딩 가능하다
	public  int getSpeed(String str) { // 클래스 내의 메서드와 매개변수 종류만 다른거 생성
		System.out.println(speed+" :~)"+str);
		return speed;
	}
}

class Char8 extends Char7{
	// 생성자 오버로딩
	Char8(){
		this("anonymous");
	}
	
	Char8(String name){
		System.out.println(name+"hehehehe");
	}
	
	
}

public class Ex15 {
	public static void main(String[] args) {
		Char1 char1 = new Char1();
		char1.setSpeed(10);
		
		Char2 char2 = new Char2();
		char2.setSpeed(13);
		int speed = char2.getSpeed();
		System.out.println(speed);
		
		Char7 char7 = new Char7();
		char7.getSpeed();
		char7.getSpeed("hheehee");
	}

}
