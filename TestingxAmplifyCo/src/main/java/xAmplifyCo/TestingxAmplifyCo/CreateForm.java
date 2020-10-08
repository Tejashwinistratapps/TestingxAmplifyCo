package xAmplifyCo.TestingxAmplifyCo;

import java.util.regex.Pattern;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateForm {


	WebDriver driver = Instance.getInstance();
	static Properties properties = PropertiesFile.readPropertyFile("rdata.properties");

  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();



  @Test
  public void testForm() throws Exception {
	  Thread.sleep(1000);
    //driver.get("https://release.xamplify.io/home/dashboard/welcome");
    driver.findElement(By.xpath(properties.getProperty("ClickDesign"))).click();// Click Design module on left menu
    Thread.sleep(5000);
    driver.findElement(By.xpath(properties.getProperty("ClickcreateForm"))).click();// click create form 
    driver.findElement(By.id(properties.getProperty("EnterFormname"))).click();// click form name field
    driver.findElement(By.id(properties.getProperty("EnterFormname"))).clear();// clear data from the form name field
    driver.findElement(By.id(properties.getProperty("EnterFormname"))).sendKeys("AutomationForm"+System.currentTimeMillis());// enter form name
    driver.findElement(By.id(properties.getProperty("EnterDescription"))).click();// click description field
    driver.findElement(By.id(properties.getProperty("EnterDescription"))).clear();// clear data from the description field
    driver.findElement(By.id(properties.getProperty("EnterDescription"))).sendKeys("AutomationForm Description");// enter the data for the description field
    driver.findElement(By.xpath(properties.getProperty("closepopup"))).click();// close pop up window
    driver.findElement(By.xpath(properties.getProperty("clickEmailmodule"))).click();// Click Email module
    driver.findElement(By.xpath(properties.getProperty("firstfield"))).click();// click first field
    driver.findElement(By.xpath(properties.getProperty("firstfield"))).click();// click first field
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(//input[@type='text'])[7] | ]]
    driver.findElement(By.xpath(properties.getProperty("firstfield"))).clear();// clear first field
    driver.findElement(By.xpath(properties.getProperty("firstfield"))).sendKeys("Email ID");// enter data for email id field
    driver.findElement(By.xpath(properties.getProperty("secondfield"))).click();
    driver.findElement(By.xpath(properties.getProperty("secondfield"))).sendKeys("please enter your mail id");
    driver.findElement(By.xpath(properties.getProperty("firstnamemodule"))).click();// click first name module
    driver.findElement(By.xpath(properties.getProperty("secondfield"))).clear();// clear first name Field Placeholder Text 
    driver.findElement(By.xpath(properties.getProperty("secondfield"))).sendKeys("Please enter your FirstName");// enter data for first name Field Placeholder Text 
    driver.findElement(By.xpath(properties.getProperty("firstfield"))).click(); // click first name Field Label*
    driver.findElement(By.xpath(properties.getProperty("firstfield"))).click();// click first name Field Label*
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(//input[@type='text'])[7] | ]]
    driver.findElement(By.xpath(properties.getProperty("firstfield"))).click();// click first name Field Label*
    driver.findElement(By.xpath(properties.getProperty("firstfield"))).clear();// clear  first name Field Label*
    driver.findElement(By.xpath(properties.getProperty("firstfield"))).sendKeys("First Name");
    driver.findElement(By.xpath(properties.getProperty("secondfield"))).click();
    driver.findElement(By.xpath(properties.getProperty("secondfield"))).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(//input[@type='text'])[8] | ]]
    driver.findElement(By.xpath(properties.getProperty("secondfield"))).click(); // 
    driver.findElement(By.linkText("Last Name")).click();
    driver.findElement(By.xpath(properties.getProperty("secondfield"))).clear();
    driver.findElement(By.xpath(properties.getProperty("secondfield"))).sendKeys("Please enter your LastName");
    driver.findElement(By.xpath(properties.getProperty("firstfield"))).click();
    driver.findElement(By.xpath(properties.getProperty("firstfield"))).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(//input[@type='text'])[7] | ]]
    driver.findElement(By.xpath(properties.getProperty("firstfield"))).click();
    driver.findElement(By.xpath(properties.getProperty("firstfield"))).clear();
    driver.findElement(By.xpath(properties.getProperty("firstfield"))).sendKeys("Last Name");
    driver.findElement(By.xpath(properties.getProperty("secondfield"))).click();
    driver.findElement(By.xpath(properties.getProperty("secondfield"))).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(//input[@type='text'])[8] | ]]
    driver.findElement(By.xpath(properties.getProperty("secondfield"))).click();
    driver.findElement(By.xpath(properties.getProperty("secondfield"))).click();
    driver.findElement(By.xpath(properties.getProperty("secondfield"))).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(//input[@type='text'])[8] | ]]
    driver.findElement(By.xpath(properties.getProperty("secondfield"))).click();
    driver.findElement(By.xpath(properties.getProperty("mobinumbermodule"))).click();// click mobile number module
    driver.findElement(By.xpath(properties.getProperty("secondfield"))).clear();
    driver.findElement(By.xpath(properties.getProperty("secondfield"))).sendKeys("Please enter your Mobile Number");
    driver.findElement(By.xpath(properties.getProperty("firstfield"))).click();
    driver.findElement(By.xpath(properties.getProperty("firstfield"))).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(//input[@type='text'])[7] | ]]
    driver.findElement(By.xpath(properties.getProperty("firstfield"))).click();
    driver.findElement(By.xpath(properties.getProperty("firstfield"))).clear();
    driver.findElement(By.xpath(properties.getProperty("firstfield"))).sendKeys("MobileNUmber");
    driver.findElement(By.xpath(properties.getProperty("secondfield"))).click();
    driver.findElement(By.xpath(properties.getProperty("secondfield"))).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(//input[@type='text'])[8] | ]]
    driver.findElement(By.xpath(properties.getProperty("secondfield"))).click();
    driver.findElement(By.xpath("//a[@id='drag-div']/h4")).click();
    driver.findElement(By.xpath("//div[@id='edit-from-div']/div/div/fieldset/div[3]/switch/div/div/span[3]")).click();
    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=responseMessage | ]]
    Thread.sleep(10000);
    driver.findElement(By.id("responseMessage")).click();
    
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}



