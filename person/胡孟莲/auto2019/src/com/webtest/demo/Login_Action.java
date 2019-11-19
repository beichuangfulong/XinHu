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
			  webtest.click("link=ÍË³ö");
		  }
			webtest.click("link=µÇÂ¼");
			webtest.type("name=username", email);
			webtest.type("name=password", password);
			webtest.click("xpath=//input[@value='µÇÂ¼']");
		
	  }
	  
	  public boolean is_login()
	  {
		  return webtest.isElementPresent("link=ÍË³ö");
	  }
	  
	  

}
