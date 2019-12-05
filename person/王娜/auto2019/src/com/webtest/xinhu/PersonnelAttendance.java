package com.webtest.xinhu;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;

public class PersonnelAttendance extends BaseTest {
	//人事考勤模块
	
	@Test(dataProvider="excel",dataProviderClass=NSDataProvider.class)
	//登录，进入人事考勤模块
	public void test1(String name,String pwd) {
		System.out.println(name+pwd);
		webtest.open("http://localhost:9999/?m=login");
		webtest.type("name=adminuser", name);
		webtest.type("xpath=//input[@type='password']", pwd);
		webtest.click("class=webbtn");
		webtest.click("xpath=//span[@pmenuid=27]");
	}
	
	@Test
	//新增员工合同
	//按照不同的关键字查看员工合同
	public void test2() {
		webtest.click("xpath=//*[@id=\"menu_list_num84\"]");
		webtest.click("xpath=//*[@id=\"menu_list_num95\"]");
//		定位变化的id
		webtest.click("xpath=//button[starts-with(@id,'addbtn')]");
//		进入iframe页面
		webtest.enterFrame("openinputiframe");
		webtest.click("xpath=//*[@id=\"btnchange_uname\"]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/div[1]/table/tbody/tr/td[2]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/span[1]/div/table/tbody/tr/td[3]/input");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
//		下拉框的定位select
		webtest.selectByValue("name=companyid", "2");
		webtest.click("xpath=/html/body/div/div[2]/div[3]/form/table/tbody/tr[2]/td[2]/span/input");
		webtest.type("xpath=/html/body/div/div[2]/div[3]/form/table/tbody/tr[2]/td[2]/span/input", "信呼");
		webtest.selectByValue("name=httype", "劳动合同");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[3]/form/table/tbody/tr[3]/td[2]/span/input");
		
//		webtest.runJs("document.getElementsByTagName(\"H1\")[0].removeAttribute(\"style\");");
//		选择时间 配置readonly属性
		webtest.runJs("arguments[0].removeAttribute('readonly')", "xpath=//span[@id='div_startdt']/input");
		webtest.type("xpath=//span[@id='div_startdt']/input", "2019-10-1");
		webtest.runJs("arguments[0].removeAttribute('readonly')","xpath=//span[@id='div_enddt']/input");
		webtest.type("xpath=//span[@id='div_enddt']/input", "2019-12-13");

		webtest.click("xpath=//input[@id=\"AltS\"]");
		
		webtest.leaveFrame();
		webtest.type("xpath=//input[starts-with(@id,'key')]", "管理层");
		webtest.click("xpath=/html/body/table/tbody/tr/td[3]/div/div[4]/div/div[2]/div[1]/table/tbody/tr/td[3]/div/button[1]");
	
//		webtest.enterFrame("openinputiframe");
	}
	
	@Test
	//考试培训
	public void test3() {
		webtest.click("xpath=//*[@id=\"menu_list_num199\"]");
		webtest.click("xpath=//*[@id=\"menu_list_num201\"]");
//		webtest.type("xpath=//input[starts-with(@id,'key')]", "管理层");
		webtest.type("xpath=//*[@id=\"content_num201\"]/div[1]/table/tbody/tr/td[1]/input", "管理层");
		webtest.click("xpath=//*[@id=\"content_num201\"]/div[1]/table/tbody/tr/td[2]/button");
	}
	//*[@id="content_num201"]/div[1]/table/tbody/tr/td[1]
	

}
