package TC_01;

import Utility.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_01 extends BaseDriver {

    @Test(groups = {"Smoke Test"})
    public void DropdownMenu(){

        TC_01Elements tc=new TC_01Elements();

        driver.get("https://techno.study/tr/");


        for (int i = 0; i < tc.courselist.size(); i++) {

            tc.courses.click();
            Assert.assertTrue(tc.courselist.get(i).isDisplayed(),"Courselist not found");
            tc.courselist.get(i).click();
            System.out.println(tc.courselist.get(i).getText());
            Assert.assertTrue(driver.getTitle().contains(tc.courselist.get(i).getText()), "Course menu is not clickable");
            driver.navigate().back();

        }

    }
}
