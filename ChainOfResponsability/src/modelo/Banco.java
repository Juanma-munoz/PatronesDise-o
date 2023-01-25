
package modelo;

public class Banco implements IManejador{
    
    private IManejador sucesor;
    
   
    
    @Override
    public void peticion(int monto) {
        CajeroAutomatico ca=new CajeroAutomatico();
        setSucesor(ca);
        
        CajeroSucursal cs=new CajeroSucursal();
        ca.setSucesor(cs);
        
        AsesorFinanciero af=new AsesorFinanciero();
        cs.setSucesor(af);
               
       
       
        
        sucesor.peticion(monto);
        
    }

    @Override
    public IManejador getSucesor() {
        
    return sucesor ;
    }

    @Override
    public void setSucesor(IManejador sucesor) {
        this.sucesor=sucesor;
    }
}
