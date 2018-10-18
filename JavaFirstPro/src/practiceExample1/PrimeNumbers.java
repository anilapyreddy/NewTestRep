package practiceExample1;

public class PrimeNumbers {

	public static void main(String[] args) {
	int	n=22,i,flag=0;
	int m=n/2;
	if(n==0||n==1) {
		System.out.println("number is not a prime number" + n);}
	
			else { 
				for(i=2;i<=m;i++) {
					if (n%i==0) {
						System.out.println("Number is  not a prime number " + n);
     					flag=1;
     					break;
					}}
					
					 if  (flag==0) {System.out.println("Number is a prime number " + n);}
				}
				
				}
	
			
			
			
		}
		
	


