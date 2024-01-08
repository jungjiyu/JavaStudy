package sec04.MethodOverloadingPractice;

public class CalcUsing {
	public static void main(String[] args) {
	Calc calculator = new Calc();
	double result = calculator.devide(10,20);
	System.out.printf("%d/%d = %f\n",10,20,result); //f 대신 lf 씀 오류남
	
	result = calculator.devide(10,20.0);
	System.out.printf("%d/%f = %f\n",10,20.0,result);//f 대신 lf 씀 오류남

	}
}
