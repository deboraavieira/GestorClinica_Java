/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projfinal;

import gestaoclinicafono.grafica.Financeiro;
import gestaoclinicafono.grafica.JFrameMain;
import gestaoclinicafono.grafica.Login;
import gestaoclinicafono.grafica.Prontuarios;
import gestaoclinicafono.grafica.RegistaFono;
import gestaoclinicafono.grafica.RegistaPaciente;

/**
 *
 * @author deboravieira
 */
public class projFinal {
    public static void main(String[]args){

            
            Login LoginFrame = new Login();
            LoginFrame.setVisible(true);
            
            JFrameMain jfm2=new JFrameMain();
            jfm2.setVisible(true);
            
            RegistaPaciente jrp1 = new RegistaPaciente();
            jrp1.setVisible(true);
            
            RegistaFono jrf1 = new RegistaFono();
            jrf1.setVisible(true);
            
            Prontuarios jfpro = new Prontuarios();
            jfpro.setVisible(true);
            
            Financeiro Financeiro = new Financeiro();
            Financeiro.setVisible(true);
            
        } 
    
}
