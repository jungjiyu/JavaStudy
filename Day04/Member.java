package chap04;

public class Member {
	
	int age;
	String name;
	String phoneNumber;
	
	
	Member(){
	}
	
	public Member(int age, String name,String phoneNumber){
		this.age = age;
		this.name = name;
		this.phoneNumber = phoneNumber;
		System.out.println(age+"세의 "+name+"씨가 멤버로 추가됬습니다");
		
	}
	
	
	
}
