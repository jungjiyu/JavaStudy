package sec04.MethodPractice;

public class CarUsing {
	public static void main(String[] args) {
		
 		Car car1 = new Car();
 
		car1.fillGas(10);
		
		
		while(car1.isLeftGas()){
			 
			System.out.println(car1.isLeftGas());
			car1.run();
			System.out.println(car1.isLeftGas());
			System.out.println();	
		
		}
		
		
		
	}

}
