package sec05.StaticPractice2;

public class SingletonJiyu {
	int age = 10;
	String movie = "Inception";
	String music = "As the World Caves In"; 
	
	// static 으로 인스턴스를 클래스 내부서 생성
	static SingletonJiyu instance = new SingletonJiyu();
	
	
	private SingletonJiyu() {  // private 으로 선언해 외부 클래스에서 사용 불가
		System.out.println("객체가 생성되었습니다");
	}
	
	static SingletonJiyu getInstance() { // 객체를 반환하기 위해 반환 타입을 클래스 명으로함 ( 객체 참조변수도 클래스 명으로 선언하니까)
		return instance;
	}


}
