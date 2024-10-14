package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BaseDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;

    // WARNING!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // ARKADAŞLAR BURALARDA DEĞİŞİKLİK YAPMAYIN, GEREKLİ OLAN KISIMLARI BIRAKTIM, PROJE BİTTİKTEN SONRA BEN DÜZENLEYİP ATICAM, KOLAY GELSİN

    @BeforeClass
    //@Parameters("browserType")
    //public void startUp(String browserType) {
    public void startUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));


        //switch (browserType.toLowerCase())
        //{
        //    case "firefox": driver=new FirefoxDriver();break;
        //    default: driver=new ChromeDriver();
        //}

    }
    //@AfterClass
    //public void tearDown() {
    //    driver.quit();
    //}

}
