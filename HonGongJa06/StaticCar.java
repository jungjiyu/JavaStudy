package sec06.PackagePractice.PracticeClass;

public class StaticCar {

		static String company = "Tesla";
		static final String CEO= "Jiyu";
		
		int distance ;
		
		final int window;
		
		
		public StaticCar(){
			System.out.println("you r using sec06.PackagePractice.PracticeClass.StaticCar");
			window = 4;
		} 
		// 기본생성자

		StaticCar(int window){
			this(window, 0); 
			
		} 
		
		StaticCar(int window, int distance){
			this.window = window;
			this.distance = distance;
			System.out.println("you r using sec06.PackagePractice.PracticeClass.StaticCar");
		}
		

		
		static void shoutoutCompany() {
			System.out.println(company +company +company );
		}
}
