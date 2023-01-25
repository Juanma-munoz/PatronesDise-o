/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Juan Manuel
 */
public class AsesorFinanciero implements IManejador{

    private IManejador sucesor;
    
    
    
    @Override
    public void peticion(int monto) {
    if(monto>=300 ){
        JOptionPane.showMessageDialog(null,"La peticion ha sido atendida por el asesor Financiero");   
    }else{
        
        sucesor.peticion(monto);
        }
    }

    @Override
    public IManejador getSucesor() {
        return sucesor;
        }

    @Override
    public void setSucesor(IManejador sucesor) {
        this.sucesor=sucesor;
    }





    
}
