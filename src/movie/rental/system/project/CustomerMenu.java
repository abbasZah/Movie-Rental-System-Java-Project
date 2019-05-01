/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie.rental.system.project;

/**
 *
 * @author Abbas Zaheer
 */
public class CustomerMenu extends javax.swing.JFrame {

    /**
     * Creates new form CustomerMenu
     */
    public CustomerMenu() {
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

        P_Head1 = new javax.swing.JPanel();
        heading = new javax.swing.JLabel();
        P_Left = new javax.swing.JPanel();
        Profile = new javax.swing.JButton();
        RentMovie = new javax.swing.JButton();
        ReturnMovie = new javax.swing.JButton();
        RentedMovies = new javax.swing.JButton();
        ReturnedMovies = new javax.swing.JButton();
        Back_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        P_Head1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        heading.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/rental/system/project/Xbox Menu_32px.png"))); // NOI18N
        heading.setText("Customer Menu");

        javax.swing.GroupLayout P_Head1Layout = new javax.swing.GroupLayout(P_Head1);
        P_Head1.setLayout(P_Head1Layout);
        P_Head1Layout.setHorizontalGroup(
            P_Head1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_Head1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(heading, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addGap(63, 63, 63))
        );
        P_Head1Layout.setVerticalGroup(
            P_Head1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_Head1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        P_Left.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        Profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/rental/system/project/Female Profile_24px.png"))); // NOI18N
        Profile.setText("Profile");
        Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileActionPerformed(evt);
            }
        });

        RentMovie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/rental/system/project/Lease_24px.png"))); // NOI18N
        RentMovie.setText("Rent a Movie");
        RentMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentMovieActionPerformed(evt);
            }
        });

        ReturnMovie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/rental/system/project/Return_24px.png"))); // NOI18N
        ReturnMovie.setText("Return a Movie");
        ReturnMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnMovieActionPerformed(evt);
            }
        });

        RentedMovies.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/rental/system/project/Rent_24px.png"))); // NOI18N
        RentedMovies.setText("Rented Movies");
        RentedMovies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentedMoviesActionPerformed(evt);
            }
        });

        ReturnedMovies.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/rental/system/project/Return Purchase_24px.png"))); // NOI18N
        ReturnedMovies.setText("Returned Movies");
        ReturnedMovies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnedMoviesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_LeftLayout = new javax.swing.GroupLayout(P_Left);
        P_Left.setLayout(P_LeftLayout);
        P_LeftLayout.setHorizontalGroup(
            P_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_LeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RentMovie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ReturnMovie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RentedMovies, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ReturnedMovies, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                .addContainerGap())
        );
        P_LeftLayout.setVerticalGroup(
            P_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_LeftLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(Profile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RentMovie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReturnMovie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RentedMovies)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReturnedMovies)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        Back_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/rental/system/project/Go Back_24px.png"))); // NOI18N
        Back_Button.setText("Back");
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(P_Left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P_Head1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Back_Button)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P_Head1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(P_Left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(Back_Button)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileActionPerformed
        
    }//GEN-LAST:event_ProfileActionPerformed

    private void RentMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentMovieActionPerformed
        
    }//GEN-LAST:event_RentMovieActionPerformed

    private void ReturnMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnMovieActionPerformed

        

    }//GEN-LAST:event_ReturnMovieActionPerformed

    private void ReturnedMoviesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnedMoviesActionPerformed
        
    }//GEN-LAST:event_ReturnedMoviesActionPerformed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void RentedMoviesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentedMoviesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RentedMoviesActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Button;
    private javax.swing.JPanel P_Head1;
    private javax.swing.JPanel P_Left;
    private javax.swing.JButton Profile;
    private javax.swing.JButton RentMovie;
    private javax.swing.JButton RentedMovies;
    private javax.swing.JButton ReturnMovie;
    private javax.swing.JButton ReturnedMovies;
    private javax.swing.JLabel heading;
    // End of variables declaration//GEN-END:variables
}
