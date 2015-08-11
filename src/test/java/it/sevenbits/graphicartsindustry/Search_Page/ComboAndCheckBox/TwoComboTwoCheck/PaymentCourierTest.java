package it.sevenbits.graphicartsindustry.Search_Page.ComboAndCheckBox.TwoComboTwoCheck;

import java.sql.DriverManager;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


  public class PaymentCourierTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
   public void setUp() throws Exception {
   // driver = new FirefoxDriver();
    System.setProperty("webdriver.chrome.driver", "/home/nastya/internship-2015-polygraphy/src/test/java/it/sevenbits/graphicartsindustry/ChromeDriver/chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "http://polygraphy:gjkbuhfabz@polygraphy.7bits.it";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testPaymentCourier() throws Exception {
    driver.get(baseUrl + "/");

//оплата по счету
    WebElement we = driver.findElement(By.id("item13"));
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
//доставка с курьером
    WebElement wee = driver.findElement(By.id("item22"));
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
//выдает чек
    WebElement che = driver.findElement(By.id("check1"));
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
//заказ по  email
    WebElement ch = driver.findElement(By.id("check2"));
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
   // driver.findElement(By.cssSelector(".extend-submit")).click();

    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
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
