public class DepartamentoAcademico
{
    private String director;
    private DocenteCatedra docenteCatedra;

    public DepartamentoAcademico(){
        
    }
    
    public DepartamentoAcademico(String dorector, DocenteCatedra docenteCatedra){
        this.director = director;
        this.docenteCatedra = docenteCatedra;
    }

    
    public String getDirector(){
        return director;
    }
    
    public DocenteCatedra getDocenteCatedra(){
        return docenteCatedra;
    }

    public void setDirector(String director){
        this.director = director;
    }
    
    public void setDocenteCatedra(DocenteCatedra docenteCatedra){
        this.docenteCatedra = docenteCatedra;
    }
}
