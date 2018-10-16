package page;

import service.APIService;
import model.User;
import helpers.Input;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegisterPage extends javax.swing.JFrame {

    private User user;
    public RegisterPage() {
        
        initComponents();
        textboxName.setText("Name");
        textboxUsername.setText("Username");
        textboxPassword.setText("Password");
        textboxConfirmPassword.setText("Password");
        
    }

    
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button_edit = new javax.swing.JLabel();
        buttonLogin = new javax.swing.JLabel();
        textboxUsername = new javax.swing.JTextField();
        textboxName = new javax.swing.JTextField();
        textboxConfirmPassword = new javax.swing.JPasswordField();
        textboxPassword = new javax.swing.JPasswordField();
        buttonSignup = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(button_edit);
        button_edit.setBounds(257, 530, 23, 23);

        buttonLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/bt-li2.png"))); // NOI18N
        buttonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonLoginMouseExited(evt);
            }
        });
        getContentPane().add(buttonLogin);
        buttonLogin.setBounds(641, 508, 250, 40);

        textboxUsername.setBorder(null);
        textboxUsername.setNextFocusableComponent(textboxPassword);
        textboxUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textboxUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textboxUsernameFocusLost(evt);
            }
        });
        textboxUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textboxUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(textboxUsername);
        textboxUsername.setBounds(680, 261, 210, 30);

        textboxName.setBorder(null);
        textboxName.setNextFocusableComponent(textboxUsername);
        textboxName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textboxNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textboxNameFocusLost(evt);
            }
        });
        getContentPane().add(textboxName);
        textboxName.setBounds(680, 220, 210, 30);

        textboxConfirmPassword.setBorder(null);
        textboxConfirmPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textboxConfirmPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textboxConfirmPasswordFocusLost(evt);
            }
        });
        getContentPane().add(textboxConfirmPassword);
        textboxConfirmPassword.setBounds(680, 349, 210, 30);

        textboxPassword.setBorder(null);
        textboxPassword.setNextFocusableComponent(textboxConfirmPassword);
        textboxPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textboxPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textboxPasswordFocusLost(evt);
            }
        });
        getContentPane().add(textboxPassword);
        textboxPassword.setBounds(680, 303, 210, 30);

        buttonSignup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/bt-su.png"))); // NOI18N
        buttonSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSignupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonSignupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonSignupMouseExited(evt);
            }
        });
        getContentPane().add(buttonSignup);
        buttonSignup.setBounds(640, 410, 250, 40);

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/bt-close.png"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        getContentPane().add(Exit);
        Exit.setBounds(980, 10, 30, 30);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/BGlogin.png"))); // NOI18N
        BG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BG.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(BG);
        BG.setBounds(0, -1, 1030, 770);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void textboxNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textboxNameFocusGained
        textboxName.setText("");
    }//GEN-LAST:event_textboxNameFocusGained

    private void textboxNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textboxNameFocusLost
        if(textboxName.getText().equals("")){
             textboxName.setText("Name");
         }
    }//GEN-LAST:event_textboxNameFocusLost

    private void textboxUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textboxUsernameFocusGained
        
        textboxUsername.setText("");
    }//GEN-LAST:event_textboxUsernameFocusGained

    private void textboxUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textboxUsernameFocusLost
         if(textboxUsername.getText().equals("")){
             textboxUsername.setText("Username");
         }
        
    }//GEN-LAST:event_textboxUsernameFocusLost

    private void textboxPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textboxPasswordFocusGained
        textboxPassword.setText("");
    }//GEN-LAST:event_textboxPasswordFocusGained

    private void textboxPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textboxPasswordFocusLost
         if(textboxPassword.getText().equals("")){
             textboxPassword.setText("Password");
         }
        
    }//GEN-LAST:event_textboxPasswordFocusLost

    private void textboxConfirmPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textboxConfirmPasswordFocusGained
         textboxConfirmPassword.setText("");
    }//GEN-LAST:event_textboxConfirmPasswordFocusGained

    private void textboxConfirmPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textboxConfirmPasswordFocusLost
        if(textboxConfirmPassword.getText().equals("")){
             textboxConfirmPassword.setText("Password");
         }
    }//GEN-LAST:event_textboxConfirmPasswordFocusLost

    private void buttonSignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSignupMouseClicked
        String text = CheckInput();
        System.out.println(text);
        JOptionPane.showMessageDialog(null,text); 
    }//GEN-LAST:event_buttonSignupMouseClicked

    private String CheckInput(){
            String user = this.textboxUsername.getText(),
                   name = this.textboxName.getText(),
                   pass = String.valueOf(this.textboxPassword.getPassword()),
                   passCon = String.valueOf(this.textboxConfirmPassword.getPassword());
            if(!Input.checkSpace(user,name,pass,passCon))
            {
               return "Please enter your information";
            }
            else
            {
            if(matchConfirmpass(pass,passCon)){
                    return APIService.register(user, pass, name);
                
            }else
                return "A password mismatch (pls, try again)";
            }
    }
    
    public boolean matchConfirmpass(String pass,String passCon){
        if(pass.equals(passCon))
            return true;
        else
            return false;
    }
    
    public void reset(){
        textboxName.setText("");
        textboxUsername.setText("");
        textboxPassword.setText("");
        textboxConfirmPassword.setText("");
    }
    
    
    
    
    
    private void buttonSignupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSignupMouseEntered
        ImageIcon img = new ImageIcon(this.getClass().getResource("../imgs/bt-su2.png"));
          buttonSignup.setIcon(img);
    }//GEN-LAST:event_buttonSignupMouseEntered

    private void buttonSignupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSignupMouseExited
        ImageIcon img = new ImageIcon(this.getClass().getResource("../imgs/bt-su.png"));
          buttonSignup.setIcon(img);
    }//GEN-LAST:event_buttonSignupMouseExited

    private void buttonLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLoginMouseEntered
       ImageIcon img = new ImageIcon(this.getClass().getResource("../imgs/bt-li.png"));
          buttonLogin.setIcon(img);
        
    }//GEN-LAST:event_buttonLoginMouseEntered

    private void buttonLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLoginMouseExited
         ImageIcon img = new ImageIcon(this.getClass().getResource("../imgs/bt-li2.png"));
          buttonLogin.setIcon(img);
        
    }//GEN-LAST:event_buttonLoginMouseExited

    private void buttonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLoginMouseClicked
        LoginPage LP = new LoginPage();
        LP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonLoginMouseClicked

    private void textboxUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textboxUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textboxUsernameActionPerformed

    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
              
         
         
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new RegisterPage().setVisible(true);
                
            }
        });
    }

    public JPasswordField getTextboxConfirmPassword() {
        return textboxConfirmPassword;
    }

    public JTextField getTextboxName() {
        return textboxName;
    }

    public JPasswordField getTextboxPassword() {
        return textboxPassword;
    }

    public JTextField getTextboxUsername() {
        return textboxUsername;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel buttonLogin;
    private javax.swing.JLabel buttonSignup;
    private javax.swing.JLabel button_edit;
    private javax.swing.JPasswordField textboxConfirmPassword;
    private javax.swing.JTextField textboxName;
    private javax.swing.JPasswordField textboxPassword;
    private javax.swing.JTextField textboxUsername;
    // End of variables declaration//GEN-END:variables
}
