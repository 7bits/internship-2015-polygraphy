//// все тесты, связанные с чекбоксом "широкоформатная печать"
//package it.sevenbits.graphicartsindustry.searchpage;
//
//import java.net.URL;
//import java.sql.DriverManager;
//import java.util.regex.Pattern;
//import java.util.concurrent.TimeUnit;
//
//import com.thoughtworks.selenium.webdriven.commands.WaitForCondition;
//import org.junit.*;
//import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.*;
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class WidescreenTest {
//   public static final String USERNAME = "nastya_prohorova";
//   public static final String ACCESS_KEY = "475fc805-6e70-46a5-adb4-938288051155";
//   public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
//
//// + наличный расчет
//@Test
//  public void testCash() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));             // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement wee = driver.findElement(By.id("paymentMethod-item-1"));// наличный расчет
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
//    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
//    driver.findElement(By.xpath(".//*[text()='Изба-принт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
//    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Медиаплюс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
//    driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
//    driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт Экспресс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Ретранс']/.."));
//    driver.quit();
//  }
//// + расчет по карте
//@Test
//  public void testCashless() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));            // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));// расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.quit();
//  }
//// + оплата по счету
//@Test
//  public void testPayment() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));            // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));// оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
//    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
//    driver.findElement(By.xpath(".//*[text()='Изба-принт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
//    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
//    driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Ретранс']/.."));
//    driver.quit();
//  }
//// + Самовывоз
//@Test
//  public void testPickup() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));             // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));// Самовывоз
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
//    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
//    driver.findElement(By.xpath(".//*[text()='Изба-принт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
//    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Медиаплюс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
//    driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
//    driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт Экспресс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Ретранс']/.."));
//    driver.quit();
//  }
//// + Доставка с курьером
//@Test
//  public void testCourier() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));             // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));// Доставка с курьером
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.quit();
//  }
//// выдает чек
//@Test
//  public void testCheck() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("check1"));          // выдает чек
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
//    driver.findElement(By.xpath(".//*[text()='Изба-принт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт Экспресс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
//    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='Медиаплюс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
//    driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Ретранс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//    driver.quit();
//  }
//// + Принимает заказ по email
//@Test
//  public void testEmail() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
//    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
//    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//    driver.quit();
//  }
//// + выдает чек + принимает заказ по email
//@Test
//  public void testCheckEmail() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("check1"));           // выдает чек
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
//    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//    driver.quit();
//  }
//// + Наличный расчет + Самовывоз
//@Test
//  public void testCashPickup() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));              // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));  // Наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));// Самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
//    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
//    driver.findElement(By.xpath(".//*[text()='Изба-принт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
//    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Медиаплюс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
//    driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
//    driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт Экспресс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Ретранс']/.."));
//    driver.quit();
//  }
//// + Наличный расчет + Доставка с курьером
//  @Test
//  public void testCachCourier() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));              // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));  // Наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));// Доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//      driver.quit();
//  }
//// + Оплата по счету + Самовывоз
//  @Test
//  public void testPaymentPickup() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));              // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));  // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));// Самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
//    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
//    driver.findElement(By.xpath(".//*[text()='Изба-принт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
//    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
//    driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Ретранс']/.."));
//      driver.quit();
//  }
//// + Оплата по счету + Доставка с курьером
//@Test
//  public void testPaymentCourier() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));              // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));  // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));// Доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.quit();
//  }
//// + Расчет по карте + Самовывоз
//@Test
//  public void testCashlessPickup() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));              // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));  // Расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));//Самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.quit();
//  }
//// + Расчет по карте + Доставка с курьером
//@Test
//  public void testCashlessCourier() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));              // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));  // Расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));// Доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
//    driver.quit();
//  }
//// + Наличный расчет + Выдает чек
//@Test
//  public void testCashCheck() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));            // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));// Наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));             // Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
//    driver.findElement(By.xpath(".//*[text()='Изба-принт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
//    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Медиаплюс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
//    driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
//    driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт Экспресс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Ретранс']/.."));
//    driver.quit();
//  }
//// + Оплата по счету + Выдает чек
//@Test
//  public void testPaymentCheck() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));            // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));// Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));             //Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
//    driver.findElement(By.xpath(".//*[text()='Изба-принт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
//    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
//    driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Ретранс']/.."));
//    driver.quit();
//  }
//// + Расчет по карте + Выдает чек
//@Test
//  public void testCashlessCheck() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));            // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));// Расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));             // Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.quit();
//  }
//// + Самовывоз + Выдает чек
//  @Test
//  public void testPickupCheck() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));             // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));// Самовывоз
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));              //Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
//    driver.findElement(By.xpath(".//*[text()='Изба-принт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
//    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Медиаплюс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
//    driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
//    driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт Экспресс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Ретранс']/.."));
//      driver.quit();
//  }
//// + Доставка с курьером + Выдает чек
//  @Test
//  public void testCourierCheck() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));             // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));// Доставка с курьером
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));              // Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//      driver.quit();
//  }
//// + Наличный расчет + Принимает заказ по email
//@Test
//  public void testCashEmail() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));            // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));// Наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));             // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
//    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
//    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//    driver.quit();
//  }
//// + Оплата по счету + Принимает заказ по email
//@Test
//  public void testPaymentEmail() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));            // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));// Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));             // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
//    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
//    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.quit();
//  }
//// + Расчет по карте + Принимает заказ по email
//  @Test
//  public void testCashlessEmail() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));             // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2")); // Расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));              // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//      driver.quit();
//  }
//// + Самовывоз + Принимает заказ по email
//  @Test
//  public void testPickupEmail() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));             // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));// Самовывоз
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));              // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
//    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
//    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//      driver.quit();
//  }
//// + Доставка с курьером + Принимает заказ по email
//  @Test
//  public void testCourierEmail() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));             // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));// Доставка с курьером
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));              // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//      driver.quit();
//  }
//// + наличный расчет + самовывоз + выдает чек
//@Test
//  public void testCashPickupCheck() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));             // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1")); // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));// самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));               //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
//    driver.findElement(By.xpath(".//*[text()='Изба-принт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
//    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Медиаплюс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
//    driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
//    driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт Экспресс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Ретранс']/.."));
//    driver.quit();
//  }
//// + наличный расчет + доставка с курьером + выдает чек
//  @Test
//  public void testCashCourierCheck() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));              // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));  // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));//доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));               //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//      driver.quit();
//  }
//// + оплата по счету + доставка с курьером + выдает чек
//@Test
//  public void testCashlessPaymentCourierCheck() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));              // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));  // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));//доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//     WebElement che = driver.findElement(By.id("check1"));              //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.quit();
//  }
//// + оплата по счету + самовывоз + выдает чек
//  @Test
//  public void testPaymentPickupCheck() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));              // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));  // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));//самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));               //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
//    driver.findElement(By.xpath(".//*[text()='Изба-принт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
//    driver.findElement(By.xpath(".//*[text()='Глобал Принт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Образование Информ']/.."));
//    driver.findElement(By.xpath(".//*[text()='Советская Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Ретранс']/.."));
//      driver.quit();
//  }
//// + расчет по карте + доставка с курьером + выдает чек
//  @Test
//  public void testCashlessCourierCheck() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));              // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));  // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));//доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));               //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
//    driver.quit();
//  }
//// + расчет по карте + самовывоз + выдает чек
//@Test
//  public void testCashlessPickupCheck() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));              // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));  // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));// самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));               //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.quit();
//  }
//// + наличный расчет + самовывоз + заказ по  email
//  @Test
//  public void testCashPickupEmail() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));              // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));  // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));//самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));                //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
//    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
//    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//      driver.quit();
//  }
//// + наличный расчет + доставка с курьером + заказ по  email
//@Test
//  public void testCashCourierEmail() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));              // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));  // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));// доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));               //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.quit();
//  }
//// + оплата по счету + доставка с курьером + заказ по  email
//@Test
//  public void testPaymentCourierEmail() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));              // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));  // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));// доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));               //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.quit();
//  }
//// + оплата по счету + самовывоз + заказ по  email
//  @Test
//  public void testPaymentPickupEmail() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));              // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));  // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));//самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));                //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
//    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
//    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.quit();
//  }
//// + расчет по карте + доставка с курьером + заказ по  email
//@Test
//  public void testCashlessCourierEmail() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));              // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));  // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));// доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));                //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
//    driver.quit();
//  }
//// + расчет по карте + самовывоз + заказ по  email
//@Test
//  public void testCashlessPickupEmail() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));              // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));  // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));// самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));                //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.quit();
//  }
//// + оплата наличными + выдает чек + заказ по  email
//  @Test
//  public void testCashCheckEmail() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));            // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));// оплата наличными
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));             //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));              //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
//    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//      driver.quit();
//  }
//// + оплата по счету + выдает чек + заказ по  email
//@Test
//  public void testPaymentCheckEmail() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));// оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));            //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
//    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.quit();
//  }
//// + расчет по карте + выдает чек + заказ по  email
//  @Test
//  public void testCashlessCheckEmail() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));            // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));// расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));             //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));              //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//      driver.quit();
//  }
//// + самовывоз + выдает чек + заказ по  email
//  @Test
//  public void testPickupCheckEmail() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));             // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));// самовывоз
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));              //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));               //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
//    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//      driver.quit();
//  }
//// + доставка с курьером + выдает чек + заказ по  email
//  @Test
//  public void testCourierCheckEmail() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));             // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));// доставка с курьером
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));              //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));               //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//      driver.quit();
//  }
//// + наличный расчет + самовывоз + выдает чек + заказ по  email
//  @Test
//  public void testCashPickupCheckEmail() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));              // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));  // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));// самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));               //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));                //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
//    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//      driver.quit();
//  }
//// + наличный расчет + доставка с курьером + выдает чек + заказ по  email
//@Test
//  public void testCashCourierCheckEmail() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));              // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));  // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));// доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));               //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));               //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.quit();
//  }
//// + Оплата по счету + доставка с курьером + выдает чек + заказ по  email
//@Test
//  public void testPaymentCourierCheckEmail() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));              // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));  // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));// доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));               //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));                //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.quit();
//  }
//// оплата по счету + самовывоз + выдает чек + заказ по  email
//@Test
//  public void testPaymentPickupCheckEmail() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));              // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));  // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));// самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));               //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));                //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Оригинал']/.."));
//    driver.findElement(By.xpath(".//*[text()='Марка']/.."));
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='АЛЬФА-ПРИНТ']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.quit();
//  }
//// + расчет по карте + доставка с курьером + выдает чек + заказ по  email
//@Test
//  public void testCashlessCourierCheckEmail() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));              // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));  // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));// доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));               //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));                //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
//    driver.quit();
//  }
//// + расчет по карте  + самовывоз + выдает чек + заказ по  email
//@Test
//  public void testCashlessPickupCheckEmail() throws Exception {
//    DesiredCapabilities caps = DesiredCapabilities.chrome();
//    caps.setCapability("platform", "Linux");
//    caps.setCapability("version", "45.0");
//
//    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//    driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    WebElement screen = driver.findElement(By.id("btn4"));              // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));  // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));// самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));               //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));                //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.quit();
//  }
//}
