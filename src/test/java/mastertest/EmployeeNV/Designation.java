package mastertest.EmployeeNV;

import controllers.MethodBase;
import controllers.TestBase;
import org.testng.annotations.Test;

public class Designation extends TestBase {

    @Test(groups = {"Smoke"}, priority = 1)
    public void DesignationTest() {
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[15]/a");
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");
        MethodBase.setText_ByXpath("//*[@id=\"designation_name\"]", "add employee");
        MethodBase.setText_ByXpath("//*[@id=\"designation_description\"]", "employee");
        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]");
    }
}