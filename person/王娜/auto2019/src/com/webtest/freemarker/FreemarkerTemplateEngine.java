package com.webtest.freemarker;

import java.io.File;
import java.io.FileWriter;
import java.io.StringWriter;
import java.util.Locale;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class FreemarkerTemplateEngine {

private static final String DEFAULT_TEMPLATE = "conf/reportTemplate.html";   
    

    public String getTemplatePath() {   
        return "";   
    }   
       
    public String run(Map context) throws Exception{   
    	return executeFreemarker(context); 
    }   
    
    private String executeFreemarker(Map context)throws Exception{   

        Configuration cfg = new Configuration();   
        cfg.setDirectoryForTemplateLoading(   
                new File(getTemplatePath()));   
        cfg.setEncoding(Locale.CHINA, "UTF-8");
//        cfg.setObjectWrapper(new DefaultObjectWrapper());              
//                  
        Template temp = cfg.getTemplate(getTemplate());    
        StringWriter out = new StringWriter();   
        temp.process(context, out);
        
        temp.process(context, new FileWriter
        		(new File("F:\\\\Demo\\\\auto2019\\\\auto2019\\\\test-output\\\\emailable-report.html"))); 
        //System.out.print(out.toString());
        return out.toString();
    }   

  
    public String getTemplate() {   
        // TODO Auto-generated method stub   
        return DEFAULT_TEMPLATE;   
    }     


  
}
