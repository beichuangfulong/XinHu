package com.edu.yanjie.system.IM.conversationRecord;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class ExportConversation extends BaseTest {
	public void initDemo() {
//		进入系统模块
		webtest.click("xpath=//span[@pmenuid='1']");
//		点击即时通信管理
		webtest.click("id=menu_list_num14");				
//		点击会话记录
		webtest.click("id=menu_list_num228");
	}
	@Test(description="导出会话记录")
	public void ExportConversation1() {
		initDemo();
		//将系统提醒叉掉
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		webtest.click("xpath=//button[@click='daochu,1']");
		assertTrue(webtest.isTextPresent("处理成功"));
	}
}
