package com.apexit.Stepdefinitions;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActions {

	public TestActions() throws Exception{
		super();
	}
	
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		Actions action = new Actions(driver); 
		Action SiriesofActions;
		String ImgPath="C:\\Users\\sunitha.reddy\\OneDrive - Apex IT\\Pictures\\Screenshots\\FaceBookerror.PNG";
		File tempFile,PermanantFile;
		WebDriverWait wait;
		TakesScreenshot screenShot;
		
				
		
		public void invokebrowser() throws Exception {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			System.out.println("Login to TrailHead");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
  		    driver.get("http://www.facebook.com");
  		    LoginFacebook();
	}
		
		
		
		
		
		
		
		
		
		
		
		public void TestActionsFaceBook() {
			SiriesofActions = action.moveToElement(driver.findElement(By.id("email"))).click().keyDown(Keys.SHIFT)
					.sendKeys("sunitha").keyUp(Keys.SHIFT).doubleClick().contextClick().build();			
			SiriesofActions.perform();
		}
		
		public void LoginFacebook() {
			SiriesofActions = action.moveToElement(driver.findElement(By.id("email")))
					.sendKeys("sunitha").sendKeys(Keys.TAB).sendKeys("sunitha").sendKeys(Keys.ENTER)
					.sendKeys(Keys.TAB).click().build();			
			SiriesofActions.perform();
		}
		
		public void sceenshots() {
			
			try {
				PermanantFile=new File(ImgPath);
				
				if(PermanantFile.exists()) {
					throw new Exception("File already exists");
				}
				screenShot=(TakesScreenshot)driver;
				tempFile=screenShot.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(tempFile,PermanantFile);
				
				 
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		public static void main(String[] args) throws Exception {
			TestActions test=new TestActions();
			test.invokebrowser();
			test.sceenshots();
		}
}
