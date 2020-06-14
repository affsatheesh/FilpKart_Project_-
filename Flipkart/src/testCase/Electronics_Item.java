package testCase;
import java.util.Set;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonFiles.CommonFunction;
import pageObjectFile.EveryIdems_Functions;


public class Electronics_Item extends CommonFunction
{	
	public void fipkartlogin() {
		EveryIdems_Functions.Filpkart_login.click();
	}
	
	public void MovingOperation()
	{
		Actions action = new Actions(driver);
	    action.moveToElement(EveryIdems_Functions.MovetoElectranics).perform();
	}
	public void MovingtoOppo()
	{
	   Actions action = new Actions(driver);
	   action.moveToElement(EveryIdems_Functions.MovetoOppo);
	   action.click().build().perform();
	}
	
	public void ViewAll_Mobile()
	{
		EveryIdems_Functions.ViewAll.click();
		
	}
	public void Select_Mobile()
	{
		EveryIdems_Functions.OppoA5s.click();
	}
	public void Childwindow_AddTocart()
	{
		Set<String> Child = driver.getWindowHandles();	 
		for (String string : Child) 
		{
			driver.switchTo().window(string);
		}
		EveryIdems_Functions.AddToCart.click();
	}
	public void Remove() throws InterruptedException
	{
		Thread.sleep(7000);
		EveryIdems_Functions.Remove.click();
		EveryIdems_Functions.ConformationRemove.click();
		driver.close();
	}
	public void parentWindow_Refresh()
	{
		driver.switchTo().window(fatherwindow);
		driver.navigate().refresh();
	}
	@Test
	public void verify() throws InterruptedException {
		PageFactory.initElements(driver, EveryIdems_Functions.class);
		fipkartlogin();
		MovingOperation();
		MovingtoOppo();
		ViewAll_Mobile();
		Select_Mobile();
		Childwindow_AddTocart();
		Remove();
		parentWindow_Refresh();
		
	}
	
}