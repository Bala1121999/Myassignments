package practise;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/contr");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		WebElement item = driver.findElement(By.xpath("//div[@id=\"form\"]/h2"));
		System.out.println(item.getText());
		driver.close();
		
		
	}

}
