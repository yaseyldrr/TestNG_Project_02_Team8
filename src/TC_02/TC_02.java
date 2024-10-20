package TC_02;

import Utility.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_02 extends BaseDriver {
    @Test(groups = {"Smoke Test"})
    public void Test() {
        TC_02Elements tc = new TC_02Elements();

        driver.get("https://techno.study/tr/");
        tc.camPusLogin.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://campus.techno.study/"), "The url doesn't match the expected one");

    }
}
