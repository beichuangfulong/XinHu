package com.edu.yanjie.system.basicmangement.groupMangement;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.edu.yanjie.core.BaseTest;

public class AddGroupUser extends BaseTest {
	public void InitDemo() {
		//进入系统模块
		webtest.click("xpath=//span[@pmenuid='1']");
		//点击基础管理
		webtest.click("id=menu_down_isons_num220");
		//点击组管理
		webtest.click("id=menu_list_group");
	}
	@Test(description="添加组下成员")
	public void addGroupUser1() throws InterruptedException {
		InitDemo();
		webtest.doubleClick("xpath=//td[@cell='2']");
		//将系统提醒叉掉
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		//点击添加组下成员
		webtest.click("xpath=//button[@click='addguser,0']");
		//选择管理层
		webtest.click("xpath=//td[@deptxu='1_1']");
		//选择tom1
		webtest.click("xpath=//input[@xname='tom1']");
		//点击确定
		webtest.click("xpath=//input[@value='确定']");
		//再次选择该组，查看组内成员
		webtest.doubleClick("xpath=//td[@cell='2']");
		assertTrue(webtest.isTextPresent("tom1"));
		
	}
	@Test(description="不选择组直接点击添加组下成员")
	public void addGroupUser2() throws InterruptedException {
		InitDemo();
		//将系统提醒叉掉
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		//直接点击确定，判断添加组下成员按钮是否置灰状态
		assertFalse(webtest.isEnabled("xpath=//button[@click='addguser,0']"));
	}
	@Test(description="不选择成员后直接点击确定")
	public void addGroupUser3() throws InterruptedException {
		InitDemo();
		webtest.doubleClick("xpath=//td[@cell='2']");		
		//将系统提醒叉掉
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		//点击添加组下成员
		webtest.click("xpath=//button[@click='addguser,0']");
		//直接点击确定，判断确定按钮是否置灰状态
		assertFalse(webtest.isEnabled("xpath=//input[@value='确定']"));
	}


}
