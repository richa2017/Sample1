package pages;

import static org.junit.Assume.assumeNoException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import utils.Driver;

public class Page {

    private WebDriver driver = Driver.getDriver();


    public void getUrl(final String url) {
        driver.navigate().to(url);
    }
    
    public void enterUname(String Uname) {
    	driver.findElement(By.xpath("//*[@class='ssrcss-qgttmg-AccountText eki2hvo4']")).click();
    	//username
    	driver.findElement(By.cssSelector("input[name='username']")).sendKeys(Uname);
    	
    }
    
    public void enterPwd(String pwd) {
    	
    	driver.findElement(By.cssSelector("input[name='password']")).sendKeys(pwd);
    	
    }
    
    public void signin() {
    	//submit-button
    	driver.findElement(By.id("submit-button")).click();
    	
    	
    }

}