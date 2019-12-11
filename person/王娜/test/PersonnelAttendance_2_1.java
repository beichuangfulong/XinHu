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
public class PersonnelAttendance_2_1 extends BaseTest {
	
	public void InitDemo() {
		//进入人事考勤模块
		webtest.click("xpath=//*[@id=\"topheaderid\"]/table/tbody/tr/td[2]/div/span[6]");
		//点击人事管理
		webtest.click("xpath=//*[@id=\"menu_list_num127\"]");
	}
	
	@Test(description="查看转正申请")
	public void test1() throws InterruptedException {	
		InitDemo();
		//点击转正申请
		webtest.click("xpath=//*[@id=\"menu_list_num96\"]");
		//点击操作
		webtest.click("xpath=//tbody[starts-with(@id,'tbody_')]/tr/td[11]/a");
		webtest.click("xpath=//div[starts-with(@id,'rockmenuli')]/ul/li[1]");
		webtest.click("xpath=//div[@id=\"winiframe_spancancel\"]");
		
		assertTrue(true);
	}
	
}
