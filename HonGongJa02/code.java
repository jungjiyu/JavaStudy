package chap02_scanner_pkg;

import java.util.Scanner; // Scanner 클래스를 사용하기 위해 java.util 패키지의 Scanner 를 import 해줘야됨


public class code {
	public static void main(String[] args)throws Exception { // read() 쓰렴 예외처리구문 필요. Scanner 만 쓸꺼면 필요 없다
				
				System.out.print("yiyiyiyi");
				System.out.print("\r"); // 자바에선 개행문자(라인피드) 뿐 아니라 캐리지 리턴까지 줄바꿈에 관여함
				System.out.print("hihihihi");
				System.out.print("\n"); // 줄바꿈
				System.out.print("fdfs");
				System.out.print("\r\n"); // 줄바꿈
				System.out.println("33333333333333");
				
				int key; // read()로 입력받을 키코드 저장할 변수
				while(true) {
					key=System.in.read();
					System.out.print(key);
					if(key == 13 || key == 10) System.out.println("(Blank)"); // 13 == 캐리지리턴 , 10 == 라인피드==개행문자
					else System.out.println("("+(char)key+")");
					
					if(key == 113) break; // q 입력하면 종료
				}
				System.in.read(); // q 입력하고 남아있는 cr 제거
				System.in.read(); // q 입력하고 남아있는 lf 제거
				
				Scanner scanner = new Scanner(System.in); //scanner 변수 선언과 새로운 scanner 생성
				
				String str = scanner.nextLine();
				System.out.println("1:"+str);
				
				str = scanner.nextLine();
				System.out.println("2:"+str);
				
				str = scanner.nextLine();
				System.out.println("3:"+str);
				
				str = scanner.nextLine();
				System.out.println("4:"+str);
				

		
	}
}
