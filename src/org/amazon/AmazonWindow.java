package org.amazon;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWindow {
	static WebDriver driver;
	int i=1;
	private void addtocart() throws InterruptedException, IOException
	{
		String firstWindow = driver.getWindowHandle();
		
		System.out.println("the firstwindow id is"+firstWindow);
		Set<String> FirstChild = driver.getWindowHandles();
		for (String x:FirstChild)
		{
			if(!firstWindow.equals(x))
			{
				System.out.println("the child window id is"+x);
				driver.switchTo().window(x);
			}
		}
		Thread.sleep(5000);
		WebElement add1 = driver.findElement(By.name("submit.add-to-cart"));
	    add1.click();
	    Thread.sleep(2000);
	    TakesScreenshot tk5 = (TakesScreenshot)driver;
		File source1=tk5.getScreenshotAs(OutputType.FILE);
		File destin1=new File("C:\\Users\\livin\\lizia\\AmazonAdd\\screenshot\\first"+i+".png");
		FileUtils.copyFile(source1,destin1);
		i++;
		driver.close();
		driver.switchTo().window(firstWindow);
	}
	private void reentry() throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyPress(KeyEvent.VK_DELETE);
	}
public static void main(String[]args) throws InterruptedException, IOException, AWTException
{
	System.setProperty("window.chrome.driver","C:\\Users\\livin\\lizia\\AmazonAdd\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=678711876615&hvpos=&hvnetw=g&hvrand=5757185898929653264&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9298829&hvtargid=kwd-10573980&hydadcr=14453_2371562&gclid=CjwKCAiAmZGrBhAnEiwAo9qHiZZix3RT0UWd20rgkyKZkSRf9Uxi6dtHCNTPiTg1uF-rTTzth_rYvRoCCWgQAvD_BwE");
	driver.manage().window().maximize();
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("samsung m34 waterfall blue",Keys.ENTER);
	WebElement samm34 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
	samm34.click();
    AmazonWindow a=new AmazonWindow();
	a.addtocart();
	
	Thread.sleep(5000);
	
	WebElement search1 = driver.findElement(By.id("twotabsearchtextbox"));
	search1.click();
	a.reentry();
	
	search1.sendKeys("iphone 11",Keys.ENTER);
	WebElement iphone = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
	iphone.click();
    a.addtocart();
    WebElement search2 = driver.findElement(By.id("twotabsearchtextbox"));
	search2.click();
	a.reentry();
	
	search2.sendKeys("moto g84 5g",Keys.ENTER);
	WebElement moto = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));
	moto.click();
    a.addtocart();
    WebElement search3 = driver.findElement(By.id("twotabsearchtextbox"));
	search3.click();
	a.reentry();
	
	search3.sendKeys("redmi note 12 pro",Keys.ENTER);
	WebElement redmi = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
	redmi.click();
    a.addtocart();
    WebElement search4 = driver.findElement(By.id("twotabsearchtextbox"));
	search4.click();
	a.reentry();
	
	search4.sendKeys("samsung m13",Keys.ENTER);
	WebElement sam = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));
	sam.click();
    a.addtocart();
    WebElement search5 = driver.findElement(By.id("twotabsearchtextbox"));
	search5.click();
	a.reentry();
	
	search5.sendKeys("oppo 5g mobile phone",Keys.ENTER);
	WebElement oppo = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
	oppo.click();
    a.addtocart();
    WebElement search6 = driver.findElement(By.id("twotabsearchtextbox"));
	search6.click();
	a.reentry();
	
	search6.sendKeys("realme 5g mobile",Keys.ENTER);
	WebElement real = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
	real.click();
    a.addtocart();
	
}

}
