package com.edu.lijiaqi.reim;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.ApiListener;
import com.webtest.core.BaseTest;
import com.webtest.dataprovider.ExcelDataProvider;
@Listeners(ApiListener.class)
public class ReimSearch extends BaseTest{
	@DataProvider(name="data3")
	public static Object[][] data() throws IOException {
		ExcelDataProvider dataProvider = new ExcelDataProvider();
		return dataProvider.getTestDataByExcel("D:\\git\\XinHu\\XinHu\\data\\data.xlsx", "Sheet4");
	}
	public void InitDemo() {
		webtest.click("xpath=//span[@title='REIM即时通信']");
		webtest.click("id=confirm_btn1");
		webtest.switchWidow(1);
		webtest.max();
	}
	@Test(description="输入搜索",dataProvider="data3")
	public void searchDemo1(String a1) {	
		InitDemo();
		webtest.typeAndClear("xpath=//*[@id=\"reim_keysou\"]", a1);
		assertTrue(webtest.isTextPresent(a1));
	}
}
