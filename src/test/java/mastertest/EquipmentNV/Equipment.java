package mastertest.EquipmentNV;

import controllers.MethodBase;
import controllers.PageBase;
import controllers.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Equipment extends TestBase {
    @Test(groups = {"Smoke" },priority = 1)
    public void equipment() throws Exception {
        SoftAssert softAssert = new SoftAssert();
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[7]/a");
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div[1]");
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[1]"),"Sorry we could not find" );
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");//click Add equipment
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[6]/div/div[2]/div/div[2]/div[3]/button[2]");//click save btn
        //here check validation Message
        softAssert.assertEquals(MethodBase.get_Text("/html/body/div[6]/div/div[2]/div/div[2]/div[2]/form/div[2]/div/div/div[1]"),"Name can't be empty","there are not equal");
        MethodBase.setText_ByID   ("equipment_name","Oven");
        MethodBase.setText_ByID   ("equipment_description","hi");//discription
        MethodBase.click_ByXpath("//*[@id=\"type\"]/div/div");
        MethodBase.hitEnter();
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[6]/div/div[2]/div/div[2]/div[3]/button[2]");//click save btn
        // next line for Editing purpose
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[2]/td[4]/span/a[1]/i");//click Edit
        PageBase.staticWait(02);
        MethodBase.setText_ByID   ("equipment_description","ohhh");//discription
        MethodBase.click_ByXpath("/html/body/div[6]/div/div[2]/div/div[2]/div[3]/button[2]");//click save btn
        // this is for check the delete button
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[2]/td[4]/span/a[2]/a/i");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("/html/body/div[8]/div/div/div/div[2]/div/div/div[2]/button[2]");
        softAssert.assertAll();
    }
}
