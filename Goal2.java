package seleniumExaamples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Goal2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Shantanu\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://klaaradmin-trials711.orangehrmlive.com/client/#/dashboard");
		driver.manage().window().maximize();
	
	//Login 	
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("SyN6Ktl@O0"); 
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/form/div[4]/button")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	//Navigate to Performance Module
		driver.findElement(By.xpath("//*[@id=\"side-menu-more\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"menu_item_241\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"top_level_menu_item_menu_item_237\"]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"top_level_menu_item_menu_item_237\"]/sub-menu-container/div/div[2]/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"goalListContainer\"]/div/div/list/div/div[1]/button")).click();
		
	//Verifying that we have landed to goal page
		WebElement e = driver.findElement(By.xpath("//*[@id=\"addGoalContainer\"]/div/div[1]/span/h4"));
		System.out.println("The current web page is : "+e.getText());
		
	//Filling Required fields to create a goal	
		driver.findElement(By.xpath("//*[@id=\"name_value\"]")).sendKeys("jfkgdshgfds");
		driver.findElement(By.xpath("//*[@id=\"dueDate\"]")).sendKeys("2024-03-23");
		driver.findElement(By.xpath("//*[@id=\"addGoalContainer\"]/div/div[2]/form/div/div/oxd-decorator[1]/div/div[2]/div/div[2]/div/div/div/div[1]/button")).click();
//		driver.findElement(By.xpath("//*[@id=\"bs-select-3-2\"]")).click();
	
	//Setting Priority as High and Weight as 20	
		driver.findElement(By.xpath("//*[text()='High']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"spinnerInputweight\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"spinnerInputweight\"]")).sendKeys("20");
		
	//showing the error message after putting weight as 20 and the same is dispalyed on the Console.
		e=driver.findElement(By.xpath("//*[@id=\"weight\"]/span"));
		System.out.println("While entering 20 as the weight, we receive this message : "+e.getText());
		
		driver.findElement(By.xpath("//*[@id=\"spinnerInputweight\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"spinnerInputweight\"]")).sendKeys("10");
	
	//The Goal Details are Verified.
		driver.findElement(By.xpath("//*[@id=\"addGoalContainer\"]/div/div[2]/form/div/div/oxd-decorator[4]/div/div[2]/button")).click();
	}
	}