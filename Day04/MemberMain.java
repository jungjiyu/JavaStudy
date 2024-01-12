package chap04;

import java.util.ArrayList;
import java.util.Scanner;


public class MemberMain {
	public static Scanner scanner = new Scanner(System.in);
	public static MemberFunctionImplementation Func = new MemberFunctionImplementation();
	public static void main(String[] args) {
		
		boolean flag = true;
		while(flag) {
			Func.showMenu();
			System.out.print("메뉴선택: ");
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				Func.showMembers();
				break;
				
			case 2:
				Func.findMember();
				break;
				
			case 3:
				Func.addMember();
				break;
			case 4:
				
				break;	
				
			case 5:
				Func.removeMember();
				break;
				
			case 6:
				flag = false;
				break;
				
			default :
				System.out.println("메뉴를 제대로 입력하세요");
			}
			
		}
		
		System.out.println("프로그램이 종료되었스빈다");	
		scanner.close();
		
	
	}
	
	


}
