package com.edu.yanjie.system.subscriptionManagement.subscriptionTable;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class OperateSubscriptionTable extends BaseTest {

		public void initDemo() {
//			进入系统模块
			webtest.click("xpath=//span[@pmenuid='1']");
//			点击订阅管理
			webtest.click("id=menu_list_num237");				
//			点击订阅报表
			webtest.click("id=menu_list_rssinfoall");
		}
		@Test(description="点击打开")
		public void openSuscription() {
			initDemo();
			//点击打开
			webtest.click("xpath=//td[@cell=4]");		
			//判断是否是打开的那个页面
			webtest.switchWidow(1);
			assertEquals(webtest.getUrl(), "http://localhost:8888/xinhu_utf8_v1.5.9/upload/2019-12/%E8%AE%A2%E9%98%85%E7%AE%A1%E7%90%86(%E8%AE%A2%E9%98%85%E7%AE%A1%E7%90%86)_03_145533.html");		                        
		}
//		@Test(description="删除订阅报表")
//		public void delSuscription1() throws InterruptedException {			
//			refreshPage();
//			initDemo();
//			//点击打开
//			webtest.click("link=操作");
//			//点击删除
//			webtest.click("xpath=//li[@temp=4]");
//			//点击确定
//			webtest.click("id=confirm_btn1");
//				                        
//		}
		@Test(description="搜索订阅报表")
		public void SearchSuscription() {
			webtest.switchWidow(0);
			initDemo();
			//输入关键字
			webtest.type("xpath=//input[@placeholder='关键字']","考勤统计简表");
			//点击搜索
			webtest.click("xpath=//button[@click='searchbtn']");
			//判断是否有结果出现
			assertTrue(webtest.isDisplayed("xpath=//tr[@oi='0']"));				                        
		}

}
