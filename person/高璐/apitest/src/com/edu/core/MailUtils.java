package com.edu.core;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.testng.annotations.Test;

import com.webtest.utils.ReadProperties;

public class MailUtils {	

	public static  void sendMail1() throws IOException {
		  String from=ReadProperties.getPropertyValue("from");
		  String auth_code=ReadProperties.getPropertyValue("auth_code");
		  String to=ReadProperties.getPropertyValue("tomail");
		
		//1创建properties对象
		Properties prop=new Properties();
		prop.put("mail.transport.protocol","smtp");//协议
		prop.put("mail.smtp.host", "smtp.qq.com");
		prop.put("mail.smtp.auth",true);
		
		
		//2创建session对象
		Session session=Session.getInstance(prop,new Authenticator(){

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				
				// TODO Auto-generated method stub
				return new PasswordAuthentication(from,auth_code);
			}	
			
		});
		
		
		//3message对象设置，发送人，收件人，主题，正文
		Message message=new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
			message.setSubject("测试报告");
			String resultPath=ReadProperties.getPropertyValue("resultPath");
			String content=MailUtils.readFile(resultPath);
			MimeBodyPart attachPart = new MimeBodyPart();
			attachPart.setContent(content,"text/html;charset=gb2312");
			MimeMultipart mimeMultipart=new MimeMultipart();
			mimeMultipart.addBodyPart(attachPart);
			message.setContent(mimeMultipart);
			Transport.send(message);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//4使用transport发送
		
	}
	
	public static String readFile(String filePathAndName) {
        String fileContent = "";
        try {
            File f = new File(filePathAndName);
            if(f.isFile()&&f.exists()){
                InputStreamReader read = new InputStreamReader(new FileInputStream(f),"gb2312");
                BufferedReader reader=new BufferedReader(read);
                String line;
                while ((line = reader.readLine()) != null) {
           //将读取到的字符拼接  
                  fileContent += line;
                }
                read.close();
            }
        } catch (Exception e) {
            System.out.println("读取文件内容操作出错");
            e.printStackTrace();
        }
        return fileContent;
    }
	

}
