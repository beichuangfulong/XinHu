package com.edu.zmj.task;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edu.core.ApiListener;
import com.edu.core.BaseTest;
@Listeners(ApiListener.class)
public class AddProject extends BaseTest{
	public void InitDemo() {
		//进入任务模块
		webtest.click("xpath=//span[@pmenuid='66']");
		//点击项目管理
		webtest.click("id=menu_down_isons_num79");
		//点击我执行的项目
		webtest.click("id=menu_list_num69");
	}
	@Test(description="添加名称111的项目")
	public void AddProject1() throws InterruptedException {		
		InitDemo();		
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//选择项目类型
		webtest.click("xpath=//select[@name='type']");
		webtest.click("xpath=//option[@value='一般项目']");
		//输入编号为111
		webtest.type("name=num","111");
		//输入名称为111
		webtest.type("name=title","111");
		//选择负责人
		webtest.click("id=btnchange_fuze");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/div[1]/table/tbody/tr/td[2]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/span[1]/div/table/tbody/tr/td[3]/input");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
		//选择执行人
		webtest.click("id=btnchange_runuser");
	
		webtest.click("xpath=//input[@xname='开发部']");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
		//点击保存
		webtest.click("id=AltS");
		//离开iframe页面
		webtest.leaveFrame();
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("111"));	
	}
	@Test(description="不添加名称")
	public void AddProject2() throws InterruptedException {	
		refreshPage();
		InitDemo();		
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//点击保存
		webtest.click("id=AltS");
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("名称不能为空"));	
	}
	@Test(description="不选择项目类型")
	public void AddProject3() throws InterruptedException {
		refreshPage();
		InitDemo();		
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//输入名称为111
		webtest.type("name=title","111");
		//点击保存
		webtest.click("id=AltS");
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("项目类型不能为空"));	
	}
	@Test(description="不选择负责人")
	public void AddProject4() throws InterruptedException {
		refreshPage();
		InitDemo();		
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//选择项目类型
		webtest.click("xpath=//select[@name='type']");
		webtest.click("xpath=//option[@value='一般项目']");
		//输入编号为111
		webtest.type("name=num","111");
		//输入名称为111
		webtest.type("name=title","111");
		//点击保存
		webtest.click("id=AltS");
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("负责人不能为空"));	
	}
	@Test(description="不选择执行人")
	public void AddProject5() throws InterruptedException {
		refreshPage();
		InitDemo();		
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//选择项目类型
		webtest.click("xpath=//select[@name='type']");
		webtest.click("xpath=//option[@value='一般项目']");
		//输入编号为111
		webtest.type("name=num","111");
		//输入名称为111
		webtest.type("name=title","111");
		//选择负责人
		webtest.click("id=btnchange_fuze");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/div[1]/table/tbody/tr/td[2]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/span[1]/div/table/tbody/tr/td[3]/input");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
		//点击保存
		webtest.click("id=AltS");
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("执行人不能为空"));	
	}
}
