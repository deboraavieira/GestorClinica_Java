/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author deboravieira
 */
public class BD {
    private final String CONN_STRING = "jdbc:mysql://localhost:3306/CliniFono?useLegacyDatetimeCode=false&serverTimezone=UTC";
    private final String CONN_USER = "root";
    private final String CONN_PASS = "Pipoca123!";
    
    public Boolean RegistaPaciente(Pessoa pac){
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Connection SQLCnn = DriverManager.getConnection(CONN_STRING, CONN_USER, CONN_PASS);

            System.out.println("Conectado!");

            PreparedStatement stat1 = SQLCnn.prepareStatement("Insert into pacientes (nome_pac,data_nasc,cpf_pac,email_pac,tel_pac,morada_pac) "
                    + "values(?,?,?,?,?,?)");

            stat1.setString(1, pac.Nome);
            stat1.setString(2, pac.Data_Nascimento);
            stat1.setString(3, pac.CPF);
            stat1.setString(4, pac.Email);
            stat1.setString(5, pac.Telefone);
            stat1.setString(6, pac.Morada);
            stat1.executeUpdate();

            stat1.close();
            SQLCnn.close();

        } catch (SQLException ex) {
            System.out.println("Erro!" + ex);
            return false;
        }
        return true;
    }
    public Boolean RegistaFono(Profissional fono){
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Connection SQLCnn = DriverManager.getConnection(CONN_STRING, CONN_USER, CONN_PASS);

            System.out.println("Conectado!");

            PreparedStatement stat1 = SQLCnn.prepareStatement("Insert into funcionarios "
                    + "(nome_func,registo_func,data_nascFunc,cpf_func,email_func,tel_func,morada_func) "
                    + "values(?,?,?,?,?,?,?)");

            stat1.setString(1, fono.Nome);
            stat1.setString(2, fono.Registo);
            stat1.setString(3, fono.Data_Nascimento);
            stat1.setString(4, fono.CPF);
            stat1.setString(5, fono.Email);
            stat1.setString(6, fono.Telefone);
            stat1.setString(7, fono.Morada);
            stat1.executeUpdate();

            stat1.close();
            SQLCnn.close();

        } catch (SQLException ex) {
            System.out.println("Erro!" + ex);
            return false;
        }
        return true;
    }
    
     public Boolean Financeiro(financeiro pag){
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Connection SQLCnn = DriverManager.getConnection(CONN_STRING, CONN_USER, CONN_PASS);

            System.out.println("Conectado!");

            PreparedStatement stat1 = SQLCnn.prepareStatement("Insert into servico (idservico,tipo_servico,valor_servico,freq_pagamento) "
                    + "values(?,?,?,?)");

            stat1.setInt(1, pag.idservico);
            stat1.setString(2, pag.tipo_servico);
            stat1.setDouble(3, pag.valor_servico);
            stat1.setString(4, pag.freq_pagamento);

            stat1.executeUpdate();

            stat1.close();
            SQLCnn.close();

        } catch (SQLException ex) {
            System.out.println("Erro!" + ex);
            return false;
        }
        return true;
}
}
