package com.edu.yanjie.system.basicmangement.userMangement;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class ChangePhoto extends BaseTest {
	public void initDemo() {
		//进入系统模块
		webtest.click("xpath=//span[@pmenuid='1']");
		//点击基础管理
		webtest.click("id=menu_down_isons_num220");				
		//点击用户管理
		webtest.click("id=menu_list_user");
	}
	@Test(description="判断没有选中用户时，修改头像按钮是否灰化")
	public void changePhoto1() throws InterruptedException {
		initDemo();
		//将系统提醒叉掉
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		assertFalse(webtest.isEnabled("xpath=//button[@class='btn btn-default']"));
	}
	@Test(description="选中用户修改头像上传图片文件")
		public void changePhoto2() throws InterruptedException {
		refreshPage();
		initDemo();
       //选中一个用户
		webtest.click("id=faceviewabc_21");
		//将系统提醒叉掉
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		//点击修改头像
		webtest.click("xpath=//button[@click='editface']");
		//进入iframe
		webtest.enterFrame("winiframe");
		//点添加文件
		webtest.click("id=addbtn");
		//将input框设为可见
		WebElement element=webtest.FindElement("name=myform");
		webtest.ElementDisplay(element);
		//选择一张图片
		webtest.type("id=inputfileid", "D:\\demo\\tree.jpg");
		//点击开始上传
		webtest.click("id=startbtn");
		//上传完毕后点击确定
		webtest.click("id=quebtn");
		webtest.leaveFrame();
		//判断是否存在新的图片
		assertTrue(webtest.isElementPresent("xpath=//img[@src='upload/face/10_8292.jpg']"));
		assertTrue(webtest.isTextPresent("修改成功,如没显示最新头像,请清除浏览器缓存"));
	}
	@Test(description="选中用户修改头像上传非图片文件")
	public void changePhoto3() throws InterruptedException {
		refreshPage();
		initDemo();
	    //选中一个用户
		webtest.click("id=faceviewabc_11");
		//将系统提醒叉掉
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		//点击修改头像
		webtest.click("xpath=//button[@click='editface']");
		//进入iframe
		webtest.enterFrame("winiframe");
		//点添加文件
		webtest.click("id=addbtn");
		//将input框设为可见
		WebElement element=webtest.FindElement("name=myform");
		webtest.ElementDisplay(element);
		//选择一个非图片文件
		webtest.type("id=inputfileid", "D:\\demo\\1.txt");
		//点击开始上传
		webtest.click("id=startbtn");
		//上传完毕后点击确定
		webtest.click("id=quebtn");
//		webtest.leaveFrame();
		assertTrue(webtest.isTextPresent("文件类型不符合，请选择类型为[jpg,png,gif,bmp,jpeg]的文件"));
	}
	@Test(description="选中用户修改头像上传2张图片")
	public void changePhoto4() throws InterruptedException {
		refreshPage();
		initDemo();
	   //选中一个用户
		webtest.click("id=faceviewabc_11");
		//将系统提醒叉掉
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		//点击修改头像
		webtest.click("xpath=//button[@click='editface']");
		//进入iframe
		webtest.enterFrame("winiframe");
		//点添加文件
		webtest.click("id=addbtn");
		//将input框设为可见
		WebElement element=webtest.FindElement("name=myform");
		webtest.ElementDisplay(element);
		//选择一张图片
		webtest.type("id=inputfileid", "D:\\demo\\头像.png");
		webtest.type("id=inputfileid", "D:\\demo\\tree.jpg");
		//点击开始上传
		webtest.click("id=startbtn");
		//上传完毕后点击确定
		webtest.click("id=quebtn");
//		webtest.leaveFrame();
		//判断是否存在新的图片
		assertTrue(webtest.isElementPresent("最多可添加1个文件"));
	}
	
	
}
