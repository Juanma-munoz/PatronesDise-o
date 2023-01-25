
package principal;

import modelo.AutoElectrico;
import modelo.Automovil;
import modelo.CarroEstandar;

public class principal {

    public static void main(String[] args) {
        Automovil carro=new AutoElectrico(new CarroEstandar("Corsa"));
        carro.arranque();
        carro.acelelar();
        carro.alto();
    } 



    
}
