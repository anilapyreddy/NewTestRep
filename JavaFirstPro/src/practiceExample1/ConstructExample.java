package practiceExample1;

public class ConstructExample {

	
		String empName;
		String empId;
		String empDesg;
		int EmpSalary;
		
		public ConstructExample (String empDesg,String empName,String empId,int EmpSalary) {
			this.empDesg=empDesg;
			this.empName=empName;
			this.empId=empId;
			this.EmpSalary=EmpSalary;
		}
		public ConstructExample (String a,String b,String c) {
			empDesg=a;
			empName=b;
			empId=c;
			//EmpSalary=d;
		}
		public static void main(String[] args) {
			ConstructExample e1=new 	ConstructExample("Implementation Engineer","Anila","4300",2);
			System.out.println(e1.empDesg);
			System.out.println(e1.empName);
			System.out.println(e1.empId);
			System.out.println(e1.EmpSalary);
			
			ConstructExample e2=new 	ConstructExample("QA","Anila Reddy","4300",4);
			System.out.println(e2.empDesg);
			System.out.println(e2.empName);
			System.out.println(e2.empId);
			System.out.println(e2.EmpSalary);		
			ConstructExample e3=new 	ConstructExample("QA","Anila Reddy","4300");
			System.out.println(e3.empDesg);
			System.out.println(e3.empName);
			System.out.println(e3.empId);
			//System.out.println(e2.EmpSalary);	
			
	}

}
