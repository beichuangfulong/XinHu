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
public class Administration_2_2 extends BaseTest {
	
	public void InitDemo() {
		//进入行政模块
		webtest.click("xpath=//*[@id=\"topheaderid\"]/table/tbody/tr/td[2]/div/span[7]");
		//点击固定资产
		webtest.click("xpath=//*[@id=\"menu_list_num137\"]");
	}
	@DataProvider(name="zichan")
	public Object[][] getExcelDada() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("F:\\data\\time.xlsx","Sheet5");
	}
	
	@Test(description="新增固定资产",dataProvider="zichan")
	public void test1(String zichan) throws InterruptedException {	
		InitDemo();
		
		//点击操作
		webtest.typeAndClear("xpath=//*[@id=\"content_num137\"]/table/tbody/tr/td[3]/div[1]/table/tbody/tr/td[2]/input", zichan);
		webtest.click("xpath=//*[@id=\"content_num137\"]/table/tbody/tr/td[3]/div[1]/table/tbody/tr/td[3]/button");

	}
	
}
