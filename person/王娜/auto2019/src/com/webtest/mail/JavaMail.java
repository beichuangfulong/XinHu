//package com.webtest.mail;
//
//import java.util.Properties;
//
//import javax.activation.DataHandler;
//import javax.activation.DataSource;
//import javax.activation.FileDataSource;
//import javax.mail.BodyPart;
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.Multipart;
//import javax.mail.PasswordAuthentication;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.AddressException;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeBodyPart;
//import javax.mail.internet.MimeMessage;
//import javax.mail.internet.MimeMultipart;
//
//public class JavaMail {
//
//	public static void main(String[] args) throws AddressException, MessagingException {
//		Properties props = new Properties();
//		props.put("mail.smtp.host", "smtp.qq.com");
//		props.put("mail.smtp.socketFactory.port", "465");
//		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//		props.put("mail.smtp.auth", "true");
//		
//		props.put("mail.smtp.port", "25");
//		
//		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
//			protected PasswordAuthentication getPasswordAuthentication() {
//				return new PasswordAuthentication("1955328943@qq.com", "oubgltkwyhrmbggh");
//			}
//		});
//		
//		Message message = new MimeMessage(session);
//		message.setFrom(new InternetAddress("1955328943@qq.com"));
//		message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("191301708@qq.com"));
//		message.setSubject("测试发送邮件");
//		BodyPart messageBodyPart1=new MimeBodyPart();
//		messageBodyPart1.setText("这是邮件的正文部分");
//		BodyPart messageBodyPart2=new MimeBodyPart();
//		String filename="F:\\Demo\\auto2019\\auto2019\\test-output\\emailable-report.html";
//		DataSource source = new FileDataSource(filename);
//		
//		messageBodyPart2.setDataHandler(new DataHandler(source));
//		messageBodyPart2.setFileName(filename);
//		Multipart multipart = new MimeMultipart();
//		multipart.addBodyPart(messageBodyPart1);
//		multipart.addBodyPart(messageBodyPart2);
//		message.setContent(multipart);
//		Transport.send(message);
//		
//		System.out.println("邮件已经发送");
//		
//	}
//	}
//	
//
