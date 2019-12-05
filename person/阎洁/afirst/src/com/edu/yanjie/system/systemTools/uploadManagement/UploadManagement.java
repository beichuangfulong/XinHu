package com.edu.yanjie.system.systemTools.uploadManagement;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.edu.yanjie.core.BaseTest;

public class UploadManagement extends BaseTest {
	public void initDemo() {
//		进入系统模块
		webtest.click("xpath=//span[@pmenuid='1']");
//		点击系统工具
		webtest.click("id=menu_list_num46");				
//		点击上传文件管理
		webtest.click("id=menu_list_num161");
	}
	@Test(description="查看图片")
	public void viewPhoto() {
		initDemo();
		webtest.click("link=查看");		
		assertTrue(webtest.isTextPresent("保存文件"));
		
	}

}
