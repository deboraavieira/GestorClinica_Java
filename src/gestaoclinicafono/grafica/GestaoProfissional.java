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
public class GestaoProfissional extends javax.swing.JFrame {

            private final String CONN_STRING = "jdbc:mysql://localhost:3306/CliniFono?useLegacyDatetimeCode=false&serverTimezone=UTC";
            private final String CONN_USER = "root";
            private final String CONN_PASS = "Pipoca123!";
    public GestaoProfissional() {
        initComponents();   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        imageAvatar1 = new icon.ImageAvatar();
        jLabel2 = new javax.swing.JLabel();
        jtxtNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtdata = new com.toedter.calendar.JDateChooser();
        jtxt_cpf = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxt_telefone = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxt_email = new javax.swing.JTextField();
        jtxtmorada = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtprocura = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_registar = new javax.swing.JButton();
        btnalterar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablefunc = new javax.swing.JTable();
        btndelete = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtregisto = new javax.swing.JTextField();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestão de Profissionais");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(173, 216, 230));

        imageAvatar1.setImage(new javax.swing.ImageIcon(getClass().getResource("/icon/logo.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");

        jLabel6.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Data de Nascimento:");

        try {
            jtxt_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-## ")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefone:");

        try {
            jtxt_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)######-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("E-mail:");

        jLabel4.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Morada:");

        txtprocura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtprocuraKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Digite aqui para buscar:");

        btn_registar.setBackground(new java.awt.Color(0, 102, 102));
        btn_registar.setFont(new java.awt.Font("PT Serif Caption", 0, 14)); // NOI18N
        btn_registar.setText("Registar");
        btn_registar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registarActionPerformed(evt);
            }
        });

        btnalterar.setBackground(new java.awt.Color(0, 102, 102));
        btnalterar.setFont(new java.awt.Font("PT Serif Caption", 0, 14)); // NOI18N
        btnalterar.setText("Alterar");
        btnalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalterarActionPerformed(evt);
            }
        });

        tablefunc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablefunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablefuncMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablefunc);

        btndelete.setBackground(new java.awt.Color(0, 102, 102));
        btndelete.setFont(new java.awt.Font("PT Serif Caption", 0, 14)); // NOI18N
        btndelete.setText("Apagar");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CPF:");

        jLabel3.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registro:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtmorada, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 427, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtxtdata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtxtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                                .addGap(75, 75, 75)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtregisto, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(230, 230, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(btn_registar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(347, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtprocura, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtregisto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jtxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtdata, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtmorada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprocura, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_registar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_registar, btnalterar, btndelete});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void carregaTabela(){               //carrega os dados já existentes da tabela na bd
        try{
            Connection SQLCnn = DriverManager.getConnection(CONN_STRING, CONN_USER, CONN_PASS);
            System.out.println("Conectado!");
            Statement st = SQLCnn.createStatement();
            ResultSet res = st.executeQuery("Select * from funcionarios;");
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
            String[]columnName = {"Id Fono","Nome","Registro","Data de Nascimento","CPF","E-mail","Telefone","Morada"};
            DefaultTableModel model =(DefaultTableModel)tablefunc.getModel();
            model.setDataVector(rowData,columnName);          
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private void txtprocuraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprocuraKeyReleased
        try{
            Connection SQLCnn = DriverManager.getConnection(CONN_STRING, CONN_USER, CONN_PASS);
            System.out.println("Conectado!");
            Statement st = SQLCnn.createStatement();
            ResultSet res = st.executeQuery("Select * from funcionarios where nome_func like '%"+txtprocura.getText()+"%'");
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
            String[]columnName = {"Id Fono","Nome","Registro","Data de Nascimento","CPF","E-mail","Telefone","Morada"};
            DefaultTableModel model =(DefaultTableModel)tablefunc.getModel();
            model.setDataVector(rowData,columnName);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtprocuraKeyReleased

    private void btn_registarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registarActionPerformed

        String Nome = jtxtNome.getText();
        String Registo = txtregisto.getText();
        Date Data_Nascimento = new Date(jtxtdata.getDate().getTime());
        String CPF = jtxt_cpf.getText();
        String Email = jtxt_email.getText();
        String Telefone = jtxt_telefone.getText();
        String Morada = jtxtmorada.getText();

        try (Connection SQLCnn = DriverManager.getConnection(CONN_STRING, CONN_USER, CONN_PASS)) {
            System.out.println("Conectado!");

            PreparedStatement stat1 = SQLCnn.prepareStatement("INSERT INTO funcionarios (nome_func,registo_func, data_nascFunc, cpf_func, email_func, tel_func, morada_func) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)");

            stat1.setString(1, Nome);
            stat1.setString(2, Registo);
            stat1.setDate(3, new java.sql.Date(Data_Nascimento.getTime()));
            stat1.setString(4, CPF);
            stat1.setString(5, Email);
            stat1.setString(6, Telefone);
            stat1.setString(7, Morada);

            stat1.executeUpdate();

            JOptionPane.showMessageDialog(null, "Fonoaudiólogo(a) inserido(a) com sucesso!");

            // Limpa os campos após a inserção
            jtxtNome.setText("");
            txtregisto.setText("");
            jtxtdata.setDate(null);
            jtxt_cpf.setText("");
            jtxt_email.setText("");
            jtxt_telefone.setText("");
            jtxtmorada.setText("");
            carregaTabela();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao inserir fonoaudiólogo(a): " + e.getMessage());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro na conversão de números: " + e.getMessage());
        }

    }//GEN-LAST:event_btn_registarActionPerformed

    private void btnalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalterarActionPerformed
        if (tablefunc.getSelectedRow() == -1) {         //verifica se algum item da tabela foi selecionado
            JOptionPane.showMessageDialog(null, "Selecione um(uma) fonoaudiólogo(a) para alterar.");
            return;
        }
        if (jtxtdata.getDate() == null) {           //garante que a data seja preenchida
            JOptionPane.showMessageDialog(null, "Por favor, selecione uma data.");
            return;
        }
        // Obtendo o ID do funcionario selecionado
        int idfunc = Integer.parseInt(tablefunc.getValueAt(tablefunc.getSelectedRow(), 0).toString());

        try (Connection SQLCnn = DriverManager.getConnection(CONN_STRING, CONN_USER, CONN_PASS)) {
            String sql = "UPDATE funcionarios SET nome_func = ?,registo_func = ?, data_nascFunc = ?, cpf_func = ?, email_func = ?, tel_func = ?, morada_func = ? WHERE idfunc = ?";

            try (PreparedStatement stat = SQLCnn.prepareStatement(sql)) {
                // Definindo os parâmetros da consulta
                stat.setString(1, jtxtNome.getText());
                stat.setString(2,txtregisto.getText());
                stat.setDate(3, new java.sql.Date(jtxtdata.getDate().getTime()));
                stat.setString(4, jtxt_cpf.getText());
                stat.setString(5, jtxt_email.getText());
                stat.setString(6, jtxt_telefone.getText());
                stat.setString(7, jtxtmorada.getText());
                stat.setInt(8, idfunc);

                int rowsAffected = stat.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Profissional alterado com sucesso!");
                    // Limpa os campos após a alteração
                    jtxtNome.setText("");
                    txtregisto.setText("");
                    jtxtdata.setDate(null);
                    jtxt_cpf.setText("");
                    jtxt_email.setText("");
                    jtxt_telefone.setText("");
                    jtxtmorada.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum profissional foi alterado.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao alterar profissional: " + e.getMessage());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro na conversão de números: " + e.getMessage());
        }
        // Atualiza a tabela após a alteração
        carregaTabela();
    }//GEN-LAST:event_btnalterarActionPerformed

    private void tablefuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablefuncMouseClicked
        try{
            int id = Integer.parseInt(tablefunc.getValueAt(tablefunc.getSelectedRow(),0).toString());
            Connection SQLCnn = DriverManager.getConnection(CONN_STRING, CONN_USER, CONN_PASS);
            System.out.println("Conectado!");
            Statement st = SQLCnn.createStatement();
            ResultSet res = st.executeQuery("Select * from funcionarios where idfunc="+id);
            if(res.next()){
                jtxtNome.setText(res.getString("nome_func"));
                txtregisto.setText(res.getString("registo_func"));
                jtxtdata.setDate(res.getDate("data_nascFunc"));
                jtxt_cpf.setText(res.getString("cpf_func"));
                jtxt_email.setText(res.getString("email_func"));
                jtxt_telefone.setText(res.getString("tel_func"));
                jtxtmorada.setText(res.getString("morada_func"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_tablefuncMouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
            try {
            int id = Integer.parseInt(tablefunc.getValueAt(tablefunc.getSelectedRow(), 0).toString());
            Connection SQLCnn = DriverManager.getConnection(CONN_STRING, CONN_USER, CONN_PASS);
            System.out.println("Conectado!");
            Statement st = SQLCnn.createStatement();
            int r = JOptionPane.showConfirmDialog(this, "Essa ação não poderá ser desfeita, tem certeza que quer realizá-la?");
            if (r == JOptionPane.YES_OPTION) {
                int rowsAffected = st.executeUpdate("DELETE FROM funcionarios WHERE idfunc=" + id);

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Registro excluído com sucesso!");
      
                    formWindowOpened(null); // Recarrega a tabela
                    //limpa campos
                    jtxtNome.setText("");
                    txtregisto.setText("");
                    jtxtdata.setDate(null);
                    jtxt_cpf.setText("");
                    jtxt_email.setText("");
                    jtxt_telefone.setText("");
                    jtxtmorada.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Nenhum registro foi excluído.");
                }
            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       carregaTabela();
       //garante que ao carregar o form, carrega-se os dados da tabela
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(GestaoProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestaoProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestaoProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestaoProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestaoProfissional().setVisible(true);
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jtxtNome;
    private javax.swing.JFormattedTextField jtxt_cpf;
    private javax.swing.JTextField jtxt_email;
    private javax.swing.JFormattedTextField jtxt_telefone;
    private com.toedter.calendar.JDateChooser jtxtdata;
    private javax.swing.JTextField jtxtmorada;
    private javax.swing.JTable tablefunc;
    private javax.swing.JTextField txtprocura;
    private javax.swing.JTextField txtregisto;
    // End of variables declaration//GEN-END:variables
}
