
package chap04;

import java.util.ArrayList;

public interface MemberService {
	public static ArrayList<Member> memberList = new ArrayList<>();
	
	// 추상메서드
	public  Member findMember();
	public void addMember();
	public void removeMember();
	public void showMenu();
	public void showMembers();
	

}
