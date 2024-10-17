/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestaoclinicafono.grafica;

import java.awt.Color;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javax.swing.ImageIcon;
/**
 *
 * @author deboravieira
 */
public class JFrameMain extends javax.swing.JFrame {

    private DrawerController  drawer;
    public JFrameMain() {
            Login LoginFrame = new Login();
            LoginFrame.setVisible(true);
        initComponents();
        drawer = Drawer.newDrawer(this)
                .header(new JPanelHeader())
                .space(5)
                .background(new Color(173,216,230))
                .backgroundTransparent(0.3f)
                .duration(300)
                    .enableScroll(true)
                .addChild(new DrawerItem("Início").icon(new ImageIcon(getClass().getResource("/icon/user1.png"))).build())
                .addChild(new DrawerItem("Agenda").icon(new ImageIcon(getClass().getResource("/icon/user1.png"))).build())
                .addChild(new DrawerItem("Prontuário").icon(new ImageIcon(getClass().getResource("/icon/user1.png"))).build())
                .addChild(new DrawerItem("Gestão de Paciente").icon(new ImageIcon(getClass().getResource("/icon/user1.png"))).build())
                .addChild(new DrawerItem("Pagamentos").icon(new ImageIcon(getClass().getResource("/icon/user1.png"))).build())
                
                .addFooter(new DrawerItem("Sair").icon(new ImageIcon(getClass().getResource("/icon/user1.png"))).build())
                
                .build();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_menu.setText("---");
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_menu)
                .addContainerGap(488, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_menu)
                .addContainerGap(552, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        if(drawer.isShow()){
            drawer.hide();
        }else{
            drawer.show();
        }
    }//GEN-LAST:event_btn_menuActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMain().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_menu;
    // End of variables declaration//GEN-END:variables
}
