
package modelo;

import javax.swing.JOptionPane;

public class CarroEstandar implements Automovil{

    private String nombre;
    
    public CarroEstandar(String name){
        nombre=name;
    }
    
    @Override
    public void acelelar() {
    JOptionPane.showMessageDialog(null,"El carro esta acelerando");
    }

    @Override
    public void alto() {
    JOptionPane.showMessageDialog(null,"Frenando");
    
    }

    @Override
    public void arranque() {
    
        JOptionPane.showMessageDialog(null,"Prendiendo el carro");
       
        
    }
    
}




    
