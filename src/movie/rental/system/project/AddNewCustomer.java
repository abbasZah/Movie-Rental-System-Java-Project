/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie.rental.system.project;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
/**
 *
 * @author Abbas Zaheer
 */
public class AddNewCustomer extends javax.swing.JFrame {

    /**
     * Creates new form AddNewCustomer
     */
    public AddNewCustomer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        P_Head = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Container2 = new javax.swing.JPanel();
        L_Name2 = new javax.swing.JLabel();
        L_IdCard = new javax.swing.JLabel();
        L_Email = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        L_Username = new javax.swing.JLabel();
        L_PhNo = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextFieldCode = new javax.swing.JTextField();
        Add_Button = new javax.swing.JButton();
        Back_Button2 = new javax.swing.JButton();
        B_Clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        P_Head.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/rental/system/project/Add User Male_32px.png"))); // NOI18N
        jLabel1.setText("Add a New Customer");

        javax.swing.GroupLayout P_HeadLayout = new javax.swing.GroupLayout(P_Head);
        P_Head.setLayout(P_HeadLayout);
        P_HeadLayout.setHorizontalGroup(
            P_HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_HeadLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addGap(64, 64, 64))
        );
        P_HeadLayout.setVerticalGroup(
            P_HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_HeadLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        Container2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        L_Name2.setText("Name *");

        L_IdCard.setText("ID Card");

        L_Email.setText("Email ID");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        L_Username.setText("Username *");

        L_PhNo.setText("Phone No *");

        jTextFieldCode.setEditable(false);
        jTextFieldCode.setText("+92");

        javax.swing.GroupLayout Container2Layout = new javax.swing.GroupLayout(Container2);
        Container2.setLayout(Container2Layout);
        Container2Layout.setHorizontalGroup(
            Container2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Container2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Container2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L_Name2)
                    .addComponent(L_IdCard)
                    .addComponent(L_Email)
                    .addComponent(L_Username)
                    .addComponent(L_PhNo))
                .addGap(60, 60, 60)
                .addGroup(Container2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jTextField5)
                    .addComponent(jTextField4)
                    .addGroup(Container2Layout.createSequentialGroup()
                        .addComponent(jTextFieldCode, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        Container2Layout.setVerticalGroup(
            Container2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Container2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(Container2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_Name2))
                .addGap(18, 18, 18)
                .addGroup(Container2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_IdCard))
                .addGap(18, 18, 18)
                .addGroup(Container2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_PhNo)
                    .addComponent(jTextFieldCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Container2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_Email))
                .addGap(47, 47, 47)
                .addGroup(Container2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_Username))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        Add_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/rental/system/project/Add User Male_24px.png"))); // NOI18N
        Add_Button.setText("Add");
        Add_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_ButtonActionPerformed(evt);
            }
        });

        Back_Button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/rental/system/project/Go Back_24px.png"))); // NOI18N
        Back_Button2.setText("Back");
        Back_Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_Button2ActionPerformed(evt);
            }
        });

        B_Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/rental/system/project/Erase_24px.png"))); // NOI18N
        B_Clear.setText("Clear");
        B_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P_Head, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Container2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B_Clear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Back_Button2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P_Head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Container2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back_Button2)
                    .addComponent(Add_Button)
                    .addComponent(B_Clear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ButtonActionPerformed

         if(jTextField1.getText().equals("") || jTextField3.getText().equals("") || jTextField5.getText().equals("") || !jTextField4.getText().contains("@"))
       {
           JOptionPane.showMessageDialog(this,"Please Enter Compulsery Fields !");
       }
       else
       {
        String NAME= jTextField1.getText();
        String ID= jTextField2.getText();
        //Stars List Top
        String PHNO= jTextField3.getText();
       
        
        String EMAIL= jTextField4.getText();
        String USERNAME= jTextField5.getText();
        
        if(PHNO.length()>11)
        {
            JOptionPane.showMessageDialog(this,"Please Enter Valid Phone No. !");
        }
        else
        {
                Customer CustomerObj = new Customer(NAME,ID,PHNO,EMAIL,USERNAME);

            PrintWriter fout=null;

            try
            {
                fout = new PrintWriter(new FileOutputStream("Customer.txt",true));

                fout.println("~Info~");
                fout.println(USERNAME);
                fout.println(NAME);
                fout.println(ID);
                fout.println(PHNO);
                fout.println(EMAIL);
                fout.println("~/Info~");
            }
            catch(FileNotFoundException e)
            {
                System.out.println("Error in Opening File");
            }
            fout.close();
            JOptionPane.showMessageDialog(this,"Customer is Added");
        
        
        }
        }
        
            
    
        
        

    }//GEN-LAST:event_Add_ButtonActionPerformed

    private void Back_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_Button2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_Back_Button2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void B_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ClearActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
       
    }//GEN-LAST:event_B_ClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Button;
    private javax.swing.JButton B_Clear;
    private javax.swing.JButton Back_Button2;
    private javax.swing.JPanel Container2;
    private javax.swing.JLabel L_Email;
    private javax.swing.JLabel L_IdCard;
    private javax.swing.JLabel L_Name2;
    private javax.swing.JLabel L_PhNo;
    private javax.swing.JLabel L_Username;
    private javax.swing.JPanel P_Head;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextFieldCode;
    // End of variables declaration//GEN-END:variables
}
