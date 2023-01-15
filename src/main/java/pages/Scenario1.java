package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Scenario1 extends PagesBase {

	public Scenario1(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private By serchBar = By.id("twotabsearchtextbox");
	public void send_searchBar() {
	driver.findElement(serchBar).sendKeys("car accessories");	
	}
	
	
	private By 	searchBtn = By.id("nav-search-submit-button");
	public void press_searchBtn() {
	driver.findElement(searchBtn).click();
	}
	
	/*private By 	FristItem = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div");
	public void press_FirstItem() {
	driver.findElement(FristItem).click();
	}*/
	
	/* When I choose the first item, the item is not available on Amazon,
	so I chose another item but I left the code that chooses the first item and it is above this comment. 
	*/
	
	
	private By 	selectanotheritem = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div");
	public void press_selectanotheritem() {
	driver.findElement(selectanotheritem).click();
	}
	
	
	
	private By 	AddToCardBtn = By.id("add-to-cart-button");
	public void press_AddToCardBtn() {
	driver.findElement(AddToCardBtn).click();
	}
	
	private By 	VeiwCardBtn = By.xpath("//*[@id=\"sw-gtc\"]/span/a");
	public void press_VeiwCardBtn() {
	driver.findElement(VeiwCardBtn).click();
	}
	
	
	
	
	
}
