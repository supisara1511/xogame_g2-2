/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page;


import com.placeholder.PlaceHolder;
import service.APIService;
import helpers.Input;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author Demon
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
        PlaceHolder holderUsername = new PlaceHolder(textboxUsername, "Username");
        PlaceHolder holderPass = new PlaceHolder(textboxPassword, "********");
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonLogin = new javax.swing.JLabel();
        textboxUsername = new javax.swing.JTextField();
        textboxPassword = new javax.swing.JPasswordField();
        buttonSignup = new javax.swing.JLabel();
        button_close = new javax.swing.JLabel();
        BG_Login = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

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
        buttonLogin.setBounds(640, 480, 250, 40);

        textboxUsername.setBorder(null);
        textboxUsername.setOpaque(false);
        textboxUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textboxUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textboxUsernameFocusLost(evt);
            }
        });
        getContentPane().add(textboxUsername);
        textboxUsername.setBounds(680, 396, 210, 30);

        textboxPassword.setBorder(null);
        textboxPassword.setOpaque(false);
        textboxPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textboxPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textboxPasswordFocusLost(evt);
            }
        });
        getContentPane().add(textboxPassword);
        textboxPassword.setBounds(680, 438, 210, 30);

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
        buttonSignup.setBounds(640, 590, 250, 40);

        button_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/bt-close.png"))); // NOI18N
        button_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_closeMouseClicked(evt);
            }
        });
        getContentPane().add(button_close);
        button_close.setBounds(980, 10, 30, 30);

        BG_Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/BG_Login2.jpg"))); // NOI18N
        BG_Login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(BG_Login);
        BG_Login.setBounds(0, 0, 1024, 768);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(730, 590, 34, 14);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSignupMouseClicked
       fromSingup singup = new fromSingup();
       singup.setVisible(true);
       this.dispose();
      
       

    }//GEN-LAST:event_buttonSignupMouseClicked

    private void textboxUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textboxUsernameFocusGained

    }//GEN-LAST:event_textboxUsernameFocusGained

    private void textboxUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textboxUsernameFocusLost
     

    }//GEN-LAST:event_textboxUsernameFocusLost

    private void textboxPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textboxPasswordFocusGained
     
    }//GEN-LAST:event_textboxPasswordFocusGained

    private void textboxPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textboxPasswordFocusLost
      

    }//GEN-LAST:event_textboxPasswordFocusLost

    private void button_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_button_closeMouseClicked

    private void buttonSignupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSignupMouseEntered
          ImageIcon img = new ImageIcon(this.getClass().getResource("../imgs/bt-su2.png"));
          buttonSignup.setIcon(img);
    }//GEN-LAST:event_buttonSignupMouseEntered

    private void buttonSignupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSignupMouseExited
         ImageIcon img = new ImageIcon(this.getClass().getResource("../imgs/bt-su.png"));
          buttonSignup.setIcon(img);
    }//GEN-LAST:event_buttonSignupMouseExited

    private void buttonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLoginMouseClicked
        String text = CheckInput();
        System.out.println(text);
        JOptionPane.showMessageDialog(null,text); 
    }//GEN-LAST:event_buttonLoginMouseClicked

    private String CheckInput(){
            String user = this.textboxUsername.getText(),
                    pass = String.valueOf(this.textboxPassword.getPassword());
            if(!Input.checkSpace(user,pass))
            {
               return "Please enter your information";
            }
            else
            {
                return APIService.login(user, pass).getMessage();
            }
    }
    
    private void buttonLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLoginMouseEntered
       ImageIcon img = new ImageIcon(this.getClass().getResource("../imgs/bt-li.png"));
          buttonLogin.setIcon(img);
    }//GEN-LAST:event_buttonLoginMouseEntered

    private void buttonLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLoginMouseExited
         ImageIcon img = new ImageIcon(this.getClass().getResource("../imgs/bt-li2.png"));
          buttonLogin.setIcon(img);
    }//GEN-LAST:event_buttonLoginMouseExited

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG_Login;
    private javax.swing.JLabel buttonLogin;
    private javax.swing.JLabel buttonSignup;
    private javax.swing.JLabel button_close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField textboxPassword;
    private javax.swing.JTextField textboxUsername;
    // End of variables declaration//GEN-END:variables
}