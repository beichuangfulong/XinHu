package com.edu.system;

import org.testng.annotations.Test;

public class SearchApply10 extends LoginDemo{
//新增销售机会
	
	public void initDemo() {
		//进入流程模块
		webtest.click("xpath=//span[@pmenuid='40']");
		//点击流程申请
		webtest.click("id=menu_list_num42");		
	}
	
	@Test(description="新增销售机会的申请")
	public void AddApplyRepair1() throws InterruptedException{
		
		initDemo();
		//点击销售申请
		webtest.click("xpath=//a[@onclick=\"openinput('销售机会','custsale',0)\"]");
		//点击进入frame
		webtest.enterFrame("openinputiframe");
		//选择客户
		webtest.click("xpath=//a[@onclick=\"c.selectdata('selectcust,custid',false,'custname','客户',0)\"]");
		//搜索信呼
		webtest.type("xpath=//input[contains(@id,'changekey')]","信呼");
		//选择信呼
		webtest.click("xpath=//label[contains(@id,'selectlist')]/div[1]");
		//点击保存
		webtest.click("xpath=//input[contains(@id,'changeok')]");
		//选择来源
		webtest.click("name=laiyuan");
		//选择网上联系
		webtest.click("xpath=//*[@id=\"div_laiyuan\"]/select/option[3]");
		//选择状态
		webtest.click("name=state");
		//选择已成交
		webtest.click("value=0");
		//输入金额
		webtest.type("xpath=//*[@id=\"div_money\"]/input","416");
		//点击保存
		webtest.click("id=AltS");
		//离开frame页面
		webtest.leaveFrame();
		//检验是否添加成功
//		assertTrue(webtest.isTextPresent(""));				
	}
}
