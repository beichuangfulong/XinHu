package com.edu.yanjie.system.basicmangement.organization;


import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.edu.yanjie.core.BaseTest;


public class AddJunior extends BaseTest {
	
	public void initDemo() {
		//点击基础管理
		webtest.click("id=menu_down_isons_num220");
		//点击组织结构
		webtest.click("id=menu_list_num6");		
	}
	@Test(description="直接点击新增下级")
	public void addJunior1() {
		initDemo();
		//判断新增下级按钮是否灰化
		assertFalse(webtest.isEnabled("xpath=//button[@class='btn btn-success']"));		
	}
	@Test(description="选中一个组织后新增下级")
	public void addJunior2() {
		initDemo();
		webtest.click("xpath=//td[@row='4']");
		//点击新增下级
		webtest.click("xpath=//button[@class='btn btn-success']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//输入名称为呵呵哒
	    webtest.type("name=name","呵呵哒");
		//点击保存
		webtest.click("class=btn btn-primary");
		//离开iframe页面
		webtest.leaveFrame();
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("呵呵哒"));	
	
	}



}
