package core.domain.employeeCreationComponent;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;

public class Contractor extends Employee implements Subscriber {

    public Contractor(int identityDocument, String fullName, String email){
        super(identityDocument, fullName, email);
    }

    @Override
    public void update(String subject, String body) {

        //---------- WARNING (PROVISIONAL) ----------
        final String from = "notificationsMail@gmail.com";
        final String password = "notificationsPassword";
        //-------------------------------------------

        String to = this.getEmail();  // Obtiene el email del empleado

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);
            message.setText(body);

            Transport.send(message);
            System.out.println("Mail sent to " + to);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

}
