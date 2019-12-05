package com.webtest.demo;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.dataprovider.NSDataProvider;

public class LoginExcel extends BaseTest{

//	@DataProvider(name="excel")
//	public Object[][] getExcelDada() throws IOException{
////		Object[][] user = new ExcelDataProvider().getTestDataByExcel("F:\\\\data\\\\user.xlsx", "Sheet1");
////		return user;
//		return new ExcelDataProvider().getTestDataByExcel("F:\\data\\user.xlsx","Sheet1");
//	}
//	
//	@Test(dataProvider="excel")
//	public void login(String name,String pwd) {
//		System.out.println(name+ pwd);
//	}
	
	@Test(dataProvider="excel",dataProviderClass=NSDataProvider.class)
	public void login(String name,String pwd) {
		System.out.println(name+pwd);
		webtest.open("http://localhost:9999/?m=login");
		webtest.type("name=adminuser", name);
		webtest.type("xpath=//input[@type='password']", pwd);
		webtest.click("class=webbtn");
	}
}
