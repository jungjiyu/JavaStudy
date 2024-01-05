package seq02.loop;

public class Loop {
	public static void main(String[] args) {
			// 외부에서 선언된 변수를 for문의 조건식, 증감식 부분에 활용
			int k = 10;
			for(;k>0;k--) {
				System.out.println(k);
			}
			
			//for문에서 2개 이상의 변수를 사용
			for(int i = 10,j=0 ; i>0 && j<6 ;i-- , j++) {
				System.out.println("i:"+i+" j:"+j);
			}
			
			
			// for문 외부에서도 index 값 쓰는 법: 외부서 변수 선언하고 사용함됨
			int i;
			for(i=0;i<10;i++){
			  System.out.println(i);
			  } 
			System.out.println("for문 마지막 i값:" + --i);
			
			// for문 헤드 부분에 쓰이는 변수가 int 타입이 아니여도 되긴 하지만 부정확한편
			int count =0;
			for(float f = 0.1f; f<= 1.0f; f+=0.1f) {
				System.out.println("실수 회차:"+ ++count);
			}
			
			
			// java 의 경우 반복문에 라벨 걸어서 가장 인접한 루프가 아니더라도 루프를 지정하여 break/continue 할 수 있음
			a: for (char h ='a';h<='c'; h++) {
				System.out.println("======first loop======");
				b : for(char p = 'A' ; p<='C' ; p++) {
					System.out.println("======second loop======");
						c: for(int q = 1 ; q <=5; q++) {
							System.out.println("=====third loop=====");
							System.out.printf("%c %c %d\n",h,p,q);
							if(q == 2) {
								//System.out.println(" break b");
								//break b;
								System.out.println("continue b\n");
								continue b;
							}
						}
				}
				
			}
			
	}
}
