package com.webtest.xinhu;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.dataprovider.NSDataProvider;

public class PersonnelAttendance_1 extends BaseTest {
//	人事考勤-人事管理
	@Test(dataProvider="excel",dataProviderClass=NSDataProvider.class)
	//登录，进入人事考勤模块
	public void test1(String name,String pwd) {
		System.out.println(name+pwd);
		webtest.open("http://localhost:9999/?m=login");
		webtest.type("name=adminuser", name);
		webtest.type("xpath=//input[@type='password']", pwd);
		webtest.click("class=webbtn");
		webtest.click("xpath=//span[@pmenuid=27]");
		webtest.click("xpath=//*[@id=\"menu_list_num127\"]");
	}
	
	@Test
//	查看转正申请
	public void test2() {
	
		webtest.click("xpath=//*[@id=\"menu_list_num96\"]");
		webtest.click("xpath=//a[starts-with(@temp,'caozuomenu')]");
		webtest.click("xpath=//div[starts-with(@id,'rockmenuli')]/ul/li[1]");
		webtest.click("xpath=//div[@id=\"winiframe_spancancel\"]");
	}
	
	@Test
//	催办离职申请
	public void test3() {
		webtest.click("xpath=//*[@id=\"menu_list_num97\"]");
		webtest.click("xpath=//tbody[starts-with(@id,'tbody')]/tr/td[12]/a");
		webtest.click("xpath=//div[starts-with(@id,'rockmenuli')]/ul/li[5]");
		webtest.type("xpath=//*[@id=\"confirm_input\"]", "123");
		webtest.click("xpath=//*[@id=\"confirm_btn1\"]");
	}
	
	@Test
//	新增人事调动
	public void test4() {
		webtest.click("xpath=//*[@id=\"menu_list_num128\"]");
		webtest.click("xpath=//tbody[starts-with(@id,'tbody')]/tr[1]/td[13]/a");
		webtest.click("xpath=//div[starts-with(@id,'rockmenuli')]/ul/li[9]");
		webtest.click("xpath=//*[@id=\"confirm_btn1\"]");
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

	}
	
	
	@Test()
//	新增员工鼓励
	public void test5() {
		webtest.leaveFrame();
		webtest.click("xpath=//*[@id=\"menu_list_num130\"]");
		webtest.click("xpath=//*[@id=\"content_num130\"]/div[1]/table/tbody/tr/td[1]/button");
		webtest.enterFrame("openinputiframe");
		webtest.click("xpath=//*[@id=\"btnchange_object\"]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/div[1]/table/tbody/tr/td[2]");
		webtest.click("xpath=//input[starts-with(@name,'changeuserinput_')]");
		webtest.click("xpath=//input[starts-with(@id,'changeok_')]");
		webtest.selectByValue("xpath=//*[@id=\"div_result\"]/select", "奖励");
		webtest.runJs("arguments[0].removeAttribute('readonly')", "xpath=//*[@id=\"div_happendt\"]/input");
		webtest.type("xpath=//*[@id=\"div_happendt\"]/input", "2019-12-25 16:43:38");
		webtest.type("xpath=//*[@id=\"div_hapaddress\"]/input", "1");
		webtest.typeAndClear("xpath=//*[@id=\"div_money\"]/input", "2");
		webtest.type("xpath=//*[@id=\"div_explain\"]/textarea", "3");
		webtest.click("xpath=//*[@id=\"AltS\"]");
		webtest.click("xpath=//*[@id=\"menu_list_num127\"]");
	}
	

}
