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

public class RegistrateNewPolygraphyTest {
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
public void testRegistration() throws Exception {
      /*  driver.get(baseUrl + "/info-for-polygraphy");
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("polygraphy1@qwery.qu");
        driver.findElement(By.id("submit-email")).click();
        driver.get(baseUrl + "//login");
        driver.findElement(By.id("name-input")).clear();
        driver.findElement(By.id("name-input")).sendKeys("nastyaproh21@gmail.com");
        driver.findElement(By.id("password-input")).clear();
        driver.findElement(By.id("password-input")).sendKeys("polygraphy");
        driver.findElement(By.cssSelector("button.submit-login-form")).click();
        driver.findElement(By.cssSelector("div.navigate-button.icon-for-list")).click();
        driver.findElement(By.linkText("Личный кабинет")).click();*/


        // каждый раз генерится НОВАЯ ссылка, как прописывать ее в тестах

        driver.get(baseUrl + "/registration?id=c4ac205b557869b7d17b0029023aa7ec78c73137");
        driver.findElement(By.id("email-input")).clear();
        driver.findElement(By.id("email-input")).sendKeys("poly1@poly.po");
        driver.findElement(By.id("password-input")).clear();
        driver.findElement(By.id("password-input")).sendKeys("123456");
        driver.findElement(By.id("name-input")).clear();
        driver.findElement(By.id("name-input")).sendKeys("Проверка регистрации");
        driver.findElement(By.id("address-input")).clear();
        driver.findElement(By.id("address-input")).sendKeys("Улица N дом 34");
        driver.findElement(By.id("phone-input")).clear();
        driver.findElement(By.id("phone-input")).sendKeys("234567");
        driver.findElement(By.id("step0Next")).click();
//        driver.findElement(By.id("orderByEmail")).click();
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
}
        @Test
        public void testRegistrationCheck ()throws Exception {
                driver.get(baseUrl + "/login");
                driver.findElement(By.id("name-input")).clear();
                driver.findElement(By.id("name-input")).sendKeys("nastyaproh21@gmail.com");
                driver.findElement(By.id("password-input")).clear();
                driver.findElement(By.id("password-input")).sendKeys("polygraphy");
                driver.findElement(By.cssSelector("button.submit-login-form")).click();
                driver.findElement(By.cssSelector("div.header__menu-item.header__dropdown")).click();
                driver.findElement(By.linkText("Личный кабинет")).click();
                driver.findElement(By.cssSelector("div.tab.tab2")).click();
                try {
                        assertEquals("Проверка регистрации", driver.findElement(By.xpath("//tr[38]/td")).getText());
                } catch (Error e) {
                        verificationErrors.append(e.toString());
                }
                driver.findElement(By.cssSelector("img[alt=\"Полиграфия\"]")).click();
                driver.findElement(By.name("query")).clear();
                driver.findElement(By.name("query")).sendKeys("проверка");
                driver.findElement(By.linkText("Подробнее")).click();
                try {
                        assertEquals("Проверка регистрации", driver.findElement(By.cssSelector("div.polygraphy-name-pop-up")).getText());
                } catch (Error e) {
                        verificationErrors.append(e.toString());
                }
                driver.findElement(By.cssSelector("div.close")).click();
        }
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