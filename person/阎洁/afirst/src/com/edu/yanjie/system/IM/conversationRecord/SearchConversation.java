package com.edu.yanjie.system.IM.conversationRecord;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.edu.yanjie.core.BaseTest;

public class SearchConversation extends BaseTest {
	public void initDemo() {
//		进入系统模块
		webtest.click("xpath=//span[@pmenuid='1']");
//		点击即时通信管理
		webtest.click("id=menu_list_num14");				
//		点击会话记录
		webtest.click("id=menu_list_num228");
	}
	@Test(description="输入消息内容进行搜索")
	public void searchConversation1() {
		initDemo();
		webtest.type("xpath=//input[@placeholder='消息内容']", "[微笑]");
		webtest.click("xpath=//button[@click='search']");
		//判断是否有结果
		assertTrue(webtest.isDisplayed("xpath=//tr[@oi='0']"));
	}
	@Test(description="输入不存在的消息内容进行搜索")
	public void searchConversation2() {
		initDemo();
		webtest.type("xpath=//input[@placeholder='消息内容']", "阎");
		webtest.click("xpath=//button[@click='search']");
		//判断是否没有结果
		assertFalse(webtest.isDisplayed("xpath=//tr[@oi='0']"));
	}
	@Test(description="输入消息发送人进行搜索")
	public void searchConversation3() {
		initDemo();
		//点击搜索后面的放大镜
		webtest.click("xpath=//button[@click='getdists,1']");
		//选择管理层的tom
		webtest.click("xpath=//td[@deptxu='1_1']");
		webtest.click("xpath=//input[@xname='tom']");
		webtest.click("xpath=//input[@value='确定']");
		//点击搜索按钮
		webtest.click("xpath=//button[@click='search']");
		//判断是否有结果
		assertFalse(webtest.isDisplayed("xpath=//tr[@oi='0']"));
	}
	

}
