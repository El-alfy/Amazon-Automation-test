package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Scenario2 extends PagesBase {

	public Scenario2(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private By TodayDealsBtn = By.xpath("//*[@id=\"nav-xshop\"]/a[1]");
	public void press_TodayDealsBtn() {
	driver.findElement(TodayDealsBtn).click();	
	}
	
	
	private By 	Headphonescheckbox = By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[19]/label/input");
	public void press_Headphonescheckbox() {
	driver.findElement(Headphonescheckbox).click();
	}
	
	private By 	Grocerycheckbox = By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[17]/label/input");
	public void press_Grocerycheckbox() {
	driver.findElement(Grocerycheckbox).click();
	}
	
	private By 	Dsicount10 = By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[6]/ul/li[2]/div/a");
	public void press_Dsicount10() {
	driver.findElement(Dsicount10).click();
	}
	
	private By 	Btn3rdpage = By.xpath("//*[@id=\"slot-15\"]/div/div/div[3]/div/ul/li[4]/a");
	public void press_Btn3rdpage() {
	driver.findElement(Btn3rdpage).click();
	}
	
	
	private By 	Btn4thpage = By.xpath("//*[@id=\"slot-15\"]/div/div/div[3]/div/ul/li[5]/a");
	public void press_Btn4thpage() {
	driver.findElement(Btn4thpage).click();
	}
	
	
	private By 	ClickItem = By.xpath("//*[@id=\"grid-main-container\"]/div[3]/div/div[58]");
	public void press_ClickItem() {
	driver.findElement(ClickItem).click();
	}
	
	private By 	ClickAddedToCardBtn = By.id("add-to-cart-button");
	public void press_ClickAddedToCardBtn () {
	driver.findElement(ClickAddedToCardBtn ).click();
	}
	

}
