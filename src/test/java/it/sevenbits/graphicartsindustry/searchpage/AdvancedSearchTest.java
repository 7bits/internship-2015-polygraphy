package it.sevenbits.graphicartsindustry.searchpage;

import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;

public class AdvancedSearchTest {
  public static final String USERNAME = System.getenv("SAUCE_LABS_USERNAME");
  public static final String ACCESS_KEY = System.getenv("SAUCE_LABS_PASSWORD");
  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
  public static final String username = System.getenv("POLYGRAPHY_USERNAME");
  public static final String password = System.getenv("POLYGRAPHY_PASSWORD");
// Наличный расчет
@Test
  public void testCash() throws Exception {
    DesiredCapabilities caps = DesiredCapabilities.chrome();
    caps.setCapability("platform", "Linux");
    caps.setCapability("version", "45.0");

    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    driver.findElement(By.id("paymentMethod")).click();
    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);

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
    driver.findElement(By.xpath(".//*[text()='Полиграф']/..")) ;
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
      List<WebElement> list = driver.findElements(By.className("b-results-item"));
      assertThat(45, equalTo(list.size()));
      System.out.println("number of polygraphy on request: " + equalTo(list.size()));
    driver.quit();
  }
// Оплата по счету
@Test
  public void testPayment() throws Exception {
    DesiredCapabilities caps = DesiredCapabilities.chrome();
    caps.setCapability("platform", "Linux");
    caps.setCapability("version", "45.0");

    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));
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
    driver.quit();
  }
// Расчет по карте
  @Test
  public void testCashless() throws Exception {
    DesiredCapabilities caps = DesiredCapabilities.chrome();
    caps.setCapability("platform", "Linux");
    caps.setCapability("version", "45.0");

    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));
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
    driver.quit();
  }
// Самовывоз
@Test
  public void testPickup() throws Exception {
      DesiredCapabilities caps = DesiredCapabilities.chrome();
      caps.setCapability("platform", "Linux");
      caps.setCapability("version", "45.0");

      WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
      driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

      WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));
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
      driver.quit();
  }
// Доставка с курьером
@Test
  public void testCourier() throws Exception {
   DesiredCapabilities caps = DesiredCapabilities.chrome();
   caps.setCapability("platform", "Linux");
   caps.setCapability("version", "45.0");

   WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
   driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

   WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));
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
   driver.quit();
  }
// Наличный расчет + Самовывоз
@Test
public void testCashPickup() throws Exception {
    DesiredCapabilities caps = DesiredCapabilities.chrome();
    caps.setCapability("platform", "Linux");
    caps.setCapability("version", "45.0");

    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));        // Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));       // Самовывоз
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
    driver.quit();
   }
// Наличный расчет + Доставка с курьером
@Test
    public void testCashCourier() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-1"));          // Наличный расчет
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));         // Доставка с курьером
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
        driver.quit();
    }
// Оплата по счету + Самовывоз
@Test
    public void testPaymentPickup() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-3"));            // Оплата по счету
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));           // Самовывоз
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);

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
        driver.quit();
    }
// Оплата по счету + Доставка с курьером
@Test
    public void testPaymentCourier() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          //  Доставка с курьером
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);

        driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
        driver.findElement(By.xpath(".//*[text()='55Print']/.."));
        driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
        driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
        driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
        driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
        driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
        driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
        driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
        driver.quit();
    }
// Расчет по карте + Самовывоз
@Test
    public void testCashlessPickup() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // Расчет по карте
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          // Самовывоз
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);

        driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
        driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
        driver.findElement(By.xpath(".//*[text()='А3+']/.."));
        driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
        driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
        driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
        driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
        driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
        driver.quit();
    }
// Расчет по карте + Доставка с курьером
@Test
    public void testCashlessCourier() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-2"));            // Расчет по карте
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));           // Доставка с курьером
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);

        driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
        driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
        driver.quit();
    }
// выдает чек
@Test
    public void testCheck() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("check1"));
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
        driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
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
        driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
        driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
        driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
        driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
        driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
        driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
        driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
        driver.findElement(By.xpath(".//*[text()='Дизайн-Проект']/.."));
        driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
        driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
        driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
        driver.quit();
    }
