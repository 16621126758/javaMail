package cn.com.chnsys.springbootdemo.utils;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import sun.security.util.Password;

/**
 * @Class: MailUtils
 * @description: 邮件发送工具类
 * @Author: hongzhi.zhao
 * @Date: 2019-05-27 14:50
 */
public class MailUtils {

    /**
     *
     * @param to  给谁发送邮件
     * @param code   激活码
     */
    public static void sendMail(String to,String code) throws MessagingException {
        //1.创建连接对象，连接到邮箱服务器
//        Properties props = new Properties();
//        //props 主要用来设置发送的主机名。服务器的地址
//      //  props.setProperty("host",value);
        //1、连接邮件服务器的参数配置
        Properties props = new Properties();
        //设置用户的认证方式
        props.setProperty("mail.smtp.auth", "true");
        //设置传输协议
        props.setProperty("mail.transport.protocol", "smtp");
        //设置发件人的SMTP服务器地址
        props.setProperty("mail.smtp.host", "smtp.qq.com");

        Session session = Session.getInstance(props,
                new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("915032838@qq.com","utkjuwsaoymubcce");
            }
        });
        session.setDebug(true);
        //2.创建一个邮件的对象
        Message message = new MimeMessage(session);
        //2.1设置发件人
        message.setFrom(new InternetAddress("915032838@qq.com"));
        //2.2设置收件人
        message.setRecipient(RecipientType.TO,new InternetAddress(to));
        //2.3设置主题
        message.setSubject("来自赵洪志网站的激活邮件");
        //2.4设置正文 第一个参数是邮件的内容，第二个参数是类型，是文本还是一个连接
        message.setContent("<h1>来自赵洪志的网站的激活邮件，激活请点击以下连接</h1>"
                + "<h3><a href = 'http://localhost:8080/ActiveService?code="+code+"'>http://localhost:8080/ActiveService?code="+code+"</a></h3>","text/html;charset=UTF-8");
        //3.发送激活邮件

        Transport transport = session.getTransport();
        transport.connect("915032838@qq.com","utkjuwsaoymubcce");
       // javax.mail.AuthenticationFailedException: failed to connect, no password specified?
        Transport.send(message);
        transport.close();
    }
}
