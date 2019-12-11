package com.edu.zmj.task;
import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;
public class DeletePayment extends BaseTest{
	public void InitDemo() {
		//进入客户模块
		webtest.click("xpath=//span[@pmenuid='63']");
		//点击付款单
		webtest.click("id=menu_list_num118");
		//点击我的付款单
		webtest.click("id=menu_list_num107");
	}
	@Test(description="删除收款单")
	public void DeletePayment1(){		
		InitDemo();		
		//点击操作
		webtest.click("xpath=/html/body/table/tbody/tr/td[3]/div/div[4]/div/div[2]/div[3]/div[1]/table/tbody/tr[1]/td[12]/a");
	    //点击删除
		webtest.click("xpath=/html/body/div[1]/div/ul/li[7]");
		webtest.click("id=confirm_btn1");
		assertFalse(webtest.isTextPresent("百度"));	
	}
}