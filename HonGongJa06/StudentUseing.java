package sec01.ClassPractice;

import java.util.Scanner;

public class StudentUseing {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Student[] Students = new Student[2]; // Student 클래스 배열 생성. 아직 각 인덱스에 객체 부여한 상태는 아니고
		
		for(int i = 0 ; i <Students.length ;i++) {
			
			String name;
			System.out.print("이름 입력: ");
			name = scanner.nextLine();
			
			
			int age;
			String tmp;
			System.out.print("나이 입력: ");
			tmp = scanner.nextLine(); 
			age = Integer.parseInt(tmp);
			
			Students[i] = new Student(name , age); 
			
		}
		
		System.out.println();
		
		Students[0].PrintInfo();
		Students[0].name = "bingsin";
		Students[0].PrintInfo();
		
		Student BadStudent = new Student(18);
		BadStudent.PrintInfo();
		
		double[] scores = {10, 20, 40, 22.9};
		BadStudent.meanUpdate1(scores);
		BadStudent.PrintInfo();
	//	BadStudent.meanUpdate1(double[] hehehe = {55.3, 34.23 ,454.3}); 처럼 내부에서 참조 변수 선언은 불가
		BadStudent.meanUpdate2(new double[]{55.3, 34.23 ,454.3}); // 내부에서 객체 생성은 가능
		BadStudent.PrintInfo();
		BadStudent.meanUpdate2(55.3, 34.23 ,33.2 ,45.3); // 내부에서 객체 생성은 가능
		BadStudent.PrintInfo();

		
		
		

		
	}
	
	
}