// выдает чек+пинимает заказы по почте
@Test
    public void testDoubleCheck() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("check1"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("check2"));
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);

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
        driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
        driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
        driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
        driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
        driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
        driver.findElement(By.xpath(".//*[text()='Полиграф']/..")) ;
        driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
        driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
        driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
        driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
        driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
        driver.quit();
    }
//Приним. заказы
@Test
    public void testEmail() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("check2"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);

        driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
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
        driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
        driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
        driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
        driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
        driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
        driver.findElement(By.xpath(".//*[text()='Полиграф']/..")) ;
        driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
        driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
        driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
        driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
        driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
        driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
        driver.quit();
    }
// Наличный расчет + Выдает чек
@Test
    public void testCheckCash() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-1"));         // Наличный расчет
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("check1"));        //Выдает чек
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);

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
        driver.quit();
    }
// Оплата по счету + Выдает чек
@Test
    public void testCheckCashless() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-3"));          // Оплата по счету
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("check1"));         // Выдает чек
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);

        driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
        driver.findElement(By.xpath(".//*[text()='Марка']/.."));
        driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
        driver.findElement(By.xpath(".//*[text()='Изба-принт']/.."));
        driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
        driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
        driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
        driver.findElement(By.xpath(".//*[text()='55Print']/.."));
        driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
        driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
        driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
        driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
        driver.findElement(By.xpath(".//*[text()='Акула']/.."));
        driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
        driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
        driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
        driver.findElement(By.xpath(".//*[text()='Офисная полиграфия и комфорт']/.."));
        driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
        driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
        driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
        driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
        driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
        driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
        driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
        driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
        driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
        driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
        driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
        driver.findElement(By.xpath(".//*[text()='А3+']/.."));
        driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
        driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
        driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
        driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
        driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
        driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
        driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
        driver.findElement(By.xpath(".//*[text()='Ретранс']/.."));
        driver.quit();
    }
// Расчет по карте + Выдает чек
@Test
    public void testCheckPayment() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // Расчет по карте
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);

        driver.findElement(By.xpath(".//*[text()='А3+']/.."));
        driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
        driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
        driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
        driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
        driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
        driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
        driver.quit();
    }
// Самовывоз + Выдает чек
@Test
    public void testCheckPickup() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("deliveryMethod-item-1")); // Самовывоз
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("check1"));               // Выдает чек
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);

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
        driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
        driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
        driver.findElement(By.xpath(".//*[text()='Офисная полиграфия и комфорт']/.."));
        driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
        driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
        driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
        driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
        driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
        driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
        driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
        driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
        driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
        driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
        driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
        driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
        driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
        driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
        driver.quit();
    }
// Доставка с курьером + Выдает чек
@Test
    public void testCheckCourier() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("deliveryMethod-item-2")); // Доставка с курьером
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("check1"));               // Выдает чек
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
        driver.quit();
    }
// Наличный расчет + Принимает заказ по email
@Test
    public void testEmailCash() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-1")); // Наличный расчет
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("check2"));              // Принимает заказ по email
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);

        driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
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
        driver.quit();
    }
// Оплата по счету + Принимает заказ по email
@Test
    public void testEmailCashless() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-3")); // Оплата по счету
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("check2"));              // Принимает заказ по email
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);

        driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
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
        driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
        driver.quit();
    }
// Расчет по карте + Принимает заказ по email
@Test
    public void testEmailPayment() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-2")); // Расчет по карте
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("check2"));              // Принимает заказ по email
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);

        driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
        driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
        driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
        driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
        driver.quit();
    }
// Самовывоз + Принимает заказ по email
@Test
    public void testEmailPickup() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));         // Самовывоз
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("check2"));        // Принимает заказ по email
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);

        driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
        driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
        driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
        driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
        driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
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
        driver.quit();
  }
