/*
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

    public void main(String[] args) throws Exception {

        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

        driver.get("http://polygraphy:gjkbuhfabz@polygraphy.7bits.it");

        driver.findElement(By.id("paymentMethod")).click();
        WebElement we = driver.findElement(By.id("paymentMethod-item-1"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", we);

        driver.findElement(By.xpath("./*/
/*[text()='Оригинал']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Крафтлайн']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Изба-принт']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='futbolkaprint']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Принт Экспресс']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='КАЙРОС']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Селбс']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Марка']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='55Print']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Ретранс']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Компаньон']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Принт сервис']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Аванта']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Акула']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Алвест']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Алые паруса']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='АЛЬФА-ПРИНТ']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='АНТАРЕС']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='АрТ-РЕКЛАМА']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='А3+']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Бумеранг']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Всемайки.ру']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Глобал Принт']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Дизайн-Проект']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='ДимАрт']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Золотой тираж']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Мегаполис PRINT']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Медиаплюс']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Образование Информ']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Омская картографическая фабрика']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Отдел 55']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Офисная полиграфия и комфорт']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Печатное дело']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='ПечатьPremier']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Полиграф']/..")) ;
        driver.findElement(By.xpath("./*/
/*[text()='Пульсар-98']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Сибирь']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Синяя Птица']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='СКАЙ ПРИНТ']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Советская Сибирь']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='ТИСА']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Фото-М']/.."));
        driver.findElement(By.xpath("./*/
/*[text()='Центр Рекламы']/.."));

        driver.quit();
    }
}*/
