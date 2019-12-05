package com.edu.yanjie.system.basicmangement.userMangement;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.edu.yanjie.core.BaseTest;

import dataprovider.NSDataProvider;

public class AddUser extends BaseTest {
	public void InitDemo() {
		//进入系统模块
		webtest.click("xpath=//span[@pmenuid='1']");
		//点击基础管理
		webtest.click("id=menu_down_isons_num220");
		//点击用户管理
		webtest.click("id=menu_list_user");
	}
	@Test(dataProvider="excel",dataProviderClass=NSDataProvider.class,description="数据驱动添加新的用户")
	public void addUser1(String name,String user,String ranking,String mobile,String condition) {
		InitDemo();
		webtest.click("xpath=//button[@class='btn btn-primary']");
		webtest.enterFrame("openinputiframe");
		//输入姓名和用户名
		webtest.type("name=name", name);
		webtest.type("name=user", user);
		//选择部门
		webtest.click("id=btnchange_deptname");
		webtest.click("xpath=//input[@xname='管理层']");		
		//点击确定按钮
		webtest.click("xpath=//input[@value='确定']");
		//填写职位
		webtest.type("name=ranking", ranking);
		//选择所属单位
		webtest.click("xpath=//select[@name='companyid']");
		webtest.click("xpath=//option[@value='1']");
		//输入手机号
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.type("name=mobile", mobile);
		webtest.click("id=AltS");
		//离开iframe页面
		webtest.leaveFrame();
		//检验是否添加成功
		assertTrue(webtest.isTextPresent(condition));
	}
		
		@Test(description="添加用户名为中文的用户")
		public void addUser2() throws InterruptedException {
			refreshPage();
			InitDemo();
			webtest.click("xpath=//button[@class='btn btn-primary']");
			webtest.enterFrame("openinputiframe");
			//输入姓名和用户名
			webtest.type("name=name", "tom3");
			webtest.type("name=user", "汤姆3");
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
			webtest.type("name=mobile", "12345678904");
			webtest.click("id=AltS");
			//离开iframe页面
//			webtest.leaveFrame();
			//验证是否提示不能有中文
			assertTrue(webtest.isTextPresent("用户名不能有中文"));				
			
	}

}
