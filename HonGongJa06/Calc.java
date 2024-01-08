package sec04.MethodOverloadingPractice;

public class Calc {
	
	double devide(int a , int b) {
		System.out.println("첫 오버로딩 메서드");
		return a/(double)b;
	}
	
	double devide(double a , double b) {
		System.out.println("두번째 오버로딩 메서드");
		return a/b;
	}
	
}
