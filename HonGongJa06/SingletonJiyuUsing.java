package sec05.StaticPractice2;

public class SingletonJiyuUsing {
	public static void main(String[] args) {
		//SingletonJiyu instance = new SingletonJiyu(); 으로 생성 못함 - private 걸려 있어서
		
		
		// new 연산자를 통해 생성한게 아니라서 아무리 많이 getInstance 써도 같은 객체를 참조함
		SingletonJiyu instance1 = SingletonJiyu.getInstance();
		SingletonJiyu instance2 = SingletonJiyu.getInstance();
		
		System.out.println("instance 1의 나이: "+instance1.age);
		System.out.println("instace 2의 나이: "+instance2.age);
		
		instance1.age = 12;
		
		System.out.println("instance 1의 나이 수정후 instance1의 나이: "+instance1.age);
		System.out.println("instance 1의 나이 수정후 instace 2의 나이: "+instance2.age); // instance2 를 수정한게 아닌데도 같이 바뀐다 - 같은 객체를 참조하고 있으니까
		
		
		SingletonJiyu instance3 = instance2;
		System.out.println("instance 2를 복사시켜 만든 instace 3의 나이: "+instance3.age); // getInstance 가 아니더라도 외부서 복사를 통해 참조할 수 있다
		
		
	}

}
