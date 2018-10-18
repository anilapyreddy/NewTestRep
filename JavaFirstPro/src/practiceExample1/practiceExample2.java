package practiceExample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class practiceExample2 {

	public static void main(String[] args) throws InterruptedException {
		//ProfilesIni init=new ProfilesIni();
		//FirefoxProfile profile=init.getProfile("default");
		
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/b/ref=nav_swm_key_pol_gw_swm_en?ie=UTF8&node=17879387011&pf_rd_p=871d7737-2af0-4478-9422-fed50eb353b2&pf_rd_s=nav-sitewide-msg&pf_rd_t=4201&pf_rd_i=navbar-4201&pf_rd_m=ATVPDKIKX0DER&pf_rd_r=62PF14D4Q0EBN0NW1QW9&pf_rd_r=62PF14D4Q0EBN0NW1QW9&pf_rd_p=871d7737-2af0-4478-9422-fed50eb353b2");
	/*WebElement Element= driver.findElement(By.id(id));
		driver.navigate().to("http://www.DemoQA.com");
		driver.navigate().back();
		driver.navigate().forward();
        driver.navigate().refresh();*/
	driver.findElement(By.id("nav-link-accountList")).click();
	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("Anila");
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	Thread.sleep(5000);
	System.out.println(driver.findElement(By.id("auth-error-message-box")).getText());
	}

}
