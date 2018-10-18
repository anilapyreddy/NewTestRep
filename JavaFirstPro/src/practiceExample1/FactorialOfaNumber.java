package practiceExample1;

public class FactorialOfaNumber {

	public static void main(String[] args) {
	int	n=6,i,factorial=1,x;
	for (i=2;i<=n;i++)
	{
		x=i*factorial;	
		factorial=x;
		
		
	}
System.out.println("Factorial of a number is " + factorial);
	}

}
