package com.webtest.freemarker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

public class FreeMarker_Demo {

	public String getEmailHtml(Map map,String templateName) throws IOException, MalformedTemplateNameException, ParseException, IOException {
		String htmlText="";
		Configuration configuration =new Configuration(Configuration.VERSION_2_3_29);
		
		configuration.setClassLoaderForTemplateLoading(ClassLoader.getSystemClassLoader(), "ftl");
		Template template = configuration.getTemplate(templateName);

//		htmlText=FreeMarker_Demo.processTemplateIntoString(template,map);
//		
		return htmlText;
	}
	
	public void print(String name,Map<String,Object> root) throws TemplateException, IOException {
		Template template = this.getTemplate(name);
		template.process(root, new PrintWriter(System.out));;
	}
	
	private Template getTemplate(String name) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException {
		Configuration cfg = new Configuration(Configuration.VERSION_2_3_29);
		cfg.setClassLoaderForTemplateLoading(ClassLoader.getSystemClassLoader(), "ftl");
		
		Template template=cfg.getTemplate(name);
		
		return template;
	}
	

	public void fprint(String name,Map<String,Object> root,String outfile) throws IOException, TemplateException {
		FileWriter out=null;
		out=new FileWriter(new File(" F:\\\\Demo\\\\auto2019\\\\auto2019\\\\test-output\\\\emailable-report.html"+outfile));
		Template template=this.getTemplate(name);
		template.setEncoding("utf-8");
		template.process(root, out);
		
		if(out!=null) {
			out.close();
		}
	}

}
