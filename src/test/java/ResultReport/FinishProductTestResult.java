package ResultReport;

import controllers.MethodBase;
import controllers.PageBase;
import controllers.TestBase;
import org.testng.annotations.Test;


/**
  *Author Daclas
  */
public class FinishProductTestResult extends TestBase {

    @Test
    public void FinishProductTestResult(){
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[3]/div/div");
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]\n");
    }
}
