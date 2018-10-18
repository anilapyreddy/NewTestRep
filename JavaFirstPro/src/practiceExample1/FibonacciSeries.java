package practiceExample1;

public class FibonacciSeries {

	public static void main(String[] args) {
	int F1=0,F2=1,F3,F4;
	
	
	for (F3=0;F3<=10;F3++) {
		System.out.print(" " +F1);
		F4=F1+F2;
		F1=F2;
		F2=F4;
		}
}

}
