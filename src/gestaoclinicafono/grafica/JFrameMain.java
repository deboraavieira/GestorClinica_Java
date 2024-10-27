/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestaoclinicafono.grafica;


import java.awt.Color;
import javax.swing.ImageIcon;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import java.awt.event.*;


/*
 *
 * @author deboravieira
 */


public class JFrameMain extends javax.swing.JFrame {

 private DrawerController  drawer;
 private DrawerItem inicioItem = new DrawerItem("Início").icon(new ImageIcon(getClass().getResource("/icon/user1.png"))).build();
 private DrawerItem agendaItem = new DrawerItem("Agenda").icon(new ImageIcon(getClass().getResource("/icon/user1.png"))).build();
 private DrawerItem prontuarioItem = new DrawerItem("Prontuário").icon(new ImageIcon(getClass().getResource("/icon/user1.png"))).build();
 private DrawerItem gestaopacItem = new DrawerItem("Gestão de Paciente").icon(new ImageIcon(getClass().getResource("/icon/user1.png"))).build();
 private DrawerItem gestaofItem = new DrawerItem("Gestão de Profissional").icon(new ImageIcon(getClass().getResource("/icon/user1.png"))).build();
  private DrawerItem pagItem = new DrawerItem("Financeiro").icon(new ImageIcon(getClass().getResource("/icon/user1.png"))).build();
  private DrawerItem sairItem = new DrawerItem("Sair").icon(new ImageIcon(getClass().getResource("/icon/user1.png"))).build();
 
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
                .addChild(inicioItem)
                .addChild(agendaItem)
                .addChild(prontuarioItem)
                .addChild(gestaopacItem)
                .addChild(gestaofItem)
                .addChild(pagItem)
                
                .addFooter(sairItem)
                .build();
        
        inicioItem.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
});
         agendaItem.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                 System.exit(0);   
                }
            
});
          prontuarioItem.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                 System.exit(0);   
                }
            
});
           gestaopacItem.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                 System.exit(0);   
                }
            
});
            gestaofItem.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                 System.exit(0);   
                }
            
});
             pagItem.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                 System.exit(0);   
                }
            
});
        sairItem.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                 System.exit(0);   
                }
            
});
        
    }
  
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_menu = new javax.swing.JButton();
        calendario = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxt_dia = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_menu.setFont(btn_menu.getFont().deriveFont(btn_menu.getFont().getStyle() | java.awt.Font.BOLD, btn_menu.getFont().getSize()+5));
        btn_menu.setText("|||");
        btn_menu.setToolTipText("");
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });

        calendario.setBackground(new java.awt.Color(208, 244, 240));
        calendario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(69, 163, 162), 1, true));

        jtxt_dia.setColumns(20);
        jtxt_dia.setRows(5);
        jScrollPane1.setViewportView(jtxt_dia);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_menu)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 239, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(calendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE))
                        .addGap(116, 116, 116))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_menu)
                .addGap(26, 26, 26)
                .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
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
    private com.toedter.calendar.JCalendar calendario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtxt_dia;
    // End of variables declaration//GEN-END:variables
}