// Доставка с курьером + Принимает заказ по email
@Test
    public void testEmailCourier() throws Exception {
       DesiredCapabilities caps = DesiredCapabilities.chrome();
       caps.setCapability("platform", "Linux");
       caps.setCapability("version", "45.0");

       WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
       driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

       WebElement we = driver.findElement(By.id("deliveryMethod-item-2")); //Доставка с курьером
       JavascriptExecutor executor = (JavascriptExecutor)driver;
       executor.executeScript("arguments[0].click();", we);
       WebElement wee = driver.findElement(By.id("check2"));               // Принимает заказ по email
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
       driver.quit();
    }
// наличный расчет + самовывоз + выдает чек
@Test
    public void testCCashPickup() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-1"));        // наличный расчет
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));       // самовывоз
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);
        WebElement che = driver.findElement(By.id("check1"));       //выдает чек
        JavascriptExecutor doer = (JavascriptExecutor)driver;
        doer.executeScript("arguments[0].click();", che);

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
        driver.quit();
    }
// наличный расчет + доставка с курьером + выдает чек
@Test
    public void testCCashCourier() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-1"));       //наличный расчет
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));      //доставка с курьером
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);
        WebElement che = driver.findElement(By.id("check1"));      //выдает чек
        JavascriptExecutor doer = (JavascriptExecutor)driver;
        doer.executeScript("arguments[0].click();", che);

        driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
        driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
        driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
        driver.findElement(By.xpath(".//*[text()='55Print']/.."));
        driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
        driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
        driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
        driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
        driver.quit();
    }
// оплата по счету + доставка с курьером + выдает чек
@Test
    public void testCCashlessCourier() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-3"));   // оплата по счету
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("deliveryMethod-item-2")); // доставка с курьером
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);
        WebElement che = driver.findElement(By.id("check1"));                // выдает чек
        JavascriptExecutor doer = (JavascriptExecutor)driver;
        doer.executeScript("arguments[0].click();", che);

        driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
        driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
        driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
        driver.findElement(By.xpath(".//*[text()='55Print']/.."));
        driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
        driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
        driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
        driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
        driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
        driver.quit();
    }
// оплата по счету + самовывоз + выдает чек
@Test
    public void testCChashlessPickup() throws Exception {
         DesiredCapabilities caps = DesiredCapabilities.chrome();
         caps.setCapability("platform", "Linux");
         caps.setCapability("version", "45.0");

         WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
         driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

         WebElement we = driver.findElement(By.id("paymentMethod-item-3"));   // оплата по счету
         JavascriptExecutor executor = (JavascriptExecutor)driver;
         executor.executeScript("arguments[0].click();", we);
         WebElement wee = driver.findElement(By.id("deliveryMethod-item-1")); // самовывоз
         JavascriptExecutor executore = (JavascriptExecutor)driver;
         executore.executeScript("arguments[0].click();", wee);
         WebElement che = driver.findElement(By.id("check1"));                // выдает чек
         JavascriptExecutor doer = (JavascriptExecutor)driver;
         doer.executeScript("arguments[0].click();", che);

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
         driver.quit();
    }
// расчет по карте + доставка с курьером + выдает чек
@Test
    public void testCPaymentCourier() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-2"));  // расчет по карте
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));// доставка с курьером
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);
        WebElement che = driver.findElement(By.id("check1"));               // выдает чек
        JavascriptExecutor doer = (JavascriptExecutor)driver;
        doer.executeScript("arguments[0].click();", che);

        driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
        driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
        driver.quit();
    }
// расчет по карте + самовывоз + выдает чек
@Test
    public void testCPaymentPickup() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-2"));  // расчет по карте
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));// самовывоз
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);
        WebElement che = driver.findElement(By.id("check1"));               // выдает чек
        JavascriptExecutor doer = (JavascriptExecutor)driver;
        doer.executeScript("arguments[0].click();", che);

        driver.findElement(By.xpath(".//*[text()='А3+']/.."));
        driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
        driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
        driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
        driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
        driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
        driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
        driver.quit();
    }
// наличный расчет + самовывоз + заказ по  email
@Test
    public void testECashPickup() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-1"));        // наличный расчет
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));       // самовывоз
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);
        WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
        JavascriptExecutor performer = (JavascriptExecutor)driver;
        performer.executeScript("arguments[0].click();", ch);

        driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
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
        driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
        driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
        driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
        driver.quit();
    }
