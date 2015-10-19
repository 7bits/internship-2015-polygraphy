package it.sevenbits.graphicartsindustry.searchpage;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class ServiceTest {
  private WebDriver driver;
  /*public static final String USERNAME = System.getenv("SAUCE_LABS_USERNAME");
  public static final String ACCESS_KEY = System.getenv("SAUCE_LABS_PASSWORD");
  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
  public static final String username = System.getenv("POLYGRAPHY_USERNAME");
  public static final String password = System.getenv("POLYGRAPHY_PASSWORD");
  public static final String domain = System.getenv("POLYGRAPHY_DOMAIN");*/

    // Печать на футболках
@Test
  public void testTShirt() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement we = driver.findElement(By.id("btn1"));
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
    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    driver.quit();
}
// Печать на кружках
@Test
  public void testCap() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement we = driver.findElement(By.id("btn2"));
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
    driver.quit();
  }
// Изготовление визиток
@Test
  public void testCards() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement we = driver.findElement(By.id("btn9"));
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);

    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт Экспресс']/.."));
    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='Медиаплюс']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Офисная полиграфия и комфорт']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    driver.quit();
}
// Широкоформатная печать
@Test
  public void testPrint() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement we = driver.findElement(By.id("btn4"));
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);

    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
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
    driver.quit();
}
// футболки + кружки
@Test
  public void testFK() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement we = driver.findElement(By.id("btn1"));                // футболки
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement btn = driver.findElement(By.id("btn2"));                // кружки
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", btn);

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
    driver.quit();
   }
// футболки + визитки
@Test
  public void testFV() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement we = driver.findElement(By.id("btn1"));                // футболки
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement btn = driver.findElement(By.id("btn9"));                // визитки
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", btn);

    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    driver.quit();
  }
// футболки + ш\п
@Test
  public void testFSh() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement we = driver.findElement(By.id("btn1"));                // футболки
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement btn = driver.findElement(By.id("btn4"));                // ш\п
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", btn);

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
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    driver.quit();
  }
// кружки + визитки
@Test
  public void testKV() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement we = driver.findElement(By.id("btn2"));                // кружки
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement btn = driver.findElement(By.id("btn9"));                // визитки
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", btn);

    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    driver.quit();
  }
// кружки + ш\п
@Test
  public void testKSh() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement we = driver.findElement(By.id("btn2"));                // кружки
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement btn = driver.findElement(By.id("btn4"));                // ш\п
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", btn);

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
    driver.quit();
  }
// визитки + ш\п
@Test
  public void testVSh() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement we = driver.findElement(By.id("btn9"));                // визитки
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement btn = driver.findElement(By.id("btn4"));                // ш\п
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", btn);

    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт Экспресс']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='Медиаплюс']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    driver.quit();
  }
// футболки + кружки + визитки
@Test
  public void testFKV() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement we = driver.findElement(By.id("btn1"));                 // футболки
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement btn = driver.findElement(By.id("btn2"));                // кружки
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", btn);
    WebElement cal = driver.findElement(By.id("btn9"));                // визитки
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", cal);

    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    driver.quit();
  }
// футболки + кружки + ш\п
@Test
  public void testFKSh() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement we = driver.findElement(By.id("btn1"));                 // футболки
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement btn = driver.findElement(By.id("btn2"));                // кружки
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", btn);
    WebElement pr = driver.findElement(By.id("btn4"));                // ш\п
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", pr);

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
    driver.quit();
  }
// кружки + визитки + ш\п
@Test
  public void testKVSh() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement we = driver.findElement(By.id("btn2"));                // кружки
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement btn = driver.findElement(By.id("btn9"));                // визитки
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", btn);
    WebElement pr = driver.findElement(By.id("btn4"));                // ш\п
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", pr);

    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    driver.quit();
  }
// футболки + визитки + ш\п
@Test
  public void testFVSh() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement we = driver.findElement(By.id("btn1"));                 // футболки
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement btn = driver.findElement(By.id("btn9"));                // визитки
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", btn);
    WebElement pr = driver.findElement(By.id("btn4"));                // ш\п
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", pr);

    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    driver.quit();
  }
// футболки + кружки + визитки + ш\п
@Test
  public void testFourService() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement we = driver.findElement(By.id("btn1"));                 // футболки
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement btn = driver.findElement(By.id("btn2"));                // кружки
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", btn);
    WebElement cal = driver.findElement(By.id("btn9"));                // визитки
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", cal);
    WebElement pr = driver.findElement(By.id("btn4"));                // ш\п
    JavascriptExecutor executant = (JavascriptExecutor)driver;
    executant.executeScript("arguments[0].click();", pr);

    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    driver.quit();
  }
}
