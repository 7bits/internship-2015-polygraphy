// тесты сервисов (в разделе "часто ищут") комбинированных по 3 и по 4 между собой
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


public class TripleServicesTest {
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
// футболки + кружки + ш/п + наличный расчет
  @Test
  public void testFKShCash() throws Exception {
      driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    mugs.executeScript("arguments[0].click();", mug);
    WebElement wee = driver.findElement(By.id("item11"));        // наличный расчет
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
 }

// футболки + кружки + ш/п + расчет по карте
@Test
  public void testFKShCashless() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    mugs.executeScript("arguments[0].click();", mug);
    WebElement we = driver.findElement(By.id("item12"));          // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
 
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
   
}

// футболки + кружки + ш/п + оплата по счету
@Test
  public void testFKShPayment() throws Exception {
      driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item13"));           // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
 }

// футболки + кружки + ш/п + Самовывоз 
@Test
  public void testFKShPickup() throws Exception {
      driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item21"));           // Самовывоз
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);

    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }

// футболки + кружки + ш/п + Доставка с курьером
@Test
  public void testFKShCourier() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item22"));          // Доставка с курьером
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
   }

// футболки + кружки + ш/п + выдает чек
@Test
  public void testFKShCheck() throws Exception {
      driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("check1"));          // выдает чек
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
   
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
   }

// футболки + кружки + ш/п + Принимает заказ по email
@Test
  public void testFKShEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }

// футболки + кружки + ш/п + выдает чек + принимает заказ по email
  @Test
  public void testFKShCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("check1"));           // выдает чек
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + кружки + ш/п + Наличный расчет + Самовывоз
@Test
  public void testFKShCashPickup() throws Exception {
      driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item11"));          // Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));         // Самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    }

// футболки + кружки + ш/п + Наличный расчет + Доставка с курьером
  @Test
  public void testFKShCachCourier() throws Exception {
      driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item11"));         // Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));        // Доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    }

// футболки + кружки + ш/п + Оплата по счету + Самовывоз
  @Test
  public void testFKShPaymentPickup() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item13"));           // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          // Самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
  }
// футболки + кружки + ш/п + Оплата по счету + Доставка с курьером
  @Test
  public void testFKShPaymentCourier() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item13"));           // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          // Доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
 }
// футболки + кружки + ш/п + Расчет по карте + Самовывоз
  @Test
  public void testFKShCashlessPickup() throws Exception {
    driver.get(baseUrl + "/");


    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item12"));           // Расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          //Самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
  }
// футболки + кружки + ш/п + Расчет по карте + Доставка с курьером
  @Test
  public void testFKShCashlessCourier() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item12"));           // Расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          // Доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
 }
// футболки + кружки + ш/п + Наличный расчет + Выдает чек
  @Test
  public void testFKShCashCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item11"));           // Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + кружки + ш/п + Оплата по счету + Выдает чек
  @Test
  public void testFKShPaymentCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item13"));           // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          //Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
  }
// футболки + кружки + ш/п + Расчет по карте + Выдает чек
  @Test
  public void testFKShCashlessCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item12"));           // Расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
  }
// футболки + кружки + ш/п + Самовывоз + Выдает чек
  @Test
  public void testFKShPickupCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item21"));           // Самовывоз
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          //Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + кружки + ш/п + Доставка с курьером + Выдает чек
  @Test
  public void testFKShCourierCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item22"));           // Доставка с курьером
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// футболки + кружки + ш/п + Наличный расчет + Принимает заказ по email
  @Test
  public void testFKShCashEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);  
    WebElement mug = driver.findElement(By.id("btn2"));           // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item11"));           // Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + кружки + ш/п + Оплата по счету + Принимает заказ по email
  @Test
  public void testFKShPaymentEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item13"));           // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
  }
// футболки + кружки + ш/п + Расчет по карте + Принимает заказ по email
  @Test
  public void testFKShCashlessEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item12"));           // Расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
   }
// футболки + кружки + ш/п + Самовывоз + Принимает заказ по email
  @Test
  public void testFKShPickupEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item21"));           // Самовывоз
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + кружки + ш/п + Доставка с курьером + Принимает заказ по email
  @Test
  public void testFKShCourierEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item22"));           // Доставка с курьером
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
   }
// футболки + кружки + ш/п + наличный расчет + самовывоз + выдает чек
  @Test
  public void testFKShCashPickupCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + кружки + ш/п + наличный расчет + доставка с курьером + выдает чек
  @Test
  public void testFKShCashCourierCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// футболки + кружки + ш/п + оплата по счету + доставка с курьером + выдает чек
  @Test
  public void testFKShCashlessPaymentCourierCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
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

    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// футболки + кружки + ш/п + оплата по счету + самовывоз + выдает чек
  @Test
  public void testFKShPaymentPickupCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
  }
