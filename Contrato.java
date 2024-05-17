public class Contrato
{
    private int codigoPresupuestal;
    private Docente docente;

    public Contrato(){
        
    }
    
    public Contrato(int codigoPresupuestal){
        this.codigoPresupuestal = codigoPresupuestal;
    }

    public int getCodigoPresupuestal(){
        return codigoPresupuestal;
    }

    public void setCodigoPresupuestal(int codigoPresupuestal){
        this.codigoPresupuestal = codigoPresupuestal;
    }
}
