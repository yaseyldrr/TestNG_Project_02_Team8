package TC_06;

import Utility.BaseDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class TC_06 extends BaseDriver {
    @Test(groups = {"Smoke Test"})
    public void Test() {
        TC_06Elements tc = new TC_06Elements();

        driver.get("https://techno.study/tr/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

        List<WebElement> links = new ArrayList<>();
        links.add(tc.android);
        links.add(tc.bilgi);
        links.add(tc.basvur);
        links.add(tc.sdet);
        links.add(tc.veri);

        for (WebElement e : links) {
            assertIcon(e);
            driver.navigate().back();
        }
    }

    public void assertIcon(WebElement element) {
        TC_06Elements tc = new TC_06Elements();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOf(tc.icon)).isDisplayed());
    }
}
