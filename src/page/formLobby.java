/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page;
import com.fasterxml.jackson.databind.ObjectMapper;
import helpers.Img;
import io.socket.client.Ack;
import io.socket.emitter.Emitter;
import java.awt.Color;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import layout.UserListItem;
import model.User;
import service.SocketService;
/**
 *
 * @author MYSNACK
 */
public class formLobby extends javax.swing.JFrame {

    /**
     * Creates new form fromLobby
     */
    
    private int xMouse,yMouse;
    
    private User user;
    private SocketService server;
    public formLobby() {
        initComponents();
        jPanel2.setBackground(new Color(0,0,0,0));
        jPanel1.setBackground(new Color(0,0,0,0));
        
    }

    public formLobby(User userl) {
        initComponents();
        jPanel2.setBackground(new Color(0,0,0,0));
        jPanel1.setBackground(new Color(0,0,0,0));
        this.user = userl;
        this.imgProfile.setText("");
        try {
            this.imgProfile.setIcon(new ImageIcon(Img.resize(Img.circle(new URL(this.user.getTemp())), 150, 150)));
        } catch (MalformedURLException ex) {
            Logger.getLogger(formLobby.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(formLobby.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.nameDisplay.setText(this.user.getName().substring(0,1).toUpperCase()+""+this.user.getName().substring(1).toLowerCase());
        server = new SocketService(user.getId());
        server.getSocket().on("reloadUserOnline", new Emitter.Listener() {
            @Override
            public void call(Object... os) {
                userOlineList.removeAll();
                userOlineList.revalidate();
                userOlineList.repaint();
                ObjectMapper mapper = new ObjectMapper();
                try {
                    User[] userArr = mapper.readValue(os[0].toString(), User[].class);
                    int y = 0;
                    for(User userItem : userArr){
                        System.out.println("User : "+userItem.getUsername());
                        if(!userItem.getId().equals(user.getId())){
                            userOlineList.add(new UserListItem(userItem,0,y));
                            y+=50;
                            userOlineList.revalidate();
                            userOlineList.repaint();
                        }
                        
                    }
                    
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                
            }
        });
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        userOlineList = new javax.swing.JPanel();
        nameDisplay = new javax.swing.JLabel();
        imgProfile = new javax.swing.JLabel();
        TAB = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        button_close = new javax.swing.JLabel();
        BT_Scan = new javax.swing.JLabel();
        BT_Quick_Play = new javax.swing.JLabel();
        BG_Lobby = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setUndecorated(true);
        getContentPane().setLayout(null);

        userOlineList.setOpaque(false);
        userOlineList.setLayout(null);
        getContentPane().add(userOlineList);
        userOlineList.setBounds(36, 210, 210, 310);

        nameDisplay.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nameDisplay.setForeground(new java.awt.Color(255, 255, 255));
        nameDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameDisplay.setText("Name");
        getContentPane().add(nameDisplay);
        nameDisplay.setBounds(385, 180, 280, 30);

        imgProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgProfile.setText("ImgProfile");
        getContentPane().add(imgProfile);
        imgProfile.setBounds(450, 20, 150, 150);

        TAB.setFont(new java.awt.Font("PSL Omyim", 0, 24)); // NOI18N
        TAB.addTab("HISTORY", jPanel1);

        jLabel1.setText("sdfsdfsdffffffffffffffffffffffffffffffff");
        jPanel2.add(jLabel1);

        TAB.addTab("RANKING", jPanel2);

        getContentPane().add(TAB);
        TAB.setBounds(800, 60, 200, 500);

        button_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/bt-close.png"))); // NOI18N
        button_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_closeMouseClicked(evt);
            }
        });
        getContentPane().add(button_close);
        button_close.setBounds(980, 10, 30, 30);

        BT_Scan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Icon_Scan_1.png"))); // NOI18N
        BT_Scan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_ScanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_ScanMouseExited(evt);
            }
        });
        getContentPane().add(BT_Scan);
        BT_Scan.setBounds(220, 160, 30, 40);

        BT_Quick_Play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/bt_QuickPlay_1.png"))); // NOI18N
        BT_Quick_Play.setLabelFor(BT_Quick_Play);
        BT_Quick_Play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_Quick_PlayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_Quick_PlayMouseExited(evt);
            }
        });
        getContentPane().add(BT_Quick_Play);
        BT_Quick_Play.setBounds(380, 630, 320, 80);

        BG_Lobby.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/BG_Home.png"))); // NOI18N
        BG_Lobby.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BG_LobbyMouseDragged(evt);
            }
        });
        BG_Lobby.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BG_LobbyMousePressed(evt);
            }
        });
        getContentPane().add(BG_Lobby);
        BG_Lobby.setBounds(0, -10, 1030, 790);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BT_Quick_PlayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Quick_PlayMouseEntered
       ImageIcon img = new ImageIcon(this.getClass().getResource("../imgs/bt_QuickPlay_2.png"));
       BT_Quick_Play.setIcon(img);
    }//GEN-LAST:event_BT_Quick_PlayMouseEntered

    private void BT_Quick_PlayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Quick_PlayMouseExited
        ImageIcon img = new ImageIcon(this.getClass().getResource("../imgs/bt_QuickPlay_1.png"));
       BT_Quick_Play.setIcon(img);
    }//GEN-LAST:event_BT_Quick_PlayMouseExited

    private void BT_ScanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_ScanMouseEntered
        ImageIcon img = new ImageIcon(this.getClass().getResource("../imgs/Icon_Scan_2.png"));
       BT_Scan.setIcon(img);
    }//GEN-LAST:event_BT_ScanMouseEntered

    private void BT_ScanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_ScanMouseExited
         ImageIcon img = new ImageIcon(this.getClass().getResource("../imgs/Icon_Scan_1.png"));
       BT_Scan.setIcon(img);
    }//GEN-LAST:event_BT_ScanMouseExited

    private void button_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_button_closeMouseClicked

    private void BG_LobbyMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BG_LobbyMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_BG_LobbyMouseDragged

    private void BG_LobbyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BG_LobbyMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BG_LobbyMousePressed

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
            java.util.logging.Logger.getLogger(formLobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formLobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formLobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formLobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formLobby().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG_Lobby;
    private javax.swing.JLabel BT_Quick_Play;
    private javax.swing.JLabel BT_Scan;
    private javax.swing.JTabbedPane TAB;
    private javax.swing.JLabel button_close;
    private javax.swing.JLabel imgProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nameDisplay;
    private javax.swing.JPanel userOlineList;
    // End of variables declaration//GEN-END:variables
}
