package TC_07;

import TC_06.TC_06Elements;
import Utility.BaseDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class TC_07 extends BaseDriver {
    @Test(groups = {"Smoke Test"})
    public void Test() {
        TC_07Elements tc = new TC_07Elements();

        driver.get("https://techno.study/tr/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

        List<WebElement> courses = new ArrayList<>();
        courses.add(tc.sdet);
        courses.add(tc.androidapp);
        courses.add(tc.veribilimi);

        for (WebElement e : courses) {
            Assert.assertTrue(e.isDisplayed());

        }
        for (WebElement e : courses) {
            assertIcon(e);
            driver.navigate().back();
        }
    }

    public void assertIcon(WebElement element) {
        TC_07Elements tc = new TC_07Elements();
        String url = driver.getCurrentUrl();
        String[] words = url.split("/");
        String lastWord = words[words.length - 1];
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
        Assert.assertTrue(wait.until(ExpectedConditions.urlContains(lastWord)));
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOf(tc.icon)).isDisplayed());
    }

}
