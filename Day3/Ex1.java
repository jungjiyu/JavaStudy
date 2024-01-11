package chap01;

import java.util.Scanner;

public class Ex1 {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {	
		
		int total_money=0;
		boolean flag = true;
		
		while(flag) {
			menu();
			System.out.print("선택:");
		//	int choice = Integer.parseInt(scanner.nextLine()); 도 가능하긴 한데 길게 쓰기 귀찮아서 nextInt()쓰자
			int choice = scanner.nextInt(); // 엔터가 남아있다는걸 잊지 말아야한다(혹시라도 문자열 입력받을 일 있음 조심해라)
			
			
			switch(choice) {
			case 1:
				total_money += choice1();
				break;
				
			case 2:
				total_money -=choice2();
				break;
				
			case 3:
				System.out.println("잔금: "+total_money);
				break;
			
			case 4:
				flag = false;
				break;
			
			default:
				System.out.println("다시 입력\n");
				
			}
			
			
			
		}
		System.out.println("프로그램 종료");
		scanner.close();
		
	}
	
	public static void menu() {
		System.out.println("---------------------------------------------");
		System.out.println("1.예금* 2.출금* 3.잔고* 4.종료");
		System.out.println("----------------------------------------------");
	}
	
	public static int choice1() {
		System.out.print("예금하실 금액을 입력하세요:  ");
		//int mon = Integer.parseInt(scanner.nextLine());
		int mon = scanner.nextInt();
		System.out.println("예금액: "+mon);
		return mon;
		
	}
	
	public static int choice2() {
		System.out.print("출금하실 금액을 입력하세요:  ");
		int mon = scanner.nextInt();
		System.out.println("출금액:"+mon);
		return mon;
		
	}
	
	
	
}
