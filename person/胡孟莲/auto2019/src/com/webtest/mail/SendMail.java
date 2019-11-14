package com.webtest.core;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.testng.annotations.Test;

public class SendMail{
	
	String from="3052221098@qq.com";
	String auth_code="123456abcd";//授权码，不是密码
	String to="2724702423@qq.com";
	@Test
	public void sendMail() {
//		1、创建Properties对象
		Properties prop=new Properties();
		prop.put("mail.transport.protocol", "smtp");
		prop.put("mail.smtp.host", "smtp.@qq.com");
		prop.put("mail.smtp.auth", true);
//		2、Session对象，设置发件箱、授权码
		Session session=Session.getInstance(prop, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from,auth_code );
			}
			
		});
//		3、Message对象设置，发件人，收件人，主题，正文
		
		Message message=new MimeMessage(session);
		//或者子类的引用指向子类的对象
//		MimeMessage message=new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(from));
//			提示：可以把收件人地址配置在properties文件中
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("Hello,测试");
			message.setText("测试邮件");
//			4、使用Transport发送
			Transport.send(message);
		
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	
	}

}
