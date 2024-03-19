package seleniumExaamples;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HRMGOAL1 {

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
driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[4]/div/div/div/ul/li[3]/a[1]/span")).click();
//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[4]/div/div/div/ul/li[14]/a[1]/span")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//Clicking on add employee Button
driver.findElement(By.xpath("//*[@id=\"addEmployeeButton\"]/i")).click();

//Filling the required username fields from console
Scanner sc=new Scanner(System.in);

System.out.println("Enter the First Name ");
String F_Name=sc.next();

System.out.println("Enter the Last Name ");
String L_Name=sc.next();

System.out.println("Enter the employee id ");
String e_id=sc.next();

System.out.println("Enter the Comments ");
String com=sc.next();

// Add username
driver.findElement(By.id("first-name-box")).sendKeys(F_Name);
driver.findElement(By.id("last-name-box")).sendKeys(L_Name);





driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//Disable Autogenerate Emp ID Toggle
driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/oxd-decorator/div/div[2]/div/div[2]/div/div/span/div[2]")).click();
	
//Add an emplyee ID
driver.findElement(By.xpath("//*[@id=\"employeeId\"]")).sendKeys(e_id);
Thread.sleep(3000);

//date selection
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
Calendar c = Calendar.getInstance();
c.setTime(new Date()); // Using today's date
c.add(Calendar.DATE, 5); // Adding 5 days
String output = sdf.format(c.getTime());
System.out.println("enter Date");
System.out.println(output);
driver.findElement(By.xpath("//*[@id=\"joinedDate\"]")).clear();
driver.findElement(By.xpath("//*[@id=\"joinedDate\"]")).sendKeys(output);
//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/oxd-decorator/div/div[2]/div/div[3]/div/div[2]/div[2]/div[6]/div/div/div/div/div[2]/table/tbody/tr[4]/td[6]/div")).click();

	
//Choose the location as India Office
driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/oxd-decorator/div/div[2]/div/div[3]/div/div[3]/div/div[2]/div/button/i[2]")).click();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
Thread.sleep(1000);

driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/oxd-decorator/div/div[2]/div/div[3]/div/div[3]/div/div[1]/div/div/ul/li[11]/a")).click();
	
	
//*****************************calendar*********
//Thread.sleep(1000);

//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/oxd-decorator/div/div[2]/div/div[3]/div/div[2]/div[2]/div[1]/div/button")).click();


//  login details on and off
driver.findElement(By.xpath("//*[@id=\"modal-holder\"]/div/div/div/div[2]/form/oxd-decorator/div/div[2]/div/div[5]/div/div/span/div[2]")).click();

//create login details.
driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(F_Name+L_Name);
driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("shantanu1234");
driver.findElement(By.xpath("//*[@id=\"confirmPassword\"]")).sendKeys("shantanu1234");
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"modal-holder\"]/div/div/div/div[2]/form/oxd-decorator/div/div[2]/div/div[11]/div/div[3]/div/div[1]/button")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[text()='Regional HR Admin']")).click();
driver.findElement(By.xpath("//*[@id=\"modal-holder\"]/div/div/div/div[2]/form/oxd-decorator/div/div[2]/div/div[12]/div/div[1]/div/div/span/div[2]")).click();
driver.findElement(By.xpath("//*[@id=\"modal-holder\"]/div/div/div/div[2]/form/oxd-decorator/div/div[2]/div/div[12]/div/div[2]/div/div/oxd-multiselect/div/div/div/div")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"IN\"]/a")).click();
driver.findElement(By.xpath("//*[@id=\"modal-holder\"]/div/div/div/div[2]/form/oxd-decorator/div/div[2]/div/div[12]/div/div[3]/div/div/div/div[3]/div/div[1]/span/div[1]/span")).click();
driver.findElement(By.xpath("//*[@id=\"modal-holder\"]/div/div/div/div[2]/form/oxd-decorator/div/div[2]/div/div[12]/div/div[3]/div/div/div/div[3]/div/div[1]/span/div[2]")).click();
driver.findElement(By.xpath("//*[@id=\"modal-holder\"]/div/div/div/div[2]/form/oxd-decorator/div/div[2]/div/div[12]/div/div[3]/div/div/div/div[3]/div/div[2]/oxd-multiselect/div/div/div/div/input")).click();
driver.findElement(By.xpath("//*[@id=\"4\"]/a")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"modal-save-button\"]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"wizard-nav-button-section\"]/button[2]")).click();

//confirming that the page is employment details
WebElement e = driver.findElement(By.xpath("//*[@id=\"employement_details_tab\"]/h4"));
System.out.println("The current web page is : "+e.getText());

driver.findElement(By.xpath("//*[@id=\"employement_details_tab\"]/form/div/oxd-decorator[1]/div/div[4]/div/div[2]/div/button")).click();
driver.findElement(By.xpath("//*[@id=\"bs-select-23-4\"]")).click();


driver.findElement(By.xpath("//*[@id=\"comment\"]")).sendKeys(com);

Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"wizard-nav-button-section\"]/button[2]")).click();

e = driver.findElement(By.xpath("//*[@id=\"contact_details_tab\"]/h4"));
System.out.println("The current web page is : "+e.getText());


Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"wizard-nav-button-section\"]/button[2]")).click();

Thread.sleep(5000);
e = driver.findElement(By.xpath("//*[@id=\"mount-vue-app\"]/ui-view/div[1]/div/employee-onboarding/h4"));
System.out.println("The current web page is : "+e.getText());

//In The Drop Down select Onboarding- india (Page Giving Issue)
//driver.findElement(By.xpath("//*[@class=\"select-dropdown\"]")).click();
//Thread.sleep(7000);
//driver.findElement(By.xpath("//*[@class=\"dropdown-content"+" "+ "select-dropdown\"]/li[2]")).click();
//Thread.sleep(5000);

driver.findElement(By.xpath("//*[@id=\"wizard-nav-button-section\"]/button[3]")).click();
System.out.println("Saved Successully");

Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"topbar-ribbon\"]/div[2]/ui-view/div/div[1]/top-level-menu-item[2]/div/a")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"mount-vue-app\"]/ui-view/div[2]/div/div[2]/pim-attachment/div[1]/div")).click();

//Image Upload Syntax (Unable To Do IT)
WebElement chooseFile = driver.findElement(By.xpath("//*[@id=\"filename\"]"));
chooseFile.sendKeys("C:\\Users\\shant\\Downloads\\Selenium_Logo.png");


//driver.close();
	}

}

