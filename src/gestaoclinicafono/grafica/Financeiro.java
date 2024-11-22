/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestaoclinicafono.grafica;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deboravieira
 */
public class Financeiro extends javax.swing.JFrame {
    
        private final String CONN_STRING = "jdbc:mysql://localhost:3306/CliniFono?useLegacyDatetimeCode=false&serverTimezone=UTC";
        private final String CONN_USER = "root";
        private final String CONN_PASS = "Pipoca123!";
       
    public Financeiro(){
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

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableservico = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnomeserv = new javax.swing.JTextField();
        txtvalorserv = new javax.swing.JTextField();
        btn_alterar = new javax.swing.JButton();
        btn_novo = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        imageAvatar1 = new icon.ImageAvatar();
        txtidserv = new javax.swing.JTextField();
        txtProcura = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtfreqpag = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Financeiro");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(173, 216, 230));

        tableservico.setBackground(new java.awt.Color(224, 244, 244));
        tableservico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableservico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableservicoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableservico);

        jLabel1.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Id Serviço:");

        jLabel2.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nome do Serviço:");

        jLabel3.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Valor do Serviço:");

        jLabel4.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Frequência de Pagamento:");

        txtnomeserv.setFont(new java.awt.Font("PT Serif Caption", 0, 12)); // NOI18N

        txtvalorserv.setFont(new java.awt.Font("PT Serif Caption", 0, 12)); // NOI18N

