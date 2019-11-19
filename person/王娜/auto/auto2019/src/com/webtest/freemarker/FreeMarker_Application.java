package com.webtest.freemarker;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FreeMarker_Application {

	public void contextLoads() {
	}

	//填充模板文件中的参数值
	Map<String, Object> root = null;
	FreeMarker_Demo freeMarkerTemplateUtil = null;

	@BeforeClass
	public void setUp(){
		freeMarkerTemplateUtil = new FreeMarker_Demo();
		root = new HashMap<String, Object>();
	}

	@Test
	public void testCreateHtml() throws Exception{

		root.put("username", "admin");

		String emailHtml = freeMarkerTemplateUtil.getEmailHtml(root, "test.ftl");
//		System.out.println(">>>>" + emailHtml);

		root.put("username", "root");
		freeMarkerTemplateUtil.print("test.ftl", root);
	}
}