// футболки + кружки + ш/п + расчет по карте + доставка с курьером + выдает чек
  @Test
  public void testFKShCashlessCourierCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
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
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// футболки + кружки + ш/п + расчет по карте + самовывоз + выдает чек
  @Test
  public void testFKShCashlessPickupCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
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
 
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
  }
// футболки + кружки + ш/п + наличный расчет + самовывоз + заказ по  email
  @Test
  public void testFKShCashPickupEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + кружки + ш/п + наличный расчет + доставка с курьером + заказ по  email
  @Test
  public void testFKShCashCourierEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
 }
// футболки + кружки + ш/п + оплата по счету + доставка с курьером + заказ по  email
  @Test
  public void testFKShPaymentCourierEmail() throws Exception {
    driver.get(baseUrl + "/");
 
    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
   }
// футболки + кружки + ш/п + оплата по счету + самовывоз + заказ по  email
  @Test
  public void testFKShPaymentPickupEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
  }
// футболки + кружки + ш/п + расчет по карте + доставка с курьером + заказ по  email
  @Test
  public void testFKShCashlessCourierEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
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
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
 }
// футболки + кружки + ш/п + расчет по карте + самовывоз + заказ по  email
  @Test
  public void testFKShCashlessPickupEmail() throws Exception {
    driver.get(baseUrl + "/");

     WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
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
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
  }
// футболки + кружки + ш/п + оплата наличными + выдает чек + заказ по  email
  @Test
  public void testFKShCashCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + кружки + ш/п + оплата по счету + выдает чек + заказ по  email
  @Test
  public void testFKShPaymentCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
  }
// футболки + кружки + ш/п + расчет по карте + выдает чек + заказ по  email
  @Test
  public void testFKShCashlessCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
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
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
  }
// футболки + кружки + ш/п + самовывоз + выдает чек + заказ по  email
  @Test
  public void testFKShPickupCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + кружки + ш/п + доставка с курьером + выдает чек + заказ по  email
  @Test
  public void testFKShCourierCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// футболки + кружки + ш/п + наличный расчет + самовывоз + выдает чек + заказ по  email
  @Test
  public void testFKShCashPickupCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + кружки + ш/п + наличный расчет + доставка с курьером + выдает чек + заказ по  email
  @Test
  public void testFKShCashCourierCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
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
 

    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// футболки + кружки + ш/п + Оплата по счету + доставка с курьером + выдает чек + заказ по  email
  @Test
  public void testFKShPaymentCourierCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// футболки + кружки + ш/п + оплата по счету + самовывоз + выдает чек + заказ по  email
  @Test
  public void testFKShPaymentPickupCheckEmail() throws Exception {
    driver.get(baseUrl + "/");
  
    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));           // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item13"));          // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));         // самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));         //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));          //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
  }
// футболки + кружки + ш/п + расчет по карте + доставка с курьером + выдает чек + заказ по  email
  @Test
  public void testFKShCashlessCourierCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));           // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
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
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// футболки + кружки + ш/п + расчет по карте  + самовывоз + выдает чек + заказ по  email
  @Test
  public void testFKShCashlessPickupCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
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
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
  }





// футболки + кружки + визитки + наличный расчет
  @Test
  public void testFKVCash() throws Exception {
      driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    mugs.executeScript("arguments[0].click();", mug);
    WebElement wee = driver.findElement(By.id("item11"));        // наличный расчет
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
 }

// футболки + кружки + визитки + расчет по карте
@Test
  public void testFKVCashless() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    mugs.executeScript("arguments[0].click();", mug);
    WebElement we = driver.findElement(By.id("item12"));          // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
 
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
   
}

// футболки + кружки + визитки + оплата по счету
@Test
  public void testFKVPayment() throws Exception {
      driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
 }

// футболки + кружки + визитки + Самовывоз 
@Test
  public void testFKVPickup() throws Exception {
      driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item21"));           // Самовывоз
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);

    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }

// футболки + кружки + визитки + Доставка с курьером
@Test
  public void testFKVCourier() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item22"));          // Доставка с курьером
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
   }

// футболки + кружки + визитки + выдает чек
@Test
  public void testFKVCheck() throws Exception {
      driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("check1"));          // выдает чек
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
   
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
   }

// футболки + кружки + визитки + Принимает заказ по email
@Test
  public void testFKVEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }

// футболки + кружки + визитки + выдает чек + принимает заказ по email
  @Test
  public void testFKVCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("check1"));           // выдает чек
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + кружки + визитки + Наличный расчет + Самовывоз
@Test
  public void testFKVCashPickup() throws Exception {
      driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item11"));          // Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));         // Самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    }

// футболки + кружки + визитки + Наличный расчет + Доставка с курьером
  @Test
  public void testFKVCachCourier() throws Exception {
      driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item11"));         // Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));        // Доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    }

// футболки + кружки + визитки + Оплата по счету + Самовывоз
  @Test
  public void testFKVPaymentPickup() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          // Самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
  }
// футболки + кружки + визитки + Оплата по счету + Доставка с курьером
  @Test
  public void testFKVPaymentCourier() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          // Доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
 }
