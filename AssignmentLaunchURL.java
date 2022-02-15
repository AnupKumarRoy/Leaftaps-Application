package WeekDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentLaunchURL {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TESTING"); 
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("4/4/1997");
		WebElement DropDown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select text = new Select(DropDown1);
		text.selectByVisibleText("Employee");
		WebElement DropDown2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select index = new Select(DropDown2);
		index.selectByIndex(3);
		WebElement Dropdown3 = driver.findElement(By.name("ownershipEnumId"));
		Select value = new Select(Dropdown3);
		value.selectByValue("OWN_CCORP");
		WebElement Dropdown4 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select text1 = new Select(Dropdown4);
		text1.selectByVisibleText("Automobile");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Kumar");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("John");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Kavery Nagar");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Mettur Dam");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Salem");
		WebElement Dropdown5 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select text2 = new Select(Dropdown5);
		text2.selectByVisibleText("India");
		WebElement  Dropdown6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select text3= new Select(Dropdown6);
		text3.selectByValue("IN-TN");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("2");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("636");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("dch255");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("asddf123@gmail.com");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ROY");
		driver.findElement(By.name("submitButton")).click();
		String title2 = driver.getTitle();
		String title3 ="Create Lead | opentaps CRM";
		if(title2.equals(title3)) {
			System.out.println("Test case pass");
		}else
		{
			System.out.println("test case Fail"); 
			
		}
		
		

		
		


	}

}
