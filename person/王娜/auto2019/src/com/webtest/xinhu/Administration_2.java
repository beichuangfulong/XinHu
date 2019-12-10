package com.webtest.xinhu;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;

public class Administration_2 extends BaseTest {

	//行政模块
	
	@Test(dataProvider="excel",dataProviderClass=NSDataProvider.class)
	//登录，进入行政模块
	public void test1(String name,String pwd) {
		System.out.println(name+pwd);
		webtest.open("http://localhost:9999/?m=login");
		webtest.type("name=adminuser", name);
		webtest.type("xpath=//input[@type='password']", pwd);
		webtest.click("class=webbtn");
		webtest.click("xpath=//*[@id=\"topheaderid\"]/table/tbody/tr/td[2]/div/span[7]");
	}
	
	@Test
	//车辆管理-新增车辆
	public void test2() {
		webtest.click("xpath=//*[@id=\"menu_list_num138\"]");
		webtest.click("xpath=//*[@id=\"menu_list_num143\"]");
		webtest.click("xpath=//*[@id=\"content_num143\"]/div[1]/table/tbody/tr/td[1]/button");
		webtest.enterFrame("openinputiframe");
		webtest.type("xpath=//*[@id=\"div_carnum\"]/input", "1");
		webtest.selectByValue("xpath=//*[@id=\"div_cartype\"]/select", "轿车");
		webtest.selectByValue("xpath=//*[@id=\"div_carbrand\"]/select", "奔驰");
		webtest.type("xpath=//*[@id=\"div_carmode\"]/input", "1");
		webtest.runJs("arguments[0].removeAttribute('readonly')", "xpath=//*[@id=\"div_buydt\"]/input");
		webtest.type("xpath=//*[@id=\"div_buydt\"]/input", "2019-10-1");
		webtest.type("xpath=//*[@id=\"div_buyprice\"]/input", "1");
		webtest.selectByValue("xpath=//*[@id=\"div_state\"]/select", "1");
		webtest.click("xpath=//*[@id=\"AltS\"]");
	}
	
	@Test
	//预定车辆查询
	public void test3() {
		webtest.click("xpath=//*[@id=\"menu_list_num144\"]");
		webtest.typeAndClear("xpath=//*[@id=\"content_num144\"]/div[1]/table/tbody/tr/td[2]/input", "开发部");
		webtest.click("xpath=//*[@id=\"content_num144\"]/div[1]/table/tbody/tr/td[4]/div/button[1]");
	}
}
