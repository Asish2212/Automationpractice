package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	WebDriver driver;
//DATA
	public String URL="http://127.0.0.1/orangehrm-2.6/login.php";
	public String UN="admin";
	public String PW="admin";
	public String Emp_FirstName="Asishjkjk";
	public String Emp_LastName="kumarjkjk";
	public String Emp_FirstNameNew="kulukulu";
	public String Emp_LastNameNew="kulikuli";
	
	
//OBJECT	
	public String username_box="txtUserName";
	public String password_box="txtPassword";
	public String login_btn="Submit";
	public String logout="Logout";
	public String add_btn="(//input[@value='Add'])";
	public String emp_FN_Box="txtEmpFirstName";
	public String emp_LN_Box="txtEmpLastName";
	public String save_btn="//*[@id=\"btnEdit\"]";      
	public String anyemp="//*[@id=\"standardView\"]/table/tbody/tr[31]/td[3]/a";//xpath
	public String edit_btn="EditMain";//name
	public String Save_btnNew="//*[@id=\"btnEditPers\"]";//xpath
	
}
