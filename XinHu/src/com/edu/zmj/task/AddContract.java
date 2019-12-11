package com.edu.zmj.task;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edu.core.ApiListener;
import com.edu.core.BaseTest;
@Listeners(ApiListener.class)
public class AddContract extends BaseTest{
	public void InitDemo() {
		//进入客户模块
		webtest.click("xpath=//span[@pmenuid='63']");
		//点击合同
		webtest.click("id=menu_list_num104");
		//点击我的合同
		webtest.click("id=menu_list_num108");
	}
	@Test(description="添加合同")
	public void AddContract1() throws InterruptedException {		
		InitDemo();		
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//选择客户
		webtest.click("class=webbtn");
		webtest.click("xpath=//input[@xname='百度']");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
        //选择开始日期
		webtest.click("id=div_startdt");
		webtest.click("xpath=/html/body/div[1]/div[4]/a[2]");
		//选择截止日期
		webtest.click("id=div_enddt");
		webtest.click("xpath=/html/body/div[1]/div[2]/table/tbody/tr[4]/td[7]");
		webtest.click("xpath=/html/body/div[1]/div[4]/a[3]");
		//点击保存
		webtest.click("id=AltS");
		//离开iframe页面
		webtest.leaveFrame();
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("百度"));	
	}
	@Test(description="不添加名称")
	public void AddContract2() throws InterruptedException {	
		refreshPage();
		InitDemo();		
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//点击保存
		webtest.click("id=AltS");
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("客户名称不能为空"));	
	}
	@Test(description="不选择生效日期")
	public void AddContract3() throws InterruptedException {
		refreshPage();
		InitDemo();		
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//选择客户
		webtest.click("class=webbtn");
		webtest.click("xpath=//input[@xname='百度']");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
		       
		//点击保存
		webtest.click("id=AltS");
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("生效日期不能为空"));	
	}
	@Test(description="不选择截止日期")
	public void AddContract4() throws InterruptedException {
		refreshPage();
		InitDemo();		
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//选择客户
		webtest.click("class=webbtn");
		webtest.click("xpath=//input[@xname='百度']");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
		//选择开始日期
		webtest.click("id=div_startdt");
		webtest.click("xpath=/html/body/div[1]/div[4]/a[2]");
				
		//点击保存
		webtest.click("id=AltS");
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("截止日期不能为空"));	
	}
}