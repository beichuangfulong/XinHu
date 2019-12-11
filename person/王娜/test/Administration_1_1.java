package com.edu.test;

import static org.testng.Assert.assertFalse;
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
public class Administration_1_1 extends BaseTest {
	
	public void InitDemo() {
		//进入行政模块
		webtest.click("xpath=//*[@id=\"topheaderid\"]/table/tbody/tr/td[2]/div/span[7]");
		//点击物品管理
		webtest.click("xpath=//*[@id=\"menu_list_num28\"]");
	}
	
	
	@Test(description="新增物品")
	public void test1() throws InterruptedException {	
		InitDemo();
		
		//点击操作
		webtest.click("xpath=//*[@id=\"menu_list_num30\"]");
		webtest.click("xpath=//*[@id=\"content_num30\"]/table/tbody/tr/td[3]/div[1]/table/tbody/tr/td[1]/button");
		webtest.enterFrame("openinputiframe");
		webtest.type("xpath=//*[@id=\"div_name\"]/input", "打印机");
		webtest.selectByValue("xpath=//*[@id=\"div_typeid\"]/select", "65");
		webtest.selectByValue("xpath=//*[@id=\"div_unit\"]/select", "台");
		webtest.click("xpath=//*[@id=\"AltS\"]");
	
		webtest.leaveFrame();
		webtest.click("xpath=//*[@id=\"winiframe_spancancel\"]");
		assertFalse(webtest.isTextPresent("物品已存在了"));
		webtest.leaveFrame();
		assertTrue(true);
	}
	
}
