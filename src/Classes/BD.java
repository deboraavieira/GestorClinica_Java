/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.sql.Connection;
import java.sql.Date;
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
            stat1.setDate(3, (Date) fono.Data_Nascimento);
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
          public Boolean Prontuarios( prontuario pr){
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Connection SQLCnn = DriverManager.getConnection(CONN_STRING, CONN_USER, CONN_PASS);

            System.out.println("Conectado!");

            PreparedStatement stat1 = SQLCnn.prepareStatement("Insert into prontuario (idAgendamento,dataevolucao,evolucao) "
                    + "values(?,?,?,?)");

            stat1.setInt(1, pr.idAgendamento);
            stat1.setDate(2, (Date) pr.dataevolucao);
            stat1.setString(3, pr.evolucao);

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
