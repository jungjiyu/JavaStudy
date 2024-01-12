package chap02;

class Animal{
	public void cry() {
		System.out.println("소리냐기");
	}
}

class Cat extends Animal{
	@Override
	public void cry() {
		System.out.println("냐용");
	}
}

class Dog extends Animal{
	@Override
	public void cry() {
		System.out.println("멍멍ㅇ");
	}
}

//class MyPet extends Cat, Dog{}; 은 불가하다 : 자바에서 다중상속은 불가
interface Animal2{ public abstract void cry();}
interface Cat2 extends Animal2{ public abstract void cry();}
interface Dog2 extends Animal2{ public abstract void cry();}

class MyPet implements Cat2, Dog2{
	@Override
	public void cry(){
		System.out.println("멍멍, 냐용"); // 동시에 상속 가능
	}
	
}
public class Ex02 {
	public static void main(String[] args) {
		MyPet pet = new MyPet();
		pet.cry();
	}

}
