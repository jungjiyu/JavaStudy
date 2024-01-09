package sec06.AccessModifierPractice;

public class Practice {
	public static void main(String[] args) {
		EX1 obj1 = new EX1(1);
		obj1 = new EX1('ㅊ');
		obj1 = new EX1("ㄹㄹㄹ");
		
		System.out.println(EX1.name);

		
	}

}
