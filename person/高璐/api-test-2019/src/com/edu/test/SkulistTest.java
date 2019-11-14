package com.edu.test;

import com.edu.core.HttpDriver;
import com.edu.utils.Checker;

public class SkulistTest {

	static String skulist_url ="/common/skuList";
	Checker check = null;
	
	public void Skulist() throws Exception {
		
		String result = HttpDriver.doGet(skulist_url);
		check = new Checker(result);
	}
	
//	public void get
	
}