// футболки + кружки + визитки + Расчет по карте + Самовывоз
  @Test
  public void testFKVCashlessPickup() throws Exception {
    driver.get(baseUrl + "/");


    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item12"));           // Расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          //Самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
  }
// футболки + кружки + визитки + Расчет по карте + Доставка с курьером
  @Test
  public void testFKVCashlessCourier() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item12"));           // Расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          // Доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
 }
// футболки + кружки + визитки + Наличный расчет + Выдает чек
  @Test
  public void testFKVCashCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item11"));           // Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + кружки + визитки + Оплата по счету + Выдает чек
  @Test
  public void testFKVPaymentCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          //Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
  }
// футболки + кружки + визитки + Расчет по карте + Выдает чек
  @Test
  public void testFKVCashlessCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item12"));           // Расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
  }
// футболки + кружки + визитки + Самовывоз + Выдает чек
  @Test
  public void testFKVPickupCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item21"));           // Самовывоз
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          //Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + кружки + визитки + Доставка с курьером + Выдает чек
  @Test
  public void testFKVCourierCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item22"));           // Доставка с курьером
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// футболки + кружки + визитки + Наличный расчет + Принимает заказ по email
  @Test
  public void testFKVCashEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);  
    WebElement mug = driver.findElement(By.id("btn2"));           // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item11"));           // Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + кружки + визитки + Оплата по счету + Принимает заказ по email
  @Test
  public void testFKVPaymentEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
  }
// футболки + кружки + визитки + Расчет по карте + Принимает заказ по email
  @Test
  public void testFKVCashlessEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item12"));           // Расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
   }
// футболки + кружки + визитки + Самовывоз + Принимает заказ по email
  @Test
  public void testFKVPickupEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item21"));           // Самовывоз
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + кружки + визитки + Доставка с курьером + Принимает заказ по email
  @Test
  public void testFKVCourierEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item22"));           // Доставка с курьером
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
   }
// футболки + кружки + визитки + наличный расчет + самовывоз + выдает чек
  @Test
  public void testFKVCashPickupCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item11"));           // наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          // самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + кружки + визитки + наличный расчет + доставка с курьером + выдает чек
  @Test
  public void testFKVCashCourierCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item11"));           // наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          //доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// футболки + кружки + визитки + оплата по счету + доставка с курьером + выдает чек
  @Test
  public void testFKVCashlessPaymentCourierCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          //доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
     WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);

    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// футболки + кружки + визитки + оплата по счету + самовывоз + выдает чек
  @Test
  public void testFKVPaymentPickupCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          //самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
  }
// футболки + кружки + визитки + расчет по карте + доставка с курьером + выдает чек
  @Test
  public void testFKVCashlessCourierCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item12"));           // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          //доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// футболки + кружки + визитки + расчет по карте + самовывоз + выдает чек
  @Test
  public void testFKVCashlessPickupCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item12"));           // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));               // самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
 
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
  }
// футболки + кружки + визитки + наличный расчет + самовывоз + заказ по  email
  @Test
  public void testFKVCashPickupEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item11"));           // наличный расчет 
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          //самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + кружки + визитки + наличный расчет + доставка с курьером + заказ по  email
  @Test
  public void testFKVCashCourierEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item11"));           // наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          // доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
 }
// футболки + кружки + визитки + оплата по счету + доставка с курьером + заказ по  email
  @Test
  public void testFKVPaymentCourierEmail() throws Exception {
    driver.get(baseUrl + "/");
 
    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          // доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
   }
// футболки + кружки + визитки + оплата по счету + самовывоз + заказ по  email
  @Test
  public void testFKVPaymentPickupEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          //самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
  }
// футболки + кружки + визитки + расчет по карте + доставка с курьером + заказ по  email
  @Test
  public void testFKVCashlessCourierEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item12"));           // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          // доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch); 
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
 }
// футболки + кружки + визитки + расчет по карте + самовывоз + заказ по  email
  @Test
  public void testFKVCashlessPickupEmail() throws Exception {
    driver.get(baseUrl + "/");

     WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item12"));           // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          // самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
  }
// футболки + кружки + визитки + оплата наличными + выдает чек + заказ по  email
  @Test
  public void testFKVCashCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item11"));           // оплата наличными
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + кружки + визитки + оплата по счету + выдает чек + заказ по  email
  @Test
  public void testFKVPaymentCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
  }
// футболки + кружки + визитки + расчет по карте + выдает чек + заказ по  email
  @Test
  public void testFKVCashlessCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item12"));           // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
  }
