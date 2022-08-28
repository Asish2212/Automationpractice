package com.hrms.testscript;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC003 {
@Test
	public void tc003() {
		
	General obj=new General();
	obj.OpenApplication();
	obj.Login();
	obj.EnterFrame();
	obj.clickAnyEmp();
	obj.ClickEditBtn();
	obj.ClearEmployeeName();
	obj.EmpNewNameAdd();
	obj.ClickSaveBtnNewName();
	obj.ExitFrame();
	obj.Logout();
	obj.CloseApplication();
	}
}
