package com.edu.test;

import org.testng.annotations.Test;

import com.edu.core.HttpDriver;
import com.edu.utils.Checker;

import net.sf.json.JSONObject;

public class LoginTest {

	String login_url="/common/fgadmin/login";
	Checker check = null;
	@Test
	public void login(Object phoneArea,Object phoneNumber,Object password) {
		JSONObject user=new JSONObject();
		user.element("phoneArea", phoneArea);
		user.element("phoneNumber",phoneNumber);
		user.element("password", password);
		String result=HttpDriver.doPost(login_url, user);
		System.out.println(result);
		check = new Checker(result);
//		try {
//			check.verifyTextPresent("massage");
//			check.verify(result, "success");
//			check.verifyXpath("massage", "success");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}	
		@Test
		public void testLoginSuccess() throws Exception {
			login("86", "20000000000", "netease123");
			check.verifyTextPresent("massage");
			check.verifyXpath("code", "200");
		}
		
		@Test
		public void testLoginForWrongPhone() throws Exception {
			login(82, "20000000000", "netease123");
			check.verifyXpath("code", "400");
		}
		
		@Test
		public void testLoginForWrongNumber() throws Exception {
			login("86", "200000000000", "netease12113");
			check.verifyXpath("code", "400");
			check.verifyXpath("massage", "用户名或者密码错误");
		}
}
