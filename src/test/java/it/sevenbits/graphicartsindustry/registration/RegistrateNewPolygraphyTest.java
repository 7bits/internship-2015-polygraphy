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

public class RegistrateNewPolygraphyTest {
    public static final String USERNAME = System.getenv("SAUCE_LABS_USERNAME");
    public static final String ACCESS_KEY = System.getenv("SAUCE_LABS_PASSWORD");
    public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
    public static final String username = System.getenv("POLYGRAPHY_USERNAME");
    public static final String password = System.getenv("POLYGRAPHY_PASSWORD");
    public static final String domain = System.getenv("POLYGRAPHY_DOMAIN");

@Test
public void testRegistration() throws Exception {
    DesiredCapabilities caps = DesiredCapabilities.chrome();
    caps.setCapability("platform", "Linux");
    caps.setCapability("version", "45.0");

    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    driver.get("http://" + username + ":" + password + "@" + domain + "/registration?id=63b9d5b208202e816fef8357814fe571a0200875");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // каждый раз генерится НОВАЯ ссылка, как прописывать ее в тестах

    driver.findElement(By.id("email-input")).clear();
    driver.findElement(By.id("email-input")).sendKeys("poly1@poly.po");
    driver.findElement(By.id("password-input")).clear();
    driver.findElement(By.id("password-input")).sendKeys("123456");
    driver.findElement(By.id("name-input")).clear();
    driver.findElement(By.id("name-input")).sendKeys("PolyMolyLy");
    driver.findElement(By.id("address-input")).clear();
    driver.findElement(By.id("address-input")).sendKeys("Полимольная 1");
    driver.findElement(By.id("phone-input")).clear();
    driver.findElement(By.id("phone-input")).sendKeys("22-56-78");
    driver.findElement(By.id("step0Next")).click();
    WebElement we = driver.findElement(By.id("service3"));
    JavascriptExecutor executor = (JavascriptExecutor) driver;
    executor.executeScript("arguments[0].click();", we);
    WebElement wee = driver.findElement(By.id("delivery2"));
    JavascriptExecutor executore = (JavascriptExecutor) driver;
    executore.executeScript("arguments[0].click();", wee);
    WebElement pay = driver.findElement(By.id("payment3"));
    JavascriptExecutor paym = (JavascriptExecutor) driver;
    paym.executeScript("arguments[0].click();", pay);
    WebElement sub = driver.findElement(By.id("submit-registration-form"));
    JavascriptExecutor submit = (JavascriptExecutor) driver;
    submit.executeScript("arguments[0].click();", sub);
    driver.quit();
    }
 }
