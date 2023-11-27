package ui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.ItemEvent;
import javax.swing.JPanel;
import model.Business;
import model.EmployeeProfile;
import model.ProfessorProfile;
import model.Profile;
import model.StudentProfile;
import model.UserAccount;
import model.UserAccountDirectory;
import org.mindrot.jbcrypt.BCrypt;
import util.ConfigureABusiness;

/**
 *
 * @author kal bugrara
 */
public class ProfileWorkAreaMainFrame extends javax.swing.JFrame {

    Business business;

    /**
     * Creates new form PricingMainFrame
     */

    public ProfileWorkAreaMainFrame() {
        initComponents();
        business = ConfigureABusiness.initialize();
        

    }

    public void insert(JPanel jpanel) {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitHomeArea = new javax.swing.JSplitPane();
        actionsidejpanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtInvalidAdmin = new javax.swing.JTextField();
        toggleButton = new javax.swing.JToggleButton();
        txtName = new javax.swing.JLabel();
        txtDesignation = new javax.swing.JLabel();
        CardSequencePanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        actionsidejpanel.setBackground(new java.awt.Color(155, 199, 196));
        actionsidejpanel.setMinimumSize(new java.awt.Dimension(200, 200));
        actionsidejpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(23, 65, 68));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        actionsidejpanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 244, 70, 30));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("User Name");
        actionsidejpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 118, -1, -1));
        actionsidejpanel.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 139, 177, -1));

        jLabel2.setText("Password");
        actionsidejpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 180, -1, 20));

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        actionsidejpanel.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 209, 177, -1));

        txtInvalidAdmin.setEditable(false);
        txtInvalidAdmin.setBackground(new java.awt.Color(155, 199, 196));
        txtInvalidAdmin.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        txtInvalidAdmin.setForeground(new java.awt.Color(204, 51, 0));
        txtInvalidAdmin.setBorder(null);
        txtInvalidAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInvalidAdminActionPerformed(evt);
            }
        });
        actionsidejpanel.add(txtInvalidAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 95, 245, -1));

        toggleButton.setBackground(new java.awt.Color(23, 65, 68));
        toggleButton.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        toggleButton.setForeground(new java.awt.Color(255, 255, 255));
        toggleButton.setText("SHOW");
        toggleButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                toggleButtonItemStateChanged(evt);
            }
        });
        toggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleButtonActionPerformed(evt);
            }
        });
        actionsidejpanel.add(toggleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 213, -1, -1));

        txtName.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        actionsidejpanel.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 4, 303, 10));

        txtDesignation.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        actionsidejpanel.add(txtDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 24, 303, 20));

        SplitHomeArea.setLeftComponent(actionsidejpanel);

        CardSequencePanel.setMinimumSize(new java.awt.Dimension(1000, 1000));
        CardSequencePanel.setLayout(new java.awt.CardLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 800));

        jLabel3.setBackground(new java.awt.Color(203, 231, 229));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("WELCOME TO COURSERA PLATFORM");
        jLabel3.setMaximumSize(new java.awt.Dimension(800, 800));
        jLabel3.setMinimumSize(new java.awt.Dimension(800, 800));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1115, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );

        CardSequencePanel.add(jPanel1, "card3");

        SplitHomeArea.setRightComponent(CardSequencePanel);

        getContentPane().add(SplitHomeArea, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        //      WorkAreaJPanel ura = new WorkAreaJPanel(workareajpanl);

        String un = txtUserName.getText();
        String pw = new String(txtPassword.getPassword());

        UserAccountDirectory uad = business.getUserAccountDirectory();
        UserAccount useraccount = uad.AuthenticateUser(un, pw);
        if (useraccount == null) {
            txtInvalidAdmin.setText("Invalid Username or Password");
            txtUserName.setText("");
            txtPassword.setText("");
            return;
        }
        txtInvalidAdmin.setText("");
        txtUserName.setText("");
        txtPassword.setText("");
        
        Profile profile = useraccount.getAssociatedPersonProfile();
        if(profile.getPerson().getFirstName()!=null){
            txtName.setText(profile.getPerson().getFirstName().toUpperCase()+" "+profile.getPerson().getLastName().toUpperCase());
        }
        txtDesignation.setText(profile.getRole().toUpperCase());
        StudentWorkAreaJPanel studentworkareajpanel;
        FacultyWorkAreaJPanel facultyworkarea;
        AdminRoleWorkAreaJPanel adminworkarea;
        
        System.out.println("PROFILE: "+profile);

        if (profile instanceof EmployeeProfile employeeProfile) {

            adminworkarea = new AdminRoleWorkAreaJPanel(business, employeeProfile, CardSequencePanel);
            CardSequencePanel.removeAll();
            CardSequencePanel.add("Admin", adminworkarea);
            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

        }
        
        if (profile instanceof StudentProfile studentProfile) {

            studentworkareajpanel = new StudentWorkAreaJPanel(business, studentProfile, CardSequencePanel);
            CardSequencePanel.removeAll();
            CardSequencePanel.add("student", studentworkareajpanel);
            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

        }
        
         if (profile instanceof ProfessorProfile professorProfile) {

            facultyworkarea = new FacultyWorkAreaJPanel(business, professorProfile, CardSequencePanel);
            CardSequencePanel.removeAll();
            CardSequencePanel.add("professor", facultyworkarea);
            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

        }
         
         

 

    }//GEN-LAST:event_LoginButtonActionPerformed

    private void txtInvalidAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInvalidAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInvalidAdminActionPerformed

    private void toggleButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_toggleButtonItemStateChanged
        int state = evt.getStateChange();
        if(state == ItemEvent.SELECTED){
            txtPassword.setEchoChar((char)0);
            toggleButton.setText("HIDE");
        }
        else{
            txtPassword.setEchoChar('*');
            toggleButton.setText("SHOW");
        }
    }//GEN-LAST:event_toggleButtonItemStateChanged

    private void toggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toggleButtonActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(ProfileWorkAreaMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileWorkAreaMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileWorkAreaMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileWorkAreaMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfileWorkAreaMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardSequencePanel;
    private javax.swing.JSplitPane SplitHomeArea;
    private javax.swing.JPanel actionsidejpanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton toggleButton;
    private javax.swing.JLabel txtDesignation;
    private javax.swing.JTextField txtInvalidAdmin;
    private javax.swing.JLabel txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}