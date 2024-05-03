package sit707_week4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;


/**
 * Hello world!
 * 
 * @author Kema Sanka Srinath Dissanayake
 */
public class Main 
{
    public static void main( String[] args )
    {
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver-win64\\chromedriver.exe");
    	//WebDriver driver = new ChromeDriver();
    	
    	ChromeDriver driver = new ChromeDriver();
    	driver.get("https://www.bunnings.com.au/login");
    	driver.findElement(By.id("okta-signin-username")).sendKeys("kemasanka981@gmail.com");
    	driver.findElement(By.id("okta-signin-password")).sendKeys("1234");
    	driver.findElement(By.xpath("//*[@id=\"okta-signin-submit\"]")).click();  
    	sleep(50);
    	driver.close();   
    
    }
    
    public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
