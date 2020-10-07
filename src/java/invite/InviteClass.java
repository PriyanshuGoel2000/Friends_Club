/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invite;

import java.io.*;
//import java.sun.net.smtp.*;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import java.sql.*;
import javax.activation.*;
/**
 *
 * @author Sankalp
 */
public class InviteClass {
    
    String to,from,msg,sub=null;
    public static Properties props=null;
    public static Session session=null;
    
    /** Creates a new instance of MailClass */
   
   public static String SendMessage(String emailto, String emailfrom,String Password, String emailmultipart, String subject,String msgText)
  {
    boolean debug = false; // change to get more information
    String msgText2 = "multipart message";
    boolean sendmultipart = Boolean.valueOf(emailmultipart).booleanValue();
    // set the host
    //Properties props = System.getProperties();
    //props.setProperty("mail.smtp.host", "localhost");
    // create some properties and get the default Session
    Properties props =new Properties();
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.auth", true);
    props.put("mail.smtp.starttls.enable", true);
    props.put("mail.smtp.port", 587);
    Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
        @Override
        protected PasswordAuthentication getPasswordAuthentication(){
            return new PasswordAuthentication(emailfrom,Password);
        }
                  });
   // Session session = Session.getDefaultInstance(props);
    session.setDebug(debug);
    try
    {
      // create a message
      MimeMessage msg = new MimeMessage(session);
      // set the from
      InternetAddress from = new InternetAddress(emailfrom);
      msg.setFrom(from);
      InternetAddress address = new InternetAddress(emailto);
      msg.addRecipient(Message.RecipientType.TO, address);
      msg.setSubject(subject);
      if(!sendmultipart)
      {
        // send a plain text message
        msg.setContent(msgText, "text/plain");
      }
      else
      {
        // send a multipart message// create and fill the first message part
        MimeBodyPart mbp1 = new MimeBodyPart();
        mbp1.setContent(msgText, "text/plain");
        // create and fill the second message part
        MimeBodyPart mbp2 = new MimeBodyPart();
        mbp2.setContent(msgText2, "text/plain");
        // create the Multipart and its parts to it
        Multipart mp = new MimeMultipart();
        mp.addBodyPart(mbp1);
        mp.addBodyPart(mbp2);
        // add the Multipart to the message
        msg.setContent(mp);
      }
      Transport.send(msg);
    }
    catch(MessagingException mex)
    {
      mex.printStackTrace();
    }
    return "Email sent to " + emailto;
  }

}
    