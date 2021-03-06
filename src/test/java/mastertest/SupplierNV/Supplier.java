package mastertest.SupplierNV;

import controllers.MethodBase;
import controllers.PageBase;
import controllers.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Supplier extends TestBase {
    public SoftAssert softAssert;

    @Test(groups = {"Smoke" },priority = 1)
    public void SupplierTest()throws Exception{
        softAssert = new SoftAssert();
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");// Click Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[13]/a");//  Supplier NV
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]");// click Supplier
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/div/button");// Click  Add Supplier
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"supplier_category\"]/div/div"); // Click Supplier category
        MethodBase.hitEnter();
        MethodBase.setText_ByID("supplier_name","name"); // Supplier name
        MethodBase.setText_ByID("supplier_company_name","company name");// Company name
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"supplier_plant\"]/div/div");// select Plant_dropdown
        PageBase.staticWait(02);
        MethodBase.hitEnter();
        MethodBase.setText_ByID("supplier_contactno","0775262482");// Supplier contact number
        MethodBase.setText_ByID("supplier_email","ravi@gmail.com");// Supplier Email
        MethodBase.setText_ByID("supplier_address","address");// Supplier Address
        MethodBase.clickButton_ByXpath("/html/body/div[8]/div/div[2]/div/div[2]/div[3]/button[2]");// Enter save button
        softAssert.assertAll();
    }
}

