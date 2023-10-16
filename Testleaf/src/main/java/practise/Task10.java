package practise;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task10 {
	
@Test
public  void oprn() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phones");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		List<WebElement> name=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for (int i = 0; i < 4; i++) {
			name.get(i).click();
		}
         Set<String> id= driver.getWindowHandles();
         List<String> mover = new ArrayList<String>(id);
         driver.switchTo().window(mover.get(0));
         System.out.println(driver.getCurrentUrl());
         driver.switchTo().window(mover.get(1));
         System.out.println(driver.getCurrentUrl());
         driver.switchTo().window(mover.get(2));
         System.out.println(driver.getCurrentUrl());
         driver.switchTo().window(mover.get(3));
         System.out.println(driver.getCurrentUrl());
         for (int i = 1; i < 4; i++) {
         driver.switchTo().window(mover.get(i));
         driver.close();
         }
	}

}
