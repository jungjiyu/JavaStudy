package Sec02.Array;

public class Array {
	public static void main(String[] args) {
		//1. 중괄호 초기화 >> 이건 선언시점에만 가능
		String[] names1 = {"bitch","posty","justin","jooa"};
		System.out.println("names1:");
		for(int i = 0 ; i <4; i++) {
			System.out.println(names1[i]);
			}
		
		//2. new 타입[ ]{ }활용 >> 선언 이후도 할당 가능(선언 시점 이후에도 할당 가능한건 대체로 new 써서 생성되는 케이스인듯)
		String[] names2 = null ;
		names2 = new String[]{"bitch","posty","justin","jooa"};
		System.out.println("\nnames2:");
		for(int i = 0 ; i <4; i++) {
			System.out.println(names2[i]);
			}	
		//3. 사이즈로만 초기화 >> 0비스무리값으로 초기화됨
		String[] names3 = null;
		names3 = new String[4];
		System.out.println("\nnames3:");
		for(int i = 0 ; i <4; i++) {
			System.out.println(names3[i]);
			}
		//메서드의 arg 로 중괄호 넘김 
		int result = sum(new int[]{1,2,3,4,5,6,7,9} );
		System.out.println("sum="+result);
		
		
		// 다차원 배열에서 new 타입[][]{ } 쓰는 경우 사이즌 필수적으로 안쓰는 거임 
		int [][] TwoDemensionAry2 = new int[][] {{1,2,3},{4,5}};
		for(int i = 0 ; i < TwoDemensionAry2.length;i++) {
			for(int j = 0 ; j <TwoDemensionAry2[i].length;j++) {
				System.out.println(TwoDemensionAry2[i][j]);

			}
		}
		
		
		//3차원 배열도 생성 가능, new int[][][] 로 생성시 가장 인접한 사이즈 하나는 무조건 써줘야됨
		int [][][]ThreeDemensionAry = new int [2][][];
		ThreeDemensionAry[0] = new int [2][]; //ThreeDemensionAry[0][][] 에다 할당하는거 아니다 (지금은 초기화 이후 인덱스적 접근을 통해 할당하는 과정)
		ThreeDemensionAry[0][0] = new int [2]; 		
		ThreeDemensionAry[0][1] = new int [4]; 		
		ThreeDemensionAry[1] = new int [2][3];
		
		for(int i = 0 ; i < ThreeDemensionAry.length;i++) {
			for(int j = 0 ; j <ThreeDemensionAry[i].length;j++) {
				for(int k = 0 ; k <ThreeDemensionAry[i][j].length;k++) {
				System.out.printf("ary[%d][%d][%d] = %d\n",i,j,k,ThreeDemensionAry[i][j][k]);
				}
			}
		}
		
		// 문자열 배열 : 일반타입의 배열과 마찬가지로 선언, 초기화 가능
		String[] StrAry1 = {"ahahahaha","chase","dumb"};
		String[] StrAry2 = new String[]{"ahahahaha","chase","dumb"};
		System.out.println("StrAry1[0] == StrAry2[0]: "+(StrAry1[0] == StrAry2[0]));
		String[] StrAry3 = new String[3];
		StrAry3[0] = "ahahahaha";
		StrAry3[1] = new String("chase");
		StrAry3[2]="dumb";
		System.out.println("StrAry1[0] == StrAry3[0]: "+(StrAry1[0] == StrAry3[0]));	
		System.out.println("StrAry1[1] == StrAry3[1]: "+(StrAry1[1] == StrAry3[1]));	
		System.out.println("StrAry1[1].equals( StrAry3[1]): "+ StrAry1[1].equals(StrAry3[1]) );	

		// 배열 복사 방법
		int[][] IntAry1 = {{1,2,3},{4,5,6,7}};
		int [][] IntAry2 = new int[4][2];
		
		System.arraycopy(IntAry1, 0 , IntAry2,0,IntAry1.length);
		
		for(int i = 0 ; i < IntAry2.length;i++) {
			System.out.println("IntAry2["+i+"].length: "+ IntAry2[i].length);
			for(int j = 0 ; j <IntAry2[i].length ; j++) {
				System.out.print(IntAry2[i][j]+"\t");
			}
			System.out.println("");
		}
		
		// 향상된 for문을 사용
		int [] EveryScores = {19,29,30};
		int sum = 0;
		for(int score :  EveryScores) {
			sum+= score;
			System.out.println(score);	
		}
		System.out.println("점수의 총합: " + sum);
		
		
		}


	// 메서드 쓸때 public class 클래스명 { } 내부에 쓰는거 주의
	public static int sum(int[] ary) {
		int result =0;
		System.out.println("\n사이즈:"+ary.length);
		for(int i =0; i < ary.length ; i++) { // 타 메서드에서도 배열의 사이즈 측정이 가능
			result+=ary[i];
		}
		
		return result;

	}

	}