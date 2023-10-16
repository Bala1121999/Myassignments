package practise;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task9 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("redmi");
		List<WebElement> search = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
		
		
		
		for (WebElement data : search ) {
			String str = data.getText();
			System.out.println(str);
			
		
		}
		
	}

}
