package com.edu.yanjie.system.basicmangement.groupMangement;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.apache.xmlbeans.impl.xb.xsdschema.impl.PublicImpl;
import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class AddGroup extends BaseTest {
	public void InitDemo() {
		//进入系统模块
		webtest.click("xpath=//span[@pmenuid='1']");
		//点击基础管理
		webtest.click("id=menu_down_isons_num220");
		//点击组管理
		webtest.click("id=menu_list_group");
	}
	@Test(description="新增组")
	public void addGroup1() throws InterruptedException {
		InitDemo();
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//输入组名
		webtest.type("class=form-control","yan");
		//双击确定按钮
		webtest.doubleClick("xpath=//button[@class='btn btn-primary']");
		assertTrue(webtest.isTextPresent("yan"));
	}
	@Test(description="新增组名为空的组")
	public void addGroup2() throws InterruptedException {
		InitDemo();
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//判断确定按钮是否为灰化状态
		assertFalse(webtest.isEnabled("class=btn btn-primary"));
	}

}