// наличный расчет + доставка с курьером + заказ по  email
@Test
    public void testECashCourier() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-1"));  //наличный расчет
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));//доставка с курьером
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);
        WebElement ch = driver.findElement(By.id("check2"));                //заказ по  email
        JavascriptExecutor performer = (JavascriptExecutor)driver;
        performer.executeScript("arguments[0].click();", ch);

        driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
        driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
        driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
        driver.findElement(By.xpath(".//*[text()='55Print']/.."));
        driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
        driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
        driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
        driver.quit();
    }
// оплата по счету + доставка с курьером + заказ по  email
@Test
    public void testECashlessCourier() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-3"));         // оплата по счету
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));        // доставка с курьером
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);
        WebElement ch = driver.findElement(By.id("check2"));         // заказ по  email
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
        driver.quit();
    }
// оплата по счету + самовывоз + заказ по  email
@Test
    public void testEChashlessPickup() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-3"));   //оплата по счету
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));  //самовывоз
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);
        WebElement ch = driver.findElement(By.id("check2"));                  //заказ по  email
        JavascriptExecutor performer = (JavascriptExecutor)driver;
        performer.executeScript("arguments[0].click();", ch);

        driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
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
        driver.quit();
    }
// расчет по карте + доставка с курьером + заказ по  email
@Test
    public void testEPaymentCourier() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-2"));  // расчет по карте
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));// доставка с курьером
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);
        WebElement ch = driver.findElement(By.id("check2"));                // заказ по  email
        JavascriptExecutor performer = (JavascriptExecutor)driver;
        performer.executeScript("arguments[0].click();", ch);

        driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
        driver.quit();
    }
// расчет по карте + самовывоз + заказ по  email
@Test
    public void testEPaymentPickup() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-2"));  //расчет по карте
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));//самовывоз
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);
        WebElement ch = driver.findElement(By.id("check2"));                //заказ по  email
        JavascriptExecutor performer = (JavascriptExecutor)driver;
        performer.executeScript("arguments[0].click();", ch);

        driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
        driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
        driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
        driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
        driver.quit();
 }
// оплата наличными + выдает чек + заказ по  email
@Test
    public void testTwoCheckCash() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-1")); //оплата наличными
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("check1"));              //выдает чек
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);
        WebElement ch = driver.findElement(By.id("check2"));               //заказ по  email
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
        driver.quit();
    }
// оплата по счету + выдает чек + заказ по  email
@Test
    public void testTwoCheckCashless() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-3")); //оплата по счету
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("check1"));              //выдает чек
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);
        WebElement ch = driver.findElement(By.id("check2"));               //заказ по  email
        JavascriptExecutor performer = (JavascriptExecutor)driver;
        performer.executeScript("arguments[0].click();", ch);

        driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
        driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
        driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
        driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
        driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
        driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
        driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
        driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
        driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
        driver.findElement(By.xpath(".//*[text()='Марка']/.."));
        driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
        driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
        driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
        driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
        driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
        driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
        driver.findElement(By.xpath(".//*[text()='55Print']/.."));
        driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
        driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
        driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
        driver.quit();
    }
// расчет по карте + выдает чек + заказ по  email
@Test
    public void testTwoCheckPayment() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-2")); //расчет по карте
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("check1"));       //выдает чек
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);
        WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
        JavascriptExecutor performer = (JavascriptExecutor)driver;
        performer.executeScript("arguments[0].click();", ch);

        driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
        driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
        driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
        driver.quit();
    }
// самовывоз + выдает чек + заказ по  email
@Test
    public void testTwoCheckPickup() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));//самовывоз
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("check1"));              //выдает чек
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);
        WebElement ch = driver.findElement(By.id("check2"));               //заказ по  email
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
        driver.quit();
    }
// доставка с курьером + выдает чек + заказ по  email
@Test
    public void testTwoCheckCourier() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));//доставка с курьером
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("check1"));              //выдает чек
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);
        WebElement ch = driver.findElement(By.id("check2"));              //заказ по  email
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
        driver.quit();
    }
