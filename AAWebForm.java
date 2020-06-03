package LinkedInLearning;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import LinkedInLearning.Confirmation.FormProcessing;
import LinkedInLearning.FormPage.Confirmation;

public class AAWebForm {

	  public static void main(String[] args) {

	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Priyan\\Documents\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
	        driver.get("https://formy-project.herokuapp.com/form");

	        FormProcessing formProcessingg=new FormProcessing();
	        formProcessingg.FormPage(driver);
	     
	        Confirmation confirmation=new Confirmation();
	        confirmation.waitforConfirmation(driver);
	        
	        Assert.assertEquals("The form was successfully submitted!",confirmation.alertMessage(driver));
	        
	        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	        driver.quit();
	    }
	}