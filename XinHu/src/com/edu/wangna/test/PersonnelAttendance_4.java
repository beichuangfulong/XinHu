package com.edu.wangna.test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edu.core.ApiListener;
import com.edu.core.BaseTest;
import com.edu.dataprovider.NSDataProvider;
import com.webtest.dataprovider.ExcelDataProvider;
@Listeners(ApiListener.class)
public class PersonnelAttendance_4 extends BaseTest {
	
	public void InitDemo() {
		//进入人事考勤模块
		webtest.click("xpath=//*[@id=\"topheaderid\"]/table/tbody/tr/td[2]/div/span[6]");
		//点击新资管理
		webtest.click("xpath=//*[@id=\"menu_list_num98\"]");
	}
	
	@DataProvider(name="name")
	public Object[][] getExcelDada() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("F:\\data\\time.xlsx","Sheet2");
	}
	
	@Test(description="按照不同的关键字查看员工新资情况",dataProvider="name")
	public void test1(String name) throws InterruptedException {	
		InitDemo();
		
		//点击操作
		webtest.click("xpath=//*[@id=\"menu_list_num99\"]");
		webtest.typeAndClear("xpath=//input[starts-with(@id,'key_')]", name);
		webtest.click("xpath=//*[@id=\"content_num99\"]/div[1]/table/tbody/tr/td[4]/button");
		
		assertTrue(true);
	}
	
}
