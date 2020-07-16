package mastertest.CustomerNV;

import controllers.MethodBase;
import controllers.PageBase;
import controllers.TestBase;
import org.testng.annotations.Test;

public class Project extends TestBase {
    @Test(groups = {"Smoke"}, priority = 1)
    public void ProjectTest() throws Exception {
        PageBase.staticWait(2);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div"); // Click Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[11]/a");//Click customerNV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]");//Click project field
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");//Click Add project
        MethodBase.setText_ByID("project_name","Base Hospital");// set project name
        MethodBase.click_ByXpath("//*[@id=\"start_date\"]/div/input");// set project date
        MethodBase.hitEnter();
        MethodBase.setText_ByID("contact_no","0774569863");// set contact_no
        MethodBase.setText_ByID("contact_person","manujan");// set  contact_person
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div/div");// select plant
        PageBase.staticWait(3);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("//*[@id=\"customer\"]/div/div");// select customer
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("/html/body/div[10]/div/div[2]/div/div[2]/div[3]/button[2]"); //Save
//        MethodBase.click_ByXpath("/html/body/div[10]/div/div[2]/div/div[2]/div[3]/button[1]"); //Return






    }
}
