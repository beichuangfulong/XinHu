package com.webtest.demo;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;

public class Front_Login1 extends BaseTest{


	@Test(dataProvider="txt",dataProviderClass=NSDataProvider.class)
	public void testLoginSuccess(String u_name,String u_pwd) throws Exception  {
		webtest.open("http://www.roqisoft.com/zhsx/");
		if(webtest.isTextPresent("ÍË³ö")) {
			webtest.click("link=ÍË³ö");
		}
		webtest.click("link=µÇÂ¼");
		webtest.type("name=username",u_name );
		webtest.type("name=password", u_pwd);
		webtest.click("xpath=//input[@value='µÇÂ¼']");
		assertTrue(webtest.isTextPresent("ÍË³ö"));
	
		
	}

	private void assertTrue(boolean textPresent) {
		// TODO Auto-generated method stub
		
	}

}
