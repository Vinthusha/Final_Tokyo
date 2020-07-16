package mastertest.EmployeeNV;

import controllers.MethodBase;
import controllers.PageBase;
import controllers.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Role extends TestBase {
    @Test(groups = {"smoke"},priority = 1)
    public void RoleSmokeTest() throws InterruptedException {
        Thread.sleep(200);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");
        Thread.sleep(200);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[16]/a");
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]");
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");
        MethodBase.setText_ByXpath("//*[@id=\"role_name\"]","Banu");
        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]");
    }

}
