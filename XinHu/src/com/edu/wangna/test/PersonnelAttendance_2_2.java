package com.edu.wangna.test;

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
public class PersonnelAttendance_2_2 extends BaseTest {
	
	public void InitDemo() {
		//进入人事考勤模块
		webtest.click("xpath=//*[@id=\"topheaderid\"]/table/tbody/tr/td[2]/div/span[6]");
		//点击人事管理
		webtest.click("xpath=//*[@id=\"menu_list_num127\"]");
	}
	
	@DataProvider(name="lizhi")
	public Object[][] getExcelDada() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("D:\\git\\XinHu\\XinHu\\data\\user.xlsx","Sheet3");
	}
	
	@Test(description="不同类型的原因催办离职申请",dataProvider="lizhi")
	public void test1(String lizhi) throws InterruptedException {	
		InitDemo();
		//点击离职申请
		webtest.click("xpath=//*[@id=\"menu_list_num97\"]");
		//点击操作
		webtest.click("xpath=//tbody[starts-with(@id,'tbody')]/tr/td[12]/a");
		webtest.click("xpath=//div[starts-with(@id,'rockmenuli')]/ul/li[5]");
		webtest.type("xpath=//*[@id=\"confirm_input\"]", lizhi);
		webtest.click("xpath=//*[@id=\"confirm_btn1\"]");
		Thread.sleep(3000);
		assertFalse(webtest.isTextPresent("处理成功"));
	}
}