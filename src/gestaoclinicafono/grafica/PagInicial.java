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


public class PagInicial extends javax.swing.JFrame {
 String user;

 private DrawerController  drawer;
 private DrawerItem inicioItem = new DrawerItem("Início").icon(new ImageIcon(getClass().getResource("/icon/user32.png"))).build();
 private DrawerItem agendaItem = new DrawerItem("Agenda").icon(new ImageIcon(getClass().getResource("/icon/contact32.png"))).build();
 private DrawerItem prontuarioItem = new DrawerItem("Prontuário").icon(new ImageIcon(getClass().getResource("/icon/pront32.png"))).build();
 private DrawerItem gestaopacItem = new DrawerItem("Gestão de Paciente").icon(new ImageIcon(getClass().getResource("/icon/gp32.png"))).build();
 private DrawerItem gestaofItem = new DrawerItem("Gestão de Profissional").icon(new ImageIcon(getClass().getResource("/icon/gfn32.png"))).build();
 private DrawerItem pagItem = new DrawerItem("Financeiro").icon(new ImageIcon(getClass().getResource("/icon/financial32.png"))).build();
 private DrawerItem sairItem = new DrawerItem("Sair").icon(new ImageIcon(getClass().getResource("/icon/exitn32.png"))).build();
 
    public PagInicial(String user) {
        this.user = user;
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
                 Agendamentos Agendamento = new Agendamentos();
                    Agendamento.setVisible(true);   
                }
            
});
          prontuarioItem.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                 Prontuarios jfpro = new Prontuarios();
                    jfpro.setVisible(true);   
                }
            
});
           gestaopacItem.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                 GestaoPaciente jrp1 = new GestaoPaciente();
                    jrp1.setVisible(true);   
                }
            
});
            gestaofItem.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(user.contains("admin")){
                        GestaoProfissional jrf1 = new GestaoProfissional();
                        jrf1.setVisible(true);
                    }else{
                        GestaoProfissional jrf1 = new GestaoProfissional();
                        jrf1.setVisible(false);
                    }
                }
            
});
             pagItem.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                 if(user.contains("admin")){   
                    Financeiro Financeiro = new Financeiro();  
                    Financeiro.setVisible(true);
                 }else{
                    Financeiro Financeiro = new Financeiro();  
                    Financeiro.setVisible(false);
                 }
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Página Inicial");

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

        jLabel1.setFont(new java.awt.Font("Charter", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Seja bem vindo(a)!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_menu)
                .addGap(191, 191, 191)
                .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(258, 258, 258))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_menu)
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
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

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_menu;
    private com.toedter.calendar.JCalendar calendario;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
