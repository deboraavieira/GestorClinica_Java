/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author deboravieira
 */
public class Profissional extends Pessoa {

    private String Registo;

    public static ArrayList<Profissional> listaProfissionais = new ArrayList<>();

    public String getRegisto() {
        return Registo;

    }
    public void setRegisto(String registo) {
        Registo = registo;
    }

    public Profissional(String n, String registo, String email) {
        Nome = n;
        Registo = registo;
        Email = email;

    }
    
}
