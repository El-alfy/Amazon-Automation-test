package Tests;

import org.testng.annotations.Test;
import pages.Scenario2;

public class Scenario2Test extends TestsBase {
	@Test
    public void sc2() throws java.lang.InterruptedException{
		
	    Scenario2 Scenario2_TC = new Scenario2(driver) ;
	       
	    Scenario2_TC.press_TodayDealsBtn();
		Thread.sleep(2000);
		
		
		Scenario2_TC.press_Headphonescheckbox();
		Thread.sleep(2000);
		
		Scenario2_TC.press_Grocerycheckbox();
		Thread.sleep(2000);
		
		
		Scenario2_TC.press_Dsicount10();
		Thread.sleep(2000);
		
		
		Scenario2_TC.press_Btn3rdpage();
		Thread.sleep(2000);
		
		Scenario2_TC.press_Btn4thpage();
		Thread.sleep(2000);
		
		Scenario2_TC.press_ClickItem();
		Thread.sleep(2000);
		
		Scenario2_TC.press_ClickAddedToCardBtn();
		Thread.sleep(2000);
		
}
}