// футболки + кружки + визитки + самовывоз + выдает чек + заказ по  email
  @Test
  public void testFKVPickupCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item21"));           // самовывоз
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + кружки + визитки + доставка с курьером + выдает чек + заказ по  email
  @Test
  public void testFKVCourierCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item22"));           // доставка с курьером
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// футболки + кружки + визитки + наличный расчет + самовывоз + выдает чек + заказ по  email
  @Test
  public void testFKVCashPickupCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + кружки + визитки + наличный расчет + доставка с курьером + выдает чек + заказ по  email
  @Test
  public void testFKVCashCourierCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 

    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// футболки + кружки + визитки + Оплата по счету + доставка с курьером + выдает чек + заказ по  email
  @Test
  public void testFKVPaymentCourierCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// футболки + кружки + визитки + оплата по счету + самовывоз + выдает чек + заказ по  email
  @Test
  public void testFKVPaymentPickupCheckEmail() throws Exception {
    driver.get(baseUrl + "/");
  
    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));           // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));          // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));         // самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));         //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));          //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
  }
// футболки + кружки + визитки + расчет по карте + доставка с курьером + выдает чек + заказ по  email
  @Test
  public void testFKVCashlessCourierCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));           // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// футболки + кружки + визитки + расчет по карте  + самовывоз + выдает чек + заказ по  email
  @Test
  public void testFKVCashlessPickupCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
  }




// футболки + визитки + ш/п + наличный расчет
  @Test
  public void testFShVCash() throws Exception {
      driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    cutaway.executeScript("arguments[0].click();", card);
    WebElement wee = driver.findElement(By.id("item11"));        // наличный расчет
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
 }

// футболки + визитки + ш/п + расчет по карте
@Test
  public void testFShVCashless() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item12"));          // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
 
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
   
}

// футболки + визитки + ш/п + оплата по счету
@Test
  public void testFShVPayment() throws Exception {
      driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item13"));           // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
 }

// футболки + визитки + ш/п + Самовывоз 
@Test
  public void testFShVPickup() throws Exception {
      driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item21"));           // Самовывоз
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);

    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }

// футболки + визитки + ш/п + Доставка с курьером
@Test
  public void testFShVCourier() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item22"));          // Доставка с курьером
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
   }

// футболки + визитки + ш/п + выдает чек
@Test
  public void testFShVCheck() throws Exception {
      driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("check1"));          // выдает чек
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
   
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
   }

// футболки + визитки + ш/п + Принимает заказ по email
@Test
  public void testFShVEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }

// футболки + визитки + ш/п + выдает чек + принимает заказ по email
  @Test
  public void testFShVCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("check1"));           // выдает чек
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + визитки + ш/п + Наличный расчет + Самовывоз
@Test
  public void testFShVCashPickup() throws Exception {
      driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item11"));          // Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));         // Самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    }

// футболки + визитки + ш/п + Наличный расчет + Доставка с курьером
  @Test
  public void testFShVCachCourier() throws Exception {
      driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item11"));         // Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));        // Доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    }

// футболки + визитки + ш/п + Оплата по счету + Самовывоз
  @Test
  public void testFShVPaymentPickup() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item13"));           // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          // Самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
  }
// футболки + визитки + ш/п + Оплата по счету + Доставка с курьером
  @Test
  public void testFShVPaymentCourier() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item13"));           // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          // Доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
 }
// футболки + визитки + ш/п + Расчет по карте + Самовывоз
  @Test
  public void testFShVCashlessPickup() throws Exception {
    driver.get(baseUrl + "/");


    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item12"));           // Расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          //Самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
  }
// футболки + визитки + ш/п + Расчет по карте + Доставка с курьером
  @Test
  public void testFShVCashlessCourier() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item12"));           // Расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          // Доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
 }
// футболки + визитки + ш/п + Наличный расчет + Выдает чек
  @Test
  public void testFShVCashCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item11"));           // Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + визитки + ш/п + Оплата по счету + Выдает чек
  @Test
  public void testFShVPaymentCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item13"));           // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          //Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
  }
// футболки + визитки + ш/п + Расчет по карте + Выдает чек
  @Test
  public void testFShVCashlessCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item12"));           // Расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
  }
// футболки + визитки + ш/п + Самовывоз + Выдает чек
  @Test
  public void testFShVPickupCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item21"));           // Самовывоз
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          //Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + визитки + ш/п + Доставка с курьером + Выдает чек
  @Test
  public void testFShVCourierCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item22"));           // Доставка с курьером
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// футболки + визитки + ш/п + Наличный расчет + Принимает заказ по email
  @Test
  public void testFShVCashEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);  
    WebElement card = driver.findElement(By.id("btn9"));           // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item11"));           // Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + визитки + ш/п + Оплата по счету + Принимает заказ по email
  @Test
  public void testFShVPaymentEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item13"));           // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
  }
// футболки + визитки + ш/п + Расчет по карте + Принимает заказ по email
  @Test
  public void testFShVCashlessEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item12"));           // Расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
   }
// футболки + визитки + ш/п + Самовывоз + Принимает заказ по email
  @Test
  public void testFShVPickupEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item21"));           // Самовывоз
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + визитки + ш/п + Доставка с курьером + Принимает заказ по email
  @Test
  public void testFShVCourierEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item22"));           // Доставка с курьером
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
   }
