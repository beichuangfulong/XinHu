package com.edu.test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edu.core.ApiListener;
import com.edu.core.BaseTest;
import com.edu.dataprovider.NSDataProvider;
import com.webtest.dataprovider.ExcelDataProvider;
@Listeners(ApiListener.class)
public class Administration_1_2 extends BaseTest {
	
	public void InitDemo() {
		//进入行政模块
		webtest.click("xpath=//*[@id=\"topheaderid\"]/table/tbody/tr/td[2]/div/span[7]");
		//点击物品管理
		webtest.click("xpath=//*[@id=\"menu_list_num28\"]");
	}
	
	
	@DataProvider(name="wupin")
	public Object[][] getExcelDada() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("F:\\data\\time.xlsx","Sheet4");
	}
	
	@Test(description="根据不同的关键字查看物品出入库情况",dataProvider="wupin")
	public void test1(String thing) throws InterruptedException {	
		InitDemo();
		
		//点击操作
		webtest.click("xpath=//*[@id=\"menu_list_num31\"]");
		webtest.typeAndClear("xpath=//*[@id=\"content_num31\"]/table/tbody/tr/td[3]/div[1]/table/tbody/tr/td[3]/input", thing);
		webtest.click("xpath=//*[@id=\"content_num31\"]/table/tbody/tr/td[3]/div[1]/table/tbody/tr/td[4]/button");
	}
	
}
