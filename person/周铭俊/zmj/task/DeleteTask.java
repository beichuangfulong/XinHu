package com.edu.zmj.task;
import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;
public class DeleteTask extends BaseTest{
	public void InitDemo() {
		//进入任务模块
		webtest.click("xpath=//span[@pmenuid='66']");
		//点击我创建任务
		webtest.click("id=menu_list_num68");
	}
	@Test(description="删除名称1111的任务")
	public void DeleteTask1(){		
		InitDemo();		
		//点击操作
		webtest.click("xpath=/html/body/table/tbody/tr/td[3]/div/div[4]/div/div[2]/div[3]/div[1]/table/tbody/tr[1]/td[13]/a");
	    //点击删除
		webtest.click("xpath=/html/body/div[1]/div/ul/li[9]");
		webtest.click("id=confirm_btn1");
		assertFalse(webtest.isTextPresent("1111"));	
	}
}