package mastertest.EquipmentNV;

import controllers.MethodBase;
import controllers.PageBase;
import controllers.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Author Daclas
 */
public class PlantEquipment extends TestBase {
    @Test(groups = {"Smoke"}, priority = 1)
    public void plantequipmentSmokeTest() throws Exception {
        PageBase.staticWait(05);
        softAssert = new SoftAssert();
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[7]/a");
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]");
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[1]"),"Page is not visible");
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]/button");
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[8]/div/div[2]/div/div[2]/div[3]/button[2]");//save btn
        softAssert.assertEquals(MethodBase.get_Text("/html/body/div[8]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[1]/div/div[1]"),"Serial No can't be empty","there are not equal");
        MethodBase.setText_ByID("serial_no","S002");
        MethodBase.click_ByXpath("//*[@id=\"equipment\"]/div/div");
        PageBase.staticWait(02);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div/div");
        MethodBase.hitEnter();
        MethodBase.setText_ByID("brand_name","bans");
        MethodBase.setText_ByID("model_name","S0015");
        MethodBase.setText_ByID("description","data");
        MethodBase.click_ByXpath("/html/body/div[8]/div/div[2]/div/div[2]/div[3]/button[2]");//save btn
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[2]/td[7]/span/a[2]/a/i");
        PageBase.staticWait(06);
        MethodBase.click_ByXpath("/html/body/div[11]/div/div/div/div[2]/div/div/div[2]/button[2]");
        softAssert.assertAll();
    }

}
