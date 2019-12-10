package com.webtest.xinhu.reim;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.ExcelDataProvider;

public class Process extends BaseTest{
	@DataProvider(name="data4")
	public static Object[][] data1() throws IOException {
		ExcelDataProvider dataProvider = new ExcelDataProvider();
		return dataProvider.getTestDataByExcel("D:\\java\\java\\auto2019\\auto2019\\src\\data\\test.xlsx", "Sheet4");
	}
	public void InitDemo() {
		webtest.click("xpath=//span[@pmenuid='7']");
		webtest.click("id=menu_list_num213");
	}
	@Test(description="审核人员分组新增组",dataProvider="data4")
	public void processAdd(String a1,String a2) {
		InitDemo();
		webtest.click("xpath=//button[@class='btn btn-warning']");
		webtest.type("xpath=//input[@name='name']", a1);
		webtest.type("xpath=//input[@name='num']", a2);
		webtest.click("class=icon-search");
		webtest.click("xpath=//td[@deptxu='1_1']");
		webtest.click("xpath=//input[@value='5']");
		webtest.click("xpath=//input[@value='确定']");
		webtest.click("xpath=//input[@name='sort']");
		webtest.click("xpath=//i[@class='icon-save']");
		assertTrue(webtest.isTextPresent(a1));
	}
	@Test(description="审核人员分组修改")
	public void processChange() {
		webtest.click("xpath=//td[@row='2']");
		webtest.click("xpath=//button[@class='btn btn-info']");
		webtest.typeAndClear("xpath=//input[@name='name']","审核人员分组4");
		webtest.typeAndClear("xpath=//input[@name='num']", "group4");
		webtest.click("class=icon-search");
		webtest.click("xpath=//td[@deptxu='3_1']");
		webtest.click("xpath=//input[@value='1']");
		webtest.click("xpath=//input[@value='确定']");
		webtest.click("xpath=//input[@name='sort']");
		webtest.click("xpath=//i[@class='icon-save']");
		assertTrue(webtest.isTextPresent("审核人员分组4"));
	}
	
	@Test(description="审核人员分组删除")
	public void processDelete() {
		webtest.click("xpath=//td[@row='2']");
		webtest.click("xpath=//button[@class='btn btn-danger']");
		webtest.click("class=icon-ok");
		assertTrue(webtest.isTextPresent("审核人员分组1"));
	}
}
