package modelo;

import javax.swing.JOptionPane;


public class CajeroAutomatico implements IManejador{

    private IManejador sucesor;
    
    
    
    @Override
    public void peticion(int monto) {
        
    if(monto<=100){
        JOptionPane.showMessageDialog(null,"La peticion ha sido atendida por el cajero Automatico");   
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
