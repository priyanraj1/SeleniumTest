package LinkedInLearning.FormPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Confirmation {

	 
	  public static void waitforConfirmation(WebDriver driver) {
    
		  WebDriverWait wait=new WebDriverWait(driver,5);
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));
    
	}
    
	  public static String alertMessage(WebDriver driver) {
		  
	  System.out.println(driver.findElement(By.className("alert")).getText());
    return driver.findElement(By.className("alert")).getText();

	  }
}
