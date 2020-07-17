package mastertest.EmployeeNV;

import controllers.MethodBase;
import controllers.PageBase;
import controllers.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
/**
 * Author vinthusha
 */
public class Employee extends TestBase {
    public SoftAssert softAssert;

    @Test(groups = {"Smoke"}, priority = 1)
    public void employeeSmokeTest() throws Exception {
       // softAssert = new SoftAssert();
        PageBase.staticWait(4);
        MethodBase.click_ByXpath("//h1[contains(text(),'Master')]");//click master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[15]");// click employee NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]");//click employee panel
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]/div[2]/div/button");//click add employee

       // MethodBase.click_ByXpath("/html/body/div[9]/div/div[2]/div/div[2]/div[3]/button[2]");//click save
       // softAssert.assertEquals(MethodBase.get_Text("/html/body/div[9]/div/div[2]/div/div[2]/div[3]/button[2]"),"Name can't be empty","there are not equal");
        MethodBase.setText_ByID("first_name","vinthusha");//set first name
        MethodBase.setText_ByID("last_name","Loganathan");// set laste name
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div/div"); // click plant
        PageBase.staticWait(02);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("//*[@id=\"desigination\"]/div/div"); // click designation
        PageBase.staticWait(02);
        MethodBase.hitEnter();
        MethodBase.setText_ByID("address","kandyyyyyyy");// set address
        MethodBase.setText_ByID("phoneno","0765689631");// set phone number
        MethodBase.setText_ByID("email","vinthusha96@gmail.com");

        MethodBase.click_ByXpath("/html/body/div[9]/div/div[2]/div/div[2]/div[3]/button[2]");//click save
       // softAssert.assertAll();


    }
}
