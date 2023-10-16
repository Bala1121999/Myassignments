package week2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Createaccount {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		String pagetxt = driver.findElement(By.tagName("h2")).getText();
		System.out.println("The current page h2 tag is "+ pagetxt );
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		WebElement find = driver.findElement(By.linkText("Create Account"));
		if (find.isDisplayed()) {
			find.click();
		}else {driver.close();}
		driver.findElement(By.id("accountName")).sendKeys("demo123");
		driver.findElement(By.id("groupNameLocal")).sendKeys("demo123");
		driver.findElement(By.id("annualRevenue")).sendKeys("500000");
		WebElement dd = driver.findElement(By.name("industryEnumId"));
		Select sl = new Select(dd);
		sl.selectByVisibleText("Computer Software");
		WebElement dd1 = driver.findElement(By.name("ownershipEnumId"));
		Select s2 = new Select(dd1);
		s2.selectByVisibleText("S-Corporation");
		WebElement dd2 = driver.findElement(By.name("dataSourceId"));
		Select s3 = new Select(dd2);
		s3.selectByValue("LEAD_EMPLOYEE");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(1000);
		String Accname = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		System.out.println(Accname);
		driver.close();
		
		
	}

}
