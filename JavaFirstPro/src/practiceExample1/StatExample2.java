package practiceExample1;




class StatExample2{
static int count=0;//will get memory when instance is created


 StatExample2(){  
count++;//incrementing value  
System.out.println(count);  
}  

public static void main(String args[]){

	StatExample2 c1=new StatExample2();
	StatExample2 c2=new StatExample2();
	StatExample2 c3=new StatExample2();

 }}
