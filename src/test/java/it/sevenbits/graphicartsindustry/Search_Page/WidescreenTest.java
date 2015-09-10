// все тесты, связанные с чекбоксом "широкоформатная печать"
package it.sevenbits.graphicartsindustry.Search_Page;

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


public class WidescreenTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
   public void setUp() throws Exception {
    //driver = new FirefoxDriver();
    System.setProperty("webdriver.chrome.driver", "src/test/java/it/sevenbits/graphicartsindustry/Drivers//chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "http://polygraphy:gjkbuhfabz@polygraphy.7bits.it";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

// + наличный расчет
  @Test
  public void testCash() throws Exception {
      driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement wee = driver.findElement(By.id("item11"));        // наличный расчет
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Изба-принт']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Медиаплюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
    driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
    driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт Экспресс']/.."));
    driver.findElement(By.xpath(".//*[text()='Ретранс']/.."));
  }

// + расчет по карте
@Test
  public void testCashless() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item12"));          // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
 
    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
  }

// + оплата по счету
@Test
  public void testPayment() throws Exception {
      driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item13"));           // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
 
    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Изба-принт']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
    driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Ретранс']/.."));
  }

// + Самовывоз 
@Test
  public void testPickup() throws Exception {
      driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item21"));           // Самовывоз
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);

    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Изба-принт']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Медиаплюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
    driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
    driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт Экспресс']/.."));
    driver.findElement(By.xpath(".//*[text()='Ретранс']/.."));
  }

// + Доставка с курьером
@Test
  public void testCourier() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item22"));          // Доставка с курьером
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
 
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
 }

// выдает чек
@Test
  public void testCheck() throws Exception {
      driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("check1"));          // выдает чек
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
   
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Изба-принт']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт Экспресс']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='Медиаплюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
    driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Ретранс']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }

// + Принимает заказ по email
@Test
  public void testEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }

// + выдает чек + принимает заказ по email
  @Test
  public void testCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("check1"));           // выдает чек
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// + Наличный расчет + Самовывоз
@Test
  public void testCashPickup() throws Exception {
      driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item11"));          // Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));         // Самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Изба-принт']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Медиаплюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
    driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
    driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт Экспресс']/.."));
    driver.findElement(By.xpath(".//*[text()='Ретранс']/.."));
  }

// + Наличный расчет + Доставка с курьером
  @Test
  public void testCachCourier() throws Exception {
      driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item11"));         // Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));        // Доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
  }

// + Оплата по счету + Самовывоз
  @Test
  public void testPaymentPickup() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item13"));           // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          // Самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Изба-принт']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
    driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Ретранс']/.."));
  }
// + Оплата по счету + Доставка с курьером
  @Test
  public void testPaymentCourier() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item13"));           // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          // Доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
  }
// + Расчет по карте + Самовывоз
  @Test
  public void testCashlessPickup() throws Exception {
    driver.get(baseUrl + "/");


    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item12"));           // Расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          //Самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
  }
// + Расчет по карте + Доставка с курьером
  @Test
  public void testCashlessCourier() throws Exception {
    driver.get(baseUrl + "/");


    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);

   WebElement we = driver.findElement(By.id("item12"));           // Расчет по карте
   JavascriptExecutor executor = (JavascriptExecutor)driver;
   executor.executeScript("arguments[0].click();", we);
   WebElement wee = driver.findElement(By.id("item22"));          // Доставка с курьером
   JavascriptExecutor executore = (JavascriptExecutor)driver;
   executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
  }
// + Наличный расчет + Выдает чек
  @Test
  public void testCashCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item11"));           // Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Изба-принт']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Медиаплюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
    driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
    driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт Экспресс']/.."));
    driver.findElement(By.xpath(".//*[text()='Ретранс']/.."));
  }
// + Оплата по счету + Выдает чек
  @Test
  public void testPaymentCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item13"));           // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          //Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Изба-принт']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
    driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Ретранс']/.."));
  }
// + Расчет по карте + Выдает чек
  @Test
  public void testCashlessCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item12"));           // Расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
  }
// + Самовывоз + Выдает чек
  @Test
  public void testPickupCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item21"));           // Самовывоз
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          //Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Изба-принт']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Медиаплюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
    driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
    driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт Экспресс']/.."));
    driver.findElement(By.xpath(".//*[text()='Ретранс']/.."));
  }
// + Доставка с курьером + Выдает чек
  @Test
  public void testCourierCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item22"));           // Доставка с курьером
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
  }
// + Наличный расчет + Принимает заказ по email
  @Test
  public void testCashEmail() throws Exception {
    driver.get(baseUrl + "/");


    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);

   WebElement we = driver.findElement(By.id("item11"));           // Наличный расчет
   JavascriptExecutor executor = (JavascriptExecutor)driver;
   executor.executeScript("arguments[0].click();", we);
   WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
   JavascriptExecutor executore = (JavascriptExecutor)driver;
   executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// + Оплата по счету + Принимает заказ по email
  @Test
  public void testPaymentEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item13"));           // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
  }