// наличный расчет + самовывоз + выдает чек + заказ по  email
@Test
    public void testCashPickupCheckEmail() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-1"));         // наличный расчет
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));        // самовывоз
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);
        WebElement che = driver.findElement(By.id("check1"));        //выдает чек
        JavascriptExecutor doer = (JavascriptExecutor)driver;
        doer.executeScript("arguments[0].click();", che);
        WebElement ch = driver.findElement(By.id("check2"));         //заказ по  email
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
        driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
        driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
        driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
        driver.quit();
    }
// наличный расчет + доставка с курьером + выдает чек + заказ по  email
@Test
    public void testCashCourierCheckEmail() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-1"));  //наличный расчет
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));//доставка с курьером
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);
        WebElement che = driver.findElement(By.id("check1"));               //выдает чек
        JavascriptExecutor doer = (JavascriptExecutor)driver;
        doer.executeScript("arguments[0].click();", che);
        WebElement ch = driver.findElement(By.id("check2"));                //заказ по  email
        JavascriptExecutor performer = (JavascriptExecutor)driver;
        performer.executeScript("arguments[0].click();", ch);

        driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
        driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
        driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
        driver.findElement(By.xpath(".//*[text()='55Print']/.."));
        driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
        driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
        driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
        driver.quit();
    }

// Оплата по счету + доставка с курьером + выдает чек + заказ по  email
@Test
    public void testCashlessCourierCheckEmail() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-3"));  //оплата по счету
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));//доставка с курьером
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);
        WebElement che = driver.findElement(By.id("check1"));               //выдает чек
        JavascriptExecutor doer = (JavascriptExecutor)driver;
        doer.executeScript("arguments[0].click();", che);
        WebElement ch = driver.findElement(By.id("check2"));                //заказ по  email
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
        driver.quit();
    }
// оплата по счету + самовывоз + выдает чек + заказ по  email
@Test
    public void testChashlessPickup() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-3"));  //оплата по счету
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));//самовывоз
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);
        WebElement che = driver.findElement(By.id("check1"));               //выдает чек
        JavascriptExecutor doer = (JavascriptExecutor)driver;
        doer.executeScript("arguments[0].click();", che);
        WebElement ch = driver.findElement(By.id("check2"));                //заказ по  email
        JavascriptExecutor performer = (JavascriptExecutor)driver;
        performer.executeScript("arguments[0].click();", ch);

        driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
        driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
        driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
        driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
        driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
        driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
        driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
        driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
        driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
        driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
        driver.findElement(By.xpath(".//*[text()='Марка']/.."));
        driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
        driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
        driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
        driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
        driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
        driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
        driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
        driver.findElement(By.xpath(".//*[text()='55Print']/.."));
        driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
        driver.quit();
    }
// расчет по карте + доставка с курьером + выдает чек + заказ по  email
@Test
    public void testPaymentCourierCheckEmail() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-2"));   //расчет по карте
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("deliveryMethod-item-2")); //доставка с курьером
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);
        WebElement che = driver.findElement(By.id("check1"));                //выдает чек
        JavascriptExecutor doer = (JavascriptExecutor)driver;
        doer.executeScript("arguments[0].click();", che);
        WebElement ch = driver.findElement(By.id("check2"));                 //заказ по  email
        JavascriptExecutor performer = (JavascriptExecutor)driver;
        performer.executeScript("arguments[0].click();", ch);

        driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
        driver.quit();
    }
// расчет по карте  + самовывоз + выдает чек + заказ по  email
@Test
    public void testPaymentPickupCheckEmail() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://" + username + ":" + password + "@polygraphy.7bits.it");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement we = driver.findElement(By.id("paymentMethod-item-2"));  //расчет по карте
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);
        WebElement wee = driver.findElement(By.id("deliveryMethod-item-1")); //самовывоз
        JavascriptExecutor executore = (JavascriptExecutor)driver;
        executore.executeScript("arguments[0].click();", wee);
        WebElement che = driver.findElement(By.id("check1"));                //выдает чек
        JavascriptExecutor doer = (JavascriptExecutor)driver;
        doer.executeScript("arguments[0].click();", che);
        WebElement ch = driver.findElement(By.id("check2"));                 //заказ по  email
        JavascriptExecutor performer = (JavascriptExecutor)driver;
        performer.executeScript("arguments[0].click();", ch);

        driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
        driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
        driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
        driver.quit();
    }
}