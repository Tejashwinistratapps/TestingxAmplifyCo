package xAmplifyCo.TestingxAmplifyCo;


import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ManageForms {
	WebDriver driver = Instance.getInstance();

  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  

  @Test
  public void testManageForms() throws Exception {
    driver.get("https://release.xamplify.io/home/dashboard");
    Thread.sleep(5000);
    driver.findElement(By.linkText("Design")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[2]/div/div/div[4]/h5/a/span")).click();
    Thread.sleep(5000);
    /* 
    driver.findElement(By.xpath("//td[@id='actions-row']/div/a/i")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@id='custom-fields-div']/div/div[2]/div/div/button")).click();
    driver.findElement(By.xpath("//div[@id='custom-fields-div']/div/div[4]/div/div/button")).click();
    driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-add-form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/fieldset[1]/div[1]/legend[1]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
    Thread.sleep(1000);
/*    driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("Email ID11");
    driver.findElement(By.xpath("(//input[@type='text'])[9]")).click();
    driver.findElement(By.xpath("(//a[@id='drag-div']/h4)[2]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[9]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("Please enter your FirstName");
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("First Name11");
    driver.findElement(By.xpath("(//input[@type='text'])[9]")).click();
    driver.findElement(By.xpath("(//a[@id='drag-div']/h4)[3]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[9]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("Please enter your LastName1");
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("Last Name11");
    driver.findElement(By.xpath("(//input[@type='text'])[9]")).click();
    driver.findElement(By.xpath("(//a[@id='drag-div']/h4)[4]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[9]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("Please enter your Mobile Number1");
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("MobileNUmber11");
    driver.findElement(By.xpath("(//input[@type='text'])[9]")).click();
    driver.findElement(By.xpath("(//a[@id='drag-div']/h4)[5]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[9]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("Email");
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("Email1");
    driver.findElement(By.xpath("(//input[@type='text'])[9]")).click();
    driver.findElement(By.xpath("(//a[@id='drag-div']/h4)[6]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[9]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("Field-61");
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("Field-611");
    driver.findElement(By.xpath("(//input[@type='text'])[9]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[9]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("Field-611");
    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//td[@id='actions-row']/div/a[2]/i")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
    driver.findElement(By.xpath("//td[@id='actions-row']/div/a[3]/i")).click();*/
    driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-manage-form[1]/div[1]/div[3]/div[1]/div[1]/section[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/a[3]/i[1]")).click();
    driver.findElement(By.linkText("Copy Link")).click(); 
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='form-url-modal']//a[@class='btn btn-default'][contains(text(),'Close')]")).click();
    Thread.sleep(1000);

    
    
    ((JavascriptExecutor)driver).executeScript("window.open()");
    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1));
    
    driver.get("https://www.facebook.com/");
    driver.findElement(By.cssSelector("Body")).clear();
    Thread.sleep(2000);
   
  // WebElement cpypast = driver.findElement(By.cssSelector("Body"));
   Actions cpypast = new Actions(driver); 

   Action copy = cpypast.sendKeys(Keys.CONTROL).sendKeys("V").build();
   copy.perform();
   Thread.sleep(2000);
   driver.findElement(By.cssSelector("Body")).sendKeys(Keys.RETURN);

   /*driver.findElement(By.cssSelector("Body")).click();
    driver.findElement(By.cssSelector("Body")).sendKeys(Keys.chord(Keys.LEFT_CONTROL, "v"));
    driver.findElement(By.cssSelector("Body")).sendKeys(Keys.RETURN);*/
    /*String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
    driver.findElement(By.linkText("https://stackoverflow.com/questions/17547473/how-to-open-a-new-tab-using-selenium-webdriver")).sendKeys(selectLinkOpeninNewTab);*/
   
    
    
    /* driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL + "t");
    System.out.println("new tab opened");*/
    
   /* ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1)); //switches to new tab
    driver.get("https://www.facebook.com");

    driver.switchTo().window(tabs.get(0)); // switch back to main screen 
    
    driver.get("https://www.news.google.com");*/
    
    
    
    
    /*driver.findElement(By.xpath("//div[@id='form-url-modal']/div/div/div[2]/app-response-message/div/div/h4")).click();
    driver.findElement(By.linkText("Close")).click();
    driver.findElement(By.xpath("//a[@id='template-delete']/i")).click();
    driver.findElement(By.xpath("//body/div/div[2]/button")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[2]/i")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div/span/i")).click();
    driver.findElement(By.xpath("//select")).click();
    new Select(driver.findElement(By.xpath("//select"))).selectByVisibleText("Name (A-Z)");
    driver.findElement(By.xpath("//select")).click();
    driver.findElement(By.xpath("//select")).click();
    new Select(driver.findElement(By.xpath("//select"))).selectByVisibleText("Name (Z-A)");
    driver.findElement(By.xpath("//select")).click();
    driver.findElement(By.xpath("//select")).click();
    new Select(driver.findElement(By.xpath("//select"))).selectByVisibleText("Name (A-Z)");
    driver.findElement(By.xpath("//select")).click();
    driver.findElement(By.xpath("//select")).click();
    new Select(driver.findElement(By.xpath("//select"))).selectByVisibleText("Created On (ASC)");
    driver.findElement(By.xpath("//select")).click();
    driver.findElement(By.xpath("//select")).click();
    new Select(driver.findElement(By.xpath("//select"))).selectByVisibleText("Created On (DESC)");
    driver.findElement(By.xpath("//select")).click();
    driver.findElement(By.xpath("//select")).click();
    new Select(driver.findElement(By.xpath("//select"))).selectByVisibleText("Updated On (ASC)");
    driver.findElement(By.xpath("//select")).click();
    driver.findElement(By.xpath("//select")).click();
    new Select(driver.findElement(By.xpath("//select"))).selectByVisibleText("Updated On (DESC)");
    driver.findElement(By.xpath("//select")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Automation");
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(Keys.ENTER);
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div/div/div/div[2]/div/button")).click();
    Thread.sleep(2000);*/
    
    
    
   
    //---------------------------------------------------------//
   /* driver.findElement(By.xpath("//div/div/ul/li[4]/a/span")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[2]/div/div/div[4]/h5/a/span")).click();
    Thread.sleep(5000);

    driver.findElement(By.xpath("//td[@id='actions-row']/div/a/i")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//a[@id='drag-div']/h4")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[7]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[7]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("Email ID1");
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("Emailplease enter your mail id1");
    driver.findElement(By.xpath("//div[@id='edit-from-div']/div/div/fieldset/div[3]/switch/div/div")).click();
    driver.findElement(By.xpath("//div[@id='edit-from-div']/div/div/fieldset/div[3]/switch/div/div")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-add-form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/fieldset[1]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[7]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[7]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("First Name1");
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).click();
    driver.findElement(By.xpath("(//a[@id='drag-div']/h4)[3]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("Please enter your LastName");
    driver.findElement(By.xpath("(//input[@type='text'])[7]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[7]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("Last Name1");
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("Please enter your LastName1");
    driver.findElement(By.xpath("//div[@id='edit-from-div']/div/div/fieldset/div[3]/switch/div/div")).click();
    driver.findElement(By.xpath("(//a[@id='drag-div']/h4)[4]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[7]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[7]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("MobileNUmber1");
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("Please enter your Mobile Number1");
    driver.findElement(By.xpath("//div[@id='custom-fields-div']/div/div[4]/div/div/button")).click();
    driver.findElement(By.xpath("//div[@id='custom-fields-div']/div/div[2]/div/div/button")).click();
    driver.findElement(By.xpath("(//a[@id='drag-div']/h4)[6]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("Field-61");
    driver.findElement(By.xpath("(//input[@type='text'])[9]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[9]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("Field-61");
    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//td[@id='actions-row']/div/a[2]/i")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
    driver.findElement(By.xpath("//td[@id='actions-row']/div/a[3]/i")).click();
    driver.findElement(By.linkText("Copy Link")).click();
    driver.findElement(By.xpath("//div[@id='form-url-modal']/div/div/div[2]/app-response-message/div/div/h4")).click();
    driver.findElement(By.linkText("Close")).click();
    driver.findElement(By.xpath("//a[@id='template-delete']/i")).click();
    driver.findElement(By.xpath("//body/div/div[2]/button")).click();
    driver.findElement(By.xpath("//span[2]/i")).click();
    driver.findElement(By.xpath("//div/span/i")).click();
    driver.findElement(By.xpath("//select")).click();
    new Select(driver.findElement(By.xpath("//select"))).selectByVisibleText("Name (A-Z)");
    driver.findElement(By.xpath("//select")).click();
    driver.findElement(By.xpath("//select")).click();
    new Select(driver.findElement(By.xpath("//select"))).selectByVisibleText("Name (Z-A)");
    driver.findElement(By.xpath("//select")).click();
    driver.findElement(By.xpath("//select")).click();
    new Select(driver.findElement(By.xpath("//select"))).selectByVisibleText("Name (A-Z)");
    driver.findElement(By.xpath("//select")).click();
    driver.findElement(By.xpath("//select")).click();
    new Select(driver.findElement(By.xpath("//select"))).selectByVisibleText("Created On (ASC)");
    driver.findElement(By.xpath("//select")).click();
    driver.findElement(By.xpath("//select")).click();
    new Select(driver.findElement(By.xpath("//select"))).selectByVisibleText("Created On (DESC)");
    driver.findElement(By.xpath("//select")).click();
    driver.findElement(By.xpath("//select")).click();
    new Select(driver.findElement(By.xpath("//select"))).selectByVisibleText("Updated On (ASC)");
    driver.findElement(By.xpath("//select")).click();
    driver.findElement(By.xpath("//select")).click();
    new Select(driver.findElement(By.xpath("//select"))).selectByVisibleText("Updated On (DESC)");
    driver.findElement(By.xpath("//select")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Automation");
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("//div/div/div/div[2]/div/button")).click();
    driver.findElement(By.id("myBtn")).click();*/
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


