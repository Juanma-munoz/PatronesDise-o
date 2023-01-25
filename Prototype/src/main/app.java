package main;

import modelo.Cuenta;

public class app {
    
    
    public static void main(String [] args){
        
        Cuenta cuentaAhorro=new Cuenta();
        cuentaAhorro.setMonto(300);
        Cuenta cuentaClonada = (Cuenta) cuentaAhorro.clonar();
        
        if(cuentaClonada!= null){
            System.out.println(cuentaClonada);
            
        }
        System.out.println(cuentaAhorro==cuentaClonada);
    }
    
}



