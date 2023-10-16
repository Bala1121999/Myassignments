package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task8 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.findElement(By.xpath("(//input[@id='name'])[1]")).sendKeys("hio");
		driver.switchTo().frame("frm1");
		WebElement sel = driver.findElement(By.xpath("//select[@id='selectnav2']"));
		Select slt = new Select(sel);
		slt.selectByVisibleText("Home");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//input[@id='name'])[1]")).clear();
		driver.switchTo().frame("frm2");
		
		driver.findElement(By.xpath("//input[@id='hindichbx']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//input[@id='name'])[1]")).sendKeys("ovr");
		driver.switchTo().frame("frm3");
		driver.findElement(By.xpath("(//input[@id='name'])")).sendKeys("ovr");
		driver.switchTo().frame("frm1");
		WebElement sel1 = driver.findElement(By.xpath("//select[@id='selectnav2']"));
		Select slt1 = new Select(sel1);
		slt1.selectByVisibleText("Home");
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frm2");
		
		driver.findElement(By.xpath("//input[@id='hindichbx']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//input[@id='name'])")).clear();
	}

}
