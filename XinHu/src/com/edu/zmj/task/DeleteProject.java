package com.edu.zmj.task;
import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;
public class DeleteProject extends BaseTest{
	public void InitDemo() {
		//进入任务模块
		webtest.click("xpath=//span[@pmenuid='66']");
		//点击项目管理
		webtest.click("id=menu_down_isons_num79");
		//点击我执行的项目
		webtest.click("id=menu_list_num69");
	}
	@Test(description="删除名称111的项目")
	public void DeleteProject1(){		
		InitDemo();		
		//点击操作
		webtest.click("xpath=/html/body/table/tbody/tr/td[3]/div/div[4]/div/div[2]/div[3]/div[1]/table/tbody/tr[1]/td[12]/a");
	    //点击删除
		webtest.click("xpath=/html/body/div[1]/div/ul/li[10]");
		webtest.click("id=confirm_btn1");
		assertFalse(webtest.isTextPresent("111"));	
	}
}
