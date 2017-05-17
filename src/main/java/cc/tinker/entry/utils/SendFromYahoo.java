package cc.tinker.entry.utils;

/**
 * Created by Tinker on 2016/12/28.
 */
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class SendFromYahoo {
    public static void sendEmailByYahoo(String to,String subject,String content) {
        // Sender's email ID needs to be mentioned
        String from = "whoszus@126.com";
        String pass = "tinker0000";
        String host = "smtp.126.com";

        // Get system properties
        Properties properties = System.getProperties();
        // Setup mail server
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.user", from);
        properties.put("mail.smtp.password", pass);
//        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
//        properties.put("mail.debug", "true");

        // Get the default Session object.
        Session session = Session.getDefaultInstance(properties);

        try{
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));

            // Set Subject: header field
            message.setSubject(subject);

            // Now set the actual message
            message.setText(content);

            // Send message
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Sent message successfully....");
        }catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}