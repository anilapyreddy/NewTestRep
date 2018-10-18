
package practiceExample1;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;



public class PracticeEx1 {

	public static void main(String[] args) {
		
		WebDriver  driver=new FirefoxDriver();
     String URL="http://Store.DemoQA.com";

     driver.get(URL);
     
     String TitleN=driver.getTitle();
   System.out.println	("Name of the title page is :" + TitleN +" Length of the title is :" + TitleN.length());
     //System.out.println(driver.getTitle()());
   String Url=driver.getCurrentUrl();
   String ActualURL="http://store.demoqa.com/";
   if(Url.equals(ActualURL)) {
	   
System.out.println("Url matches");
   }
   else
   {
	   System.out.println("url does not matches");
   }
   //System.out.println(driver.getPageSource());
   System.out.println(driver.getPageSource().length());
   driver.close();
   }
  
	}




