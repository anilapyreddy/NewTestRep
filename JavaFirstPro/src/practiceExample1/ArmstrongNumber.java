package practiceExample1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n=999,temp,r,ArmSNumb=0,i;
	for (i=1;i<=n;i++) {
		
		temp=i;
		
		while(temp>0) {
			r=temp%10;
			System.out.println(r);
			ArmSNumb=ArmSNumb+r*r*r;
			temp=temp/10;
}
		if (ArmSNumb==temp) {
			System.out.print(" " + temp);}
			//else {System.out.println("Number is not armstrong " + temp);}
		}

	}}


