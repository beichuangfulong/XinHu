package com.webtest.demo;

import com.webtest.core.WebDriverEngine;

public class Login_Action {
	private WebDriverEngine webtest;
	  public Login_Action(WebDriverEngine webtest) {
		  this.webtest=webtest;
	  }
	  
	  public void login(String email,String password) 
	  {
	
		  if(is_login()) {
			  webtest.click("link=�˳�");
		  }
			webtest.click("link=��¼");
			webtest.type("name=username", email);
			webtest.type("name=password", password);
			webtest.click("xpath=//input[@value='��¼']");
		
	  }
	  
	  public boolean is_login()
	  {
		  return webtest.isElementPresent("link=�˳�");
	  }
	  
	  

}
