package modelo;

public class Cuenta implements ICuenta {

private String tipo;
private double monto;

public Cuenta(){
    tipo="AHORRO";
}

@Override
public ICuenta clonar(){
    Cuenta cuenta=null;
    
    try{       
        cuenta=(Cuenta) clone();
    } catch (CloneNotSupportedException e){
        e.printStackTrace();
    }
    return cuenta;    
}

@Override
public String toString(){
   return "Cuenta[tipo="+tipo+",monto="+monto+"]"; 
}

//Getters and Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }




    
}