// футболки + визитки + ш/п + наличный расчет + самовывоз + выдает чек
  @Test
  public void testFShVCashPickupCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + визитки + ш/п + наличный расчет + доставка с курьером + выдает чек
  @Test
  public void testFShVCashCourierCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// футболки + визитки + ш/п + оплата по счету + доставка с курьером + выдает чек
  @Test
  public void testFShVCashlessPaymentCourierCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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

    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// футболки + визитки + ш/п + оплата по счету + самовывоз + выдает чек
  @Test
  public void testFShVPaymentPickupCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
  }
// футболки + визитки + ш/п + расчет по карте + доставка с курьером + выдает чек
  @Test
  public void testFShVCashlessCourierCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// футболки + визитки + ш/п + расчет по карте + самовывоз + выдает чек
  @Test
  public void testFShVCashlessPickupCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
  }
// футболки + визитки + ш/п + наличный расчет + самовывоз + заказ по  email
  @Test
  public void testFShVCashPickupEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + визитки + ш/п + наличный расчет + доставка с курьером + заказ по  email
  @Test
  public void testFShVCashCourierEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
 }
// футболки + визитки + ш/п + оплата по счету + доставка с курьером + заказ по  email
  @Test
  public void testFShVPaymentCourierEmail() throws Exception {
    driver.get(baseUrl + "/");
 
    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
   }
// футболки + визитки + ш/п + оплата по счету + самовывоз + заказ по  email
  @Test
  public void testFShVPaymentPickupEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
  }
// футболки + визитки + ш/п + расчет по карте + доставка с курьером + заказ по  email
  @Test
  public void testFShVCashlessCourierEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
 }
// футболки + визитки + ш/п + расчет по карте + самовывоз + заказ по  email
  @Test
  public void testFShVCashlessPickupEmail() throws Exception {
    driver.get(baseUrl + "/");

     WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
  }
// футболки + визитки + ш/п + оплата наличными + выдает чек + заказ по  email
  @Test
  public void testFShVCashCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + визитки + ш/п + оплата по счету + выдает чек + заказ по  email
  @Test
  public void testFShVPaymentCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
  }
// футболки + визитки + ш/п + расчет по карте + выдает чек + заказ по  email
  @Test
  public void testFShVCashlessCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
  }
// футболки + визитки + ш/п + самовывоз + выдает чек + заказ по  email
  @Test
  public void testFShVPickupCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + визитки + ш/п + доставка с курьером + выдает чек + заказ по  email
  @Test
  public void testFShVCourierCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// футболки + визитки + ш/п + наличный расчет + самовывоз + выдает чек + заказ по  email
  @Test
  public void testFShVCashPickupCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// футболки + визитки + ш/п + наличный расчет + доставка с курьером + выдает чек + заказ по  email
  @Test
  public void testFShVCashCourierCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 

    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// футболки + визитки + ш/п + Оплата по счету + доставка с курьером + выдает чек + заказ по  email
  @Test
  public void testFShVPaymentCourierCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// футболки + визитки + ш/п + оплата по счету + самовывоз + выдает чек + заказ по  email
  @Test
  public void testFShVPaymentPickupCheckEmail() throws Exception {
    driver.get(baseUrl + "/");
  
    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));           // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement we = driver.findElement(By.id("item13"));          // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));         // самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));         //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));          //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
  }
// футболки + визитки + ш/п + расчет по карте + доставка с курьером + выдает чек + заказ по  email
  @Test
  public void testFShVCashlessCourierCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));           // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// футболки + визитки + ш/п + расчет по карте  + самовывоз + выдает чек + заказ по  email
  @Test
  public void testFShVCashlessPickupCheckEmail() throws Exception {
    driver.get(baseUrl + "/");
    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
  }



// кружки + ш/п + визитки + наличный расчет
  @Test
  public void testKShVCash() throws Exception {
      driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement wee = driver.findElement(By.id("item11"));        // наличный расчет
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }

// кружки + ш/п + визитки + расчет по карте
@Test
  public void testKShVCashless() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item12"));          // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
 
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
  }

// кружки + ш/п + визитки + оплата по счету
@Test
  public void testKShVPayment() throws Exception {
      driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
 
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
 }

// кружки + ш/п + визитки + Самовывоз 
@Test
  public void testKShVPickup() throws Exception {
      driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item21"));           // Самовывоз
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);

    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }

// кружки + ш/п + визитки + Доставка с курьером
@Test
  public void testKShVCourier() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item22"));          // Доставка с курьером
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
 
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
 }

// кружки + ш/п + визитки + выдает чек
@Test
  public void testKShVCheck() throws Exception {
      driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("check1"));          // выдает чек
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
   
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
 }

// кружки + ш/п + визитки + Принимает заказ по email
@Test
  public void testKShVEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
}

