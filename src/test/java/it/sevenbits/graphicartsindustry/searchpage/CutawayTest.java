// все тесты, связанные с чекбоксом "изготовление визиток"
package it.sevenbits.graphicartsindustry.searchpage;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class CutawayTest {
    private WebDriver driver;
    /*public static final String USERNAME = System.getenv("SAUCE_LABS_USERNAME");
    public static final String ACCESS_KEY = System.getenv("SAUCE_LABS_PASSWORD");
    public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
    public static final String username = System.getenv("POLYGRAPHY_USERNAME");
    public static final String password = System.getenv("POLYGRAPHY_PASSWORD");
    public static final String domain = System.getenv("POLYGRAPHY_DOMAIN");*/
// + наличный расчет
@Test
  public void testCash() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));               // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    driver.findElement(By.id("paymentMethod")).click();
    WebElement wee = driver.findElement(By.id("paymentMethod-item-1"));// наличный расчет
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Дизайн-Проект']/.."));
    driver.findElement(By.xpath(".//*[text()='Офисная полиграфия и комфорт']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт Экспресс']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='Медиаплюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    driver.quit();
  }
// + расчет по карте
@Test
  public void testCashless() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));              // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));// paymentMethod-item-2
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);

    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.quit();
  }

// + оплата по счету
@Test
  public void testPayment() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));              // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));// оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);

    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Офисная полиграфия и комфорт']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.quit();
  }
// + Самовывоз
@Test
  public void testPickup() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));               // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));// Самовывоз
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);

    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Дизайн-Проект']/.."));
    driver.findElement(By.xpath(".//*[text()='Офисная полиграфия и комфорт']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт Экспресс']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='Медиаплюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
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
// + Доставка с курьером
@Test
  public void testCourier() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));               // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));// Доставка с курьером
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);

    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.quit();
  }
// выдает чек
@Test
  public void testCheck() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("check1"));         // выдает чек
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);

    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Дизайн-Проект']/.."));
    driver.findElement(By.xpath(".//*[text()='Офисная полиграфия и комфорт']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт Экспресс']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='Медиаплюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
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
// + Принимает заказ по email
@Test
  public void testEmail() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement wee = driver.findElement(By.id("check2"));        // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    driver.quit();
  }
// + выдает чек + принимает заказ по email
@Test
  public void testCheckEmail() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("check1"));         // выдает чек
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));        // принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
     driver.quit();
  }
// + Наличный расчет + Самовывоз
@Test
  public void testCashPickup() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");

    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));                 // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));  // Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));// Самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Дизайн-Проект']/.."));
    driver.findElement(By.xpath(".//*[text()='Офисная полиграфия и комфорт']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт Экспресс']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='Медиаплюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    driver.quit();
  }
// + Наличный расчет + Доставка с курьером
@Test
  public void testCachCourier() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));                // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));  // Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));// Доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.quit();
  }
// + Оплата по счету + Самовывоз
@Test
  public void testPaymentPickup() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));                // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));  // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));// Самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Офисная полиграфия и комфорт']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.quit();
  }
// + Оплата по счету + Доставка с курьером
@Test
  public void testPaymentCourier() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));                // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));  // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));// Доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.quit();
  }
// + Расчет по карте + Самовывоз
  @Test
  public void testCashlessPickup() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));                // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));  // Расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));//Самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.quit();
  }
// + Расчет по карте + Доставка с курьером
@Test
  public void testCashlessCourier() throws Exception {
   driver = new ChromeDriver();
   driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

   WebElement card = driver.findElement(By.id("btn9"));                // изготовление визиток
   JavascriptExecutor cutaway = (JavascriptExecutor)driver;
   cutaway.executeScript("arguments[0].click();", card);
   WebElement we = driver.findElement(By.id("paymentMethod-item-2"));  // Расчет по карте
   JavascriptExecutor executor = (JavascriptExecutor)driver;
   executor.executeScript("arguments[0].click();", we);
   WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));// Доставка с курьером
   JavascriptExecutor executore = (JavascriptExecutor)driver;
   executore.executeScript("arguments[0].click();", wee);

   driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
   driver.quit();
  }
