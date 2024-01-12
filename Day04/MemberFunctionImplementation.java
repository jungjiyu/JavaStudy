package chap04;

import java.util.Scanner;
import java.util.ArrayList;

public class MemberFunctionImplementation implements MemberService{ // 실체화
	public static Scanner scanner = new Scanner(System.in); 
	public static ArrayList<Member> memberList = new ArrayList<>(); 

	
	@Override
	public Member findMember() {
		System.out.print("나이를 입력하시요:");
		int AGE= scanner.nextInt();
		scanner.nextLine(); // 개행문자 꿀꺽
		System.out.print("이름을 입력하세요");
		String NAME = scanner.nextLine(); 
		System.out.print("번호을 입력하세요");
		String PHONE = scanner.nextLine(); 
		
		for(int i =0;i<memberList.size();i++) {
			Member tmp = memberList.get(i);
			if(tmp.age == AGE) {
				if((tmp.name).equals(NAME)) {
					if((tmp.phoneNumber).equals(PHONE)) {
						System.out.println("존재하는 멤버입니다");
						return tmp;
					}
				}
			}
		}
		System.out.println("존재하지 않는 멤버입니다");
		return null;
	}
	
	
	@Override
	public void addMember(){
		System.out.print("나이를 입력하시요:");
		int age= scanner.nextInt();
		scanner.nextLine(); // 개행문자 꿀꺽
		System.out.print("이름을 입력하세요");
		String name = scanner.nextLine(); 
		System.out.print("번호을 입력하세요");
		String phoneNumber = scanner.nextLine(); 
		Member member = new Member(age , name,phoneNumber);
		memberList.add(member);	
	}
	
	
	@Override
	public void removeMember(){
		Member tmpMember = findMember();
		if(tmpMember == null) {
			System.out.println("삭제 실패");
			return ;
		}
		memberList.remove(tmpMember);
		System.out.println("삭제 완료");

	}
	
	
	@Override
	public void showMenu() {
		System.out.println("------------회원관리프로그램-----------");
		System.out.println("1. 회원목록");
		System.out.println("2. 회원조회");
		System.out.println("3. 회원등록");
		System.out.println("4. 회원수정");
		System.out.println("5. 회원삭제");
		System.out.println("6. 프로그램 종료");
		System.out.println("----------------------------------");
	}
	
	@Override
	public void showMembers() {
		for (int i = 0 ; i < memberList.size();i++) {
			System.out.print(memberList.get(i).name +" ");
		}
		System.out.println();
	}
}
