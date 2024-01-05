package seq01.random;

public class Random {
	public static void main(String[] args) {
		
		int i =4;
		
		while(i-- > 0) {
			// Math.random() 사용
			int t = (int)(Math.random()*5)+1; // 1시부터 5시까지
			System.out.printf("[현재시각: %d 시]\n",t);
			
			//break 없는 switch 문
			switch(t) {
			case 1:
				System.out.println("점심을 먹습니다");
			case 2:
				System.out.println("쇼핑을 합니다");
			case 3:
				System.out.println("디저트를 먹습니다");
			case 4:
				System.out.println("낮잠을 잡니다");
			default:
				System.out.println("저녁을 먹습니다");
			}
			
		}
		
		
		//문자열 변수를 적용한 switch 문 (그래도 여전히 실수타입엔 사용 불가)
		String str = "chocolate";
		switch(str) {
		case "watermelon":
			System.out.println("watermelon suger high~~");
			break;
		case "chocolate":
			System.out.println("hmmmm u lookin good!");
			break;
		default:
			System.out.println("how should I know?");
		}
	}

}
