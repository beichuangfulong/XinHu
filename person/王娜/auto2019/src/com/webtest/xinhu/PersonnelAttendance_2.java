package com.webtest.xinhu;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.dataprovider.NSDataProvider;

public class PersonnelAttendance_2 extends BaseTest{

//	人事考勤-工作日报
	@Test(dataProvider="excel",dataProviderClass=NSDataProvider.class)
	//登录，进入人事考勤模块
	public void test1(String name,String pwd) {
		System.out.println(name+pwd);
		webtest.open("http://localhost:9999/?m=login");
		webtest.type("name=adminuser", name);
		webtest.type("xpath=//input[@type='password']", pwd);
		webtest.click("class=webbtn");
		webtest.click("xpath=//span[@pmenuid=27]");
		webtest.click("xpath=//*[@id=\"menu_list_num192\"]");
	}
	
	@DataProvider(name="time")
	public Object[][] getExcelDada() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("F:\\data\\time.xlsx","Sheet1");
	}
	
	@Test(dataProvider="time")
//	按照不同的关键字查看工作日报
	public void test2(String time) {
		webtest.click("xpath=//*[@id=\"menu_list_num193\"]");
		webtest.typeAndClear("xpath=//input[starts-with(@id,'key_')]", time);
		webtest.click("xpath=//*[@id=\"content_num193\"]/div[1]/table/tbody/tr/td[3]/div/button[1]");
	}
}
