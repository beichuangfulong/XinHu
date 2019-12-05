package com.edu.yanjie.system.basicmangement.userMangement;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.edu.yanjie.core.BaseTest;

public class ImportUser extends BaseTest  {
	
	public void initDemo() {
		//进入系统模块
		webtest.click("xpath=//span[@pmenuid='1']");
		//点击基础管理
		webtest.click("id=menu_down_isons_num220");				
		//点击用户管理
		webtest.click("id=menu_list_user");
	}
	@Test(description="成功导入用户")
	public void importUser1() throws InterruptedException {
		initDemo();
		//将系统提醒叉掉
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		//点击导入按钮
		webtest.click("xpath=//button[@click='daoru,1']");
		//输入姓名
		webtest.type("xpath=//textarea[@class='form-control']", "zxp2");
		//插入间隔符
		webtest.click("xpath=//a[@click='insrtss']");
		//输入用户名
		webtest.type("xpath=//textarea[@class='form-control']", "zxp2");
		webtest.click("xpath=//a[@click='insrtss']");
		webtest.type("xpath=//textarea[@class='form-control']", "男");
		webtest.click("xpath=//a[@click='insrtss']");
		webtest.type("xpath=//textarea[@class='form-control']", "12345678906");
		webtest.click("xpath=//a[@click='insrtss']");
		webtest.type("xpath=//textarea[@class='form-control']", "信呼开发团队/开发部");
		webtest.click("xpath=//a[@click='insrtss']");
		webtest.type("xpath=//textarea[@class='form-control']", "cro");
		webtest.click("xpath=//button[@click='saveadd']");
		assertTrue(webtest.isTextPresent("成功导入1条数据"));

	}
	@Test(description="导入已存在的用户")
	public void importUser2() throws InterruptedException {
		initDemo();
		//将系统提醒叉掉
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		//点击导入按钮
		webtest.click("xpath=//button[@click='daoru,1']");
		//输入姓名
		webtest.type("xpath=//textarea[@class='form-control']", "zxp1");
		//插入间隔符
		webtest.click("xpath=//a[@click='insrtss']");
		//输入用户名
		webtest.type("xpath=//textarea[@class='form-control']", "zxp1");
		webtest.click("xpath=//a[@click='insrtss']");
		webtest.type("xpath=//textarea[@class='form-control']", "男");
		webtest.click("xpath=//a[@click='insrtss']");
		webtest.type("xpath=//textarea[@class='form-control']", "12345678905");
		webtest.click("xpath=//a[@click='insrtss']");
		webtest.type("xpath=//textarea[@class='form-control']", "信呼开发团队/开发部");
		webtest.click("xpath=//a[@click='insrtss']");
		webtest.type("xpath=//textarea[@class='form-control']", "cro");
		webtest.click("xpath=//button[@click='saveadd']");
		assertTrue(webtest.isTextPresent("没有可导入的数据,可能有存在重复数据"));

	}
	@Test(description="导入必填项为空的用户")
	public void importUser3() throws InterruptedException {
		initDemo();
		//将系统提醒叉掉
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		//点击导入按钮
		webtest.click("xpath=//button[@click='daoru,1']");
		//输入姓名
		webtest.type("xpath=//textarea[@class='form-control']", "");
		//插入间隔符
		webtest.click("xpath=//a[@click='insrtss']");
		//输入用户名
		webtest.type("xpath=//textarea[@class='form-control']", "");
		webtest.click("xpath=//a[@click='insrtss']");
		webtest.type("xpath=//textarea[@class='form-control']", "男");
		webtest.click("xpath=//a[@click='insrtss']");
		webtest.type("xpath=//textarea[@class='form-control']", "12345678905");
		webtest.click("xpath=//a[@click='insrtss']");
		webtest.type("xpath=//textarea[@class='form-control']", "信呼开发团队/开发部");
		webtest.click("xpath=//a[@click='insrtss']");
		webtest.type("xpath=//textarea[@class='form-control']", "cro");
//		Thread.sleep(3000);
		webtest.click("xpath=//button[@click='saveadd']");
		assertTrue(webtest.isTextPresent("没有可导入的数据,注意*是必填的哦"));
	}
	@Test(description="导入空的用户")
	public void importUser4() throws InterruptedException {
		initDemo();
		//将系统提醒叉掉
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		//点击导入按钮
		webtest.click("xpath=//button[@click='daoru,1']");
		webtest.click("xpath=//button[@click='saveadd']");
		assertTrue(webtest.isTextPresent("没有输入任何东西"));
	}
	
	

}
