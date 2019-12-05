package com.edu.yanjie.system.subscriptionManagement.subscriptionManagement;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.edu.yanjie.core.BaseTest;

public class SubscriptionOperate extends BaseTest {
	public void initDemo() {
//		进入系统模块
		webtest.click("xpath=//span[@pmenuid='1']");
//		点击订阅管理
		webtest.click("id=menu_list_num237");				
//		点击订阅管理
		webtest.click("id=menu_list_rssglall");
	}
	@Test(description="设置提醒设置为空时保存")
	public void subscripitonOperate1() throws InterruptedException{
		initDemo();
		//点击操作
		webtest.click("link=操作");
		//选择添加提醒设置
		webtest.click("xpath=//li[@temp='3']");
		//判断保存按钮是否为置灰状态
		assertFalse(webtest.isEnabled("xpath=//input[@value='保存(S)']"));	
		
	}
	@Test(description="设置提醒设置提醒频率为每月 02 02:05:00")
	public void subscripitonOperate2() throws InterruptedException{
		initDemo();
	    //点击操作
		webtest.click("link=操作");
		//选择添加提醒设置
		webtest.click("xpath=//li[@temp='3']");
		webtest.type("name=ratecont", "每月 02 02:05:00");
		//点击保存按钮
		webtest.click("xpath=//input[@value='保存(S)']");
	}

}
