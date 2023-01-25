package modelo;

public abstract class AutomovilDecorador implements Automovil{
    
    private Automovil auto;
    
    public AutomovilDecorador(Automovil automovil){
        this.auto=automovil;
    }

    protected Automovil getAuto(){
        return auto;
        
    }



}
