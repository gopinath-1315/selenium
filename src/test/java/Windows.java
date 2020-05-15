import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse047\\selenium\\drivers\\chromedriver.exe");
		WebDriver c = new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://www.flipkart.com/");
		WebElement pop = c.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		pop.click();
		WebElement lap = c.findElement(By.xpath("//img[@alt='Asus i5 (Just ₹46990)']"));
		lap.click();
		Set<String> windows = c.getWindowHandles();
		System.out.println(windows);
		System.out.println(windows.size());
		List<String> l = new ArrayList<String>();
		l.addAll(windows);

		c.switchTo().window(l.get(1));
		WebElement addtocart = c.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
		addtocart.click();
		// c.switchTo().window(l.get(2));
		//c.findElement(By.xpath("//button[@class='_2AkmmA iwYpF9 _7UHT_c']")).click();
		WebElement ee = c.findElement(By.xpath("//button[@class='_2AkmmA _19C5Z']"));
		ee.click();
		WebElement emali = c.findElement(By.xpath("//input[@maxlength='auto']"));
		emali.sendKeys("gopinath");

	}

}
