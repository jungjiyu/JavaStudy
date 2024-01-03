// 2단원 - 타입 , 시스템 입출력

package sec01.exam01; // 패키지 선언도 문장이라서 세미콜론 필요

public class VariablePractice{ // 클래스 선언 == 소스파일 명
	public static void main(String[] args) {
	

		byte aa = (byte)128; // 오버플로우된 값 츨력. 왜 그런진 몰라도 형변환 안함 오류남
		System.out.println("aa:"+aa); 
		
		aa = 65; // long형 아님 딱히 정수 리터럴 뒤에 뭐 안붙여도 됨 (자동형변환 그런건 아님)
		System.out.println("aa:"+aa); 
		
		byte bb =23;
		int result = aa+bb; // int 형 이하의 정수형 변수끼리의 연산시 int 형으로 자동 형변환 됨 (증명: short result = aa + bb 하면 에러남 . 더 큰 자료형인 int 형으로 변했기 때문) 
		System.out.println(result);
		
	
		
		long l = 1231312L; // L써서 정수 리터럴이 long 타입이라고 명시해줘야됨
		System.out.println(l);
		
		char c ='가';
		int a = 65;
		System.out.println(a+c); // 연산 일어난 후의 결과가 출력됨
		System.out.println(a+":)"+c); // 자료형 곧이곧대로 출력
		
		
		a = c; // 자동형변환) 데이터 손실 없는쪽으론 가능
		System.out.println("a:"+a);
		
		c=(char)a; // 명시적 형변환) 데이터 손실 있으면 캐스팅 해줘야됨
		System.out.println("c:"+c);
		
		c = (char)aa;// 자동형변환예외) char의 경우 음수쪽 불가라 더 작은 변수 할당할때도 캐스팅 필요
		System.out.println("c:"+c);
		
		
		String intstr = String.valueOf(a); // 문자열로 형변환
		System.out.println("정수를 문자열로 형변환: "+intstr);
		
		int strint = Integer.parseInt(intstr); // 문자열을 정수로 형변환
		System.out.println("문자열을 정수로 형변환: "+strint);
		
		char cc = '\uac00'; // 이스케이프 문자를 활용해 16진수의 형태로도 저장 가능
		System.out.println(cc);
		
		cc=0xac00; // 물론 그냥 16진수로도 저장 가능
		System.out.println(cc); 
		
		String str = "hey ya all"; // 문자열 타입은 일반적 타입이 아니라 클래스 타입이고 대문자 써야됨
		System.out.println(str);
		
		float flt = 29.123456789f; // double 형보다 float 형의 크기가 작은데도 f 명시안함 에러남.;;
		System.out.println(flt);
		
		double dle = 29.123456789123456789; // float 형에 비해 소수 뒷자리를 2배정도 더 표현 가능
		System.out.println(dle);
		
		boolean tf = true; // 대문자 아님
		System.out.println(tf);
		
	
		String name ="fucking";
		int age =10;
		byte num=20;
		System.out.printf("%-20s는 %-10d살이고 %10d개의 쿠키를 처먹었다.\n",name,age,num); // 20칸범위왼쪽정렬옵션 (참고로 숫자타입 아니면 영채움 옵션은 사용 뷸가), 10칸내왼쪽정렬옵션, 10칸내옵션
		System.out.printf("%s는 %3$d살이고 %d개의 쿠키를 처먹었다.\n",name,age,num); // 3번째 변수 인터셉트
		System.out.printf("%s는 %3$d살이고 %3$d개의 쿠키를 처먹었다.\n",name,age,num); // 응응응~~
		
		
		}
}