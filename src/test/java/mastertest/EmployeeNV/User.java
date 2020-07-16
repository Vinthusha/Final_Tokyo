package mastertest.EmployeeNV;

import controllers.MethodBase;
import controllers.PageBase;
import controllers.TestBase;
import org.testng.annotations.Test;

public class User extends TestBase {
    @Test(groups = {"Smoke"}, priority = 1)
    public void UserTest() {
        PageBase.staticWait(02);
      MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//click master
   MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[22]/a");//click employee NV
MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[4]");//click user

    }

}
