package TC_04;

import Utility.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_04 extends BaseDriver {
    @Test(groups = {"Regression Test"})
    public void kurslarMenusu() throws InterruptedException {
        TC_04Elements elements = new TC_04Elements();
        driver.get("https://techno.study/tr/");
        elements.kurslarButton.click();

        System.out.println(elements.kurslarMenuItems.size());
        for (int i = 0;i< elements.kurslarMenuItems.size();i++){
            Assert.assertTrue(elements.kurslarMenuItems.get(i).isDisplayed());
        }

        for (int i = 0;i< elements.kurslarMenuItems.size();i++){
        elements.kurslarMenuItems.get(i).click();
        Assert.assertTrue(driver.getCurrentUrl().contains(elements.kurslarMenuItems.get(i).getText()));
        driver.navigate().back();
        }

    }
}