        btn_alterar.setBackground(new java.awt.Color(0, 102, 102));
        btn_alterar.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btn_alterar.setText("Alterar");
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        btn_novo.setBackground(new java.awt.Color(0, 102, 102));
        btn_novo.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(0, 102, 102));
        btn_delete.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btn_delete.setText("Apagar");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        imageAvatar1.setImage(new javax.swing.ImageIcon(getClass().getResource("/icon/logo.jpg"))); // NOI18N

        txtProcura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProcuraKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Buscar:");

        txtfreqpag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diário", "Quinzenal", "Semanal", "Mensal" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtnomeserv, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                    .addComponent(txtvalorserv, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                    .addComponent(txtidserv, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfreqpag, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtProcura, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_novo)
                        .addGap(26, 26, 26)
                        .addComponent(btn_alterar)
                        .addGap(29, 29, 29)
                        .addComponent(btn_delete)
                        .addGap(187, 187, 187)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProcura, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtidserv)))
                    .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnomeserv, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtvalorserv, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtfreqpag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_delete)
                    .addComponent(btn_alterar)
                    .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_alterar, btn_delete, btn_novo});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
       
            int idservico = Integer.parseInt(txtidserv.getText());
            String tipo_servico = txtnomeserv.getText();
            double valor_servico = Double.parseDouble(txtvalorserv.getText());
            String freq_pagamento = (String) txtfreqpag.getSelectedItem();
        try{
            Connection SQLCnn = DriverManager.getConnection(CONN_STRING, CONN_USER, CONN_PASS);
            System.out.println("Conectado!");
            PreparedStatement stat1 = SQLCnn.prepareStatement("Insert into servico (idservico,tipo_servico,valor_servico,freq_pagamento) "
                    + "values(?,?,?,?)");

            stat1.setInt(1,idservico);
            stat1.setString(2,tipo_servico);
            stat1.setDouble(3,valor_servico);
            stat1.setString(4,freq_pagamento);

            stat1.executeUpdate();

            
            stat1.close();        
            SQLCnn.close();
            
            
       }catch(SQLException e){
       }
        txtidserv.setText("");
        txtnomeserv.setText("");
        txtvalorserv.setText("");
        txtfreqpag.setSelectedIndex(0);
        carregaTabela();
    }//GEN-LAST:event_btn_novoActionPerformed

    private void tableservicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableservicoMouseClicked
        try{
            int id = Integer.parseInt(tableservico.getValueAt(tableservico.getSelectedRow(),0).toString());
            Connection SQLCnn = DriverManager.getConnection(CONN_STRING, CONN_USER, CONN_PASS);
            System.out.println("Conectado!");
            Statement st = SQLCnn.createStatement();
            ResultSet res = st.executeQuery("Select * from servico where idservico="+id);
            if(res.next()){
                txtidserv.setText(res.getString("idservico"));
                txtnomeserv.setText(res.getString("tipo_servico"));
                txtvalorserv.setText(res.getString("valor_servico"));
                String freqPag = res.getString("freq_pagamento");
                 txtfreqpag.setSelectedItem(freqPag);
            }           
        }catch(NumberFormatException | SQLException e){
        }
    }//GEN-LAST:event_tableservicoMouseClicked
    private void carregaTabela(){
        try{
            Connection SQLCnn = DriverManager.getConnection(CONN_STRING, CONN_USER, CONN_PASS);
            System.out.println("Conectado!");
            Statement st = SQLCnn.createStatement();
            ResultSet res = st.executeQuery("Select * from servico;");
            res.last();
            int row= res.getRow();
            int col= res.getMetaData().getColumnCount();
            res.beforeFirst();
            String rowData[][] = new String[row][col];
            int r = 0;
            while(res.next()){
                for(int i = 0;i<col;i++){
                    rowData[r][i] = res.getString(i+1);
                }
                r++;
            }
            String[]columnName = {"Id Serviço","Nome Serviço","Valor Serviço","Freq.Pagamento"};
            DefaultTableModel model =(DefaultTableModel)tableservico.getModel();
            model.setDataVector(rowData,columnName);          
        }catch(SQLException e){
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        carregaTabela();
    }//GEN-LAST:event_formWindowOpened

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        
        int id = Integer.parseInt(tableservico.getValueAt(tableservico.getSelectedRow(),0).toString());
        try{
            Connection SQLCnn = DriverManager.getConnection(CONN_STRING, CONN_USER, CONN_PASS);
            System.out.println("Conectado!");
            Statement st = SQLCnn.createStatement();
            int r = JOptionPane.showConfirmDialog(this,"Essa ação não poderá ser desfeita, tem certeza que quer realizá-la?");
            if(r==0){
            if(!st.execute("Delete from servico where idservico="+id)){
                formWindowOpened(null);
            }
        
            } 
        }catch(HeadlessException | SQLException e){
        }
        txtidserv.setText("");
        txtnomeserv.setText("");
        txtvalorserv.setText("");
        txtfreqpag.setSelectedIndex(0);
        carregaTabela();
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        try{
            int id = Integer.parseInt(tableservico.getValueAt(tableservico.getSelectedRow(),0).toString());
            Connection SQLCnn = DriverManager.getConnection(CONN_STRING, CONN_USER, CONN_PASS);
            System.out.println("Conectado!");
            Statement st = SQLCnn.createStatement();
            st.execute("UPDATE servico SET idservico='" + txtidserv.getText() + 
               "', tipo_servico='" + txtnomeserv.getText() + 
               "', valor_servico='" + txtvalorserv.getText() + 
               "', freq_pagamento='" + txtfreqpag.getSelectedItem() +
               "' WHERE idservico=" + id);
                    
        }catch(NumberFormatException | SQLException e){
        }
        txtidserv.setText("");
        txtnomeserv.setText("");
        txtvalorserv.setText("");
        txtfreqpag.setSelectedIndex(0);
        carregaTabela();
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void txtProcuraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProcuraKeyReleased
       try{
            Connection SQLCnn = DriverManager.getConnection(CONN_STRING, CONN_USER, CONN_PASS);
            System.out.println("Conectado!");
            Statement st = SQLCnn.createStatement();
            ResultSet res = st.executeQuery("Select * from servico where tipo_servico like '%"+txtProcura.getText()+"%'");
            res.last();
            int row= res.getRow();
            int col= res.getMetaData().getColumnCount();
            res.beforeFirst();
            String rowData[][] = new String[row][col];
            int r = 0;
            while(res.next()){
                for(int i = 0;i<col;i++){
                    rowData[r][i] = res.getString(i+1);
                }
                r++;
            }
            String[]columnName = {"Id Serviço","Nome Serviço","Valor Serviço","Freq.Pagamento"};
            DefaultTableModel model =(DefaultTableModel)tableservico.getModel();
            model.setDataVector(rowData,columnName);          
        }catch(SQLException e){
        }
    }//GEN-LAST:event_txtProcuraKeyReleased

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
            java.util.logging.Logger.getLogger(Financeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Financeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Financeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Financeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Financeiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_novo;
    private icon.ImageAvatar imageAvatar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableservico;
    private javax.swing.JTextField txtProcura;
    private javax.swing.JComboBox<String> txtfreqpag;
    private javax.swing.JTextField txtidserv;
    private javax.swing.JTextField txtnomeserv;
    private javax.swing.JTextField txtvalorserv;
    // End of variables declaration//GEN-END:variables
}
