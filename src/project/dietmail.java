/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

/**
 *
 * @author sony
 */
public class dietmail extends javax.swing.JFrame {
String user,p,d,e,f,n,z;
 String regex = "^(.+)@(.+)$";
    /**
     * Creates new form maildeit
     */
    public dietmail() {
        initComponents();
    }
  public dietmail(String u,String p1,String d1) {
        initComponents();
        getContentPane().setBackground(Color.ORANGE);
        user=u;
        p=p1;
        d=d1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        t1 = new java.awt.TextField();
        jButton1 = new javax.swing.JButton();
        button1 = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        label1.setBackground(new java.awt.Color(255, 204, 51));
        label1.setText("PLEASE ENTER YOUR MAIL ID");

        jButton1.setBackground(new java.awt.Color(204, 0, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("SEND");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(204, 0, 204));
        button1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button1.setLabel("NEXT");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
               final String username = "projecthealthcu@gmail.com";
final String password = "healthbp";
e=t1.getText();
if(e.matches(regex))
{
    
}
else
{
    JOptionPane.showMessageDialog(this,"PLEASE ENTER VALID EMAIL ID");
    return;
}
if(e.length()!=0)
{
    
}
else
{
    JOptionPane.showMessageDialog(this,"PLEASE FILL THE EMAIL ADDRESS");
    return;
}
      try
 {
     myconnection obj=new myconnection();
     String q="select * from tbdiet where user=?";
     PreparedStatement pst=obj.db.prepareStatement(q);
     pst.setString(1, user);
     ResultSet rs;
     rs=pst.executeQuery();
     if(rs.next())
     {
         n=rs.getString("name");
          p=rs.getString("pdfname");
          z=rs.getString("zip");
  
     }
 }
 catch(SQLException e)
 {
     System.out.println(e.getMessage());
 }
Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
       props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.debug", "true");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(username, password);
            }
          });
        session.setDebug(true);

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new 
                  InternetAddress("projecthealthcu@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
            InternetAddress.parse(e));
            message.setSubject("DIET PLAN");
            message.setText("YOUR DEIT PLAN IS ATTACHED BELOW");
            MimeBodyPart messageBodyPart2 = new MimeBodyPart();  
  
   // String filename = "SendAttachment.java";//change accordingly  
    DataSource source = new FileDataSource(n);  
    messageBodyPart2.setDataHandler(new DataHandler(source));  
    messageBodyPart2.setFileName(n); 
    Multipart multipart = new MimeMultipart();    
    multipart.addBodyPart(messageBodyPart2);  
     message.setContent(multipart );  



            Transport.send(message);

            System.out.println("Done");
         

        } catch (MessagingException o) {
            throw new RuntimeException(o);
        }
        Properties props1 = new Properties();
        props1.put("mail.smtp.auth", "true");
       props1.put("mail.smtp.starttls.enable", "true");
        props1.put("mail.smtp.host", "smtp.gmail.com");
        props1.put("mail.smtp.debug", "true");
        props1.put("mail.smtp.port", "587");
        props1.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        Session session1 = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(username, password);
            }
          });
        session1.setDebug(true);

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new 
                  InternetAddress("projecthealthcu@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
            InternetAddress.parse(e));
            message.setSubject("DIET PLAN");
            message.setText("YOUR DIET PLAN IS ATTACHED BELOW");
            MimeBodyPart messageBodyPart2 = new MimeBodyPart();  
  
   // String filename = "SendAttachment.java";//change accordingly  
   
    DataSource source1 = new FileDataSource(n);  
    messageBodyPart2.setDataHandler(new DataHandler(source1));  
    messageBodyPart2.setFileName(p);
    Multipart multipart = new MimeMultipart();    
    multipart.addBodyPart(messageBodyPart2);  
     message.setContent(multipart );  



            Transport.send(message);

            System.out.println("Done");
            
        } catch (MessagingException o) {
            throw new RuntimeException(o);
        }
        Properties props2 = new Properties();
        props2.put("mail.smtp.auth", "true");
       props2.put("mail.smtp.starttls.enable", "true");
        props2.put("mail.smtp.host", "smtp.gmail.com");
        props2.put("mail.smtp.debug", "true");
        props2.put("mail.smtp.port", "587");
        props2.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        Session session2 = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(username, password);
            }
          });
        session2.setDebug(true);

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new 
                  InternetAddress("projecthealthcu@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
            InternetAddress.parse(e));
            message.setSubject("DIET PLAN");
            message.setText("YOUR DIET PLAN IS ATTACHED BELOW");
            MimeBodyPart messageBodyPart2 = new MimeBodyPart();  
  
   // String filename = "SendAttachment.java";//change accordingly  
   
    DataSource source2 = new FileDataSource(z);  
    messageBodyPart2.setDataHandler(new DataHandler(source2));  
    messageBodyPart2.setFileName(z); 
    Multipart multipart = new MimeMultipart();    
    multipart.addBodyPart(messageBodyPart2);  
     message.setContent(multipart );  



            Transport.send(message);

            System.out.println("Done");
            JOptionPane.showMessageDialog(this,"YOUR DIET HAS BEEN SENT.");

        } catch (MessagingException o) {
            throw new RuntimeException(o);
        }// TODO add your handling code here:
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
feedback obj=new feedback();
obj.setVisible(true);
this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dietmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dietmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dietmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dietmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dietmail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private java.awt.Label label1;
    private java.awt.TextField t1;
    // End of variables declaration//GEN-END:variables
}
