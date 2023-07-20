//package Controlador;
//
//import java.util.Properties;
//import javax.activation.DataHandler;
//import javax.activation.FileDataSource;
//import javax.mail.BodyPart;
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeBodyPart;
//import javax.mail.internet.MimeMessage;
//import javax.mail.internet.MimeMultipart;
//import javax.swing.JOptionPane;

//public class Email {
//
//    public void enviarEmail(String correoDestino, String ruta, String nombreDocumento) {
//
//        try {
//            //ENVIAR CORREO: CON TEXTO Y CON ARCHIVO ADJUNTO
//
//            String correo = "mongebyron46@gmail.com";
//            String contra = "cjqntdlnibofgbvc"; //En esta parte se debe colocar la contraseña generada de google
//
//            Properties props = new Properties();
//            props.put("mail.smtp.host", "smtp.gmail.com");
//            props.setProperty("mail.smtp.starttls.enable", "true");
//            props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
//            props.setProperty("mail.smtp.port", "587");
//            props.setProperty("mail.smtp.user", correo);
//            props.setProperty("mail.smtp.auth", "true");
//
//            Session session = Session.getDefaultInstance(props);
//
//            ////////////Enviar archivo Adjunto/////////////////
//            BodyPart texto = new MimeBodyPart();
//            texto.setText("REGISTRO DE MATRÍCULA"); //Aqui va el texto que encabezara al documento enviado
//            BodyPart adjunto = new MimeBodyPart();
//            adjunto.setDataHandler(new DataHandler(new FileDataSource(ruta))); //Aqui va la ruta del archivo que deseo enviar
//            adjunto.setFileName(nombreDocumento);//Aqui va el nombre del archivo que estoy enviado mas su extension
//            MimeMultipart m = new MimeMultipart();
//            m.addBodyPart(texto);
//            m.addBodyPart(adjunto);
//            /////////////////////////////////////////////////
//
//            MimeMessage adjunto2 = new MimeMessage(session);
//
//            MimeMessage mensaje = new MimeMessage(session);
//
//            adjunto2.setFrom(new InternetAddress(correo));
//            adjunto2.addRecipient(Message.RecipientType.TO, new InternetAddress(correoDestino));
//            adjunto2.setContent(m); // PARA ARCHIVO ADJUNTO
//
//            mensaje.setFrom(new InternetAddress(correo));
//            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(correoDestino));
//            adjunto2.setSubject("Matrícula"); //Aqui va el asunto del email
//            Transport transport = session.getTransport("smtp");
//            transport.connect(correo, contra);
//            transport.sendMessage(adjunto2, adjunto2.getAllRecipients());
//            transport.close();
//
//            JOptionPane.showMessageDialog(null, "La matrícula ha sido enviada al correo del estudiante");
//
//        } catch (MessagingException e) {
//
//            System.out.println("Error: " + e);
//        }
//    }
//}

//
//
//package Controlador;
//
//import java.util.Properties;
//import javax.activation.DataHandler;
//import javax.activation.FileDataSource;
//import javax.mail.BodyPart;
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeBodyPart;
//import javax.mail.internet.MimeMessage;
//import javax.mail.internet.MimeMultipart;
//import javax.swing.JOptionPane;
//
//
//public class Email {
//
//    public void enviarEmail(String correoDestino, String ruta, String nombreDocumento) {
//
//        try {
//            //ENVIAR CORREO: CON TEXTO Y CON ARCHIVO ADJUNTO
//
//            String correo = "227255692396-pdqb29ighhr4tus88kt9nkghilmreleb.apps.googleusercontent.com";
//            String contra = "AIzaSyD2xCq3Ur78Fdml4k84jBrnPvugJCdsIGc"; //En esta parte se debe colocar la contraseña generada de google
//
//            Properties props = new Properties();
//            props.put("mail.smtp.host", "smtp.gmail.com");
//            props.setProperty("mail.smtp.starttls.enable", "true");
//            props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
//            props.setProperty("mail.smtp.port", "587");
//            props.setProperty("mail.smtp.user", correo);
//            props.setProperty("mail.smtp.auth", "true");
//
//            Session session = Session.getDefaultInstance(props);
//
//            ////////////Enviar archivo Adjunto/////////////////
//            BodyPart texto = new MimeBodyPart();
//            texto.setText("REGISTRO DE MATRÍCULA"); //Aqui va el texto que encabezara al documento enviado
//            BodyPart adjunto = new MimeBodyPart();
//            adjunto.setDataHandler(new DataHandler(new FileDataSource(ruta))); //Aqui va la ruta del archivo que deseo enviar
//            adjunto.setFileName(nombreDocumento);//Aqui va el nombre del archivo que estoy enviado mas su extension
//            MimeMultipart m = new MimeMultipart();
//            m.addBodyPart(texto);
//            m.addBodyPart(adjunto);
//            /////////////////////////////////////////////////
//
//            MimeMessage adjunto2 = new MimeMessage(session);
//
//            MimeMessage mensaje = new MimeMessage(session);
//
//            adjunto2.setFrom(new InternetAddress(correo));
//            adjunto2.addRecipient(Message.RecipientType.TO, new InternetAddress(correoDestino));
//            adjunto2.setContent(m); // PARA ARCHIVO ADJUNTO
//
//            mensaje.setFrom(new InternetAddress(correo));
//            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(correoDestino));
//            adjunto2.setSubject("Matrícula"); //Aqui va el asunto del email
//            Transport transport = session.getTransport("smtp");
//            transport.connect(correo, contra);
//            transport.sendMessage(adjunto2, adjunto2.getAllRecipients());
//            transport.close();
//
//            JOptionPane.showMessageDialog(null, "La matrícula ha sido enviada al correo del estudiante");
//
//        } catch (MessagingException e) {
//
//            System.out.println("Error: " + e);
//        }
//    }
//}



package Controlador;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

public class Email {

    public void enviarEmail(String correoDestino, String ruta, String nombreDocumento) {

        try {
            // ENVIAR CORREO: CON TEXTO Y CON ARCHIVO ADJUNTO

            String correo = "227255692396-pdqb29ighhr4tus88kt9nkghilmreleb.apps.googleusercontent.com"; // Coloca aquí tu dirección de correo
            String contra = "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"; // Coloca aquí tu contraseña

            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");

            Session session = Session.getInstance(props, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(correo, contra);
                }
            });

            MimeMessage mensaje = new MimeMessage(session);
            mensaje.setFrom(new InternetAddress(correo));
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(correoDestino));
            mensaje.setSubject("Matrícula"); // Aquí va el asunto del email

            // Parte de texto del mensaje
            BodyPart texto = new MimeBodyPart();
            texto.setText("REGISTRO DE MATRÍCULA"); // Aquí va el texto que encabezará al documento enviado

            // Parte del archivo adjunto
            BodyPart adjunto = new MimeBodyPart();
            adjunto.setDataHandler(new DataHandler(new FileDataSource(ruta))); // Aquí va la ruta del archivo que deseas enviar
            adjunto.setFileName(nombreDocumento); // Aquí va el nombre del archivo que estás enviando junto con su extensión

            // Combinar las partes del contenido para formar el mensaje
            MimeMultipart multipart = new MimeMultipart();
            multipart.addBodyPart(texto);
            multipart.addBodyPart(adjunto);

            mensaje.setContent(multipart);

            // Enviar el mensaje
            Transport.send(mensaje);

            JOptionPane.showMessageDialog(null, "La matrícula ha sido enviada al correo del estudiante");

        } catch (MessagingException e) {
            System.out.println("Error: " + e);
        }
    }
}
