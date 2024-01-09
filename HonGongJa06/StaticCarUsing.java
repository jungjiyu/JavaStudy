package sec05.StaticPractice;

public class StaticCarUsing {
	
	int a = 19;

	
	public static void main(String[] args) {
		// 정적 필드 , 정적 메서드의 경우 객체 생성 없이 클래스명만으로도 사용 가능
		System.out.println("사장: "+StaticCar.CEO);
		StaticCar.shoutoutCEO();
		
		// System.out.println("거리: "+StaticCar.distance); 는 불가한게 인스턴스 필드라 객체 생성이후에 사용 가능
		StaticCar car1 = new StaticCar(5);
		System.out.println("거리: "+car1.distance);
		
		
		// main 메서드도 static 키워드로 선언한 상황이라 같은 클래스 내에 인스턴스 멤버라도 따로 객체를 생성후 명시해 써야된다.
		StaticCarUsing example = new StaticCarUsing();
		System.out.println("실행 파일내의 인스턴스 필드의 값: "+ example.a);
		
		
		// final 키워드만 쓰면 객체별로 고정값을 다르게 설정할 수 있다
		StaticCar car2 = new StaticCar(6);
		System.out.println("car1 의 타이어 개수: "+car1.tire);
		System.out.println("car2 의 타이어 개수: "+car2.tire);
		
		
		// 같은 클래스 내에서 static 으로 선언된건 그냥 쓸 수 있다
		sayYeah(); 
		// 물론 클래스를 명시하여 쓸 수 있긴 하다
		StaticCarUsing.sayYeah();
		
		
	}
	
	static void sayYeah() {
		System.out.println("YeaHyeAh!");
	}

}
