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
public class Administration_3_1 extends BaseTest {
	
	public void InitDemo() {
		//进入行政模块
		webtest.click("xpath=//*[@id=\"topheaderid\"]/table/tbody/tr/td[2]/div/span[7]");
		//点击车辆管理
		webtest.click("xpath=//*[@id=\"menu_list_num138\"]");
	}
	
	@Test(description="新增车辆")
	public void test1() throws InterruptedException {	
		InitDemo();
		
		//点击操作
		webtest.click("xpath=//*[@id=\"menu_list_num143\"]");
		webtest.click("xpath=//*[@id=\"content_num143\"]/div[1]/table/tbody/tr/td[1]/button");
		webtest.enterFrame("openinputiframe");
		webtest.type("xpath=//*[@id=\"div_carnum\"]/input", "1");
		webtest.selectByValue("xpath=//*[@id=\"div_cartype\"]/select", "轿车");
		webtest.selectByValue("xpath=//*[@id=\"div_carbrand\"]/select", "奔驰");
		webtest.type("xpath=//*[@id=\"div_carmode\"]/input", "1");
		webtest.runJs2("arguments[0].removeAttribute('readonly')", "xpath=//*[@id=\"div_buydt\"]/input");
		webtest.type("xpath=//*[@id=\"div_buydt\"]/input", "2019-10-1");
		webtest.type("xpath=//*[@id=\"div_buyprice\"]/input", "1");
		webtest.selectByValue("xpath=//*[@id=\"div_state\"]/select", "1");
		webtest.click("xpath=//*[@id=\"AltS\"]");
		assertTrue(true);

	}
	
}
