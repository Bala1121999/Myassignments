package practise;

import java.time.Duration;
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listprblm {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		driver.findElement(By.xpath("//input[contains(@id,\"twotabsearchtextbox\")]")).sendKeys("phones");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		List<WebElement> amount = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Integer> prices = new ArrayList<Integer>();
		for(WebElement data:amount) {
			String text = data.getText().replace(",", "");
			int data1 = Integer.parseInt(text);
			prices.add(data1);
			
		}
		System.out.println(prices);
		Collections.sort(prices);
		System.out.println(prices);
	}

	
}
