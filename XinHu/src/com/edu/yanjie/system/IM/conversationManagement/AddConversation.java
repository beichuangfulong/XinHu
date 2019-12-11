package com.edu.yanjie.system.IM.conversationManagement;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class AddConversation extends BaseTest {
	public void initDemo() {
		//进入系统模块
		webtest.click("xpath=//span[@pmenuid='1']");
		//点击即时通信管理
		webtest.click("id=menu_list_num14");				
		//点击会话管理
		webtest.click("id=menu_list_num16");
	}
	@Test(description="添加一个会话名为1的会话")
	public void addConversation1() throws InterruptedException {
		initDemo();
		//点击新增按钮
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//输入名称
		webtest.type("name=name", "1");
		//双击确定按钮
		webtest.doubleClick("xpath=//button[@class='btn btn-primary']");
		assertTrue(webtest.isTextPresent("1"));
	}
	@Test(description="添加一个会话名为空的会话")
	public void addConversation2() throws InterruptedException {
		refreshPage();
		initDemo();
		//点击新增按钮
		webtest.click("xpath=//button[@class='btn btn-primary']");		
		//判断确定按钮是否为置灰状态
		assertFalse(webtest.isEnabled("xpath=//button[@class='btn btn-primary']"));
	}
	@Test(description="添加一个部门的会话")
	public void addConversation3() throws InterruptedException {
		refreshPage();
		initDemo();
		//点击新增按钮
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//选择一个部门
		webtest.click("xpath=//button[@changeuser='name']");
		webtest.click("xpath=//input[@xname='管理层']");
		webtest.click("xpath=//input[@value='确定']");
		//双击确定按钮
		webtest.doubleClick("xpath=//button[@class='btn btn-primary']");
		assertTrue(webtest.isTextPresent("管理层"));
	}

}