// + Наличный расчет + Выдает чек
@Test
  public void testCashCheck() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));              // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));// Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));            // Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Дизайн-Проект']/.."));
    driver.findElement(By.xpath(".//*[text()='Офисная полиграфия и комфорт']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт Экспресс']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='Медиаплюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    driver.quit();
  }
// + Оплата по счету + Выдает чек
@Test
  public void testPaymentCheck() throws Exception {DesiredCapabilities caps = DesiredCapabilities.chrome();
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));              // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));// Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));             //Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Офисная полиграфия и комфорт']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.quit();
  }
// + Расчет по карте + Выдает чек
@Test
  public void testCashlessCheck() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));              // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));// Расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));             // Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.quit();
  }
// + Самовывоз + Выдает чек
@Test
  public void testPickupCheck() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));               // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));// Самовывоз
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));              //Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Дизайн-Проект']/.."));
    driver.findElement(By.xpath(".//*[text()='Офисная полиграфия и комфорт']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт Экспресс']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='Медиаплюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
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
// + Доставка с курьером + Выдает чек
@Test
  public void testCourierCheck() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));                // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));// Доставка с курьером
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check1"));              // Выдает чек
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.quit();
  }
// + Наличный расчет + Принимает заказ по email
@Test
  public void testCashEmail() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));               // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));// Наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));             // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    driver.quit();
  }
// + Оплата по счету + Принимает заказ по email
@Test
  public void testPaymentEmail() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));               // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));// Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));             // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.quit();
  }
// + Расчет по карте + Принимает заказ по email
@Test
  public void testCashlessEmail() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));              // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));// Расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));             // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.quit();
   }
// + Самовывоз + Принимает заказ по email
@Test
  public void testPickupEmail() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));               // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));// Самовывоз
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));              // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    driver.quit();
  }
// + Доставка с курьером + Принимает заказ по email
@Test
  public void testCourierEmail() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));               // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));// Доставка с курьером
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("check2"));              // Принимает заказ по email
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);

    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.quit();
  }
// + наличный расчет + самовывоз + выдает чек
@Test
  public void testCashPickupCheck() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));                // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));  // наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));// самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));               //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);

    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Дизайн-Проект']/.."));
    driver.findElement(By.xpath(".//*[text()='Офисная полиграфия и комфорт']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт Экспресс']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='Медиаплюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    driver.quit();
  }
// + наличный расчет + доставка с курьером + выдает чек
@Test
  public void testCashCourierCheck() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));                // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));  // наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));//доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));               //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);

    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.quit();
  }
// + оплата по счету + доставка с курьером + выдает чек
@Test
  public void testCashlessPaymentCourierCheck() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));                // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));  // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));//доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));               //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);

    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.quit();
  }
// + оплата по счету + самовывоз + выдает чек
@Test
  public void testPaymentPickupCheck() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));                // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));  // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));//самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));               //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);

    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Офисная полиграфия и комфорт']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.quit();
  }
// + расчет по карте + доставка с курьером + выдает чек
@Test
  public void testCashlessCourierCheck() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));                // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));  // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));//доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));               //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);

    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
    driver.quit();
  }
// + расчет по карте + самовывоз + выдает чек
@Test
  public void testCashlessPickupCheck() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));                // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));  // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));// самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));               //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);

    driver.findElement(By.xpath(".//*[text()='СКАЙ ПРИНТ']/.."));
    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.quit();
  }
// + наличный расчет + самовывоз + заказ по  email
@Test
  public void testCashPickupEmail() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));                // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));  // наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));//самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));                //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);

    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    driver.quit();
  }
// + наличный расчет + доставка с курьером + заказ по  email
@Test
  public void testCashCourierEmail() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));                // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));  // наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));// доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));                //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);

    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.quit();
  }
// + оплата по счету + доставка с курьером + заказ по  email
@Test
  public void testPaymentCourierEmail() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));                // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));  // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));// доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));                //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);

    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.quit();
  }
