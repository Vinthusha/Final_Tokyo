package mastertest.PlantNV;

import controllers.MethodBase;
import controllers.PageBase;
import controllers.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
/**
 * Author Nixsala
 */
public class PlantUnit extends TestBase {

    @Test(groups = {"Smoke"}, priority = 1)
    public void plantSmokeTest() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(4);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div"); // click master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[5]/a"); // plant NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div/div[1]"); // plant panel
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button"); // Add plant
        MethodBase.setText_ByID("plant_code","MAN"); // set plant code
        MethodBase.setText_ByID("plant_name","Mannar"); // set plant name
        MethodBase.setText_ByID("plant_address","Mannar"); // set plant address
        MethodBase.setText_ByID("plant_contactno","0769853658"); // set plant contact no
        MethodBase.setText_ByID("fax","0769853658"); // set plant fax
        MethodBase.setText_ByID("plant_description","add plant detial"); // set description
        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[3]/div/button[2]"); // click save
    }
}