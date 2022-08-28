package com.hrms.testscript;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC001 {
	@Test
public void tc001() {
		
	General obj=new General();
	obj.OpenApplication();
	obj.Login();
	obj.Logout();
	obj.CloseApplication();
}
	
}

