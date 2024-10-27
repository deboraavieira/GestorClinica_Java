/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projfinal;

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
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistaFono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistaFono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistaFono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistaFono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            
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
            
        } 
    
}
