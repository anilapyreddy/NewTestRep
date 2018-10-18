package practiceExample1;

public class StatVarExample {
	String Name;
	int rollNo;
	static String CompanyName="XYZ";
	
	public StatVarExample(String Name,int rollNo) {
		this.Name=Name;
		this.rollNo=rollNo;
		//this.CompanyName=CompanyName;
		
	}
	public void display() {
		System.out.println(Name + " " +rollNo +" "+CompanyName);
	}
	public static void main(String[] args) {
		StatVarExample a1=new StatVarExample("ABC",10);
		StatVarExample a2=new StatVarExample("DEF",11);
		a1.display();
		a2.display();
		
		
		
		

	}

}
