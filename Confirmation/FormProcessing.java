package LinkedInLearning.Confirmation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormProcessing {

	  public static void FormPage(WebDriver driver) {
		  WebElement Fname=driver.findElement(By.id("first-name"));
	      Fname.sendKeys("Indian");
	      
	      WebElement Lname=driver.findElement(By.id("last-name"));
	      Lname.sendKeys("Wells");
	     
	      WebElement job=driver.findElement(By.id("job-title"));
	      job.sendKeys("Tournament Director");
	     
	      WebElement radioBtn=driver.findElement(By.id("radio-button-2"));
		    radioBtn.click();
	      
	      WebElement chkBox=driver.findElement(By.id("checkbox-3"));
		    chkBox.click();
	      
		    WebElement dropdown1=driver.findElement(By.id("select-menu"));
	      dropdown1.click();
	      
	      driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	      WebElement dropdown2=driver.findElement(By.xpath("//*[@id=\"select-menu\"]/option[4]"));
	      dropdown2.click();
	      
	      WebElement datefield=driver.findElement(By.id("datepicker"));
	      datefield.sendKeys("08/08/2020");
	      datefield.sendKeys(Keys.RETURN);
	      	     
	      driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	      WebElement submitbtn= driver.findElement(By.cssSelector("a[class='btn btn-lg btn-primary']"));   
	      submitbtn.click();
		  } 
	
}
