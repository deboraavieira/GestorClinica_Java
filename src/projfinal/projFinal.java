/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projfinal;

import gestaoclinicafono.grafica.JFrameMain;
import gestaoclinicafono.grafica.Login;
import gestaoclinicafono.grafica.RegistaPaciente;

/**
 *
 * @author deboravieira
 */
public class projFinal {
    public static void main(String[]args){
         
            JFrameMain jfm2=new JFrameMain();
            jfm2.setVisible(true);
            
            Login LoginFrame = new Login();
            LoginFrame.setVisible(true);
            
            RegistaPaciente jrp1 = new RegistaPaciente();
            jrp1.setVisible(true);
            
        } 
    
}
