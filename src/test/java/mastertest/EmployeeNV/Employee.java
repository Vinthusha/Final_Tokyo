package mastertest.EmployeeNV;

import controllers.MethodBase;
import controllers.PageBase;
import controllers.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Employee extends TestBase {

    @Test(groups = {"Smoke"}, priority = 1)
    public void employeeSmokeTest() throws Exception {
        softAssert = new SoftAssert();
        Thread.sleep(200);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//click master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[15]/a");// click employee NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]");//click employee panel
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]/div[2]/div/button");//click add employee
        MethodBase.click_ByXpath("/html/body/div[9]/div/div[2]/div/div[2]/div[3]/button[2]");
        softAssert.assertEquals(MethodBase.get_Text("/html/body/div[9]/div/div[2]/div/div[2]/div[3]/button[2]"),"Name can't be empty","there are not equal");
        MethodBase.setText_ByID("first_name","Manimekalai");
        MethodBase.setText_ByID("last_name","Uthaijan");
        MethodBase.setText_ByID("address","kandy");
        MethodBase.setText_ByID("phoneno","0763256986");
        MethodBase.setText_ByID("email","Manimekalai56@gmail.com");
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div/div"); // click plant
        PageBase.staticWait(01);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("//*[@id=\"desigination\"]/div/div"); // click designation
        PageBase.staticWait(01);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("/html/body/div[9]/div/div[2]/div/div[2]/div[3]/button[2]");//click save
        softAssert.assertAll();


    }
}