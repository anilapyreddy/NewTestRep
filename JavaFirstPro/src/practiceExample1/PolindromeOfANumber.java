package practiceExample1;

public class PolindromeOfANumber {

	public static void main(String[] args) {
		int n=12321,sum=0,temp,r;
		temp=n;
		
		while(n>0)
		{ r=n%10;
		sum=sum*10+r;
		n=n/10;}
		System.out.println(sum);
		if (sum==temp) {System.out.println("number " +  temp+" is a polindrome");}
		else {System.out.println("number "+temp+ " is not a polindrome");}
		
		
	}

}
