package com.edu.yanjie.system.basicmangement.company;

import static org.testng.Assert.assertTrue;

import javax.naming.directory.InitialDirContext;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.edu.yanjie.core.BaseTest;

public class SearchCompany extends BaseTest {
	
	public void initDemo() {
		//进入系统模块
		webtest.click("xpath=//span[@pmenuid='1']");
		//点击基础管理
		webtest.click("id=menu_down_isons_num220");
		//点击公司单位
		webtest.click("id=menu_list_company");
	}
	
	@Test(description="搜索已有的关键字")
	public void SearchCompany1() {
		initDemo();
		webtest.type("xpath=//input[@class='form-control']","信呼开发团队");
		webtest.click("xpath=//button[@click='searchbtn']");
		//判断是否有结果		
		assertTrue(webtest.isDisplayed("xpath=//tr[@oi='0']"));	
	}
	@Test(description="搜索不存在的关键字阎")
	public void SearchCompany2() throws InterruptedException {
		refreshPage();
		initDemo();
		webtest.type("xpath=//input[@class='form-control']","阎");
		webtest.click("xpath=//button[@click='searchbtn']");
		//判断是否有结果		
		assertTrue(webtest.isDisplayed("xpath=//tr[@oi='0']"));	
	}

}
