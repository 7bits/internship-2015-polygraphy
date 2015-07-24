package it.sevenbits.graphicartsindustry;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CashTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
   public void setUp() throws Exception {
    //driver = new FirefoxDriver();
    System.setProperty("webdriver.chrome.driver", "/home/nastya/selenium for chrome//chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "http://polygraphy.7bits.it";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCash() throws Exception {
    driver.get(baseUrl + "/");
    new Select(driver.findElement(By.name("paymentMethod"))).selectByVisibleText("Наличный расчет");
    driver.findElement(By.cssSelector("button.submit")).click();


    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[2]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[3]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[4]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[5]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[6]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[7]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[8]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[9]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[10]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[11]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[12]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[13]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[14]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[15]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[16]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[17]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[18]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[19]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[20]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[21]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[22]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[23]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[24]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[25]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[26]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[27]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[28]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[29]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[30]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[31]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[32]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[33]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[34]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[35]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[36]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[37]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[38]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[39]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[40]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[41]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[42]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[43]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[44]")).getText();
    driver.findElement(By.xpath(".//*[@id='polygraphiesList']/ul/li[45]")).getText();

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