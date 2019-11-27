package com.edu.yanjie.system.basicmangement.userMangement;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.edu.yanjie.core.BaseTest;

public class AddUser extends BaseTest {
	public void InitDemo() {
		//点击基础管理
		webtest.click("id=menu_down_isons_num220");
		//点击用户管理
		webtest.click("id=menu_list_user");
	}
	@Test(description="添加用户名为tom1的用户")
	public void addUser1() {
		InitDemo();
		webtest.click("xpath=//button[@class='btn btn-primary']");
		webtest.enterFrame("openinputiframe");
		//输入姓名和用户名
		webtest.type("name=name", "tom1");
		webtest.type("name=user", "tom1");
		//选择部门
		webtest.click("id=btnchange_deptname");
		webtest.click("xpath=//input[@xname='管理层']");		
		//点击确定按钮
		webtest.click("xpath=//input[@value='确定']");
		//填写职位
		webtest.type("name=ranking", "cmo");
		//选择所属单位
		webtest.click("xpath=//select[@name='companyid']");
		webtest.click("xpath=//option[@value='1']");
		//输入手机号
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.type("name=mobile", "12345678903");
		webtest.click("id=AltS");
		//离开iframe页面
		webtest.leaveFrame();
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("tom1"));				
		
	}

}
