/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Color;

/**
 *
 * @author sony
 */
public class bmiview extends javax.swing.JFrame {
int age;
double bmi;
String user;
    /**
     * Creates new form bmiview
     */
    public bmiview() {
        initComponents();
    }
public bmiview(String u,int a,double b)
{
    initComponents();
    user=u;
    age=a;
    bmi=b;
    getContentPane().setBackground(Color.ORANGE);
        display();
}
void display()
{
    
   l3.setText("Hey! "+user+" according to your age "+age+" your BMI is "+bmi);
    if(age>=18)
    {
       if(bmi<16)
       {
           l1.setText("YOU ARE THINNEST");
       }
       else if(bmi>=16&&bmi<17)
       {
           l1.setText("YOU ARE MODERATE THINNER");
       }
       else if(bmi>=17&&bmi<18.5)
       {
           l1.setText("YOU ARE MILD THINNER");
       }
       else if(bmi>=18.5&&bmi<25)
       {
           l1.setText("YOU ARE NORMAL");
       }
       else if(bmi>=25&&bmi<30)
       {
           l1.setText("YOU ARE OVERWEIGHT");
       }
       else if(bmi>=30&&bmi<35)
       {
           l1.setText("YOU HAVE OBESE 1");
       }
       else if(bmi>=35&&bmi<40)
       {
           l1.setText("YOU HAVE OBESE 2");
       }
       else 
       {
           l1.setText("YOU HAVE OBESE 3");
       }
       }
    else if(age<18)
    {
        if(bmi<18)
        {
            l1.setText("YOU ARE THINNER");
        }
        else if(bmi>=18&&bmi<25)
        {
            l1.setText("YOU ARE NORMAL");
        }
        else
        {
            l1.setText("YOU ARE OVERWEIGHT");
        }
    }
    t1.setText("AGE>=18\nBMI=16                 THINNEST\nBMI=16-17           MODERATE THIN\nBMI=17-18.5        MILD THIN\nBMI=18.5-25        NORMAL\nBMI=25-30           OVERWEIGHT\nBMI=30-35           OBESE 1\nBMI=35-40           OBESE 2\nBMI>40                 OBESE 3");
    t2.setText("AGE<18\nBMI<18              THINNER\nBMI=18-25        NORMAL\nBMI>25              OVERWEIGHT");
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        l1 = new java.awt.Label();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        l3 = new java.awt.Label();
        t1 = new java.awt.TextArea();
        t2 = new java.awt.TextArea();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        l1.setBackground(new java.awt.Color(255, 204, 51));
        l1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l1.setText("label1");

        button1.setBackground(new java.awt.Color(204, 0, 204));
        button1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button1.setLabel("NEXT");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(204, 0, 204));
        button2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button2.setLabel("BACK");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        l3.setBackground(new java.awt.Color(255, 204, 0));
        l3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l3.setText("label1");

        t1.setBackground(new java.awt.Color(255, 204, 0));
        t1.setEditable(false);

        t2.setBackground(new java.awt.Color(255, 204, 51));
        t2.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(t1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                    .addComponent(t2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
next obj=new next(user);
obj.setVisible(true);
this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_button2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
choosepromblem obj=new choosepromblem(user);
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
            java.util.logging.Logger.getLogger(bmiview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bmiview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bmiview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bmiview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bmiview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label l1;
    private java.awt.Label l3;
    private java.awt.TextArea t1;
    private java.awt.TextArea t2;
    // End of variables declaration//GEN-END:variables
}