// кружки + ш/п + визитки + выдает чек + принимает заказ по email
  @Test
  public void testKShVCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("check1"));           // выдает чек
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
}
// кружки + ш/п + визитки + Наличный расчет + Самовывоз
@Test
  public void testKShVCashPickup() throws Exception {
      driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item11"));          // Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));         // Самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    }

// кружки + ш/п + визитки + Наличный расчет + Доставка с курьером
  @Test
  public void testKShVCachCourier() throws Exception {
      driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item11"));         // Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));        // Доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
  }

// кружки + ш/п + визитки + Оплата по счету + Самовывоз
  @Test
  public void testKShVPaymentPickup() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          // Самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
  }
// кружки + ш/п + визитки + Оплата по счету + Доставка с курьером
  @Test
  public void testKShVPaymentCourier() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          // Доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
  }
// кружки + ш/п + визитки + Расчет по карте + Самовывоз
  @Test
  public void testKShVCashlessPickup() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item12"));           // Расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          //Самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
  }
// кружки + ш/п + визитки + Расчет по карте + Доставка с курьером
  @Test
  public void testKShVCashlessCourier() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item12"));           // Расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          // Доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
  }
// кружки + ш/п + визитки + Наличный расчет + Выдает чек
  @Test
  public void testKShVCashCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item11"));           // Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// кружки + ш/п + визитки + Оплата по счету + Выдает чек
  @Test
  public void testKShVPaymentCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          //Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
  }
// кружки + ш/п + визитки + Расчет по карте + Выдает чек
  @Test
  public void testKShVCashlessCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item12"));           // Расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
  }
// кружки + ш/п + визитки + Самовывоз + Выдает чек
  @Test
  public void testKShVPickupCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item21"));           // Самовывоз
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          //Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// кружки + ш/п + визитки + Доставка с курьером + Выдает чек
  @Test
  public void testKShVCourierCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item22"));           // Доставка с курьером
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
  }
// кружки + ш/п + визитки + Наличный расчет + Принимает заказ по email
  @Test
  public void testKShVCashEmail() throws Exception {
    driver.get(baseUrl + "/");


    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item11"));           // Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// кружки + ш/п + визитки + Оплата по счету + Принимает заказ по email
  @Test
  public void testKShVPaymentEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
  }
// кружки + ш/п + визитки + Расчет по карте + Принимает заказ по email
  @Test
  public void testKShVCashlessEmail() throws Exception {
    driver.get(baseUrl + "/");


    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item12"));           // Расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
  }
// кружки + ш/п + визитки + Самовывоз + Принимает заказ по email
  @Test
  public void testKShVPickupEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item21"));           // Самовывоз
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// кружки + ш/п + визитки + Доставка с курьером + Принимает заказ по email
  @Test
  public void testKShVCourierEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item22"));           // Доставка с курьером
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
  }
// кружки + ш/п + визитки + наличный расчет + самовывоз + выдает чек
  @Test
  public void testKShVCashPickupCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item11"));           // наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          // самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
 
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// кружки + ш/п + визитки + наличный расчет + доставка с курьером + выдает чек
  @Test
  public void testKShVCashCourierCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item11"));           // наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          //доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);

    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
  }
// кружки + ш/п + визитки + оплата по счету + доставка с курьером + выдает чек
  @Test
  public void testKShVCashlessPaymentCourierCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          //доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
     WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);

   driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
  }
// кружки + ш/п + визитки + оплата по счету + самовывоз + выдает чек
  @Test
  public void testKShVPaymentPickupCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          //самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
 
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
  }
// кружки + ш/п + визитки + расчет по карте + доставка с курьером + выдает чек
  @Test
  public void testKShVCashlessCourierCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
// кружки + ш/п + визитки + расчет по карте + самовывоз + выдает чек
  @Test
  public void testKShVCashlessPickupCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item12"));           // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));               // самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
 
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
  }
// кружки + ш/п + визитки + наличный расчет + самовывоз + заказ по  email
  @Test
  public void testKShVCashPickupEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item11"));           // наличный расчет 
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          //самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// кружки + ш/п + визитки + наличный расчет + доставка с курьером + заказ по  email
  @Test
  public void testKShVCashCourierEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item11"));           // наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          // доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
  }
// кружки + ш/п + визитки + оплата по счету + доставка с курьером + заказ по  email
  @Test
  public void testKShVPaymentCourierEmail() throws Exception {
    driver.get(baseUrl + "/");
 
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          // доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
  }
// кружки + ш/п + визитки + оплата по счету + самовывоз + заказ по  email
  @Test
  public void testKShVPaymentPickupEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          //самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
  }
// кружки + ш/п + визитки + расчет по карте + доставка с курьером + заказ по  email
  @Test
  public void testKShVCashlessCourierEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
// кружки + ш/п + визитки + расчет по карте + самовывоз + заказ по  email
  @Test
  public void testKShVCashlessPickupEmail() throws Exception {
    driver.get(baseUrl + "/");

     WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item12"));           // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          // самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
  driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
  }
