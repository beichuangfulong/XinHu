package com.edu.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edu.core.ApiListener;
import com.edu.core.BaseTest;
import com.edu.dataprovider.NSDataProvider;
import com.webtest.dataprovider.ExcelDataProvider;
@Listeners(ApiListener.class)
public class PersonnelAttendance_1_2 extends BaseTest {
	
	public void InitDemo() {
		//进入人事考勤模块
		webtest.click("xpath=//*[@id=\"topheaderid\"]/table/tbody/tr/td[2]/div/span[6]");
		//点击人事档案
		webtest.click("xpath=//*[@id=\"menu_list_num84\"]");
	}
	
	@Test(description="新增名称为“信呼”的员工合同")
	public void test1() throws InterruptedException {	
		InitDemo();
		System.out.println("a");
		//点击员工合同
		webtest.click("xpath=//*[@id=\"menu_list_num95\"]");
		//点击新增按钮
		webtest.click("xpath=//button[starts-with(@id,'addbtn')]");
		//进入iframe页面
		webtest.enterFrame("openinputiframe");
		//选择签署人
		webtest.click("xpath=//*[@id=\"btnchange_uname\"]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/div[1]/table/tbody/tr/td[2]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/span[1]/div/table/tbody/tr/td[3]/input");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
		//下拉框的定位select
		webtest.selectByValue("name=companyid", "2");
		webtest.click("xpath=/html/body/div/div[2]/div[3]/form/table/tbody/tr[2]/td[2]/span/input");
		webtest.type("xpath=/html/body/div/div[2]/div[3]/form/table/tbody/tr[2]/td[2]/span/input", "信呼");
		webtest.selectByValue("name=httype", "劳动合同");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[3]/form/table/tbody/tr[3]/td[2]/span/input");
		
		//webtest.runJs("document.getElementsByTagName(\"H1\")[0].removeAttribute(\"style\");");
		//选择时间 配置readonly属性
		webtest.runJs("arguments[0].removeAttribute('readonly')", "xpath=//span[@id='div_startdt']/input");
		webtest.type("xpath=//span[@id='div_startdt']/input", "2019-10-1");
		webtest.runJs("arguments[0].removeAttribute('readonly')","xpath=//span[@id='div_enddt']/input");
		webtest.type("xpath=//span[@id='div_enddt']/input", "2019-12-13");

		webtest.click("xpath=//input[@id=\"AltS\"]");
		
		webtest.leaveFrame();
		assertTrue(webtest.isTextPresent("保存成功"));
		
	}
	
	@Test(description="新增名称为“<script>”的员工合同")
	public void test2() throws InterruptedException {	
		System.out.println("a");
		//点击员工合同
		webtest.click("xpath=//*[@id=\"menu_list_num95\"]");
		//点击新增按钮
		webtest.click("xpath=//button[starts-with(@id,'addbtn')]");
		//进入iframe页面
		webtest.enterFrame("openinputiframe");
		//选择签署人
		webtest.click("xpath=//*[@id=\"btnchange_uname\"]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/div[1]/table/tbody/tr/td[2]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/span[1]/div/table/tbody/tr/td[3]/input");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
		//下拉框的定位select
		webtest.selectByValue("name=companyid", "2");
		webtest.click("xpath=/html/body/div/div[2]/div[3]/form/table/tbody/tr[2]/td[2]/span/input");
		webtest.type("xpath=/html/body/div/div[2]/div[3]/form/table/tbody/tr[2]/td[2]/span/input", "<script>");
		webtest.selectByValue("name=httype", "劳动合同");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[3]/form/table/tbody/tr[3]/td[2]/span/input");
		
		//webtest.runJs("document.getElementsByTagName(\"H1\")[0].removeAttribute(\"style\");");
		//选择时间 配置readonly属性
		webtest.runJs("arguments[0].removeAttribute('readonly')", "xpath=//span[@id='div_startdt']/input");
		webtest.type("xpath=//span[@id='div_startdt']/input", "2019-10-1");
		webtest.runJs("arguments[0].removeAttribute('readonly')","xpath=//span[@id='div_enddt']/input");
		webtest.type("xpath=//span[@id='div_enddt']/input", "2019-12-13");

		webtest.click("xpath=//input[@id=\"AltS\"]");
		
		webtest.leaveFrame();
		assertTrue(webtest.isTextPresent("保存成功"));
	}
	
