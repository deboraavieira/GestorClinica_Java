/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**
 *
 * @author deboravieira
 */
public class Pessoa {
    protected String Nome;
    protected Date Data_Nascimento;
    protected String Morada;
    protected String Email;
    protected String Telefone;
    protected String CPF;
    
    public String getNome(){
        return Nome;
    }
    public void setNome(String n){
        Nome = n;
    }
    public Date getData_Nascimento(){
        return Data_Nascimento;
    }
    public void setData_Nascimento(Date data_Nascimento) {
        this.Data_Nascimento = data_Nascimento;
    }

    public String getEmail(){
        return Email;
    }
    public void setEmail(String email){
        Email = email;
    }
    public String getTelefone(){
        return Telefone;
    }
    public void setTelefone(String tel){
        Telefone = tel;
    }
    public Pessoa(String n){
        Nome = n;   
    }
    public String getMorada(){
        return Morada;
    }
    public void setMorada(String m){
        Morada = m;
    }
    public String getCPF(){
        return CPF;
    }
    public void setCPF(String cpf){
        CPF = cpf;
    }

    
    public Pessoa(){
        Nome = "";
        Email = "";
    }
}
