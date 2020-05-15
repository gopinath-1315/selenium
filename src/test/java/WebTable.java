import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\Eclipse047\\selenium\\drivers\\chromedriver.exe");
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--disable-notifications");
	WebDriver c = new ChromeDriver(co);
	c.manage().window().maximize();
	c.get("https://starthreesixty.com/");
	WebElement profile = c.findElement(By.xpath("//div[@class='mobile-nav-my-account']"));
	profile.click();
	c.findElement(By.xpath("(//span[text()='Create an Account'])[1]")).click();
	
//	WebElement cal = c.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']"));
//	Thread.sleep(5000);
//	cal.click();
//	Thread.sleep(5000);
//	c.findElement(By.xpath("(//td[@class='wd day'])[9]")).click();
//	
//	List<WebElement> tbs = c.findElements(By.tagName("table"));
//	List<WebElement> tr1 = tbs.get(0).findElements(By.tagName("tr"));
//	for (int i = 0; i < tr1.size(); i++) {
//		WebElement a = tr1.get(i);
//		List<WebElement> td1 = a.findElements(By.tagName("td"));
//		for (int j = 0; j < td1.size(); j++) {
//			WebElement data = td1.get(j);
//			String text = data.getText();
//			System.out.println(text);
//			if (text.equals("5")) {
//				data.click();
//				
//			}
//		}
//	}
	
	
	
	
}
}