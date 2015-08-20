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


public class ComboBoxTest {
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

// Наличный расчет
  @Test
  public void testCash() throws Exception {
      driver.get(baseUrl + "/");

    WebElement we = driver.findElement(By.id("item11"));
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);

    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='Изба-принт']/.."));
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт Экспресс']/.."));
    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='Ретранс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
    driver.findElement(By.xpath(".//*[text()='Дизайн-Проект']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Медиаплюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
    driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Офисная полиграфия и комфорт']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Полиграф']/..")) ;
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
  }

// Оплата по счету
@Test
  public void testCashless() throws Exception {
    driver.get(baseUrl + "/");

    WebElement we = driver.findElement(By.id("item13"));
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);

    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='Изба-принт']/.."));
    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Офисная полиграфия и комфорт']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
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
    driver.findElement(By.xpath(".//*[text()='Ретранс']/.."));
  }

// Расчет по карте
@Test
  public void testPayment() throws Exception {
      driver.get(baseUrl + "/");

    WebElement we = driver.findElement(By.id("item12"));
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);

    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
 }

// Самовывоз
@Test
  public void testPickup() throws Exception {
      driver.get(baseUrl + "/");

      WebElement we = driver.findElement(By.id("item21"));
      JavascriptExecutor executor = (JavascriptExecutor)driver;
      executor.executeScript("arguments[0].click();", we);

      driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
      driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
      driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
      driver.findElement(By.xpath(".//*[text()='Изба-принт']/.."));
      driver.findElement(By.xpath(".//*[text()='Принт Экспресс']/.."));
      driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
      driver.findElement(By.xpath(".//*[text()='Марка']/.."));
      driver.findElement(By.xpath(".//*[text()='55Print']/.."));
      driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
      driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
      driver.findElement(By.xpath(".//*[text()='Дизайн-Проект']/.."));
      driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
      driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
      driver.findElement(By.xpath(".//*[text()='Медиаплюс']/.."));
      driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
      driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
      driver.findElement(By.xpath(".//*[text()='Офисная полиграфия и комфорт']/.."));
      driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
      driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
      driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
      driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
      driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
      driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
      driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
      driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
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
      driver.findElement(By.xpath(".//*[text()='Ретранс']/.."));
      driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
      driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//      driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
      driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
  }

// Доставка с курьером
@Test
  public void testCourier() throws Exception {
    driver.get(baseUrl + "/");

   WebElement we = driver.findElement(By.id("item22"));
   JavascriptExecutor executor = (JavascriptExecutor)driver;
   executor.executeScript("arguments[0].click();", we);

   driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
   driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
   driver.findElement(By.xpath(".//*[text()='55Print']/.."));
   driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
   driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
   driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
   driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
   driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
   driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
  }

// Наличный расчет + Самовывоз
@Test
public void testCashPickup() throws Exception {
    driver.get(baseUrl + "/");

    WebElement we = driver.findElement(By.id("item11"));        // Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));       // Самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='Изба-принт']/.."));
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт Экспресс']/.."));
    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='Ретранс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
    driver.findElement(By.xpath(".//*[text()='Дизайн-Проект']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Медиаплюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
    driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Офисная полиграфия и комфорт']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
}

// Наличный расчет + Доставка с курьером
@Test
public void testCashCourier() throws Exception {
    driver.get(baseUrl + "/");

    WebElement we = driver.findElement(By.id("item11"));          // Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));         // Доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
}

/*// Расчет по карте + Самовывоз
@Test
public void testChashlessPickup() throws Exception {
    driver.get(baseUrl + "/");

    WebElement we = driver.findElement(By.id("item12"));            // Расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));           // Самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='Изба-принт']/.."));
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='Ретранс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Офисная полиграфия и комфорт']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
}

// Расчет по карте + Доставка с курьером
@Test
public void testCashlessCourier() throws Exception {
    driver.get(baseUrl + "/");

    WebElement we = driver.findElement(By.id("item12"));           // Расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));          //  Доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));

}

// Оплата по счету + Самовывоз
@Test
public void testPaymentPickup() throws Exception {
    driver.get(baseUrl + "/");

    WebElement we = driver.findElement(By.id("item13"));           // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item21"));          // Самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Изба-принт']/.."));
    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
}

// Оплата по счету + Доставка с курьером
@Test
public void testPaymentCourier() throws Exception {
    driver.get(baseUrl + "/");

    WebElement we = driver.findElement(By.id("item13"));            // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("item22"));           // Доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
}
*/
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