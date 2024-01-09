package Chapter1;


import java.util.Scanner;

public class EX01 {
	public static void main(String[] args) {
		System.out.println("uuu");
		Scanner scanner = new Scanner(System.in);
		/*
		// 문제1
		double kor = 100, eng = 95, math = 85;
		double sum=0;
		double result;
		sum +=kor;
		sum +=eng;
		sum +=math;
		result = sum/3;
		System.out.println("평균: "+result);
		
		
		
		
		// 문제2
		
		
		System.out.print("\n\n수를 입력하시오:");
		String tmpAns = scanner.nextLine();
		int ans = Integer.parseInt(tmpAns);
		System.out.println("입력받은수:"+ans);
		
		if(ans%2 ==0 )System.out.println("짝수입니다");
		else System.out.println("홀수입니다");
		
		
		// 문제3
		System.out.print("\n\n생년월일을 입력하시오:");
		tmpAns = scanner.nextLine(); 
		ans = Integer.parseInt(tmpAns);
		
		int year = ans/1000/10; // 031215
		System.out.println("년: "+ year);
		int month = ans%10000/100; // 031215
		System.out.println("달: "+ month);
		int day = ans%100; // 031215
		System.out.println("일: "+day);
		
		//문제4
		System.out.println();
		String Year = tmpAns.substring(0,4);
		System.out.println("년: "+ Year);
		String Month = tmpAns.substring(4,6);
		System.out.println("달: "+ Month);
		String Day = tmpAns.substring(6,7);
		System.out.println("일: "+day);
		
	
		//문제 5
		System.out.println();
		for(int i = 0 ; i<=100;i++) {
			System.out.print(i+"\t");
		}
		
		*/
		/*
		
		//1
		int i = 0;
		while(true) {
			System.out.println(i);
			i++;
			if(i>100) break;
		}
		
		//2
		for(int k = 0 ; k<=100  ; k++ ) 
	{
			if(k%5==0) System.out.print(k+"\t");
		}
		
		//3
		System.out.println();
		i = 0;
		while(true) {
			if(i%5==0)System.out.print(i+"\t");
			i++;
			if(i>100) break;
		}
		
		//4
		System.out.println();
		for(int k = 0 ; k<=100  ; k+=5 ) 
		{
			 System.out.print(k+"\t");
			}
		//5
		System.out.println();
		i = 0;
		while(i<=100) {
			System.out.print(i+"\t");
			i+=5;
			
		}
		*/
		System.out.println();
		System.out.println();
		System.out.println();
		
		//11
		int i=1;
		 double sum=0;
		while(true){	
			if(i%3==0)sum+=i;
			i++;
			if(i>100)break;

		}
		System.out.println("sum:"+sum);
		

		//12
		/*
		 
		 for(int u = 1 ; u<=6;u++) {
			for(int k=1;k<u;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		int u=1 ;
		while(u<=6) {
			int k=1;
			while(k<u) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			u++;
		}
		
		
		*/
		
		int u=1;
		while(u<=6) {
			for(int k=1;k<u;k++) {
				System.out.print("*");
			}
			System.out.println();
			u++;
		}
		
		
		//13
		System.out.print("숫자 입력:");
		String str =scanner.nextLine();
		int a = Integer.parseInt(str);
		if(10<=a && a<=20)System.out.println("10<=a<=20");
		else System.out.println("10<=a<=20 이 아닙니다");
		
		
		//14
		System.out.print("숫자 입력:");
		str =scanner.nextLine();
		int c = Integer.parseInt(str);
		System.out.println(c);
	
		
		if( '1'<= c+'0' && c+'0' <='5')System.out.println("'1'<= c-'0' && c-'0'<='5' 맞다");
		else System.out.println("'1'<= c-'0' && c-'0'<='5' 아니다");
	
		
		//15
		
		for(int q = 1 ; q <=2000;q++) {
			if(q%4==0) {
				if(q%100 ==0) {}
				else {
					System.out.println(q+"년은 윤년입니다");
			
				}
			}
			else if(q%400 ==0)System.out.println(q+"년은 윤년입니다");
		}
	}
	
}
