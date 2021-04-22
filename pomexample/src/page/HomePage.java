package page;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class HomePage {
 
 private ChromeDriver driver;
 
 //Constructor that will be automatically called as soon as the object of the class is created
 public HomePage(ChromeDriver driver) {
 this.driver=driver;
 }
 
 //Locator for login button
 By LoginBtn = By.id("login");
 
 //Method to click login button
 public void clickLogin() {
 driver.findElement(LoginBtn).click();
 }
}

