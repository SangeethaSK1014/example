package test;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import page.dashboardPage;
import page.HomePage;
import page.loginPage;
 
public class Logintest {
 
 public static void main(String[] args) throws InterruptedException {
 
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sangeetha S K\\Downloads\\chromedriver_win32\\chromedriver.exe");
 ChromeDriver driver = new ChromeDriver();
 driver.get("https://www.demoqa.com/books");
 
 //Creating object of home page
 HomePage home = new HomePage(driver);
 
 //Creating object of Login page
 loginPage login = new loginPage(driver);
 
 //Creating object of Dashboard
 dashboardPage dashboard = new dashboardPage(driver);
 
 //Click on Login button
 home.clickLogin();
 
 //Enter username & password
 login.enterUsername("sahanya");
 login.enterPassword("sangeehr");
 
 //Click on login button
 login.clickLogin();
 Thread.sleep(3000);
 
 
 //Capture the page heading and print on console
 System.out.println("The page heading is --- " +dashboard.getHeading());
 
 //Click on Logout button
 dashboard.clickLogout();
 
               //Close browser instance
               driver.quit();
 }
 
}
