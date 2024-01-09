package sec06.PackagePractice;

import sec05.StaticPractice.*;
import sec06.PackagePractice.PracticeClass.*; // StaticPractice 내 패키지의 클래스와 겹치는 이름을 가지는 클래스 존재 
import sec06.AccessModifierPractice.EX1;

public class PackagePractice {
	public static void main(String[] args) {
		
	// 이름 똑같은 클래스는 쓰려면 풀네임 써줘야됨
		sec05.StaticPractice.StaticCar car1 = new sec05.StaticPractice.StaticCar();
		sec06.PackagePractice.PracticeClass.StaticCar car2 = new sec06.PackagePractice.PracticeClass.StaticCar();
	
	// 이름이 겹치는게 아니면 걍 같은 패키지 내에 존재하는 것 마냥 쓰면 됨
		hehe.sayHehe();
		// 걍 SayHehe(); 는 불가하다. hehe클래스가 현재 클래스인 PackagePractice 에 포함되있는걸로 치는게 아니라 PackagePractice를 포함하는 패키지 내에 혹은 PackagePractice 를 포함하는 파일에서 PackagePractice의 외부에 존재하는 클래스 인 것처럼 쓰는 것이기 때문이다 
		
		System.out.println(EX1.name);
	}

}
