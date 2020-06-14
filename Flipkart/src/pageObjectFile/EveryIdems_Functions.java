package pageObjectFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EveryIdems_Functions
{
	
@FindBy(xpath = "//button[@class='_2AkmmA _29YdH8']")
public static WebElement Filpkart_login;
	
@FindBy(xpath = "//*[text()='Electronics']")
public static WebElement MovetoElectranics;

@FindBy(xpath ="//a[text()='OPPO']")
public static WebElement MovetoOppo;

@FindBy(xpath ="//*[@id=\'container\']/div/div[3]/div[3]/div[1]/div/div[1]/div[2]/a/span")
public static WebElement ViewAll;

@FindBy(xpath="//*[@id=\'container\']/div/div[3]/div[2]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")
public static WebElement OppoA5s;

@FindBy(xpath ="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']" )
public static WebElement AddToCart;

@FindBy(xpath="//div[2][@class='gdUKd9']")
public static WebElement Remove;

@FindBy(xpath="//div[@class='gdUKd9 _3Z4XMp _2nQDKB']")
public static WebElement ConformationRemove;
//
}
