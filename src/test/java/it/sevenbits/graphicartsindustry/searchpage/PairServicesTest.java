//// тесты сервисов (в разделе "часто ищут") комбинированных попарно между собой
//package it.sevenbits.graphicartsindustry.searchpage;
//
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
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//
//public class PairServicesTest {
//  private WebDriver driver;
//  private String baseUrl;
//  private boolean acceptNextAlert = true;
//  private StringBuffer verificationErrors = new StringBuffer();
//
//  @Before
//   public void setUp() throws Exception {
//    //driver = new FirefoxDriver();
//    System.setProperty("webdriver.chrome.driver", "src/test/java/it/sevenbits/graphicartsindustry/drivers//chromedriver.exe");
//    driver = new ChromeDriver();
//    baseUrl = "http://polygraphy:gjkbuhfabz@polygraphy.7bits.it";
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//  }
//
//// футболки + кружки + наличный расчет
//  @Test
//  public void testFKCash() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement wee = driver.findElement(By.id("paymentMethod-item-1"));        // наличный расчет
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//
//// футболки + кружки + расчет по карте
//@Test
//  public void testFKCashless() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));          // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//  }
//
//// футболки + кружки + оплата по счету
//@Test
//  public void testFKPayment() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
//  }
//
//// футболки + кружки + Самовывоз
//@Test
//  public void testFKPickup() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));           // Самовывоз
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//
//// футболки + кружки + Доставка с курьером
//@Test
//  public void testFKCourier() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));          // Доставка с курьером
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//
//// футболки + кружки + выдает чек
//@Test
//  public void testFKCheck() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("check1"));          // выдает чек
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//
//// футболки + кружки + Принимает заказ по email
//@Test
//  public void testFKEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//
//// футболки + кружки + выдает чек + принимает заказ по email
//  @Test
//  public void testFKCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("check1"));           // выдает чек
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + кружки + Наличный расчет + Самовывоз
//@Test
//  public void testFKCashPickup() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));          // Наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));         // Самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//    }
//
//// футболки + кружки + Наличный расчет + Доставка с курьером
//  @Test
//  public void testFKCachCourier() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));         // Наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));        // Доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//
//// футболки + кружки + Оплата по счету + Самовывоз
//  @Test
//  public void testFKPaymentPickup() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          // Самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
//  }
//// футболки + кружки + Оплата по счету + Доставка с курьером
//  @Test
//  public void testFKPaymentCourier() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // Доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// футболки + кружки + Расчет по карте + Самовывоз
//  @Test
//  public void testFKCashlessPickup() throws Exception {
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // Расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          //Самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//  }
//// футболки + кружки + Расчет по карте + Доставка с курьером
//  @Test
//  public void testFKCashlessCourier() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // Расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // Доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
//  }
//// футболки + кружки + Наличный расчет + Выдает чек
//  @Test
//  public void testFKCashCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // Наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + кружки + Оплата по счету + Выдает чек
//  @Test
//  public void testFKPaymentCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          //Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
//  }
//// футболки + кружки + Расчет по карте + Выдает чек
//  @Test
//  public void testFKCashlessCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // Расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//  }
//// футболки + кружки + Самовывоз + Выдает чек
//  @Test
//  public void testFKPickupCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));           // Самовывоз
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          //Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//      driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//      driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//      driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//      driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//      driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//      driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//      driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//      driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//      driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//      driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//      driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//      driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//      driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//      driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//      driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//      driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
//      driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//      driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + кружки + Доставка с курьером + Выдает чек
//  @Test
//  public void testFKCourierCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));           // Доставка с курьером
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// футболки + кружки + Наличный расчет + Принимает заказ по email
//  @Test
//  public void testFKCashEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));           // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // Наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + кружки + Оплата по счету + Принимает заказ по email
//  @Test
//  public void testFKPaymentEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//  }
//// футболки + кружки + Расчет по карте + Принимает заказ по email
//  @Test
//  public void testFKCashlessEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // Расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//// футболки + кружки + Самовывоз + Принимает заказ по email
//  @Test
//  public void testFKPickupEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));           // Самовывоз
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//      driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//      driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//      driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//      driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//      driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//      driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//      driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + кружки + Доставка с курьером + Принимает заказ по email
//  @Test
//  public void testFKCourierEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));           // Доставка с курьером
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// футболки + кружки + наличный расчет + самовывоз + выдает чек
//  @Test
//  public void testFKCashPickupCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//      driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//      driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//      driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//      driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//      driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//      driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//      driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//      driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//      driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//      driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//      driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//      driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//      driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//      driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//      driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//      driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + кружки + наличный расчет + доставка с курьером + выдает чек
//  @Test
//  public void testFKCashCourierCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          //доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//      driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// футболки + кружки + оплата по счету + доставка с курьером + выдает чек
//  @Test
//  public void testFKCashlessPaymentCourierCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          //доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//     WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//      driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// футболки + кружки + оплата по счету + самовывоз + выдает чек
//  @Test
//  public void testFKPaymentPickupCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          //самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//      driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//      driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//      driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//      driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//      driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//      driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//      driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//      driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//      driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//      driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//      driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//      driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
//  }
//// футболки + кружки + расчет по карте + доставка с курьером + выдает чек
//  @Test
//  public void testFKCashlessCourierCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          //доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
//  }
//// футболки + кружки + расчет по карте + самовывоз + выдает чек
//  @Test
//  public void testFKCashlessPickupCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));               // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//      driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//      driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//      driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//      driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//  }
//// футболки + кружки + наличный расчет + самовывоз + заказ по  email
//  @Test
//  public void testFKCashPickupEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          //самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//      driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//      driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//      driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//      driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//      driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//      driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + кружки + наличный расчет + доставка с курьером + заказ по  email
//  @Test
//  public void testFKCashCourierEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// футболки + кружки + оплата по счету + доставка с курьером + заказ по  email
//  @Test
//  public void testFKPaymentCourierEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// футболки + кружки + оплата по счету + самовывоз + заказ по  email
//  @Test
//  public void testFKPaymentPickupEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          //самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//      driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//      driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//      driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//      driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//      driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//  }
//// футболки + кружки + расчет по карте + доставка с курьером + заказ по  email
//  @Test
//  public void testFKCashlessCourierEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
// }
//// футболки + кружки + расчет по карте + самовывоз + заказ по  email
//  @Test
//  public void testFKCashlessPickupEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//     WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//      driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//// футболки + кружки + оплата наличными + выдает чек + заказ по  email
//  @Test
//  public void testFKCashCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // оплата наличными
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//      driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//      driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//      driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//      driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//      driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//      driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + кружки + оплата по счету + выдает чек + заказ по  email
//  @Test
//  public void testFKPaymentCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//      driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//      driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//      driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//      driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//      driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//  }
//// футболки + кружки + расчет по карте + выдает чек + заказ по  email
//  @Test
//  public void testFKCashlessCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//// футболки + кружки + самовывоз + выдает чек + заказ по  email
//  @Test
//  public void testFKPickupCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));           // самовывоз
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//      driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//      driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//      driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//      driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//      driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//      driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//      driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + кружки + доставка с курьером + выдает чек + заказ по  email
//  @Test
//  public void testFKCourierCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));           // доставка с курьером
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// футболки + кружки + наличный расчет + самовывоз + выдает чек + заказ по  email
//  @Test
//  public void testFKCashPickupCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));              // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//      driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//      driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//      driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//      driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//      driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//      driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + кружки + наличный расчет + доставка с курьером + выдает чек + заказ по  email
//  @Test
//  public void testFKCashCourierCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// футболки + кружки + Оплата по счету + доставка с курьером + выдает чек + заказ по  email
//  @Test
//  public void testFKPaymentCourierCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// футболки + кружки + оплата по счету + самовывоз + выдает чек + заказ по  email
//  @Test
//  public void testFKPaymentPickupCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));           // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));          // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));         // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));         //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));          //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//      driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//      driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//      driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//      driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//      driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//  }
//// футболки + кружки + расчет по карте + доставка с курьером + выдает чек + заказ по  email
//  @Test
//  public void testFKCashlessCourierCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));           // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
//  }
//// футболки + кружки + расчет по карте  + самовывоз + выдает чек + заказ по  email
//  @Test
//  public void testFKCashlessPickupCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//      driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//// футболки + ш/п + наличный расчет
//  @Test
//  public void testFShCash() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement wee = driver.findElement(By.id("paymentMethod-item-1"));        // наличный расчет
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
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
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
// }
//
//  // футболки + ш/п + расчет по карте
//  @Test
//  public void testFShCashless() throws Exception {
//  driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor) driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor) driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));          // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor) driver;
//    executor.executeScript("arguments[0].click();", we);
//
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//
//// футболки + ш/п + оплата по счету
//  @Test
//  public void testFShPayment() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//
//// футболки + ш/п + Самовывоз
//  @Test
//  public void testFShPickup() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));           // Самовывоз
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//      driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//      driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//      driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//      driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
//      driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//      driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//      driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//      driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//      driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//      driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//      driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//      driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//      driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//      driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//
//// футболки + ш/п + Доставка с курьером
//  @Test
//  public void testFShCourier() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));          // Доставка с курьером
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//
//// футболки + ш/п + выдает чек
//@Test
//  public void testFShCheck() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("check1"));          // выдает чек
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
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
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//
//// футболки + ш/п + Принимает заказ по email
//@Test
//  public void testFShEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//
//// футболки + ш/п + выдает чек + принимает заказ по email
//  @Test
//  public void testFShCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
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
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + ш/п + Наличный расчет + Самовывоз
//@Test
//  public void testFShCashPickup() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));          // Наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));         // Самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
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
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//
//// футболки + ш/п + Наличный расчет + Доставка с курьером
//  @Test
//  public void testFShCachCourier() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));         // Наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));        // Доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//
//// футболки + ш/п + Оплата по счету + Самовывоз
//  @Test
//  public void testFShPaymentPickup() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          // Самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//// футболки + ш/п + Оплата по счету + Доставка с курьером
//  @Test
//  public void testFShPaymentCourier() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // Доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// футболки + ш/п + Расчет по карте + Самовывоз
//  @Test
//  public void testFShCashlessPickup() throws Exception {
//    driver.get(baseUrl + "/");
//
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // Расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          //Самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//// футболки + ш/п + Расчет по карте + Доставка с курьером
//  @Test
//  public void testFShCashlessCourier() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // Расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // Доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
// }
//// футболки + ш/п + Наличный расчет + Выдает чек
//  @Test
//  public void testFShCashCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // Наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
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
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + ш/п + Оплата по счету + Выдает чек
//  @Test
//  public void testFShPaymentCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          //Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//// футболки + ш/п + Расчет по карте + Выдает чек
//  @Test
//  public void testFShCashlessCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // Расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//// футболки + ш/п + Самовывоз + Выдает чек
//  @Test
//  public void testFShPickupCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));           // Самовывоз
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          //Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
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
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + ш/п + Доставка с курьером + Выдает чек
//  @Test
//  public void testFShCourierCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));           // Доставка с курьером
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// футболки + ш/п + Наличный расчет + Принимает заказ по email
//  @Test
//  public void testFShCashEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));           // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // Наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + ш/п + Оплата по счету + Принимает заказ по email
//  @Test
//  public void testFShPaymentEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//  }
//// футболки + ш/п + Расчет по карте + Принимает заказ по email
//  @Test
//  public void testFShCashlessEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // Расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//   }
//// футболки + ш/п + Самовывоз + Принимает заказ по email
//  @Test
//  public void testFShPickupEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));           // Самовывоз
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + ш/п + Доставка с курьером + Принимает заказ по email
//  @Test
//  public void testFShCourierEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));           // Доставка с курьером
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// футболки + ш/п + наличный расчет + самовывоз + выдает чек
//  @Test
//  public void testFShCashPickupCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
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
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + ш/п + наличный расчет + доставка с курьером + выдает чек
//  @Test
//  public void testFShCashCourierCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          //доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// футболки + ш/п + оплата по счету + доставка с курьером + выдает чек
//  @Test
//  public void testFShCashlessPaymentCourierCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          //доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//     WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// футболки + ш/п + оплата по счету + самовывоз + выдает чек
//  @Test
//  public void testFShPaymentPickupCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          //самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//// футболки + ш/п + расчет по карте + доставка с курьером + выдает чек
//  @Test
//  public void testFShCashlessCourierCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          //доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
//  }
//// футболки + ш/п + расчет по карте + самовывоз + выдает чек
//  @Test
//  public void testFShCashlessPickupCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));               // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//// футболки + ш/п + наличный расчет + самовывоз + заказ по  email
//  @Test
//  public void testFShCashPickupEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          //самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + ш/п + наличный расчет + доставка с курьером + заказ по  email
//  @Test
//  public void testFShCashCourierEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// футболки + ш/п + оплата по счету + доставка с курьером + заказ по  email
//  @Test
//  public void testFShPaymentCourierEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// футболки + ш/п + оплата по счету + самовывоз + заказ по  email
//  @Test
//  public void testFShPaymentPickupEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          //самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//  }
//// футболки + ш/п + расчет по карте + доставка с курьером + заказ по  email
//  @Test
//  public void testFShCashlessCourierEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
// }
//// футболки + ш/п + расчет по карте + самовывоз + заказ по  email
//  @Test
//  public void testFShCashlessPickupEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//     WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//// футболки + ш/п + оплата наличными + выдает чек + заказ по  email
//  @Test
//  public void testFShCashCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // оплата наличными
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + ш/п + оплата по счету + выдает чек + заказ по  email
//  @Test
//  public void testFShPaymentCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//  }
//// футболки + ш/п + расчет по карте + выдает чек + заказ по  email
//  @Test
//  public void testFShCashlessCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//// футболки + ш/п + самовывоз + выдает чек + заказ по  email
//  @Test
//  public void testFShPickupCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));           // самовывоз
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + ш/п + доставка с курьером + выдает чек + заказ по  email
//  @Test
//  public void testFShCourierCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));           // доставка с курьером
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// футболки + ш/п + наличный расчет + самовывоз + выдает чек + заказ по  email
//  @Test
//  public void testFShCashPickupCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));              // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + ш/п + наличный расчет + доставка с курьером + выдает чек + заказ по  email
//  @Test
//  public void testFShCashCourierCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// футболки + ш/п + Оплата по счету + доставка с курьером + выдает чек + заказ по  email
//  @Test
//  public void testFShPaymentCourierCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// футболки + ш/п + оплата по счету + самовывоз + выдает чек + заказ по  email
//  @Test
//  public void testFShPaymentPickupCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));           // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));          // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));         // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));         //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));          //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//  }
//// футболки + ш/п + расчет по карте + доставка с курьером + выдает чек + заказ по  email
//  @Test
//  public void testFShCashlessCourierCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));           // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
//  }
//// футболки + ш/п + расчет по карте  + самовывоз + выдает чек + заказ по  email
//  @Test
//  public void testFShCashlessPickupCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//// футболки + визитки + наличный расчет
//  @Test
//  public void testFVCash() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement wee = driver.findElement(By.id("paymentMethod-item-1"));        // наличный расчет
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
// }
//// футболки + визитки + расчет по карте
//@Test
//  public void testFVCashless() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));          // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//  }
//
//// футболки + визитки + оплата по счету
//@Test
//  public void testFVPayment() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
// }
//// футболки + визитки + Самовывоз
//@Test
//  public void testFVPickup() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));           // Самовывоз
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//  driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//  driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//  driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
//  driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//  driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//  driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//  driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//  driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//  driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//  driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//  driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//  driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//  driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//  driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
//  driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//  driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  //driver.quit();
//  }
//
//// футболки + визитки + Доставка с курьером
//@Test
//  public void testFVCourier() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));          // Доставка с курьером
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// футболки + визитки + выдает чек
//@Test
//  public void testFVCheck() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("check1"));          // выдает чек
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//  driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//  driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//  driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
//  driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//  driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//  driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//  driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//  driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//  driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//  driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//  driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//  driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//  driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//  driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
//  driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//  driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//   }
//// футболки + визитки + Принимает заказ по email
//@Test
//  public void testFVEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + визитки + выдает чек + принимает заказ по email
//  @Test
//  public void testFVCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("check1"));           // выдает чек
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + визитки + Наличный расчет + Самовывоз
//@Test
//  public void testFVCashPickup() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));          // Наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));         // Самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//  driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//  driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//  driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
//  driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//  driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//  driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//  driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//  driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//  driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//  driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//  driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//  driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//  driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//// футболки + визитки + Наличный расчет + Доставка с курьером
//  @Test
//  public void testFVCachCourier() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));         // Наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));        // Доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*text()='futbolkaprint']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//    }
//
//// футболки + визитки + Оплата по счету + Самовывоз
//  @Test
//  public void testFVPaymentPickup() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          // Самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
//  }
//// футболки + визитки + Оплата по счету + Доставка с курьером
//  @Test
//  public void testFVPaymentCourier() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // Доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
// }
//// футболки + визитки + Расчет по карте + Самовывоз
//  @Test
//  public void testFVCashlessPickup() throws Exception {
//    driver.get(baseUrl + "/");
//
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // Расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          //Самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//  }
//// футболки + визитки + Расчет по карте + Доставка с курьером
//  @Test
//  public void testFVCashlessCourier() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // Расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // Доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
// }
//// футболки + визитки + Наличный расчет + Выдает чек
//  @Test
//  public void testFVCashCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // Наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + визитки + Оплата по счету + Выдает чек
//  @Test
//  public void testFVPaymentCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          //Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
//  }
//// футболки + визитки + Расчет по карте + Выдает чек
//  @Test
//  public void testFVCashlessCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // Расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//  }
//// футболки + визитки + Самовывоз + Выдает чек
//  @Test
//  public void testFVPickupCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));           // Самовывоз
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          //Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + визитки + Доставка с курьером + Выдает чек
//  @Test
//  public void testFVCourierCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));           // Доставка с курьером
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//  }
//// футболки + визитки + Наличный расчет + Принимает заказ по email
//  @Test
//  public void testFVCashEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));           // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // Наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + визитки + Оплата по счету + Принимает заказ по email
//  @Test
//  public void testFVPaymentEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//  }
//// футболки + визитки + Расчет по карте + Принимает заказ по email
//  @Test
//  public void testFVCashlessEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // Расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//   }
//// футболки + визитки + Самовывоз + Принимает заказ по email
//  @Test
//  public void testFVPickupEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));           // Самовывоз
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + визитки + Доставка с курьером + Принимает заказ по email
//  @Test
//  public void testFVCourierEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));           // Доставка с курьером
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//   }
//// футболки + визитки + наличный расчет + самовывоз + выдает чек
//  @Test
//  public void testFVCashPickupCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + визитки + наличный расчет + доставка с курьером + выдает чек
//  @Test
//  public void testFVCashCourierCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          //доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//  }
//// футболки + визитки + оплата по счету + доставка с курьером + выдает чек
//  @Test
//  public void testFVCashlessPaymentCourierCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          //доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//     WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//  }
//// футболки + визитки + оплата по счету + самовывоз + выдает чек
//  @Test
//  public void testFVPaymentPickupCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          //самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Аванта']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
//  }
//// футболки + визитки + расчет по карте + доставка с курьером + выдает чек
//  @Test
//  public void testFVCashlessCourierCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          //доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//  }
//// футболки + визитки + расчет по карте + самовывоз + выдает чек
//  @Test
//  public void testFVCashlessPickupCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));               // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//  }
//// футболки + визитки + наличный расчет + самовывоз + заказ по  email
//  @Test
//  public void testFVCashPickupEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          //самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + визитки + наличный расчет + доставка с курьером + заказ по  email
//  @Test
//  public void testFVCashCourierEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
// }
//// футболки + визитки + оплата по счету + доставка с курьером + заказ по  email
//  @Test
//  public void testFVPaymentCourierEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//   }
//// футболки + визитки + оплата по счету + самовывоз + заказ по  email
//  @Test
//  public void testFVPaymentPickupEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          //самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//  }
//// футболки + визитки + расчет по карте + доставка с курьером + заказ по  email
//  @Test
//  public void testFVCashlessCourierEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
// }
//// футболки + визитки + расчет по карте + самовывоз + заказ по  email
//  @Test
//  public void testFVCashlessPickupEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//     WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//// футболки + визитки + оплата наличными + выдает чек + заказ по  email
//  @Test
//  public void testFVCashCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // оплата наличными
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + визитки + оплата по счету + выдает чек + заказ по  email
//  @Test
//  public void testFVPaymentCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//  }
//// футболки + визитки + расчет по карте + выдает чек + заказ по  email
//  @Test
//  public void testFVCashlessCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//// футболки + визитки + самовывоз + выдает чек + заказ по  email
//  @Test
//  public void testFVPickupCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));           // самовывоз
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + визитки + доставка с курьером + выдает чек + заказ по  email
//  @Test
//  public void testFVCourierCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));           // доставка с курьером
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//  }
//// футболки + визитки + наличный расчет + самовывоз + выдает чек + заказ по  email
//  @Test
//  public void testFVCashPickupCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));              // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// футболки + визитки + наличный расчет + доставка с курьером + выдает чек + заказ по  email
//  @Test
//  public void testFVCashCourierCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//
//    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//  }
//// футболки + визитки + Оплата по счету + доставка с курьером + выдает чек + заказ по  email
//  @Test
//  public void testFVPaymentCourierCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//  }
//// футболки + визитки + оплата по счету + самовывоз + выдает чек + заказ по  email
//  @Test
//  public void testFVPaymentPickupCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));           // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));          // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));         // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));         //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));          //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='futbolkaprint']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//  }
//// футболки + визитки + расчет по карте + доставка с курьером + выдает чек + заказ по  email
//  @Test
//  public void testFVCashlessCourierCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));           // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//  }
//// футболки + визитки + расчет по карте  + самовывоз + выдает чек + заказ по  email
//  @Test
//  public void testFVCashlessPickupCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement shirt = driver.findElement(By.id("btn1"));         // печать на футболках
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Всемайки.ру']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//
//
//
//
//
//
//// кружки + ш/п + наличный расчет
//  @Test
//  public void testKShCash() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement wee = driver.findElement(By.id("paymentMethod-item-1"));        // наличный расчет
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//
//// кружки + ш/п + расчет по карте
//@Test
//  public void testKShCashless() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));          // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//  }
//
//// кружки + ш/п + оплата по счету
//@Test
//  public void testKShPayment() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
// }
//
//// кружки + ш/п + Самовывоз
//@Test
//  public void testKShPickup() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));           // Самовывоз
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//
//// кружки + ш/п + Доставка с курьером
//@Test
//  public void testKShCourier() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));          // Доставка с курьером
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
// }
//
//// кружки + ш/п + выдает чек
//@Test
//  public void testKShCheck() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("check1"));          // выдает чек
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
// }
//
//// кружки + ш/п + Принимает заказ по email
//@Test
//  public void testKShEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//}
//
//// кружки + ш/п + выдает чек + принимает заказ по email
//  @Test
//  public void testKShCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("check1"));           // выдает чек
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//}
//// кружки + ш/п + Наличный расчет + Самовывоз
//@Test
//  public void testKShCashPickup() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));          // Наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));         // Самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//    }
//
//// кружки + ш/п + Наличный расчет + Доставка с курьером
//  @Test
//  public void testKShCachCourier() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));         // Наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));        // Доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//  }
//
//// кружки + ш/п + Оплата по счету + Самовывоз
//  @Test
//  public void testKShPaymentPickup() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          // Самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
//  }
//// кружки + ш/п + Оплата по счету + Доставка с курьером
//  @Test
//  public void testKShPaymentCourier() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // Доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// кружки + ш/п + Расчет по карте + Самовывоз
//  @Test
//  public void testKShCashlessPickup() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // Расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          //Самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//  }
//// кружки + ш/п + Расчет по карте + Доставка с курьером
//  @Test
//  public void testKShCashlessCourier() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // Расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // Доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
//  }
//// кружки + ш/п + Наличный расчет + Выдает чек
//  @Test
//  public void testKShCashCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // Наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// кружки + ш/п + Оплата по счету + Выдает чек
//  @Test
//  public void testKShPaymentCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          //Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
//  }
//// кружки + ш/п + Расчет по карте + Выдает чек
//  @Test
//  public void testKShCashlessCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // Расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//  }
//// кружки + ш/п + Самовывоз + Выдает чек
//  @Test
//  public void testKShPickupCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));           // Самовывоз
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          //Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// кружки + ш/п + Доставка с курьером + Выдает чек
//  @Test
//  public void testKShCourierCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));           // Доставка с курьером
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// кружки + ш/п + Наличный расчет + Принимает заказ по email
//  @Test
//  public void testKShCashEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // Наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// кружки + ш/п + Оплата по счету + Принимает заказ по email
//  @Test
//  public void testKShPaymentEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//  }
//// кружки + ш/п + Расчет по карте + Принимает заказ по email
//  @Test
//  public void testKShCashlessEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // Расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//// кружки + ш/п + Самовывоз + Принимает заказ по email
//  @Test
//  public void testKShPickupEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));           // Самовывоз
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// кружки + ш/п + Доставка с курьером + Принимает заказ по email
//  @Test
//  public void testKShCourierEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));           // Доставка с курьером
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// кружки + ш/п + наличный расчет + самовывоз + выдает чек
//  @Test
//  public void testKShCashPickupCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// кружки + ш/п + наличный расчет + доставка с курьером + выдает чек
//  @Test
//  public void testKShCashCourierCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          //доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//  }
//// кружки + ш/п + оплата по счету + доставка с курьером + выдает чек
//  @Test
//  public void testKShCashlessPaymentCourierCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          //доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//     WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// кружки + ш/п + оплата по счету + самовывоз + выдает чек
//  @Test
//  public void testKShPaymentPickupCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          //самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
//  }
//// кружки + ш/п + расчет по карте + доставка с курьером + выдает чек
//  @Test
//  public void testKShCashlessCourierCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          //доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
// }
//// кружки + ш/п + расчет по карте + самовывоз + выдает чек
//  @Test
//  public void testKShCashlessPickupCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));               // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//  }
//// кружки + ш/п + наличный расчет + самовывоз + заказ по  email
//  @Test
//  public void testKShCashPickupEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          //самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// кружки + ш/п + наличный расчет + доставка с курьером + заказ по  email
//  @Test
//  public void testKShCashCourierEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// кружки + ш/п + оплата по счету + доставка с курьером + заказ по  email
//  @Test
//  public void testKShPaymentCourierEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// кружки + ш/п + оплата по счету + самовывоз + заказ по  email
//  @Test
//  public void testKShPaymentPickupEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          //самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//  }
//// кружки + ш/п + расчет по карте + доставка с курьером + заказ по  email
//  @Test
//  public void testKShCashlessCourierEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
//  }
//// кружки + ш/п + расчет по карте + самовывоз + заказ по  email
//  @Test
//  public void testKShCashlessPickupEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//     WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//  driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//// кружки + ш/п + оплата наличными + выдает чек + заказ по  email
//  @Test
//  public void testKShCashCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // оплата наличными
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// кружки + ш/п + оплата по счету + выдает чек + заказ по  email
//  @Test
//  public void testKShPaymentCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//  }
//// кружки + ш/п + расчет по карте + выдает чек + заказ по  email
//  @Test
//  public void testKShCashlessCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//// кружки + ш/п + самовывоз + выдает чек + заказ по  email
//  @Test
//  public void testKShPickupCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));           // самовывоз
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// кружки + ш/п + доставка с курьером + выдает чек + заказ по  email
//  @Test
//  public void testKShCourierCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));           // доставка с курьером
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// кружки + ш/п + наличный расчет + самовывоз + выдает чек + заказ по  email
//  @Test
//  public void testKShCashPickupCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));              // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// кружки + ш/п + наличный расчет + доставка с курьером + выдает чек + заказ по  email
//  @Test
//  public void testKShCashCourierCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// кружки + ш/п + Оплата по счету + доставка с курьером + выдает чек + заказ по  email
//  @Test
//  public void testKShPaymentCourierCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// кружки + ш/п + оплата по счету + самовывоз + выдает чек + заказ по  email
//  @Test
//  public void testKShPaymentPickupCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//  }
//// кружки + ш/п + расчет по карте + доставка с курьером + выдает чек + заказ по  email
//  @Test
//  public void testKShCashlessCourierCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//  driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
//  }
//// кружки + ш/п + расчет по карте  + самовывоз + выдает чек + заказ по  email
//  @Test
//  public void testKShCashlessPickupCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement shirt = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor t_shirt = (JavascriptExecutor)driver;
//    t_shirt.executeScript("arguments[0].click();", shirt);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
// driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//
//// кружки + визитки + наличный расчет
//  @Test
//  public void testKVCash() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement wee = driver.findElement(By.id("paymentMethod-item-1"));        // наличный расчет
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//
//// кружки + визитки + расчет по карте
//@Test
//  public void testKVCashless() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));          // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//  }
//
//// кружки + визитки + оплата по счету
//@Test
//  public void testKVPayment() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
// }
//
//// кружки + визитки + Самовывоз
//@Test
//  public void testKVPickup() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));           // Самовывоз
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//
//// кружки + визитки + Доставка с курьером
//@Test
//  public void testKVCourier() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));          // Доставка с курьером
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//    driver.findElement(By.xpath(".//*text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
// }
//
//// кружки + визитки + выдает чек
//@Test
//  public void testKVCheck() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("check1"));          // выдает чек
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
// }
//
//// кружки + визитки + Принимает заказ по email
//@Test
//  public void testKVEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//}
//
//// кружки + визитки + выдает чек + принимает заказ по email
//  @Test
//  public void testKVCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("check1"));           // выдает чек
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//}
//// кружки + визитки + Наличный расчет + Самовывоз
//@Test
//  public void testKVCashPickup() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));          // Наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));         // Самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//    }
//
//// кружки + визитки + Наличный расчет + Доставка с курьером
//  @Test
//  public void testKVCachCourier() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));         // Наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));        // Доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//  }
//
//// кружки + визитки + Оплата по счету + Самовывоз
//  @Test
//  public void testKVPaymentPickup() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          // Самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
//  }
//// кружки + визитки + Оплата по счету + Доставка с курьером
//  @Test
//  public void testKVPaymentCourier() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // Доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// кружки + визитки + Расчет по карте + Самовывоз
//  @Test
//  public void testKVCashlessPickup() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // Расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          //Самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//  }
//// кружки + визитки + Расчет по карте + Доставка с курьером
//  @Test
//  public void testKVCashlessCourier() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // Расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // Доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
//  }
//// кружки + визитки + Наличный расчет + Выдает чек
//  @Test
//  public void testKVCashCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // Наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// кружки + визитки + Оплата по счету + Выдает чек
//  @Test
//  public void testKVPaymentCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          //Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
//  }
//// кружки + визитки + Расчет по карте + Выдает чек
//  @Test
//  public void testKVCashlessCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // Расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//  }
//// кружки + визитки + Самовывоз + Выдает чек
//  @Test
//  public void testKVPickupCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));           // Самовывоз
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          //Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// кружки + визитки + Доставка с курьером + Выдает чек
//  @Test
//  public void testKVCourierCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));           // Доставка с курьером
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// кружки + визитки + Наличный расчет + Принимает заказ по email
//  @Test
//  public void testKVCashEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // Наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// кружки + визитки + Оплата по счету + Принимает заказ по email
//  @Test
//  public void testKVPaymentEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//  }
//// кружки + визитки + Расчет по карте + Принимает заказ по email
//  @Test
//  public void testKVCashlessEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // Расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//// кружки + визитки + Самовывоз + Принимает заказ по email
//  @Test
//  public void testKVPickupEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));           // Самовывоз
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// кружки + визитки + Доставка с курьером + Принимает заказ по email
//  @Test
//  public void testKVCourierEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));           // Доставка с курьером
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// кружки + визитки + наличный расчет + самовывоз + выдает чек
//  @Test
//  public void testKVCashPickupCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Компаньон']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='АрТ-РЕКЛАМА']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Отдел 55']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// кружки + визитки + наличный расчет + доставка с курьером + выдает чек
//  @Test
//  public void testKVCashCourierCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          //доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//  }
//// кружки + визитки + оплата по счету + доставка с курьером + выдает чек
//  @Test
//  public void testKVCashlessPaymentCourierCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          //доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//     WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// кружки + визитки + оплата по счету + самовывоз + выдает чек
//  @Test
//  public void testKVPaymentPickupCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          //самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Золотой тираж']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Сибирь']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Акула']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алвест']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Мегаполис PRINT']/.."));
//    driver.findElement(By.xpath(".//*[text()='Пульсар-98']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Тритон Плюс']/.."));
//  }
//// кружки + визитки + расчет по карте + доставка с курьером + выдает чек
//  @Test
//  public void testKVCashlessCourierCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          //доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
// }
//// кружки + визитки + расчет по карте + самовывоз + выдает чек
//  @Test
//  public void testKVCashlessPickupCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));               // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Фото-М']/.."));
//  }
//// кружки + визитки + наличный расчет + самовывоз + заказ по  email
//  @Test
//  public void testKVCashPickupEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          //самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// кружки + визитки + наличный расчет + доставка с курьером + заказ по  email
//  @Test
//  public void testKVCashCourierEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// кружки + визитки + оплата по счету + доставка с курьером + заказ по  email
//  @Test
//  public void testKVPaymentCourierEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// кружки + визитки + оплата по счету + самовывоз + заказ по  email
//  @Test
//  public void testKVPaymentPickupEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          //самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//  }
//// кружки + визитки + расчет по карте + доставка с курьером + заказ по  email
//  @Test
//  public void testKVCashlessCourierEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
//  }
//// кружки + визитки + расчет по карте + самовывоз + заказ по  email
//  @Test
//  public void testKVCashlessPickupEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//     WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//  driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//// кружки + визитки + оплата наличными + выдает чек + заказ по  email
//  @Test
//  public void testKVCashCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // оплата наличными
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// кружки + визитки + оплата по счету + выдает чек + заказ по  email
//  @Test
//  public void testKVPaymentCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//  }
//// кружки + визитки + расчет по карте + выдает чек + заказ по  email
//  @Test
//  public void testKVCashlessCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//// кружки + визитки + самовывоз + выдает чек + заказ по  email
//  @Test
//  public void testKVPickupCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));           // самовывоз
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// кружки + визитки + доставка с курьером + выдает чек + заказ по  email
//  @Test
//  public void testKVCourierCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));           // доставка с курьером
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// кружки + визитки + наличный расчет + самовывоз + выдает чек + заказ по  email
//  @Test
//  public void testKVCashPickupCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));              // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Бумеранг']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// кружки + визитки + наличный расчет + доставка с курьером + выдает чек + заказ по  email
//  @Test
//  public void testKVCashCourierCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// кружки + визитки + Оплата по счету + доставка с курьером + выдает чек + заказ по  email
//  @Test
//  public void testKVPaymentCourierCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// кружки + визитки + оплата по счету + самовывоз + выдает чек + заказ по  email
//  @Test
//  public void testKVPaymentPickupCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Крафтлайн']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Полиграф']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Алые паруса']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Стиль фирмы']/.."));
//  }
//// кружки + визитки + расчет по карте + доставка с курьером + выдает чек + заказ по  email
//  @Test
//  public void testKVCashlessCourierCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//  driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
//  }
//// кружки + визитки + расчет по карте  + самовывоз + выдает чек + заказ по  email
//  @Test
//  public void testKVCashlessPickupCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement mug = driver.findElement(By.id("btn2"));         // печать на кружках
//    JavascriptExecutor mugs = (JavascriptExecutor)driver;
//    mugs.executeScript("arguments[0].click();", mug);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
// driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//
//
//
//// ш/п+ визитки + наличный расчет
//  @Test
//  public void testShVCash() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement wee = driver.findElement(By.id("paymentMethod-item-1"));        // наличный расчет
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
//  }
//
//// ш/п+ визитки + расчет по карте
//@Test
//  public void testShVCashless() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));          // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//
//// ш/п+ визитки + оплата по счету
//@Test
//  public void testShVPayment() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
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
//  }
//
//// ш/п+ визитки + Самовывоз
//@Test
//  public void testShVPickup() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));           // Самовывоз
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
//  }
//
//// ш/п+ визитки + Доставка с курьером
//@Test
//  public void testShVCourier() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));          // Доставка с курьером
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
// }
//
//// ш/п+ визитки + выдает чек
//@Test
//  public void testShVCheck() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
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
//  }
//
//// ш/п+ визитки + Принимает заказ по email
//@Test
//  public void testShVEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
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
//  }
//
//// ш/п+ визитки + выдает чек + принимает заказ по email
//  @Test
//  public void testShVCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
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
//  }
//// ш/п+ визитки + Наличный расчет + Самовывоз
//@Test
//  public void testShVCashPickup() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));          // Наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));         // Самовывоз
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
//  }
//
//// ш/п+ визитки + Наличный расчет + Доставка с курьером
//  @Test
//  public void testShVCachCourier() throws Exception {
//      driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));         // Наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));        // Доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//
//// ш/п+ визитки + Оплата по счету + Самовывоз
//  @Test
//  public void testShVPaymentPickup() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          // Самовывоз
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
//  }
//// ш/п+ визитки + Оплата по счету + Доставка с курьером
//  @Test
//  public void testShVPaymentCourier() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // Доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// ш/п+ визитки + Расчет по карте + Самовывоз
//  @Test
//  public void testShVCashlessPickup() throws Exception {
//    driver.get(baseUrl + "/");
//
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // Расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          //Самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//// ш/п+ визитки + Расчет по карте + Доставка с курьером
//  @Test
//  public void testShVCashlessCourier() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//   WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // Расчет по карте
//   JavascriptExecutor executor = (JavascriptExecutor)driver;
//   executor.executeScript("arguments[0].click();", we);
//   WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // Доставка с курьером
//   JavascriptExecutor executore = (JavascriptExecutor)driver;
//   executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
//  }
//// ш/п+ визитки + Наличный расчет + Выдает чек
//  @Test
//  public void testShVCashCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // Наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
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
//  }
//// ш/п+ визитки + Оплата по счету + Выдает чек
//  @Test
//  public void testShVPaymentCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          //Выдает чек
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
//  }
//// ш/п+ визитки + Расчет по карте + Выдает чек
//  @Test
//  public void testShVCashlessCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // Расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//// ш/п+ визитки + Самовывоз + Выдает чек
//  @Test
//  public void testShVPickupCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));           // Самовывоз
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          //Выдает чек
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
//  }
//// ш/п+ визитки + Доставка с курьером + Выдает чек
//  @Test
//  public void testShVCourierCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));           // Доставка с курьером
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check1"));          // Выдает чек
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// ш/п+ визитки + Наличный расчет + Принимает заказ по email
//  @Test
//  public void testShVCashEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//   WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // Наличный расчет
//   JavascriptExecutor executor = (JavascriptExecutor)driver;
//   executor.executeScript("arguments[0].click();", we);
//   WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//   JavascriptExecutor executore = (JavascriptExecutor)driver;
//   executore.executeScript("arguments[0].click();", wee);
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
//  }
//// ш/п+ визитки + Оплата по счету + Принимает заказ по email
//  @Test
//  public void testShVPaymentEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
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
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//// ш/п+ визитки + Расчет по карте + Принимает заказ по email
//  @Test
//  public void testShVCashlessEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//   WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // Расчет по карте
//   JavascriptExecutor executor = (JavascriptExecutor)driver;
//   executor.executeScript("arguments[0].click();", we);
//   WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//   JavascriptExecutor executore = (JavascriptExecutor)driver;
//   executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//// ш/п+ визитки + Самовывоз + Принимает заказ по email
//  @Test
//  public void testShVPickupEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));           // Самовывоз
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
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
//  }
//// ш/п+ визитки + Доставка с курьером + Принимает заказ по email
//  @Test
//  public void testShVCourierEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));           // Доставка с курьером
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("check2"));          // Принимает заказ по email
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// ш/п+ визитки + наличный расчет + самовывоз + выдает чек
//  @Test
//  public void testShVCashPickupCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
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
//  }
//// ш/п+ визитки + наличный расчет + доставка с курьером + выдает чек
//  @Test
//  public void testShVCashCourierCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          //доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// ш/п+ визитки + оплата по счету + доставка с курьером + выдает чек
//  @Test
//  public void testShVCashlessPaymentCourierCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          //доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//     WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// ш/п+ визитки + оплата по счету + самовывоз + выдает чек
//  @Test
//  public void testShVPaymentPickupCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          //самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
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
//  }
//// ш/п+ визитки + расчет по карте + доставка с курьером + выдает чек
//  @Test
//  public void testShVCashlessCourierCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          //доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
//  }
//// ш/п+ визитки + расчет по карте + самовывоз + выдает чек
//  @Test
//  public void testShVCashlessPickupCheck() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));               // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//
//    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//// ш/п+ визитки + наличный расчет + самовывоз + заказ по  email
//  @Test
//  public void testShVCashPickupEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          //самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
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
//  }
//// ш/п+ визитки + наличный расчет + доставка с курьером + заказ по  email
//  @Test
//  public void testShVCashCourierEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// ш/п+ визитки + оплата по счету + доставка с курьером + заказ по  email
//  @Test
//  public void testShVPaymentCourierEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// ш/п+ визитки + оплата по счету + самовывоз + заказ по  email
//  @Test
//  public void testShVPaymentPickupEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          //самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
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
//  }
//// ш/п+ визитки + расчет по карте + доставка с курьером + заказ по  email
//  @Test
//  public void testShVCashlessCourierEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
//  }
//// ш/п+ визитки + расчет по карте + самовывоз + заказ по  email
//  @Test
//  public void testShVCashlessPickupEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//     WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='IQ дизайн-бюро']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//// ш/п+ визитки + оплата наличными + выдает чек + заказ по  email
//  @Test
//  public void testShVCashCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // оплата наличными
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
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
//    driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// ш/п+ визитки + оплата по счету + выдает чек + заказ по  email
//  @Test
//  public void testShVPaymentCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//   WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//   JavascriptExecutor executor = (JavascriptExecutor)driver;
//   executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
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
//  }
//// ш/п+ визитки + расчет по карте + выдает чек + заказ по  email
//  @Test
//  public void testShVCashlessCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//// ш/п+ визитки + самовывоз + выдает чек + заказ по  email
//  @Test
//  public void testShVPickupCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-1"));           // самовывоз
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
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
//    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Рекламщик']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// ш/п+ визитки + доставка с курьером + выдает чек + заказ по  email
//  @Test
//  public void testShVCourierCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("deliveryMethod-item-2"));           // доставка с курьером
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// ш/п+ визитки + наличный расчет + самовывоз + выдает чек + заказ по  email
//  @Test
//  public void testShVCashPickupCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));              // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
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
//    driver.findElement(By.xpath(".//*[text()='Омская картографическая фабрика']/.."));
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='Центр Рекламы']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='Принт сервис']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//    driver.findElement(By.xpath(".//*[text()='Филипп']/.."));
//  }
//// ш/п+ визитки + наличный расчет + доставка с курьером + выдает чек + заказ по  email
//  @Test
//  public void testShVCashCourierCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-1"));           // наличный расчет
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='55Print']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// ш/п+ визитки + Оплата по счету + доставка с курьером + выдает чек + заказ по  email
//  @Test
//  public void testShVPaymentCourierCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // Оплата по счету
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//    driver.findElement(By.xpath(".//*[text()='ДимАрт']/.."));
//    driver.findElement(By.xpath(".//*[text()='ОмПАК']/.."));
//    driver.findElement(By.xpath(".//*[text()='Селбс']/.."));
//  }
//// ш/п+ визитки оплата по счету + самовывоз + выдает чек + заказ по  email
//  @Test
//  public void testShVPaymentPickupCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//   WebElement we = driver.findElement(By.id("paymentMethod-item-3"));           // оплата по счету
//   JavascriptExecutor executor = (JavascriptExecutor)driver;
//   executor.executeScript("arguments[0].click();", we);
//   WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          // самовывоз
//   JavascriptExecutor executore = (JavascriptExecutor)driver;
//   executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
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
//  }
//// ш/п+ визитки + расчет по карте + доставка с курьером + выдает чек + заказ по  email
//  @Test
//  public void testShVCashlessCourierCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-2"));          // доставка с курьером
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='Ни одна из полиграфий не удовлетворяет требованиям запроса']/.."));
//  }
//// ш/п+ визитки + расчет по карте  + самовывоз + выдает чек + заказ по  email
//  @Test
//  public void testShVCashlessPickupCheckEmail() throws Exception {
//    driver.get(baseUrl + "/");
//
//    WebElement screen = driver.findElement(By.id("btn4"));         // широкоформатная печать
//    JavascriptExecutor widescreen = (JavascriptExecutor)driver;
//    widescreen.executeScript("arguments[0].click();", screen);
//    WebElement card = driver.findElement(By.id("btn9"));         // изготовление визиток
//    JavascriptExecutor cutaway = (JavascriptExecutor)driver;
//    cutaway.executeScript("arguments[0].click();", card);
//    WebElement we = driver.findElement(By.id("paymentMethod-item-2"));           // расчет по карте
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", we);
//    WebElement wee = driver.findElement(By.id("deliveryMethod-item-1"));          // самовывоз
//    JavascriptExecutor executore = (JavascriptExecutor)driver;
//    executore.executeScript("arguments[0].click();", wee);
//    WebElement che = driver.findElement(By.id("check1"));       //выдает чек
//    JavascriptExecutor doer = (JavascriptExecutor)driver;
//    doer.executeScript("arguments[0].click();", che);
//    WebElement ch = driver.findElement(By.id("check2"));        //заказ по  email
//    JavascriptExecutor performer = (JavascriptExecutor)driver;
//    performer.executeScript("arguments[0].click();", ch);
//
//    driver.findElement(By.xpath(".//*[text()='ТИСА']/.."));
//    driver.findElement(By.xpath(".//*[text()='АНТАРЕС']/.."));
//    driver.findElement(By.xpath(".//*[text()='А3+']/.."));
//    driver.findElement(By.xpath(".//*[text()='Синяя Птица']/.."));
//  }
//
// @After
//  public void tearDown() throws Exception {
//    driver.quit();
//    String verificationErrorString = verificationErrors.toString();
//    if (!"".equals(verificationErrorString)) {
//      fail(verificationErrorString);
//    }
//  }
//
//  private boolean isElementPresent(By by) {
//    try {
//      driver.findElement(by);
//      return true;
//    } catch (NoSuchElementException e) {
//      return false;
//    }
//  }
//
//  private boolean isAlertPresent() {
//    try {
//      driver.switchTo().alert();
//      return true;
//    } catch (NoAlertPresentException e) {
//      return false;
//    }
//  }
//
//  private String closeAlertAndGetItsText() {
//    try {
//      Alert alert = driver.switchTo().alert();
//      String alertText = alert.getText();
//      if (acceptNextAlert) {
//        alert.accept();
//      } else {
//        alert.dismiss();
//      }
//      return alertText;
//    } finally {
//      acceptNextAlert = true;
//    }
//  }
//}
