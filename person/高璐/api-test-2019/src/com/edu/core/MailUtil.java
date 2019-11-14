package com.edu.core;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class MailUtil {
	
	static int port = 25;
	static String socketFactoryport = "465";
    static String host = "smtp.qq.com";
    static String from = "高璐";
    static String user = "979986627@qq.com";
    static String password = "rrnffcewqyyebdba";//授权码

  public static void sendEmail(String email, String subject, String body) throws UnsupportedEncodingException, AddressException, MessagingException {

		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.socketFactory.port", socketFactoryport);
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", port);
		
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);
			}
		});
		
		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(user));
		message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("979986627@qq.com"));
		message.setSubject("发送邮件");
		BodyPart messageBodyPart1=new MimeBodyPart();
		messageBodyPart1.setText("正文部分");
		BodyPart messageBodyPart2=new MimeBodyPart();
		String filename="F:\\ceshi\\api-test-2019\\test-output\\reportTemplate.html";
		DataSource source = new FileDataSource(filename);
		
		messageBodyPart2.setDataHandler(new DataHandler(source));
		messageBodyPart2.setFileName(filename);
		Multipart multipart = new MimeMultipart();
		multipart.addBodyPart(messageBodyPart1);
		multipart.addBodyPart(messageBodyPart2);
		message.setContent(multipart);
		Transport.send(message);
		
	}
}
//package com.edu.core;

//import java.io.UnsupportedEncodingException;
//import java.util.Date;
//import java.util.Properties;
//
//import java.util.Properties;
//
//import javax.mail.Authenticator;
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.NoSuchProviderException;
//import javax.mail.PasswordAuthentication;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.AddressException;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
//
//
//public class MailUtil {
//	
//	static int port = 25;
//	static String socketFactoryport = "465";
//    static String server = "smtp.qq.com";
//    static String from = "高璐";
//    static String user = "979986627@qq.com";
//    static String password = "rrnffcewqyyebdba";//授权码
////	  static String socketFactoryclass = "javax.net.ssl.SSLSocketFactory";
//	  static String filename="F:\\ceshi\\api-test-2019\\test-output\\emailable-report.html";
//
//    public static void sendEmail(String email, String subject, String body, String filePath) throws UnsupportedEncodingException {
//        try {
//            Properties props = new Properties();
//			  props.put("mail.smtp.port", socketFactoryport);
//            props.put("mail.smtp.host", server);
//            props.put("mail.smtp.port", String.valueOf(port));
//            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
////            props.put("mail.smtp.class", socketFactoryclass);
//            props.put("mail.smtp.auth", "true");
//
//            Transport transport = null;
////            Session session = Session.getDefaultInstance(props,new javax.mail.Authenticator());
//            Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
//    			protected PasswordAuthentication getPasswordAuthentication() {
//    				return new PasswordAuthentication("979986627@qq.com", "rrnffcewqyyebdba");
//    			}
//    		});
//            transport = session.getTransport("smtp");
//            transport.connect(server, user, password);
//            MimeMessage msg = new MimeMessage(session);
//            msg.setSentDate(new Date());
//            
//            InternetAddress fromAddress = new InternetAddress(user,from,"UTF-8");
//            msg.setFrom(fromAddress);
//            String emailList[]=email.split(",");
//            InternetAddress[] toAddress = new InternetAddress[emailList.length];
//            
//            for(int i=0;i<emailList.length;i++)
//            {
//            	toAddress[i]=new InternetAddress(emailList[i]);
//            }
//          
//            msg.addRecipients(Message.RecipientType.TO, toAddress);
//            msg.setSubject(subject, "UTF-8");   
//            msg.setContent(body, "text/html;charset=utf-8");
//            msg.saveChanges();
//            transport.sendMessage(msg, msg.getAllRecipients());
//            
//            if (filePath != null && !"".equals(filePath)) {
//                //BodyPart attachmentBodyPart = new MimeBodyPart();
//                //                // 根据附件路径获取文件,
//                //FileDataSource dataSource = new FileDataSource(filePath);
//
//                contentBodyPart = new MimeBodyPart();
//                FileDataSource dataSource = new FileDataSource(filePath);
//                contentBodyPart.setDataHandler(new DataHandler(dataSource));
//                //MimeUtility.encodeWord可以避免文件名乱码
//                contentBodyPart.setFileName(MimeUtility.encodeWord(dataSource.getFile().getName()));
//                //
//                multipart.addBodyPart(contentBodyPart);
//            }
//        } catch (NoSuchProviderException e) {
//            e.printStackTrace();
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
//    }
//    public static void main(String args[]) throws UnsupportedEncodingException
//    {
//    	
//    	MailUtil.sendEmail("L979986627@126.com", "测试发送邮件", "这是邮件的正文部分");
//    }
//
//
//}


	

