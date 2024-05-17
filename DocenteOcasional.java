public class DocenteOcasional extends Docente
{
    private String nivelEstudio;
    private double salarioBase;

    public DocenteOcasional(){

    }

    public DocenteOcasional(String nombre, double salario, int experiencia, String nivelEstudio, double salarioBase){
        super(nombre, experiencia);
        this.nivelEstudio = nivelEstudio;
        this.salarioBase = salarioBase;
    }
    
    public String getNivelEstudio(){
        return nombre;
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    
    public void setNivelEstudio(String nivelEstudio){
        this.nivelEstudio = nivelEstudio;
    }
    
    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }

    @Override
    public void calcularSalario(){
        if(nivelEstudio.equals("auxiliar")){
            salarioBase = salarioBase * 3;
        } else if(nivelEstudio.equals("asistente")){
            salarioBase = salarioBase * 4;
        } else if(nivelEstudio.equals("asociado")){
            salarioBase = salarioBase * 5;
        }
        
        System.out.println("El salario del docente ocasional es: " + salarioBase);
    }
}
