package com.edu.system;

import org.testng.annotations.Test;

public class SearchApply4 extends LoginDemo {
	
//申请维修报修
		
		public void initDemo() {
			//进入流程模块
			webtest.click("xpath=//span[@pmenuid='40']");
			//点击流程申请
			webtest.click("id=menu_list_num42");		
		}
		
		@Test(description="新增维修报修的申请")
		public void AddApplyRepair1() throws InterruptedException{
			
			initDemo();
			//点击维修报修
			webtest.click("xpath=//a[@onclick=\"openinput('维修报修','repair',0)\"]");
			//点击进入frame
			webtest.enterFrame("openinputiframe");
			//输入报修资产
			webtest.type("name=assetm","显示器");
			//输入报修原因
			webtest.type("name=reason","已损坏无法使用");
			//点击保存
			webtest.click("id=AltS");
			//离开frame页面
			webtest.leaveFrame();
			//检验是否添加成功
//			assertTrue(webtest.isTextPresent("显示器"+"已损坏无法使用"));				
		}
		
		@Test(description="添加已存在的报修资产为显示器的报修申请")
		public void AddApplyRepair2() {
			//点击维修报修
			webtest.click("xpath=//a[@onclick=\"openinput('维修报修','repair',0)\"]");
			//点击进入frame
			webtest.enterFrame("openinputiframe");
			//输入报修资产
			webtest.type("name=assetm","显示器");
			//输入报修原因
			webtest.type("name=reason","已损坏无法使用");
			//点击保存
			webtest.click("id=AltS");
			//离开frame页面
			webtest.leaveFrame();
			//检验是否添加成功
		//	assertTrue(webtest.isTextPresent("新增成功"));				
		}
		
		@Test(description="不填写报修资产")
		public void AddApplyRepair3() {
			
			//点击维修报修
			webtest.click("xpath=//a[@onclick=\"openinput('维修报修','repair',0)\"]");
			//点击进入frame
			webtest.enterFrame("openinputiframe");
			//点击保存
			webtest.click("id=AltS");		
		}
}