// + Расчет по карте + Принимает заказ по email
  @Test
  public void testCashlessEmail() throws Exception {
    driver.get(baseUrl + "/");


    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);

   WebElement we = driver.findElement(By.id("item12"));           // Расчет по карте
   JavascriptExecutor executor = (JavascriptExecutor)driver;
   executor.executeScript("arguments[0].click();", we);
   WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
   JavascriptExecutor executore = (JavascriptExecutor)driver;
   executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
  }
// + Самовывоз + Принимает заказ по email
  @Test
  public void testPickupEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item21"));           // Самовывоз
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// + Доставка с курьером + Принимает заказ по email
  @Test
  public void testCourierEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item22"));           // Доставка с курьером
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
  }
// + наличный расчет + самовывоз + выдает чек
  @Test
  public void testCashPickupCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item11"));           // наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          // самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
 
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Изба-принт']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Медиаплюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
    driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
    driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт Экспресс']/.."));
    driver.findElement(By.xpath(".//*[text()='Ретранс']/.."));
  }
// + наличный расчет + доставка с курьером + выдает чек
  @Test
  public void testCashCourierCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item11"));           // наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          //доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
 
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
  }
// + оплата по счету + доставка с курьером + выдает чек
  @Test
  public void testCashlessPaymentCourierCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item13"));           // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          //доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
     WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);

    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
  }
// + оплата по счету + самовывоз + выдает чек
  @Test
  public void testPaymentPickupCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item13"));           // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          //самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
 
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Изба-принт']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
    driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Ретранс']/.."));
  }
// + расчет по карте + доставка с курьером + выдает чек
  @Test
  public void testCashlessCourierCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item12"));           // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          //доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
 
    driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
  }
// + расчет по карте + самовывоз + выдает чек
  @Test
  public void testCashlessPickupCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item12"));           // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));               // самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
 
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
  }
// + наличный расчет + самовывоз + заказ по  email
  @Test
  public void testCashPickupEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item11"));           // наличный расчет 
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          //самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// + наличный расчет + доставка с курьером + заказ по  email
  @Test
  public void testCashCourierEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item11"));           // наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          // доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
  }
// + оплата по счету + доставка с курьером + заказ по  email
  @Test
  public void testPaymentCourierEmail() throws Exception {
    driver.get(baseUrl + "/");
 
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item13"));           // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          // доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
  }
// + оплата по счету + самовывоз + заказ по  email
  @Test
  public void testPaymentPickupEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item13"));           // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          //самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
  }
// + расчет по карте + доставка с курьером + заказ по  email
  @Test
  public void testCashlessCourierEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item12"));           // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          // доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch); 
 
    driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
  }
// + расчет по карте + самовывоз + заказ по  email
  @Test
  public void testCashlessPickupEmail() throws Exception {
    driver.get(baseUrl + "/");

     WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item12"));           // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          // самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
  }
// + оплата наличными + выдает чек + заказ по  email
  @Test
  public void testCashCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item11"));           // оплата наличными
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// + оплата по счету + выдает чек + заказ по  email
  @Test
  public void testPaymentCheckEmail() throws Exception {
    driver.get(baseUrl + "/");


    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);

   WebElement we = driver.findElement(By.id("item13"));           // оплата по счету
   JavascriptExecutor executor = (JavascriptExecutor)driver;
   executor.executeScript("arguments[0].click();", we);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
  }
// + расчет по карте + выдает чек + заказ по  email
  @Test
  public void testCashlessCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item12"));           // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
  }
// + самовывоз + выдает чек + заказ по  email
  @Test
  public void testPickupCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item21"));           // самовывоз
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// + доставка с курьером + выдает чек + заказ по  email
  @Test
  public void testCourierCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item22"));           // доставка с курьером
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
  }
// + наличный расчет + самовывоз + выдает чек + заказ по  email
  @Test
  public void testCashPickupCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item11"));           // наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));              // самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// + наличный расчет + доставка с курьером + выдает чек + заказ по  email
  @Test
  public void testCashCourierCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item11"));           // наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          // доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
  }
// + Оплата по счету + доставка с курьером + выдает чек + заказ по  email
  @Test
  public void testPaymentCourierCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item13"));           // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          // доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
  }
// оплата по счету + самовывоз + выдает чек + заказ по  email
  @Test
  public void testPaymentPickupCheckEmail() throws Exception {
    driver.get(baseUrl + "/");


    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);

   WebElement we = driver.findElement(By.id("item13"));           // оплата по счету
   JavascriptExecutor executor = (JavascriptExecutor)driver;
   executor.executeScript("arguments[0].click();", we);
   WebElement wee = driver.findElement(By.id("item21"));          // самовывоз
   JavascriptExecutor executore = (JavascriptExecutor)driver;
   executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
  }
// + расчет по карте + доставка с курьером + выдает чек + заказ по  email
  @Test
  public void testCashlessCourierCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item12"));           // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          // доставка с курьером 
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
  }
// + расчет по карте  + самовывоз + выдает чек + заказ по  email
  @Test
  public void testCashlessPickupCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item12"));           // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          // самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);

    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
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
