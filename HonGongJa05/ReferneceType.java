package Sec01.ReferenceType;

public class ReferneceType {
	public static void main(String[] args) {
		String str1 = "I'm dumb";
		String str2 = "I'm dumb"; // new 연산자 없이 할당한 문자열은 동일한 내용있음 새로 안만들고 기존 객체 참조
		String str3 = new String("I'm dumb"); // 새로운 객체 생성
		String str4 = new String("I'm dumb"); // 새로운 객체 생성
	
		// 비교연산자 ' == '를 통한 비교: 객체의 동일성 판단 
		System.out.println("str1==str2 :"+ (str1==str2));
		System.out.println("str3==str4 :"+ (str3==str4));
		System.out.println("str2==str3 :"+ (str2==str3));
	
		// equals 메소드 : 내용의 동일성 판단
		System.out.println("str1.equals(str2) :"+ str1.equals(str2));
		System.out.println("str3.equals(str4) :"+ str3.equals(str4));
		System.out.println("str2.equals(str3) :"+ str2.equals(str3));
	}
}
