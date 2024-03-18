package GuviTask17;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
public class Ans_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
	   
		 
		 	WebDriver driver=new ChromeDriver();//Step1
		 	driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.navigate().to("https://www.demoblaze.com/");//step2
		   driver.findElement(By.id("signin2")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.id("sign-username")).sendKeys("testcase07@gmail.com");
		   Thread.sleep(1000);
		   driver.findElement(By.id("sign-password")).sendKeys("Pass@123");
		   driver.findElement(By.xpath("//div/button[text()='Sign up']")).click();
		   Thread.sleep(1000);
		   
		   //Switching to alert
		   Alert alert =driver.switchTo().alert();
		   String text=alert.getText();
		   System.out.println(text);

	}

}
