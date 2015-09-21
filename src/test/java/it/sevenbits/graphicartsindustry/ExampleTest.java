package it.sevenbits.graphicartsindustry;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class ExampleTest {

    public static final String USERNAME = "prokhorova";
    public static final String ACCESS_KEY = "7021577c-564a-424b-bc41-5535d9d8b1d8";
    public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

    public static void main(String[] args) throws Exception {

        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

        driver.get("http://polygraphy.7bits.it/registration?id=6553711bf84fe1837094708062d62d81847e4470");

        driver.findElement(By.id("paymentMethod")).click();
        WebElement we = driver.findElement(By.id("paymentMethod-item-1"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);

       // driver.get(baseUrl + "/registration?id=75b20ba30d2cdc25bd0d831f66ef2e62e87f8960");
        driver.findElement(By.id("email-input")).clear();
        driver.findElement(By.id("email-input")).sendKeys("nastyaproh21@gmail.com");
        driver.findElement(By.id("password-input")).clear();
        driver.findElement(By.id("password-input")).sendKeys("polygraphy");
        driver.findElement(By.id("email-input")).clear();
        driver.findElement(By.id("email-input")).sendKeys("poly@moly.ly");
        driver.findElement(By.id("password-input")).clear();
        driver.findElement(By.id("password-input")).sendKeys("123456");
        driver.findElement(By.id("name-input")).clear();
        driver.findElement(By.id("name-input")).sendKeys("PolyMolyLy");
        driver.findElement(By.id("address-input")).clear();
        driver.findElement(By.id("address-input")).sendKeys("Полимольная 1");
        driver.findElement(By.id("phone-input")).clear();
        driver.findElement(By.id("phone-input")).sendKeys("22-56-78");
        driver.findElement(By.id("website-input")).clear();
        driver.findElement(By.id("website-input")).sendKeys("http://polymolyly.com");
        driver.findElement(By.id("step0Next")).click();
        driver.findElement(By.id("orderByEmail")).click();
        driver.findElement(By.id("delivery1")).click();
        driver.findElement(By.id("payment2")).click();
        driver.findElement(By.id("service8")).click();
        driver.findElement(By.id("service5")).click();
        driver.findElement(By.id("service4")).click();
        driver.findElement(By.id("service1")).click();
        driver.findElement(By.id("service6")).click();
        driver.findElement(By.id("submit-registration-form")).click();
        driver.findElement(By.cssSelector("div.success-registration"));
        driver.quit();
    }
}
