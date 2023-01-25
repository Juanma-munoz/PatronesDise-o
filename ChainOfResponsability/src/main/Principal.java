
package main;

import modelo.Banco;
import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
        int monto=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el monto a retirar"));
        
        Banco banco=new Banco();
        banco.peticion(monto);
    }
}
