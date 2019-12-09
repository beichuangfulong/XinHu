package com.webtest.xinhu.reim;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.ExcelDataProvider;

public class ProcessList extends BaseTest{
	@DataProvider(name="data5")
	public static Object [][] data() throws IOException{
		ExcelDataProvider dataProvider = new ExcelDataProvider();
		return dataProvider.getTestDataByExcel("D:\\java\\java\\auto2019\\auto2019\\src\\data\\test.xlsx", "Sheet5");
	}
	public void InitDemo() {
		webtest.click("xpath=//span[@pmenuid='7']");
		webtest.click("id=menu_list_num17");
	}
	@Test(description="新增流程模块",dataProvider="data5")
	public void listAdd(String a1,String a2,String a3,String a4) {
		InitDemo();
		webtest.click("xpath=//i[@class='icon-plus']");
		webtest.type("xpath=//input[@name='name']", a1);
		webtest.type("xpath=//input[@name='type']", a2);
		webtest.type("xpath=//input[@name='num']", a3);
		webtest.type("xpath=//input[@name='table']", a4);
		webtest.click("xpath=//td[@colspan='3']");
		webtest.click("xpath=//i[@class='icon-save']");
		assertTrue(webtest.isTextPresent(a1));
	}
	@Test(description="编辑流程模块")
	public void listChange() {
		webtest.click("xpath=//td[@row='0']");
		webtest.click("xpath=//i[@class='icon-edit']");
		webtest.typeAndClear("xpath=//input[@name='name']", "1");
		webtest.typeAndClear("xpath=//input[@name='type']", "1");
		webtest.typeAndClear("xpath=//input[@name='num']", "a");
		webtest.typeAndClear("xpath=//input[@name='table']", "1");
		webtest.click("xpath=//td[@colspan='3']");
		webtest.click("xpath=//i[@class='icon-save']");
		assertTrue(webtest.isTextPresent("1"));
	}
	@Test(description="删除流程模块")
	public void listDelete() {
		webtest.click("xpath=//td[@row='0']");
		webtest.click("xpath=//i[@class='icon-trash']");
		webtest.click("xpath=//i[@class='icon-ok']");
		assertTrue(webtest.isTextPresent("goods"));
	}
}
