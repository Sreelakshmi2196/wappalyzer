package P1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scriptw {
	
	ChromeDriver d;
	
	@BeforeMethod
	public void beforemethod()
	{
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.wappalyzer.com/");
	}
	
	@Test
	public void testing() throws InterruptedException
	{
		WebElement resource = d.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/header/div/div/div/div[2]/button[2]/span"));
		resource.click();
		Thread.sleep(5000);
		WebElement technologies = d.findElement(By.xpath("//*[@id=\"list-item-50\"]/div/div[1]"));
		technologies.click();
		Thread.sleep(5000);
		WebElement shopify = d.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/a/div/div/div[2]/span"));
		shopify.click();
		Thread.sleep(5000);
		WebElement createllist = d.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[1]/div[2]/div/div[3]/div/div/a/span"));
		createllist.click();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,300)","");
		Thread.sleep(5000);
		WebElement cbox = d.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div/div[2]/div/form/div[1]/div[1]/div[1]/div/div[1]/div/div/div[3]/div/div/div/div/div/div"));
		cbox.click();
	}
	

}
