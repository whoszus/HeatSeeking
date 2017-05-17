package cc.tinker.entry.utils;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

/**
 * Created by Tinker on 2016/12/28.
 */
//@Component
public class EmailUtils {

//    @Value("${mail.host}")
    private String mailHost;

//    @Value("${mail.server.host}")
    private String mailServerHost;

//    @Value("${mail.server.user}")
    private String mailServerUser;

//    @Value("${mail.server.password}")
    private String mailServerPassword;


    public void sendHtmlEmail(String mailFrom, String MAIL_TO, String subject, String htmlContent) throws Exception {
        Properties prop = new Properties();

        prop.setProperty("mail.debug", "true");

        prop.setProperty("mail.host", mailHost);

        prop.setProperty("mail.transport.protocol", "POP3");

        prop.setProperty("mail.smtp.auth", "true");

        // 1、创建session

        Session session = Session.getInstance(prop);

        Transport ts = null;

        // 2、通过session得到transport对象

        ts = session.getTransport();

        // 3、连上邮件服务器

        ts.connect(mailServerHost, mailServerUser, mailServerPassword);

        // 4、创建邮件

        MimeMessage message = new MimeMessage(session);

        // 邮件消息头

        message.setFrom(new InternetAddress(mailFrom)); // 邮件的发件人

        message.setRecipient(Message.RecipientType.TO, new InternetAddress(MAIL_TO)); // 邮件的收件人

//        message.setRecipient(Message.RecipientType.CC, new InternetAddress(MAIL_CC)); // 邮件的抄送人

//        message.setRecipient(Message.RecipientType.BCC, new InternetAddress(MAIL_BCC)); // 邮件的密送人

        message.setSubject(subject); // 邮件的标题

//        String htmlContent = "<h1>Hello</h1>" + "<p>显示图片<img src='cid:abc.jpg'>1.jpg</p>";

        MimeBodyPart text = new MimeBodyPart();

        text.setContent(htmlContent, "text/html;charset=UTF-8");

        MimeBodyPart image = new MimeBodyPart();

//        DataHandler dh = new DataHandler(new FileDataSource("D://[04]Temp//img//1.jpg"));
//
//        image.setDataHandler(dh);
//
//        image.setContentID("abc.jpg");

        // 描述数据关系

        MimeMultipart mm = new MimeMultipart();

        mm.addBodyPart(text);

        mm.setSubType("related");

        message.setContent(mm);

        message.saveChanges();

        // 5、发送邮件

        ts.sendMessage(message, message.getAllRecipients());

        ts.close();
    }




    public void test1(){
        boolean isSSL = true;
        String host = "smtp.126.com";
//        int port = 465;
        String from = "whoszus@126.com";
        String to = "whoszus@yahoo.com";
        boolean isAuth = true;
        final String username = "whoszus@126.com";
        final String password = "tinker0000";

        Properties props = new Properties();
        props.put("mail.smtp.ssl.enable", isSSL);
        props.put("mail.smtp.host", host);
//        props.put("mail.smtp.port", port);
        props.put("mail.smtp.auth", isAuth);


        props.setProperty("mail.debug", "true");
        Session session = Session.getDefaultInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);

            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("验证码邮件请查收");
            message.setText("您好最新的验证码为6633");

            Transport.send(message);
        } catch (AddressException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }

        System.out.println("发送完毕！");
    }



    Session l_session = null;


    public boolean sendMessage() {

        Properties props = System.getProperties();
        props.put("mail.smtp.host", "smtp.mail.yahoo.com");
        props.put("mail.smtp.auth", "true");
        props.put("mail.debug", "true");
        props.put("mail.smtp.port", "587");

        l_session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("whoszus@yahoo.com", "pass1844");
                    }
                });

        l_session.setDebug(true); // Enable the debug mode
        //System.out.println("Inside sendMessage 2 :: >> ");
        try {
            //System.out.println("Sending Message *********************************** ");
            MimeMessage message = new MimeMessage(l_session);
            String emailid = "whoszus@yahoo.com";
            //System.out.println("mail id in property ============= >>>>>>>>>>>>>> " + emailid);
            //message.setFrom(new InternetAddress(emailid));
            message.setFrom(new InternetAddress(emailid));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress("whoszus@126.com"));
//            message.addRecipient(Message.RecipientType.BCC, new InternetAddress(AppConstants.fromEmail));
            message.setSubject("测试");
            message.setContent("测试正文", "text/html");
            //message.setText(msg);
            Transport.send(message);
            System.out.println("Message Sent");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }//end catch block
        return true;
    }

}
