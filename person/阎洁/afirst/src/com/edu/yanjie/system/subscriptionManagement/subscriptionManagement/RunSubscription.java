package com.edu.yanjie.system.subscriptionManagement.subscriptionManagement;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.edu.yanjie.core.BaseTest;

public class RunSubscription extends BaseTest{
	public void initDemo() {
//		进入系统模块
		webtest.click("xpath=//span[@pmenuid='1']");
//		点击订阅管理
		webtest.click("id=menu_list_num237");				
//		点击订阅管理
		webtest.click("id=menu_list_rssglall");
	}
	@Test(description="没有选中订阅时判断运行按钮是否为置灰状态")
	public void subscripitonOperate1() throws InterruptedException{
		initDemo();
		//将系统提醒叉掉
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		//判断保存按钮是否为置灰状态
		assertFalse(webtest.isEnabled("xpath=//button[@click='dinghue']"));			
	}
	@Test(description="选中订阅后运行")
	public void subscripitonOperate2() throws InterruptedException{
		initDemo();
		webtest.doubleClick("xpath=//td[@fields='cont']");
		//将系统提醒叉掉
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		//点击保存按钮
		webtest.click("xpath=//button[@click='dinghue']");
		assertTrue(webtest.isTextPresent("运行中"));	
	}

}
