package week2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Faceboookregistration {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("Test1");
		driver.findElement(By.name("reg_email__")).sendKeys("Test@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Test123");
		WebElement day = driver.findElement(By.id("day"));
		Select s1 = new Select(day);
		s1.selectByVisibleText("3");
		WebElement Month = driver.findElement(By.id("month"));
		Select s2 = new Select(Month);
		s2.selectByValue("12");
		WebElement year = driver.findElement(By.id("year"));
		Select s3 = new Select(year);
		s3.selectByValue("1991");
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.name("websubmit")).click();



		
	}

}
