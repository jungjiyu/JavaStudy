package sec04.MethodPractice;

public class Car {
	
	double gas=0;
	int  distance=0;
	Efficiency efficiency = Efficiency.SOSO;; // 열거형 타입 . 1~5 . 5로 갈수록 안좋은 걸로 함.
	
	
	Car(){	};
	
	Car(Efficiency efficiency){
		this.efficiency = efficiency;
	};
	
	void fillGas(double gas) {
		this.gas +=gas;
	}
	

	boolean isLeftGas() { // 가스 잔량 체크
		if(gas>0) return true;
		return false;
	}

	
	void run() {
		if(!isLeftGas() ) {
			System.out.println("더이상 달릴 수 없습니다");
			return ;
		}
		
		switch(efficiency){
		case Efficiency.BEST:
			gas -= 0.5;
			break;
		case Efficiency.GOOD:
			gas -=1;
			break;
		case Efficiency.SOSO:
			gas -=0.5;
			break;
		case Efficiency.NOTGOOD:
			gas -= 1;
			break;
		default:
			gas -=2;
		}
		distance ++;
		System.out.println("남은 가스: "+gas);
		System.out.printf("총 %dkm 달렸습니다\n",distance);
	}
	
	
	
}
