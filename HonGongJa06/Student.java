package sec01.ClassPractice;


public class Student {
	
	String name;
	int age;
	double mean=0;
	
	Student(){ } // 기본생성자
	
	Student(String  name){ // 생성자1
		this(name , 70); // 똑같은 코드 귀찮게 또 쓰지 않기 위해 첫줄에 this( ) 사용
		System.out.println("1번째 Student 생성자애 들어왔습나다");

	}
	
	Student(int age){ // 생성자2
		this("Trump",age);
		System.out.println("2번째 Student 생성자애 들어왔습나다");

	}
		
	
	Student(String name , int age){ // 생성자3
		this(age,name);
		System.out.println("3번째 Student 생성자애 들어왔습나다");
	}
	
	Student( int age, String name){ // 생성자4
		this.name = name; // 필드명과 겹치는 param명을 사용하기 위해 this 객체( 클래스 자기자신)를 사용
		this.age = age;
		System.out.println("4번째 Student 생성자애 들어왔습나다");

	}
	
	
	void PrintInfo() {
		System.out.println("\n============개인정보===========");
		
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		
		if(mean == 0) System.out.println("*성적 미입력 상태");
		else System.out.println("성적 평균: "+mean);
		
		System.out.println("============================");

	
	}
	
	
	void meanUpdate1(double[] ary) {
		System.out.println("\n++++++++in meanUpdate1+++++++++");
		meanUpdate2(ary); // 어차피 같은 내용 실행하는 거라 meanUpdate2 로 대체
		System.out.println("++++++++out meanUpdate1++++++++");

	}
	
	void meanUpdate2(double ...ary) { 
		System.out.println("\n~~~~~in meanUpdate2~~~~~~");
		
		mean = 0;
		double sum=0;
		int count = ary.length;
		

		System.out.println("입력된 성적의 개수: "+count);
		for(int i = 0 ; i<ary.length ;i++) {
			sum += ary[i];
		}
		mean = sum/count;
		System.out.println("성적 업뎃 완료");
		
		System.out.println("~~~~~~out meanUpdate2~~~~~~~");
	}

}