	@Test(description="新增名称为“!@%**0”的员工合同")
	public void test3() throws InterruptedException {	
		System.out.println("a");
		//点击员工合同
		webtest.click("xpath=//*[@id=\"menu_list_num95\"]");
		//点击新增按钮
		webtest.click("xpath=//button[starts-with(@id,'addbtn')]");
		//进入iframe页面
		webtest.enterFrame("openinputiframe");
		//选择签署人
		webtest.click("xpath=//*[@id=\"btnchange_uname\"]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/div[1]/table/tbody/tr/td[2]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/span[1]/div/table/tbody/tr/td[3]/input");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
		//下拉框的定位select
		webtest.selectByValue("name=companyid", "2");
		webtest.click("xpath=/html/body/div/div[2]/div[3]/form/table/tbody/tr[2]/td[2]/span/input");
		webtest.type("xpath=/html/body/div/div[2]/div[3]/form/table/tbody/tr[2]/td[2]/span/input", "!@%**0");
		webtest.selectByValue("name=httype", "劳动合同");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[3]/form/table/tbody/tr[3]/td[2]/span/input");
		
		//webtest.runJs("document.getElementsByTagName(\"H1\")[0].removeAttribute(\"style\");");
		//选择时间 配置readonly属性
		webtest.runJs("arguments[0].removeAttribute('readonly')", "xpath=//span[@id='div_startdt']/input");
		webtest.type("xpath=//span[@id='div_startdt']/input", "2019-10-1");
		webtest.runJs("arguments[0].removeAttribute('readonly')","xpath=//span[@id='div_enddt']/input");
		webtest.type("xpath=//span[@id='div_enddt']/input", "2019-12-13");

		webtest.click("xpath=//input[@id=\"AltS\"]");
		
		webtest.leaveFrame();
		assertTrue(webtest.isTextPresent("保存成功"));
	}
	
	@Test(description="新增名称为“false”的员工合同")
	public void test4() throws InterruptedException {	
		System.out.println("a");
		//点击员工合同
		webtest.click("xpath=//*[@id=\"menu_list_num95\"]");
		//点击新增按钮
		webtest.click("xpath=//button[starts-with(@id,'addbtn')]");
		//进入iframe页面
		webtest.enterFrame("openinputiframe");
		//选择签署人
		webtest.click("xpath=//*[@id=\"btnchange_uname\"]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/div[1]/table/tbody/tr/td[2]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/span[1]/div/table/tbody/tr/td[3]/input");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
		//下拉框的定位select
		webtest.selectByValue("name=companyid", "2");
		webtest.click("xpath=/html/body/div/div[2]/div[3]/form/table/tbody/tr[2]/td[2]/span/input");
		webtest.type("xpath=/html/body/div/div[2]/div[3]/form/table/tbody/tr[2]/td[2]/span/input", "false");
		webtest.selectByValue("name=httype", "劳动合同");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[3]/form/table/tbody/tr[3]/td[2]/span/input");
		
		//webtest.runJs("document.getElementsByTagName(\"H1\")[0].removeAttribute(\"style\");");
		//选择时间 配置readonly属性
		webtest.runJs("arguments[0].removeAttribute('readonly')", "xpath=//span[@id='div_startdt']/input");
		webtest.type("xpath=//span[@id='div_startdt']/input", "2019-10-1");
		webtest.runJs("arguments[0].removeAttribute('readonly')","xpath=//span[@id='div_enddt']/input");
		webtest.type("xpath=//span[@id='div_enddt']/input", "2019-12-13");

		webtest.click("xpath=//input[@id=\"AltS\"]");
		
		webtest.leaveFrame();
		assertTrue(webtest.isTextPresent("保存成功"));
	}
	
	@Test(description="新增名称为“12345”的员工合同")
	public void test5() throws InterruptedException {	
		System.out.println("a");
		//点击员工合同
		webtest.click("xpath=//*[@id=\"menu_list_num95\"]");
		//点击新增按钮
		webtest.click("xpath=//button[starts-with(@id,'addbtn')]");
		//进入iframe页面
		webtest.enterFrame("openinputiframe");
		//选择签署人
		webtest.click("xpath=//*[@id=\"btnchange_uname\"]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/div[1]/table/tbody/tr/td[2]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/span[1]/div/table/tbody/tr/td[3]/input");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
		//下拉框的定位select
		webtest.selectByValue("name=companyid", "2");
		webtest.click("xpath=/html/body/div/div[2]/div[3]/form/table/tbody/tr[2]/td[2]/span/input");
		webtest.type("xpath=/html/body/div/div[2]/div[3]/form/table/tbody/tr[2]/td[2]/span/input", "12345");
		webtest.selectByValue("name=httype", "劳动合同");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[3]/form/table/tbody/tr[3]/td[2]/span/input");
		
		//webtest.runJs("document.getElementsByTagName(\"H1\")[0].removeAttribute(\"style\");");
		//选择时间 配置readonly属性
		webtest.runJs("arguments[0].removeAttribute('readonly')", "xpath=//span[@id='div_startdt']/input");
		webtest.type("xpath=//span[@id='div_startdt']/input", "2019-10-1");
		webtest.runJs("arguments[0].removeAttribute('readonly')","xpath=//span[@id='div_enddt']/input");
		webtest.type("xpath=//span[@id='div_enddt']/input", "2019-12-13");

		webtest.click("xpath=//input[@id=\"AltS\"]");
		
		webtest.leaveFrame();
		assertTrue(webtest.isTextPresent("保存成功"));
	}
	
}