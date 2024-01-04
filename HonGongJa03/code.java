// 헷갈리는 연산자 개념

package chap03_pkg;

public class Summary {
	public static void main(String[] args) {
		byte bte = 19;
		bte = (byte)(-bte);

		System.out.println(bte);
	//	int a = 2147483648; int 범위 넘어가서 2147483648L로 표기해야 리터럴 사용 가능
		
		//리터럴 연산시에도 자동형변환 일어나고 실수형의 경우 소수점표기 떄문에 예외 생길수 있다
		if (3 == 3.0) System.out.println("3 == 3.0");
		if (3 == 3L) System.out.println("3 == 3L");
		if (3.0 == 3.0f) System.out.println("3.0 == 3.0f");
		if (1.0 == 1.0f) System.out.println("1.0 == 1.0f");
		if (0.1 == 0.1f) System.out.println("겠냐?");
		else System.out.println("0.1 != 0.1f");
		
		
		//논리연산자와 비트 연산자 비교: 논리 결과(true, false)는 같지만 실행 정도가 다르다
		int x=1,y=2;
		if(x==2 && ++y == 3) { //왼쪽 조건이 거짓인 상황서 && 사용 >> faㅣse 확정이니 오른쪽은 연산도 안하고 넘어감
			System.out.println("어쩌구저쩌구");
		}
		System.out.println("reuslt1: x="+x+" y="+y);  
		
		
		x=1;
		y=2;
		if(++y == 3 && x==2) {  //왼쪽 조건이 참인 상황서 && 사용 >> faㅣse 미확정이므로 오른쪽까지 연산함 
			System.out.println("어쩌구저쩌구");
		}
		System.out.println("reuslt2: x="+x+" y="+y);

		
		x=1;
		y=2;
		if(x==2 & ++y == 3) {  //왼쪽 조건이 거짓인 상황서 & 사용 >> faㅣse 확정이지만 오른쪽까지 연산함 
			System.out.println("어쩌구저쩌구3");
		}
		System.out.println("reuslt3: x="+x+" y="+y);

		x=1;
		y=2;
		if(x==2 || ++y == 3) { //왼쪽 조건이 거짓인 상황서 || 사용 >> true 미확정이니 오른쪽까지 연산
			System.out.println("어쩌구저쩌구4");
		}
		System.out.println("reuslt4: x="+x+" y="+y);  
		
		
		x=1;
		y=2;
		if(++y == 3 || x==2) {  //왼쪽 조건이 참인 상황서 || 사용 >> true 확정이니 오른쪽은 연산 안하고 바로 넘어감
			System.out.println("어쩌구저쩌구5");
		}
		System.out.println("reuslt5: x="+x+" y="+y);

		
		x=1;
		y=2;
		if(x==2 | ++y == 3) {  //왼쪽 조건이 거짓인 상황서 | 사용 >> true 미확정이니 오른쪽까지 연산
			System.out.println("어쩌구저쩌구6");
		}
		System.out.println("reuslt6: x="+x+" y="+y);

		
		System.out.println(1&2);
	//	System.out.println(1&&2); 논리연산자의 경우 불값만 피연산자로 가능
	
		System.out.println("4<<2: " + (4<<2));
		System.out.println("4>>2: " + (4>>2));

		int a=11,b=22;
		String r;
		r=(a>b) ? (a>10) ? "a가 b보다 더 크고 10 넘음" : "a가 b보다 더 크지만 10보다 작음":  (b>10) ? "b가 a보다 더 크고 10 넘음" : "b가 a보다 더 크지만 10보다 작음";
		System.out.println(r);
		
		int o=22, u=33,q;
		q=(o>u)?o:u;
		System.out.println(o+"와 "+u+" 중에서 큰 수는 "+q);
	}

}
