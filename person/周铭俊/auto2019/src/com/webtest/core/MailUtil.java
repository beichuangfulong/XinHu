package com.webtest.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.webtest.utils.ReadProperties;


public class MailUtil {
	//文件不是file输入1，是file输入其他int型数字
    public static void sendEmail(String subject, String body,int type) throws IOException {
        try {
        	 String server = ReadProperties.getPropertyValue("server");
        	 String port = ReadProperties.getPropertyValue("port");
        	 String from = ReadProperties.getPropertyValue("from");
        	 String user = ReadProperties.getPropertyValue("from-mail-n");
        	 String password = ReadProperties.getPropertyValue("from-mail-p");
        	 String tomail = ReadProperties.getPropertyValue("tomail");

            Properties props = new Properties();
            props.put("mail.smtp.host", server);
            props.put("mail.smtp.port", String.valueOf(port));
            props.put("mail.smtp.auth", "true");
            Authenticator authenticator = new Authenticator() {
            	protected PasswordAuthentication getPasswordAuthentication() {
            		String userName = props.getProperty(user);
            		String passWord = props.getProperty(password);
            		return new PasswordAuthentication(userName, passWord);
            	}
			};
            Session session = Session.getDefaultInstance(props,authenticator);
            Transport transport = null;
            transport = session.getTransport("smtp");
            transport.connect(server, user, password);
            MimeMessage msg = new MimeMessage(session);
            msg.setSentDate(new Date());
            
            InternetAddress fromAddress = new InternetAddress(user,from,"UTF-8");
            msg.setFrom(fromAddress);
            String emailList[]=tomail.split(",");
            InternetAddress[] toAddress = new InternetAddress[emailList.length];
            
            for(int i=0;i<emailList.length;i++)
            {
            	toAddress[i]=new InternetAddress(emailList[i]);
            }
          
            msg.addRecipients(Message.RecipientType.TO, toAddress);
            msg.setSubject(subject, "UTF-8");
            if(type == 1) {
            	msg.setContent(body, "text/html;charset=utf-8");
            }else {
            	msg.setContent(readFile(body),"text/html;charset=gb2312");
			}
            msg.saveChanges();
            transport.sendMessage(msg, msg.getAllRecipients());
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
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
