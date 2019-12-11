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
public class PersonnelAttendance_2_3 extends BaseTest {
	
	public void InitDemo() {
		//进入人事考勤模块
		webtest.click("xpath=//*[@id=\"topheaderid\"]/table/tbody/tr/td[2]/div/span[6]");
		//点击人事管理
		webtest.click("xpath=//*[@id=\"menu_list_num127\"]");
	}
	
	@Test(description="新增人事调动")
	public void test1() throws InterruptedException {	
		InitDemo();
		//点击人事调动
		webtest.click("xpath=//*[@id=\"menu_list_num128\"]");
		//点击新增
		webtest.click("xpath=//*[@id=\"content_num128\"]/div[1]/table/tbody/tr/td[1]/button");
		webtest.enterFrame("openinputiframe");
		webtest.click("xpath=//*[@id=\"btnchange_tranname\"]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/div[3]/table/tbody/tr/td[2]");
		webtest.click("xpath=//input[starts-with(@name,'changeuserinput')]");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
		webtest.click("xpath=//*[@id=\"btnchange_newdeptname\"]");
		webtest.click("xpath=//input[starts-with(@name,'changeuserinput')]");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
		webtest.selectByValue("xpath=//*[@id=\"div_trantype\"]/select", "平调");
		webtest.type("xpath=//*[@id=\"div_newranking\"]/input", "2");
		webtest.click("xpath=//*[@id=\"AltS\"]");
		assertTrue(webtest.isTextPresent("该人员已申请过了"));
		webtest.leaveFrame();
		webtest.click("xpath=//*[@id=\"winiframe_spancancel\"]");
	}
}