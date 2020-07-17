package mastertest.EmployeeNV;

import controllers.MethodBase;
import controllers.PageBase;
import controllers.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Designation extends TestBase {
    public SoftAssert softAssert;

    @Test(groups = {"Smoke"}, priority = 1)
    public void DesignationTest() {
         softAssert = new SoftAssert();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");// Master
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[15]/a");// Employee NV
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]");// Designation Button
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");// Add Designation
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]");// Save Button
        softAssert.assertEquals(MethodBase.get_Text("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]"),"Designation can't be empty","there are no  equal Validation message");
        softAssert.assertEquals(MethodBase.get_Text("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[2]"),"Description can't be empty\n","there are no  equal Validation message");
        MethodBase.setText_ByXpath("//*[@id=\"designation_name\"]", "add employee");
        MethodBase.setText_ByXpath("//*[@id=\"designation_description\"]", "employee");
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]");// Save Button

    }
}