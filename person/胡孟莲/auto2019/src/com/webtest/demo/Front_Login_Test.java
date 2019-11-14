package com.webtest.demo;

import com.webtest.core.BaseTest;

public class Front_Login_Test extends BaseTest{

	Login_Action action;
	
	@BeforeMethod
	public void setup()
	{
		action=new Login_Action(webtest);
	}

	@Test
	public void testLogin() throws Exception  {
		webtest.open("http://www.roqisoft.com/zhsx/");
		action.login("humenglian", "123456");
		assertTrue(webtest.isTextPresent("ÍË³ö"));
		

	}

	private void assertTrue(boolean textPresent) {
		// TODO Auto-generated method stub
		
	}

}
