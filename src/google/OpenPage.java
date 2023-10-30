package google;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenPage {

	public static void main(String[]args)
	{
		 System.setProperty("WebDriver.chrome.driver","D:\\Selenium server\\browser\\28.10\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//textarea[@id='APjFqb']")).click();
		 driver.findElement(By.xpath("//a[@class='gb_za gb_jd gb_Ld gb_ie']")).click();
		 driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("vaijayantakarale@gmail.com" );
		 driver.findElement(By.xpath("//span[conatins(text(),'Next')]")).click();
		 
		 
		 
				 
		 		
	}
}
