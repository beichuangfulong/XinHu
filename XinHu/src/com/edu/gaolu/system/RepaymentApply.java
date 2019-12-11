package com.edu.system;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class RepaymentApply extends BaseTest {

//申请还款单
		public void InitDemo() {
			//进入流程模块
			webtest.click("xpath=//span[@pmenuid='40']");
			//点击流程申请
			webtest.click("id=menu_list_num42");		
		}
		
		@Test(description="新增还款单申请还款金额小于欠款金额500")
		public void AddApply1() {
			InitDemo();
			//点击还款单
			webtest.click("xpath=//a[@onclick=\"openinput('还款单','finhkd',0)\"]");
			//点击进入frame
			webtest.enterFrame("openinputiframe");
			//输入还款金额
			webtest.type("name=money","416");
			//点击保存
			webtest.click("id=AltS");
			//离开frame页面
			webtest.leaveFrame();
			//检验是否添加成功
//			assertTrue(webtest.isTextPresent("416"));				
		}
		
		@Test(description="不填写还款金额默认为0")
		public void AddApply2() {
			InitDemo();
			//点击考勤机设备
			webtest.click("xpath=//a[@onclick=\"openinput('还款单','finhkd',0)\"]");
			//点击进入frame
			webtest.enterFrame("openinputiframe");
			//点击保存
			webtest.click("id=AltS");
//			assertTrue(webtest.isTextPresent("还款金额不能小于0"));			
		}
		
		@Test(description="新增还款单申请还款金额大于欠款金额500")
		public void AddApply3() {
			InitDemo();
			//点击还款单
			webtest.click("xpath=//a[@onclick=\"openinput('还款单','finhkd',0)\"]");
			//点击进入frame
			webtest.enterFrame("openinputiframe");
			//输入还款金额
			webtest.type("name=money","501");
			//点击保存
			webtest.click("id=AltS");
			//离开frame页面
			webtest.leaveFrame();
			//检验是否添加成功
//			assertTrue(webtest.isTextPresent("还款金额超过需还金额"));				
		}
}
