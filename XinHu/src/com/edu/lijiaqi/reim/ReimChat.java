package com.edu.lijiaqi.reim;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.ExcelDataProvider;

public class ReimChat extends BaseTest{
	@DataProvider(name="data2")
	public static Object [][] data() throws IOException{
		ExcelDataProvider dataProvider = new ExcelDataProvider();
		return dataProvider.getTestDataByExcel("D:\\java\\java\\auto2019\\auto2019\\src\\data\\test.xlsx", "Sheet3");
	}
	public void InitDemo() {
		webtest.click("xpath=//span[@title='REIM即时通信']");
		webtest.click("id=confirm_btn1");
		webtest.switchWidow(1);
		webtest.max();
		webtest.click("xpath=//div[@title='会话/群']");
		webtest.click("id=group_2");
		webtest.switchWidow(2);
		webtest.max();
		webtest.click("xpath=//a[@tools='clear']");
	}
	@Test(description="发送信息",dataProvider="data2")
	public void chatDemo1(String a1) {
		InitDemo();
		webtest.typeAndClear("id=contentss", a1);
		webtest.click("xpath=//a[@tools='send']");
		assertTrue(webtest.isTextPresent(a1));
	}
	@Test(description="会话框关闭")
	public void chatDemo2() {
		webtest.click("xpath=//a[@tools='close']");
		webtest.switchWidow(1);
		assertTrue(webtest.isElementPresent("id=group_2"));
	}
}