// кружки + ш/п + визитки + оплата наличными + выдает чек + заказ по  email
  @Test
  public void testKShVCashCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item11"));           // оплата наличными
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// кружки + ш/п + визитки + оплата по счету + выдает чек + заказ по  email
  @Test
  public void testKShVPaymentCheckEmail() throws Exception {
    driver.get(baseUrl + "/");


    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
  }
// кружки + ш/п + визитки + расчет по карте + выдает чек + заказ по  email
  @Test
  public void testKShVCashlessCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item12"));           // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
  }
// кружки + ш/п + визитки + самовывоз + выдает чек + заказ по  email
  @Test
  public void testKShVPickupCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item21"));           // самовывоз
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// кружки + ш/п + визитки + доставка с курьером + выдает чек + заказ по  email
  @Test
  public void testKShVCourierCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item22"));           // доставка с курьером
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
  }
// кружки + ш/п + визитки + наличный расчет + самовывоз + выдает чек + заказ по  email
  @Test
  public void testKShVCashPickupCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// кружки + ш/п + визитки + наличный расчет + доставка с курьером + выдает чек + заказ по  email
  @Test
  public void testKShVCashCourierCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
 
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
  }
// кружки + ш/п + визитки + Оплата по счету + доставка с курьером + выдает чек + заказ по  email
  @Test
  public void testKShVPaymentCourierCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
  }
// кружки + ш/п + визитки + оплата по счету + самовывоз + выдает чек + заказ по  email
  @Test
  public void testKShVPaymentPickupCheckEmail() throws Exception {
    driver.get(baseUrl + "/");


    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
  }
// кружки + ш/п + визитки + расчет по карте + доставка с курьером + выдает чек + заказ по  email
  @Test
  public void testKShVCashlessCourierCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
// кружки + ш/п + визитки + расчет по карте  + самовывоз + выдает чек + заказ по  email
  @Test
  public void testKShVCashlessPickupCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
 driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
  }



// 4 сервиса + наличный расчет
  @Test
  public void testAllCash() throws Exception {
      driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    mugs.executeScript("arguments[0].click();", mug);
    WebElement wee = driver.findElement(By.id("item11"));        // наличный расчет
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
 }

// 4 сервиса + расчет по карте
@Test
  public void testAllCashless() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    mugs.executeScript("arguments[0].click();", mug);
    WebElement we = driver.findElement(By.id("item12"));          // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
 
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
   
}

// 4 сервиса + оплата по счету
@Test
  public void testAllPayment() throws Exception {
      driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
 }

// 4 сервиса + Самовывоз 
@Test
  public void testAllPickup() throws Exception {
      driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item21"));           // Самовывоз
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);

    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }

// 4 сервиса + Доставка с курьером
@Test
  public void testAllCourier() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item22"));          // Доставка с курьером
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
   }

// 4 сервиса + выдает чек
@Test
  public void testAllCheck() throws Exception {
      driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("check1"));          // выдает чек
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
   
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
   }

// 4 сервиса + Принимает заказ по email
@Test
  public void testAllEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }

// 4 сервиса + выдает чек + принимает заказ по email
  @Test
  public void testAllCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("check1"));           // выдает чек
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// 4 сервиса + Наличный расчет + Самовывоз
@Test
  public void testAllCashPickup() throws Exception {
      driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item11"));          // Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));         // Самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    }

// 4 сервиса + Наличный расчет + Доставка с курьером
  @Test
  public void testAllCachCourier() throws Exception {
      driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item11"));         // Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));        // Доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    }

// 4 сервиса + Оплата по счету + Самовывоз
  @Test
  public void testAllPaymentPickup() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          // Самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
  }
// 4 сервиса + Оплата по счету + Доставка с курьером
  @Test
  public void testAllPaymentCourier() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          // Доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
 }
// 4 сервиса + Расчет по карте + Самовывоз
  @Test
  public void testAllCashlessPickup() throws Exception {
    driver.get(baseUrl + "/");


    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item12"));           // Расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          //Самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
  }
// 4 сервиса + Расчет по карте + Доставка с курьером
  @Test
  public void testAllCashlessCourier() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item12"));           // Расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          // Доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
 }
// 4 сервиса + Наличный расчет + Выдает чек
  @Test
  public void testAllCashCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item11"));           // Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// 4 сервиса + Оплата по счету + Выдает чек
  @Test
  public void testAllPaymentCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          //Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
  }
// 4 сервиса + Расчет по карте + Выдает чек
  @Test
  public void testAllCashlessCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item12"));           // Расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
  }
