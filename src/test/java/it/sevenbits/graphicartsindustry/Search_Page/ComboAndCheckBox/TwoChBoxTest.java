package it.sevenbits.graphicartsindustry.Search_Page.ComboAndCheckBox;

import java.sql.DriverManager;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import com.thoughtworks.selenium.webdriven.commands.WaitForCondition;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TwoChBoxTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
   public void setUp() throws Exception {
    //driver = new FirefoxDriver();
    System.setProperty("webdriver.chrome.driver", "src/test/java/it/sevenbits/graphicartsindustry/ChromeDriver//chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "http://polygraphy:gjkbuhfabz@polygraphy.7bits.it";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

// оплата наличными + выдает чек + заказ по  email
  @Test
  public void testTwoCheckCash() throws Exception {
      driver.get(baseUrl + "/");

    WebElement we = driver.findElement(By.id("item11"));        //оплата наличными
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);

    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Полиграф']/..")) ;
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
  }
// расчет по карте + выдает чек + заказ по  email
@Test
  public void testTwoCheckCashless() throws Exception {
    driver.get(baseUrl + "/");

    WebElement we = driver.findElement(By.id("item12"));        //расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);

    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
 }
// оплата по счету + выдает чек + заказ по  email
@Test
  public void testTwoCheckPayment() throws Exception {
      driver.get(baseUrl + "/");

    WebElement we = driver.findElement(By.id("item13"));        //оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email 
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);    
 
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
 }
// самовывоз + выдает чек + заказ по  email
@Test
  public void testTwoCheckPickup() throws Exception {
      driver.get(baseUrl + "/");

      WebElement we = driver.findElement(By.id("item21"));          //самовывоз
      JavascriptExecutor executor = (JavascriptExecutor)driver;
      executor.executeScript("arguments[0].click();", we);
      WebElement wee = driver.findElement(By.id("check1"));         //выдает чек
      JavascriptExecutor executore = (JavascriptExecutor)driver;
      executore.executeScript("arguments[0].click();", wee);
      WebElement ch = driver.findElement(By.id("check2"));          //заказ по  email
      JavascriptExecutor performer = (JavascriptExecutor)driver;
      performer.executeScript("arguments[0].click();", ch);    
 
      driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
      driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
      driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
      driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
      driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
      driver.findElement(By.xpath(".//*[text()='Марка']/.."));
      driver.findElement(By.xpath(".//*[text()='55Print']/.."));
      driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
      driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
      driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
      driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
      driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
      driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
      driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
      driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
      driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
      driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
      driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
      driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
      driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
      driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
  }

//доставка с курьером + выдает чек + заказ по  email
@Test
  public void testTwoCheckCourier() throws Exception {
    driver.get(baseUrl + "/");


   WebElement we = driver.findElement(By.id("item22"));       //доставка с курьером
   JavascriptExecutor executor = (JavascriptExecutor)driver;
   executor.executeScript("arguments[0].click();", we);
   WebElement wee = driver.findElement(By.id("check1"));      //выдает чек
   JavascriptExecutor executore = (JavascriptExecutor)driver;
   executore.executeScript("arguments[0].click();", wee);
   WebElement ch = driver.findElement(By.id("check2"));       //заказ по  email
   JavascriptExecutor performer = (JavascriptExecutor)driver;
   performer.executeScript("arguments[0].click();", ch);     

   driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
   driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
   driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
   driver.findElement(By.xpath(".//*[text()='55Print']/.."));
   driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
   driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
   driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
   driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
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
