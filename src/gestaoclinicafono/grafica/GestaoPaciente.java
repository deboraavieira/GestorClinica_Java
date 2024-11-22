/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestaoclinicafono.grafica;
import java.awt.HeadlessException;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deboravieira
 */
public class GestaoPaciente extends javax.swing.JFrame {

        private final String CONN_STRING = "jdbc:mysql://localhost:3306/CliniFono?useLegacyDatetimeCode=false&serverTimezone=UTC";
        private final String CONN_USER = "root";
        private final String CONN_PASS = "Pipoca123!";
    
    public GestaoPaciente() {
        initComponents();
    }
    @SuppressWarnings("null")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imageAvatar1 = new icon.ImageAvatar();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtxtNome = new javax.swing.JTextField();
        jtxt_email = new javax.swing.JTextField();
        btn_registar = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jtxt_cpf = new javax.swing.JFormattedTextField();
        jtxt_telefone = new javax.swing.JFormattedTextField();
        jtxtmorada = new javax.swing.JTextField();
        btnalterar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablepac = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtprocura = new javax.swing.JTextField();
        jtxtdata = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestão de Pacientes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(173, 216, 230));

        imageAvatar1.setImage(new javax.swing.ImageIcon(getClass().getResource("/icon/logo.jpg"))); // NOI18N

        jLabel2.setText("Nome:");
        jLabel2.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("CPF:");
        jLabel3.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Morada:");
        jLabel4.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("E-mail:");
        jLabel5.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Data de Nascimento:");
        jLabel6.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setText("Telefone:");
        jLabel7.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));

        btn_registar.setBackground(new java.awt.Color(0, 102, 102));
        btn_registar.setFont(new java.awt.Font("PT Serif Caption", 0, 14)); // NOI18N
        btn_registar.setText("Registar");
        btn_registar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registarActionPerformed(evt);
            }
        });

        btndelete.setBackground(new java.awt.Color(0, 102, 102));
        btndelete.setFont(new java.awt.Font("PT Serif Caption", 0, 14)); // NOI18N
        btndelete.setText("Apagar");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        try {
            jtxt_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-## ")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jtxt_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)######-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnalterar.setBackground(new java.awt.Color(0, 102, 102));
        btnalterar.setFont(new java.awt.Font("PT Serif Caption", 0, 14)); // NOI18N
        btnalterar.setText("Alterar");
        btnalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalterarActionPerformed(evt);
            }
        });

        tablepac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablepac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablepacMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablepac);

        jLabel1.setText("Digite aqui para buscar:");
        jLabel1.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        txtprocura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtprocuraKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 118, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_registar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btnalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(200, 200, 200))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtprocura, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addGap(8, 8, 8))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtxt_email)
                                        .addComponent(jtxtmorada, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))
                                    .addComponent(jtxt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(200, 200, 200))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtdata, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(291, 291, 291))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtmorada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtprocura, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnalterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_registar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void carregaTabela(){
        try{
            Connection SQLCnn = DriverManager.getConnection(CONN_STRING, CONN_USER, CONN_PASS);
            System.out.println("Conectado!");
            Statement st = SQLCnn.createStatement();
            ResultSet res = st.executeQuery("Select * from pacientes;");
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
            String[]columnName = {"Id Paciente","Nome","Data de Nascimento","CPF","E-mail","Telefone","Morada"};
            DefaultTableModel model =(DefaultTableModel)tablepac.getModel();
            model.setDataVector(rowData,columnName);          
        }catch(SQLException e){
        }
    }
    private void btn_registarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registarActionPerformed
      
                String Nome = jtxtNome.getText();
                Date Data_Nascimento = new Date(jtxtdata.getDate().getTime());
                String CPF = jtxt_cpf.getText();
                String Email = jtxt_email.getText();
                String Telefone = jtxt_telefone.getText();
                String Morada = jtxtmorada.getText();

            try (Connection SQLCnn = DriverManager.getConnection(CONN_STRING, CONN_USER, CONN_PASS)) {
                System.out.println("Conectado!");

                PreparedStatement stat1 = SQLCnn.prepareStatement("INSERT INTO pacientes (nome_pac, data_nasc, cpf_pac, email_pac, tel_pac, morada_pac)"
                        + " VALUES (?, ?, ?, ?, ?, ?)");

                stat1.setString(1, Nome);
                stat1.setDate(2, new java.sql.Date(Data_Nascimento.getTime())); 
                stat1.setString(3, CPF);
                stat1.setString(4, Email);
                stat1.setString(5, Telefone);
                stat1.setString(6, Morada);

                stat1.executeUpdate();

                JOptionPane.showMessageDialog(null, "Paciente inserido com sucesso!");

                // Limpa os campos após a inserção
                jtxtNome.setText("");
                jtxtdata.setDate(null);
                jtxt_cpf.setText("");
                jtxt_email.setText("");
                jtxt_telefone.setText("");
                jtxtmorada.setText("");
                carregaTabela();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir paciente: " + e.getMessage());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro na conversão de números: " + e.getMessage());
        }
                                     

    }//GEN-LAST:event_btn_registarActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        try {
            int id = Integer.parseInt(tablepac.getValueAt(tablepac.getSelectedRow(), 0).toString());
            Connection SQLCnn = DriverManager.getConnection(CONN_STRING, CONN_USER, CONN_PASS);
            System.out.println("Conectado!");
            Statement st = SQLCnn.createStatement();

            int r = JOptionPane.showConfirmDialog(this, "Essa ação não poderá ser desfeita, tem certeza que quer realizá-la?");
            if (r == JOptionPane.YES_OPTION) {
                int rowsAffected = st.executeUpdate("DELETE FROM pacientes WHERE idpaciente=" + id);

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Registro excluído com sucesso!");
                        //limpa os campos
                        jtxtNome.setText("");
                        jtxtdata.setDate(null);
                        jtxt_cpf.setText("");
                        jtxt_email.setText("");
                        jtxt_telefone.setText("");
                        jtxtmorada.setText("");
                    formWindowOpened(null); // Recarrega a tabela
                } else {
                    JOptionPane.showMessageDialog(this, "Nenhum registro foi excluído.");
                }
            }

        } catch (HeadlessException | NumberFormatException | SQLException e) {
        }


    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalterarActionPerformed
            if (tablepac.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Selecione um paciente para alterar.");
                return;
            }
            if (jtxtdata.getDate() == null) {
                JOptionPane.showMessageDialog(null, "Por favor, selecione uma data.");
                return;
            }
            // Obtendo o ID do paciente selecionado
            int idPaciente = Integer.parseInt(tablepac.getValueAt(tablepac.getSelectedRow(), 0).toString());

            try (Connection SQLCnn = DriverManager.getConnection(CONN_STRING, CONN_USER, CONN_PASS)) {
                String sql = "UPDATE pacientes SET nome_pac = ?, data_nasc = ?, cpf_pac = ?, email_pac = ?, tel_pac = ?, morada_pac = ? WHERE idpaciente = ?";
                try (PreparedStatement stat = SQLCnn.prepareStatement(sql)) {
                    // Definindo os parâmetros da consulta
                    stat.setString(1, jtxtNome.getText());
                    stat.setDate(2, new java.sql.Date(jtxtdata.getDate().getTime())); 
                    stat.setString(3, jtxt_cpf.getText());
                    stat.setString(4, jtxt_email.getText());
                    stat.setString(5, jtxt_telefone.getText());
                    stat.setString(6, jtxtmorada.getText());
                    stat.setInt(7, idPaciente); 

                    int rowsAffected = stat.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Paciente alterado com sucesso!");
                        // Limpa os campos após a alteração
                        jtxtNome.setText("");
                        jtxtdata.setDate(null);
                        jtxt_cpf.setText("");
                        jtxt_email.setText("");
                        jtxt_telefone.setText("");
                        jtxtmorada.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Nenhum paciente foi alterado.");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao alterar paciente: " + e.getMessage());
            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro na conversão de números: " + e.getMessage());
            }
            // Atualiza a tabela após a alteração
            carregaTabela();
    }//GEN-LAST:event_btnalterarActionPerformed

    private void tablepacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablepacMouseClicked
        try{
            int id = Integer.parseInt(tablepac.getValueAt(tablepac.getSelectedRow(),0).toString());
            Connection SQLCnn = DriverManager.getConnection(CONN_STRING, CONN_USER, CONN_PASS);
            System.out.println("Conectado!");
            Statement st = SQLCnn.createStatement();
            ResultSet res = st.executeQuery("Select * from pacientes where idpaciente="+id);
            if(res.next()){
                jtxtNome.setText(res.getString("nome_pac"));
                jtxtdata.setDate(res.getDate("data_nasc"));
                jtxt_cpf.setText(res.getString("cpf_pac"));
                jtxt_email.setText(res.getString("email_pac"));
                jtxt_telefone.setText(res.getString("tel_pac"));
                jtxtmorada.setText(res.getString("morada_pac"));
            }           
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_tablepacMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         carregaTabela();
    }//GEN-LAST:event_formWindowOpened

    private void txtprocuraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprocuraKeyReleased
        try{
            Connection SQLCnn = DriverManager.getConnection(CONN_STRING, CONN_USER, CONN_PASS);
            System.out.println("Conectado!");
            Statement st = SQLCnn.createStatement();
            ResultSet res = st.executeQuery("Select * from pacientes where nome_pac like '%"+txtprocura.getText()+"%'");
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
            String[]columnName = {"Id Paciente","Nome","Data de Nascimento","CPF","E-mail","Telefone","Morada"};
            DefaultTableModel model =(DefaultTableModel)tablepac.getModel();
            model.setDataVector(rowData,columnName);          
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtprocuraKeyReleased

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
            java.util.logging.Logger.getLogger(GestaoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestaoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestaoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestaoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestaoPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registar;
    private javax.swing.JButton btnalterar;
    private javax.swing.JButton btndelete;
    private icon.ImageAvatar imageAvatar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jtxtNome;
    private javax.swing.JFormattedTextField jtxt_cpf;
    private javax.swing.JTextField jtxt_email;
    private javax.swing.JFormattedTextField jtxt_telefone;
    private com.toedter.calendar.JDateChooser jtxtdata;
    private javax.swing.JTextField jtxtmorada;
    private javax.swing.JTable tablepac;
    private javax.swing.JTextField txtprocura;
    // End of variables declaration//GEN-END:variables
}
