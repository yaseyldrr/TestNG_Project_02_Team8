package TC_05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC_05 extends BaseDriver {
    @Test
    public void Test(){TC_05Elements tc=new TC_05Elements();
        driver.get("https://techno.study/tr/");
        driver.manage().window().maximize();

        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        js.executeScript("arguments[0].scrollIntoView(true);", tc.dw);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        tc.facebook.click();
        driver.navigate().back();
        tc.inst.click();
        driver.navigate().back();
        tc.youtube.click();
        driver.navigate().back();
        tc.linkedin.click();

    }

}
