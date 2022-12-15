package Tutorial;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");

		WebElement wb = driver.findElement(By.name("birthday_month"));

		Select sel = new Select(wb);

		List<WebElement> ls = sel.getOptions();

		TreeSet t = new TreeSet();

		for (WebElement abc : ls) 
		{
			String a = abc.getText();
			t.add(a);
		}

		System.out.println(t);


	}

}
