package TC_08;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class TC_08 extends BaseDriver {
    @Test(groups = {"Smoke Test"})
    public void Test(){
        TC_08Elements tc=new TC_08Elements();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.get("https://techno.study/tr/");
        tc.info.click();
        js.executeScript("arguments[0].scrollIntoView();", tc.terms);
        wait.until(ExpectedConditions.elementToBeClickable(tc.terms));
        tc.terms.click();
        Set<String> windows = driver.getWindowHandles();
        for (String s:windows)
        driver.switchTo().window(s);

        wait.until(ExpectedConditions.titleContains("Kullanım Şartları"));
        Assert.assertTrue(driver.getCurrentUrl().contains("https://techno.study/tr/terms"), "The url doesn't match with the expected one");
    }
}
