//package it.sevenbits.graphicartsindustry.registration;
//
//import java.util.regex.Pattern;
//import java.util.concurrent.TimeUnit;
//import org.junit.*;
//import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.*;
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;
//
//public class QwerTest {
//  private WebDriver driver;
//  private String baseUrl;
//  private boolean acceptNextAlert = true;
//  private StringBuffer verificationErrors = new StringBuffer();
//
//  @Before
//  public void setUp() throws Exception {
////driver = new FirefoxDriver();
//    System.setProperty("webdriver.chrome.driver", "src/test/java/it/sevenbits/graphicartsindustry/ChromeDriver//chromedriver.exe");
//    driver = new ChromeDriver();
//    baseUrl = "http://polygraphy:gjkbuhfabz@polygraphy.7bits.it";
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//  }
//
//  @Test
//  public void testQwer() throws Exception {
//    driver.get(baseUrl + "/registration?id=de2bed926e8474bd8f9ccc46806dd19cad3e022d");
//    driver.findElement(By.id("email-input")).clear();
//    driver.findElement(By.id("email-input")).sendKeys("nastyaproh21@gmail.com");
//    driver.findElement(By.id("password-input")).clear();
//    driver.findElement(By.id("password-input")).sendKeys("polygraphy");
//    driver.findElement(By.id("email-input")).clear();
//    driver.findElement(By.id("email-input")).sendKeys("zx@zx@zx");
//    driver.findElement(By.id("password-input")).clear();
//    driver.findElement(By.id("password-input")).sendKeys("123456");
//    driver.findElement(By.id("name-input")).clear();
//    driver.findElement(By.id("name-input")).sendKeys("My Polygraphy");
//    driver.findElement(By.id("address-input")).clear();
//    driver.findElement(By.id("address-input")).sendKeys("Qwedc");
//    driver.findElement(By.id("phone-input")).clear();
//    driver.findElement(By.id("phone-input")).sendKeys("123");
//    driver.findElement(By.id("email-public-input")).clear();
//    driver.findElement(By.id("email-public-input")).sendKeys("xz@xz.xz");
//    driver.findElement(By.id("step0Next")).click();
//    try {
//      assertEquals("Введите правильный email", driver.findElement(By.cssSelector("div.invalid-email")).getText());
//    } catch (Error e) {
//      verificationErrors.append(e.toString());
//    }
//    try {
//      assertEquals("Поле должно быть длинее, чем 5 символа", driver.findElement(By.cssSelector("div.invalid-phone")).getText());
//    } catch (Error e) {
//      verificationErrors.append(e.toString());
//    }
//  }
//
//  @After
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
