package com.edu.yanjie.system.IM.conversationRecord;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

import com.edu.yanjie.core.BaseTest;

public class DeleteConversation extends BaseTest {
	public void initDemo() {
//		进入系统模块
		webtest.click("xpath=//span[@pmenuid='1']");
//		点击即时通信管理
		webtest.click("id=menu_list_num14");				
//		点击会话记录
		webtest.click("id=menu_list_num228");
	}
	@Test(description="未选中会话记录时，判断删除按钮是否为置灰状态")
	public void deleteConversation1() {
		initDemo();
		//将系统提醒叉掉
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		assertFalse(webtest.isEnabled("xpath=//button[@click='del']"));
	}

}
