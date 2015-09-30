package it.sevenbits.graphicartsindustry.registration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class ValidationTest {
  private StringBuffer verificationErrors = new StringBuffer();
  public static final String USERNAME = System.getenv("SAUCE_LABS_USERNAME");
  public static final String ACCESS_KEY = System.getenv("SAUCE_LABS_PASSWORD");
  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
  public static final String username = System.getenv("POLYGRAPHY_USERNAME");
  public static final String password = System.getenv("POLYGRAPHY_PASSWORD");
  public static final String domain = System.getenv("POLYGRAPHY_REGISTR_DOMAIN");

  @Test
  public void testEmptyFieldsStepOne() throws Exception {
    DesiredCapabilities caps = DesiredCapabilities.chrome();
    caps.setCapability("platform", "Linux");
    caps.setCapability("version", "45.0");

    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    driver.get("http://" + username + ":" + password + "@" + domain);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement we = driver.findElement(By.id("step0Next"));
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);

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
    DesiredCapabilities caps = DesiredCapabilities.chrome();
    caps.setCapability("platform", "Linux");
    caps.setCapability("version", "45.0");

    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    driver.get("http://" + username + ":" + password + "@" + domain);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    driver.findElement(By.id("email-input")).clear();
    driver.findElement(By.id("email-input")).sendKeys("wdfgtyhjk,l;p");
    WebElement we = driver.findElement(By.id("step0Next"));
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    try {
      assertEquals("Введите правильный email", driver.findElement(By.id("email-error")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }
  @Test
  public void testMinPasswordLength() throws Exception {
    DesiredCapabilities caps = DesiredCapabilities.chrome();
    caps.setCapability("platform", "Linux");
    caps.setCapability("version", "45.0");

    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    driver.get("http://" + username + ":" + password + "@" + domain);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    driver.findElement(By.id("password-input")).clear();
    driver.findElement(By.id("password-input")).sendKeys("1234");
    WebElement we = driver.findElement(By.id("step0Next"));
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);

    try {
      assertEquals("Поле должно быть длинее, чем 6 символов", driver.findElement(By.id("password-error")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }
  //изменена длина ввода допустимых символов. Зачем 255 на пароль???
  @Test
  public void testMaxPasswordLength() throws Exception {
    DesiredCapabilities caps = DesiredCapabilities.chrome();
    caps.setCapability("platform", "Linux");
    caps.setCapability("version", "45.0");

    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    driver.get("http://" + username + ":" + password + "@" + domain);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    driver.findElement(By.id("password-input")).clear();
    driver.findElement(By.id("password-input")).sendKeys("5s6LUpmX7qWlWzMrsgK586XCvmEaH5rPSLh4kPv8eipkv1JAeV8SYhAEtq5fhi4dWHAk9TxjkXreQT3lArgI6KCc7HWtTdjhgqsNLoTX3GWwpaKUyGmzHftbgp48VpTQ2WOWR65VbOjCllyWYrnDpAPizB4Pxaw1rZyIwZy0kvAaZnPkqFqP6Y7GIm7qDffA9C6eFKccHDnscioAAWPDCo6oUfGybmAnV0RA5rkuxK8pq62jqR42B2kXFSxgfKxl");
    WebElement we = driver.findElement(By.id("step0Next"));
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", we);
    try {
      assertEquals("Поле должно быть короче, чем 255 символов", driver.findElement(By.id("password-error")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }
  @Test
  public void testEmptyFieldsStepTwo() throws Exception {
    DesiredCapabilities caps = DesiredCapabilities.chrome();
    caps.setCapability("platform", "Linux");
    caps.setCapability("version", "45.0");

    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    driver.get("http://" + username + ":" + password + "@" + domain);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

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
    WebElement wee = driver.findElement(By.id("step0Next"));
    JavascriptExecutor executore = (JavascriptExecutor)driver;
    executore.executeScript("arguments[0].click();", wee);
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
}
