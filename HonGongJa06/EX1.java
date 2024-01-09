package sec06.AccessModifierPractice;

public class EX1 {
	int a ;
	char c;
	String s;
	public static String name = "EX!";
	
	static EX1 obj = new EX1(); // 꼭 Singleton 을 만드는게 목적이 아니더라도 static 안씀 오류냠
	
	private EX1(){
		System.out.println("private EX1()");
	}
	
	
	public EX1(int a){
		this.a= a;
		System.out.println("public EX1(int a)");
	}
	
	
	protected EX1(char c){
		this.c= c;
		System.out.println("protected EX1(char c)");
	}
	
	EX1(String s){ // default
		this.s= s;
		System.out.println("EX1(String s)");
	}	
	

}