// 4 сервиса + Самовывоз + Выдает чек
  @Test
  public void testAllPickupCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item21"));           // Самовывоз
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          //Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// 4 сервиса + Доставка с курьером + Выдает чек
  @Test
  public void testAllCourierCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item22"));           // Доставка с курьером
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// 4 сервиса + Наличный расчет + Принимает заказ по email
  @Test
  public void testAllCashEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);  
    WebElement mug = driver.findElement(By.id("btn2"));           // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item11"));           // Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// 4 сервиса + Оплата по счету + Принимает заказ по email
  @Test
  public void testAllPaymentEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
  }
// 4 сервиса + Расчет по карте + Принимает заказ по email
  @Test
  public void testAllCashlessEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item12"));           // Расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
   }
// 4 сервиса + Самовывоз + Принимает заказ по email
  @Test
  public void testAllPickupEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item21"));           // Самовывоз
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// 4 сервиса + Доставка с курьером + Принимает заказ по email
  @Test
  public void testAllCourierEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item22"));           // Доставка с курьером
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
   }
// 4 сервиса + наличный расчет + самовывоз + выдает чек
  @Test
  public void testAllCashPickupCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item11"));           // наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          // самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// 4 сервиса + наличный расчет + доставка с курьером + выдает чек
  @Test
  public void testAllCashCourierCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item11"));           // наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          //доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// 4 сервиса + оплата по счету + доставка с курьером + выдает чек
  @Test
  public void testAllCashlessPaymentCourierCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          //доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
     WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);

    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// 4 сервиса + оплата по счету + самовывоз + выдает чек
  @Test
  public void testAllPaymentPickupCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          //самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
  }
// 4 сервиса + расчет по карте + доставка с курьером + выдает чек
  @Test
  public void testAllCashlessCourierCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item12"));           // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          //доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// 4 сервиса + расчет по карте + самовывоз + выдает чек
  @Test
  public void testAllCashlessPickupCheck() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item12"));           // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));               // самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
 
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
  }
// 4 сервиса + наличный расчет + самовывоз + заказ по  email
  @Test
  public void testAllCashPickupEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item11"));           // наличный расчет 
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          //самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// 4 сервиса + наличный расчет + доставка с курьером + заказ по  email
  @Test
  public void testAllCashCourierEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item11"));           // наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          // доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
 }
// 4 сервиса + оплата по счету + доставка с курьером + заказ по  email
  @Test
  public void testAllPaymentCourierEmail() throws Exception {
    driver.get(baseUrl + "/");
 
    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          // доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
   }
// 4 сервиса + оплата по счету + самовывоз + заказ по  email
  @Test
  public void testAllPaymentPickupEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          //самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
  }
// 4 сервиса + расчет по карте + доставка с курьером + заказ по  email
  @Test
  public void testAllCashlessCourierEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item12"));           // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          // доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch); 
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
 }
// 4 сервиса + расчет по карте + самовывоз + заказ по  email
  @Test
  public void testAllCashlessPickupEmail() throws Exception {
    driver.get(baseUrl + "/");

     WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item12"));           // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          // самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
  }
// 4 сервиса + оплата наличными + выдает чек + заказ по  email
  @Test
  public void testAllCashCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item11"));           // оплата наличными
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// 4 сервиса + оплата по счету + выдает чек + заказ по  email
  @Test
  public void testAllPaymentCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));           // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
  }
// 4 сервиса + расчет по карте + выдает чек + заказ по  email
  @Test
  public void testAllCashlessCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item12"));           // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
  }
// 4 сервиса + самовывоз + выдает чек + заказ по  email
  @Test
  public void testAllPickupCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item21"));           // самовывоз
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// 4 сервиса + доставка с курьером + выдает чек + заказ по  email
  @Test
  public void testAllCourierCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item22"));           // доставка с курьером
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// 4 сервиса + наличный расчет + самовывоз + выдает чек + заказ по  email
  @Test
  public void testAllCashPickupCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
  }
// 4 сервиса + наличный расчет + доставка с курьером + выдает чек + заказ по  email
  @Test
  public void testAllCashCourierCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 

    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// 4 сервиса + Оплата по счету + доставка с курьером + выдает чек + заказ по  email
  @Test
  public void testAllPaymentCourierCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// 4 сервиса + оплата по счету + самовывоз + выдает чек + заказ по  email
  @Test
  public void testAllPaymentPickupCheckEmail() throws Exception {
    driver.get(baseUrl + "/");
  
    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));           // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("item13"));          // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));         // самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));         //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));          //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);
 
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
  }
// 4 сервиса + расчет по карте + доставка с курьером + выдает чек + заказ по  email
  @Test
  public void testAllCashlessCourierCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));           // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }
// 4 сервиса + расчет по карте  + самовывоз + выдает чек + заказ по  email
  @Test
  public void testAllCashlessPickupCheckEmail() throws Exception {
    driver.get(baseUrl + "/");

    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
    t_shirt.executeScript("arguments[0].click();", shirt);
    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
    JavascriptExecutor mugs = (JavascriptExecutor)driver;
    mugs.executeScript("arguments[0].click();", mug);
    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
    widescreen.executeScript("arguments[0].click();", screen);
    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
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
 
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
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