// + оплата по счету + самовывоз + заказ по  email
@Test
  public void testPaymentPickupEmail() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));                // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));  // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));//самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));                //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);

    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.quit();
  }
// + расчет по карте + доставка с курьером + заказ по  email
@Test
  public void testCashlessCourierEmail() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));                // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));  // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));// доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));                //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);

    driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
    driver.quit();
  }
// + расчет по карте + самовывоз + заказ по  email
@Test
  public void testCashlessPickupEmail() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));               // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-2")); // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));// самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement ch = driver.findElement(By.id("check2"));                //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);

    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.quit();
  }
// + оплата наличными + выдает чек + заказ по  email
@Test
  public void testCashCheckEmail() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));              // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));// оплата наличными
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement che = driver.findElement(By.id("check1"));             //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));              //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);

    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    driver.quit();
  }
// + оплата по счету + выдает чек + заказ по  email
@Test
  public void testPaymentCheckEmail() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));              // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));// оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement che = driver.findElement(By.id("check1"));             //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));              //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);

    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.quit();
  }
// + расчет по карте + выдает чек + заказ по  email
@Test
  public void testCashlessCheckEmail() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));              // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));// расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement che = driver.findElement(By.id("check1"));             //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));              //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);

    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.quit();
  }
// + самовывоз + выдает чек + заказ по  email
@Test
  public void testPickupCheckEmail() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));               // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));// самовывоз
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement che = driver.findElement(By.id("check1"));              //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));               //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);

    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    driver.quit();
  }
// + доставка с курьером + выдает чек + заказ по  email
@Test
  public void testCourierCheckEmail() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));               // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));// доставка с курьером
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement che = driver.findElement(By.id("check1"));              //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));               //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);

    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.quit();
  }
// + наличный расчет + самовывоз + выдает чек + заказ по  email
@Test
  public void testCashPickupCheckEmail() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));                // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));  // наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));// самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));               //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));                //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);

    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
    driver.quit();
  }
// + наличный расчет + доставка с курьером + выдает чек + заказ по  email
  @Test
  public void testCashCourierCheckEmail() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));                // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));  // наличный расчет
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));// доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));               //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));                //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);

    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.quit();
  }
// + Оплата по счету + доставка с курьером + выдает чек + заказ по  email
@Test
  public void testPaymentCourierCheckEmail() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));                // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));  // Оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));// доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));               //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));                //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);

    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.quit();
  }
// оплата по счету + самовывоз + выдает чек + заказ по  email
@Test
  public void testPaymentPickupCheckEmail() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));                // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));  // оплата по счету
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));// самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));               //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));                //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);

    driver.findElement(By.xpath(".//*[text()='КАЙРОС']/.."));
    driver.findElement(By.xpath(".//*[text()='Печатное дело']/.."));
    driver.findElement(By.xpath(".//*[text()='ПечатьPremier']/.."));
    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.quit();
  }
// + расчет по карте + доставка с курьером + выдает чек + заказ по  email
@Test
  public void testCashlessCourierCheckEmail() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));                // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));  // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));// доставка с курьером
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));               //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));                //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);

    driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
    driver.quit();
  }
// + расчет по карте  + самовывоз + выдает чек + заказ по  email
@Test
  public void testCashlessPickupCheckEmail() throws Exception {
    driver = new ChromeDriver();
    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement card = driver.findElement(By.id("btn9"));                // изготовление визиток
    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
    cutaway.executeScript("arguments[0].click();", card);
    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));  // расчет по карте
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));// самовывоз
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement che = driver.findElement(By.id("check1"));               //выдает чек
    JavascriptExecutor doer = (JavascriptExecutor)driver;
    doer.executeScript("arguments[0].click();", che);
    WebElement ch = driver.findElement(By.id("check2"));                //заказ по  email
    JavascriptExecutor performer = (JavascriptExecutor)driver;
    performer.executeScript("arguments[0].click();", ch);

    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
    driver.quit();
  }
}
