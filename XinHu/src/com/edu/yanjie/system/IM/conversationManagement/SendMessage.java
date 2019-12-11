package com.edu.yanjie.system.IM.conversationManagement;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class SendMessage extends BaseTest {
	public void initDemo() {
		//进入系统模块
//		webtest.click("xpath=//span[@pmenuid='1']");
		//点击即时通信管理
//		webtest.click("id=menu_list_num14");				
		//点击会话管理
//		webtest.click("id=menu_list_num16");
	}
	@Test(description="发送文字消息")
	public void sendMessage1() {
		//打开会话界面
		webtest.open("http://localhost:8888/xinhu_utf8_v1.5.9/?d=reim&m=chat&uid=2&type=group&winobj=group_2");
		webtest.type("class=content","你们好呀");
		webtest.click("xpath=//a[@tools='send']");
		assertTrue(webtest.isTextPresent("你们好呀"));
	}
	@Test(description="发送表情消息")
	public void sendMessage2() {
		//打开会话界面
		webtest.open("http://localhost:8888/xinhu_utf8_v1.5.9/?d=reim&m=chat&uid=2&type=group&winobj=group_2");		
		webtest.type("class=content","[撇嘴]");
		webtest.click("xpath=//a[@tools='send']");
		assertTrue(webtest.isElementPresent("xpath=//img[@src='web/images/im/emots/qq/1.gif']"));	
	}
	@Test(description="发送图片文件")
	public void sendMessage3() {
		//打开会话界面
		webtest.open("http://localhost:8888/xinhu_utf8_v1.5.9/?d=reim&m=chat&uid=2&type=group&winobj=group_2");
		webtest.click("xpath=//a[@tools='file']");
//		webtest.runJs("arguments[0].setAttribute(arguments[1],"+"arguments[2])",webtest.FindElement("name=form_allfileinput"),display,block);
		WebElement element=webtest.FindElement("name=form_allfileinput");
		webtest.ElementDisplay(element);
		webtest.type("id=allfileinput", "D:\\demo\\tree.jpg");
		assertTrue(webtest.isDisplayed("xpath=//img[@fid='11']"));
	}
	@Test(description="发送非图片文件")
	public void sendMessage4() {
		//打开会话界面
		webtest.open("http://localhost:8888/xinhu_utf8_v1.5.9/?d=reim&m=chat&uid=2&type=group&winobj=group_2");
		webtest.click("xpath=//a[@tools='file']");
//		webtest.runJs("arguments[0].setAttribute(arguments[1],"+"arguments[2])",webtest.FindElement("name=form_allfileinput"),display,block);
		WebElement element=webtest.FindElement("name=form_allfileinput");
		webtest.ElementDisplay(element);
		webtest.type("id=allfileinput", "D:\\demo\\1.txt");
		assertTrue(webtest.isTextPresent("1.txt"));
	}
	
	

}
