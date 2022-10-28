package com.apexit.Stepdefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class TestGetCommands {
	public TestGetCommands() throws Exception{
		super();
	}
	
	WebDriver driver=new ChromeDriver();
	Actions action = new Actions(driver); 
	WebDriverWait wait;

	public void invokebrowser() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.out.println("Login to TrailHead");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//In the WebDriver interface, we use two different methods for navigating or accessing any website i.e. driver.get() and driver.navigate().to().
		//GetCommandsFK();
		GetCommandsPTM();
	}
	public void GetCommandsFK() {
		driver.get("http://www.flipkart.com");
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		String title=driver.getTitle();
		System.out.println("the title of page is"+title);
		driver.findElement(By.xpath("//span[contains(text(),'Become a Seller')]")).click();
		String currenturl=driver.getCurrentUrl();
		System.out.println("the currenturl of page is"+currenturl);
		String SubHeader =driver.findElement(By.xpath("//a[normalize-space()='Fee Structure']")).getText();
		System.out.println("the SubHeader of page is"+SubHeader);
		System.out.println("the Pgae source of page is"+driver.getPageSource());

	}
	public void GetCommandsPTM() throws Exception {
		driver.get("http://www.paytm.com");
		wait=new WebDriverWait(driver,Duration.ofSeconds(3));
		WebElement Element1=driver.findElement(By.xpath("//img[contains(@src,'https://assetscdn1.paytm.com/images/catalog/view_item/733299/1626251017535.png')]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
	    executor.executeScript("arguments[0].scrollIntoView(true);", Element1);
	    executor.executeScript("arguments[0].click();", Element1);
		Thread.sleep(1000);

	    /*WebElement element=driver.findElement(By.xpath("//label[normalize-space()='Prepaid']//input[@id='radio0']"));//label[contains(text(),'Prepaid')]"));
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		//Thread.sleep(1000);
		//element.click();
	//	Actions action = new Actions(driver); 
	action.moveToElement(Element1).click().perform();*/

		
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9999999999");
		driver.findElement(By.xpath("//input[@autocomplete='off']")).click();
		//driver.findElement(By.xpath("//span[normalize-space()='Airtel']")).click();
		
		
          List<WebElement> options= driver.findElements(By.xpath("//div[@class='_3xI1']//ul/child::li"));
		 // getting the list of options in the dropdown with getOptions()
		  for (int i=0;i<= options.size()-1;i++) {
		  WebElement ActProduct=options.get(i);
		  if(ActProduct.getText().equals("Vi")) {
		  System.out.println(ActProduct.getText() + " is selected");
		  ActProduct.click();
		  break;
		  }else {
		  System.out.println(ActProduct.getText() + " is not selected");
		  }
		  }
		  Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[type='text'][maxlength='30']")).sendKeys("100");
		/*WebElement FFchkbox=driver.findElement(By.xpath("//i[contains(@class,'icon-fastforward')]/preceding-sibling::i"));
		if(FFchkbox.isSelected()==false) {
		FFchkbox.click();	
		}*/
		Thread.sleep(5000);
		WebElement RechargeNow=driver.findElement(By.xpath("//button[normalize-space()='Proceed to Pay Bill']"));
		//if(RechargeNow.isEnabled()==false) {
			//RechargeNow.click();	
			action.moveToElement(RechargeNow).click().perform();

		//}
		//button[normalize-space()='Recharge Now']
		//input[@name='Fast Forward']
	}
	public void Closebrowser() {
		driver.quit();
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TestGetCommands commands=new TestGetCommands();
		commands.invokebrowser();
		commands.Closebrowser();
	}

}
