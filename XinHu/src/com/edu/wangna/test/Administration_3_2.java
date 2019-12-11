package com.edu.test;

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
public class Administration_3_2 extends BaseTest {
	
	public void InitDemo() {
		//进入行政模块
		webtest.click("xpath=//*[@id=\"topheaderid\"]/table/tbody/tr/td[2]/div/span[7]");
		//点击车辆管理
		webtest.click("xpath=//*[@id=\"menu_list_num138\"]");
	}
	
	@Test(description="预定车辆查询")
	public void test1() throws InterruptedException {	
		InitDemo();
		
		//点击操作
		webtest.click("xpath=//*[@id=\"menu_list_num144\"]");
		webtest.typeAndClear("xpath=//*[@id=\"content_num144\"]/div[1]/table/tbody/tr/td[2]/input", "开发部");
		webtest.click("xpath=//*[@id=\"content_num144\"]/div[1]/table/tbody/tr/td[4]/div/button[1]");
		assertTrue(true);

	}
	
}
