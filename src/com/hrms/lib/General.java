package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global{
	public void OpenApplication() {
		System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to(URL);
		System.out.println("Application opened");
		Log.info("application opened");
		Reporter.log("application opened");
	}
public void CloseApplication() {
	driver.close();
	System.out.println("Application closed");
	Log.info("appliction closed");
	Reporter.log("Application closed");
}
public void Logout() {
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("logout completed");
	Log.info("logout completed");
	Reporter.log("logout completed");
}
public void Login() {
	driver.findElement(By.name(username_box)).sendKeys(UN);
	driver.findElement(By.name(password_box)).sendKeys(PW);
	driver.findElement(By.name(login_btn)).click();
	System.out.println("login completed");
	Log.info("login completed");
	Reporter.log("login completed");
}
public void EnterFrame() {
	driver.switchTo().frame("rightMenu");
	System.out.println("entered into frame");
	Log.info("entered into frame");
	Reporter.log("entered into frame");
}
public void ExitFrame() {
	driver.switchTo().defaultContent();
	System.out.println("exit from frame");
	Log.info("exit from frame");
	Reporter.log("Exit from frame");
}
public void AddNewEmp() {
	driver.findElement(By.xpath(add_btn)).click();
	driver.findElement(By.name(emp_FN_Box)).sendKeys(Emp_FirstName);
	driver.findElement(By.name(emp_LN_Box)).sendKeys(Emp_LastName);
	driver.findElement(By.xpath(save_btn)).click();
	System.out.println("employee added");
	Log.info("employee added");
	Reporter.log("employee added");
}
public void clickAnyEmp() {
	driver.findElement(By.xpath(anyemp)).click();
	System.out.println("clicked on one employee name");
	Log.info("clicked on one employee name");
	Reporter.log("clicked one employee name");
}
public void ClickEditBtn() {
	driver.findElement(By.name(edit_btn)).click();
	System.out.println("edit btn clicked");
	Log.info("clicked on edit btn");
	Reporter.log("edit btn clicked");
}
public void ClearEmployeeName() {
	driver.findElement(By.name(emp_FN_Box)).clear();
	driver.findElement(By.name(emp_LN_Box)).clear();
	System.out.println("employee name cleared");
	Log.info("Employee name cleared");
	Reporter.log("emploee name cleared");
}
public void EmpNewNameAdd() {
	driver.findElement(By.name(emp_FN_Box)).sendKeys(Emp_FirstNameNew);
	driver.findElement(By.name(emp_LN_Box)).sendKeys(Emp_LastNameNew);
	System.out.println("new name entered");
	Log.info("new name entered");
	Reporter.log("new name entered");
}
public void ClickSaveBtnNewName() {
	driver.findElement(By.xpath(Save_btnNew)).click();
	System.out.println("clicked on save button");
	Log.info("clicked on save button");
	Reporter.log("clicked on save button");
}
}
