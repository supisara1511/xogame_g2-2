package page;

import com.placeholder.PlaceHolder;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import model.User;
import org.json.JSONObject;
import service.APIService;

public class fromSingup extends javax.swing.JFrame {

    private String fileImg = "";

    public fromSingup() {
        initComponents();

        PlaceHolder holderNmae = new PlaceHolder(textboxName, "Name");
        PlaceHolder holderUsername = new PlaceHolder(textboxUsername, "Username");
        PlaceHolder holderPass = new PlaceHolder(textboxPassword, "********");
        PlaceHolder holderConPass = new PlaceHolder(textboxConfirmPassword, "********");

    }

    public static boolean matchPassword(String password, String confirmPassword) {
        if (password.equals(confirmPassword)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Confirm Password Not Match");
            return false;
        }
    }

    public static boolean checkStongPassword(String password) {
        if (password.length() >= 8) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Short password are easy to guess,Try one with at least 8 charactors.");
            return false;
        }
    }

    public void reset() {
        textboxName.setText("");
        textboxUsername.setText("");
        textboxPassword.setText("");
        textboxConfirmPassword.setText("");
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonExit = new javax.swing.JLabel();
        button_edit = new javax.swing.JLabel();
        buttonLogin = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textboxUsername = new javax.swing.JTextField();
        textboxName = new javax.swing.JTextField();
        textboxConfirmPassword = new javax.swing.JPasswordField();
        textboxPassword = new javax.swing.JPasswordField();
        buttonSignup = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        imgUp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 520, 240, 50);

        buttonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/bt-close.png"))); // NOI18N
        buttonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonExitMouseClicked(evt);
            }
        });
        getContentPane().add(buttonExit);
        buttonExit.setBounds(980, 10, 30, 30);
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
        buttonLogin.setBounds(640, 530, 250, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/monter_Blue.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 435, 200, 220);

        textboxUsername.setBorder(null);
        textboxUsername.setNextFocusableComponent(textboxPassword);
        getContentPane().add(textboxUsername);
        textboxUsername.setBounds(680, 261, 210, 30);

        textboxName.setBorder(null);
        textboxName.setName(""); // NOI18N
        textboxName.setNextFocusableComponent(textboxUsername);
        getContentPane().add(textboxName);
        textboxName.setBounds(680, 220, 210, 30);

        textboxConfirmPassword.setBorder(null);
        getContentPane().add(textboxConfirmPassword);
        textboxConfirmPassword.setBounds(680, 349, 210, 30);

        textboxPassword.setBorder(null);
        textboxPassword.setNextFocusableComponent(textboxConfirmPassword);
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

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/BGlogin.png"))); // NOI18N
        BG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BG.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(BG);
        BG.setBounds(0, -1, 1030, 770);

        imgUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/q.png"))); // NOI18N
        imgUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgUpMouseClicked(evt);
            }
        });
        getContentPane().add(imgUp);
        imgUp.setBounds(145, 155, 370, 370);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_buttonExitMouseClicked

    private void buttonSignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSignupMouseClicked
        String name = textboxName.getText();
        String username = textboxUsername.getText();
        String password = String.valueOf(textboxPassword.getPassword());
        String confirmPassword = String.valueOf(textboxConfirmPassword.getPassword());

        if (name.isEmpty() || username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรุณากรอกข้อมูลให้ครบ");
        } else if (fileImg.isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรุณาเลือกรูปประจำตัว");
        } else if (matchPassword(password, confirmPassword) && checkStongPassword(password)) {
            User user = new User(username, name, fileImg, password, confirmPassword);
            JOptionPane.showMessageDialog(null, APIService.register(user));
            reset();
        }

    }//GEN-LAST:event_buttonSignupMouseClicked

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
        fromLogin login = new fromLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonLoginMouseClicked

    private void imgUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgUpMouseClicked
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setDialogTitle("Select an image");
        jfc.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG and JPG images", "png", "jpg");
        jfc.addChoosableFileFilter(filter);

        int returnValue = jfc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            fileImg = jfc.getSelectedFile().getPath();
            System.out.println(fileImg);
            BufferedImage img = null;
            try {
                img = ImageIO.read(new File(fileImg));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            Image dimg = img.getScaledInstance(370, 370, Image.SCALE_SMOOTH);
            imgUp.setIcon(new ImageIcon(dimg));
        }
    }//GEN-LAST:event_imgUpMouseClicked

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
            java.util.logging.Logger.getLogger(fromSingup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fromSingup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fromSingup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fromSingup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new fromSingup().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel buttonExit;
    private javax.swing.JLabel buttonLogin;
    private javax.swing.JLabel buttonSignup;
    private javax.swing.JLabel button_edit;
    private javax.swing.JLabel imgUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField textboxConfirmPassword;
    private javax.swing.JTextField textboxName;
    private javax.swing.JPasswordField textboxPassword;
    private javax.swing.JTextField textboxUsername;
    // End of variables declaration//GEN-END:variables
}
