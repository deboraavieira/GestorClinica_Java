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
public class Paciente extends Pessoa {

    private long CPF;

    public static ArrayList<Paciente> listaPacientes = new ArrayList<>();

    public long getCPF() {
        return CPF;

    }
    public void setCPF(long cpf) {
        CPF = cpf;
    }

    public Paciente(String n, long cpf, String email) {
        Nome = n;
        CPF = cpf;
        Email = email;

    }
}
