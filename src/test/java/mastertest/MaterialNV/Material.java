package mastertest.MaterialNV;

import controllers.MethodBase;
import controllers.PageBase;
import controllers.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*
Author vinthusha
 */
public class Material extends TestBase {
    public SoftAssert softAssert;

    @Test(groups = {"Smoke"}, priority = 1)
    public void materialSmokeTest () throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div");//click master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[10]/a");//click material NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[4]");//click material panel
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");//click add material
        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[3]/button[2]");//click savebtn
        MethodBase.click_ByXpath("//*[@id=\"sub_category\"]/div/div");//select sub category in drop down
        MethodBase.click_ByXpath("//*[@id=\"material_nature\"]/div/div");// select materialnature drop down
        MethodBase.setText_ByID("material_name","riversand");// set value material name
        MethodBase.setText_ByID("description","buy");// set value description
        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[3]/button[2]");//click savebtn
        softAssert.assertAll();
    }
}
