package it.sevenbits.graphicartsindustry.Registration;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ValidationTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "src/test/java/it/sevenbits/graphicartsindustry/Drivers//chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "http://polygraphy:gjkbuhfabz@polygraphy.7bits.it";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testEmptyFieldsStepOne() throws Exception {
    driver.get(baseUrl + "/registration?id=37d622aa649c5985efe548c5c133e8a75c307715");
    driver.findElement(By.id("step0Next")).click();
    try {
      assertEquals("Поле не должно быть пустым", driver.findElement(By.id("email-error")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Поле не должно быть пустым", driver.findElement(By.id("password-error")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Поле не должно быть пустым", driver.findElement(By.id("name-error")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Поле не должно быть пустым", driver.findElement(By.id("address-error")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Поле не должно быть пустым", driver.findElement(By.id("phone-error")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }

  @Test
  public void testInvalidEmail() throws Exception {
    driver.get(baseUrl + "/registration?id=37d622aa649c5985efe548c5c133e8a75c307715");
    driver.findElement(By.id("email-input")).clear();
    driver.findElement(By.id("email-input")).sendKeys("wdfgtyhjk,l;p");
    driver.findElement(By.id("step0Next")).click();
    try {
      assertEquals("Введите правильный email", driver.findElement(By.id("email-error")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }
  @Test
  public void testMinPasswordLength() throws Exception {
    driver.get(baseUrl + "/registration?id=37d622aa649c5985efe548c5c133e8a75c307715");
    driver.findElement(By.id("password-input")).clear();
    driver.findElement(By.id("password-input")).sendKeys("1234");
    driver.findElement(By.id("step0Next")).click();
    try {
      assertEquals("Поле должно быть длинее, чем 6 символов", driver.findElement(By.id("password-error")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }
  //изменена длина ввода допустимых символов. Зачем 255 на пароль???
/*  @Test
  public void testMaxPasswordLength() throws Exception {
    driver.get(baseUrl + "/registration?id=37d622aa649c5985efe548c5c133e8a75c307715");
    driver.findElement(By.id("password-input")).clear();
    driver.findElement(By.id("password-input")).sendKeys("123456789012345678901234567890123456789012345678901234567890123");
    driver.findElement(By.id("step0Next")).click();
    try {
      assertEquals("Поле должно быть короче, чем 60 символов", driver.findElement(By.id("password-error")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }*/
  @Test
  public void testEmptyFieldsStepTwo() throws Exception {
    driver.get(baseUrl + "/registration?id=37d622aa649c5985efe548c5c133e8a75c307715");
    driver.findElement(By.id("email-input")).clear();
    driver.findElement(By.id("email-input")).sendKeys("qwe@qw.qw");
    driver.findElement(By.id("password-input")).clear();
    driver.findElement(By.id("password-input")).sendKeys("1234567");
    driver.findElement(By.id("name-input")).clear();
    driver.findElement(By.id("name-input")).sendKeys("Проверка");
    driver.findElement(By.id("address-input")).clear();
    driver.findElement(By.id("address-input")).sendKeys("адрес");
    driver.findElement(By.id("phone-input")).clear();
    driver.findElement(By.id("phone-input")).sendKeys("123456");
    driver.findElement(By.id("step0Next")).click();
    WebElement we = driver.findElement(By.id("submit-registration-form"));
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    try {
      assertEquals("Необходимо выбрать хотя бы один метод оплаты", driver.findElement(By.id("paymentMethods-error")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Необходимо выбрать хотя бы один метод доставки", driver.findElement(By.id("deliveryMethods-error")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Необходимо выбрать хотя бы одну услугу", driver.findElement(By.id("services-error")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }
  @After
  public void tearDown() throws Exception {
    //driver.quit();
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
