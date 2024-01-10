package chapter1;

import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*
		//16
		double sum=0;
		for(int i = 1 ; i <=20 ;i++) {
			if(i%2!=0 || i%3!=0) sum+=i;
		}
		
		System.out.println("총합: "+sum);
		
		//17: 정답 ) 171700
		sum=0;
		double prev_sum=0;
		for(int i = 1 ; i <=100 ;i++) {
			prev_sum+=i;
			sum += prev_sum;
		}
		System.out.println("총합: "+sum);
		
	//18 
		sum=0;
		int count=0;
		for(int i = 1 ; i <=10000 ;i++) {
			if(i%2 == 0) sum += (i*-1);
			else sum += i;
			
			count++;
			if(sum>=100) {
				System.out.println("100 이상의 수가 "+count+"회 만에 되었습니다");
				break;
			}
			
		}
		
		
		//19
		int i = 0;
		while(i<=10) {
			int j =0;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();	
			i++;
		}
		
		//20
		for(int u = 1 ; u<=6 ; u++) {
			for(int f = 1; f<=6;f++) {
				if(u+f == 10) {
					System.out.println(u+","+f);
				}
			}
		}
	*/
		//21
	/*	
		String str = "12345";
		String tmp;
		double sum=0;
		
		for(int u =0;u<str.length();u++ ) {
		 tmp = str.substring(u,u+1);
		System.out.print(tmp+"\t");
			sum += Integer.parseInt(tmp);
		}
		System.out.println("\nsum = "+sum);
		
	//22
		for(int i = 0 ; i<10;i++) {
		int num = (int)(Math.random()*10)+1;
		System.out.print(num+"\t");
		}
		
	//23
		int number = 12345;
		sum=0;
		str = Integer.toString(number);
		for(int u = 0 ; u<str.length() ;u++) {
			tmp = str.substring(u,u+1);
			System.out.print(tmp + "\t");
				sum += Integer.parseInt(tmp);
		}
		
		System.out.println("\nresult ="+sum);
		*/
		
		
		
		//25
		int[] ary1 = new int[]{70,60,55,75,95,90,80,80,85,100};
		double sum = 0 ;
		for(int i = 0 ; i < ary1.length ;i++) {
			sum +=ary1[i];
			System.out.print(ary1[i]+"\t");
		}
		System.out.println("\n mean ="+sum/ary1.length);
		
		int[][]ary2 = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		
		
		//26
		sum=0;
		int count=0;
		for(int i = 0 ; i < ary2.length ;i++) { 
			for(int j =0;j<ary2[i].length;j++) {
				sum +=ary2[i][j];
				System.out.print(ary2[i][j]+"\t");
				count++;
			}
			
		}
		
		System.out.println("\n sum ="+sum);
		System.out.println("count ="+count);
		System.out.println("mean ="+sum/count);
		
		
		//27
		/*
		int result_num=0;
		int tmp =1;
		for(int i = 0 ; i<3;i++) {
			int ran_num = (int)(Math.random()*9)+1;
			System.out.println(ran_num);
			result_num +=ran_num*tmp;
			tmp*=10;
			}
		System.out.println(result_num);
		*/
		
		
	}

}
