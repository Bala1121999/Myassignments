package practise;

import java.awt.Checkbox;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task11 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		List<WebElement> table = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr/td[2]"));
		List<WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement data : table) {
			String str = data.getText();
			System.out.println(str);
		}
		

	}

}
