package tn.edu.espritCs.gab.gui;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Mailing {

public static void envoyer(tn.edu.espritCs.gab.domain.Mail m) {
     try
    {
      String smtpServer="smtp.topnet.tn";
      String to=m.getDest();
      String from="noreply@smssys.com";
      String subject=m.getObjet();
      String body=m.getCorps();
      //send(smtpServer, to, from, subject, body);
    }
    catch (Exception ex)
    {
      System.out.println("Usage: java com.lotontech.mail.SimpleSender"
       +" smtpServer toAddress fromAddress subjectText bodyText");
    }
    System.exit(0);
    }
public static void send(String smtpServer, String to, String from
   , String subject, String body)
  {
    try
    {
      Properties props = System.getProperties();
      // -- Attaching to default Session, or we could start a new one --
      props.put("mail.smtp.host", smtpServer);
      Session session = Session.getDefaultInstance(props, null);
      // -- Create a new message --
      Message msg = new MimeMessage(session);
      // -- Set the FROM and TO fields --
      msg.setFrom(new InternetAddress(from));
      msg.setRecipients(Message.RecipientType.TO,
        InternetAddress.parse(to, false));
      // -- We could include CC recipients too --
      // if (cc != null)
      // msg.setRecipients(Message.RecipientType.CC
      // ,InternetAddress.parse(cc, false));
      // -- Set the subject and body text --
      msg.setSubject(subject);
      msg.setText(body);
      // -- Set some other header information --
      msg.setHeader("X-Mailer", "LOTONtechEmail");
      msg.setSentDate(new Date());
      // -- Send the message --
      Transport.send(msg);
      System.out.println("Votre mail a �t� correctement envoy�");
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }

}


