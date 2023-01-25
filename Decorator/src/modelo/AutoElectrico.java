package modelo;

import javax.swing.JOptionPane;

public class AutoElectrico extends AutomovilDecorador{
    
    public AutoElectrico(Automovil auto){
        super(auto);
    }
    
    
    
    public void acelelar(){
        JOptionPane.showMessageDialog(null,"Iniciando Electricamente");
        getAuto().acelelar();
        
    }
    
    public void alto(){
        JOptionPane.showMessageDialog(null,"Controlando Frenos");
        getAuto().alto();
    }
    
    public void arranque(){
        JOptionPane.showMessageDialog(null,"Iniciando Electricamente");
        getAuto().acelelar();
    }
    
}
