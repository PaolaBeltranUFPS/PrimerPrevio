public abstract class Docente
{
    protected String nombre;
    protected int experiencia;

    public Docente(){

    }

    public Docente(String nombre, int experiencia){
        this.nombre = nombre;
        this.experiencia = experiencia;
    }

    public String getNombre(){
        return nombre;
    }

    public int getExperiencia(){
        return experiencia;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setExperiencia(int experiencia){
        this.experiencia = experiencia;
    }

    public abstract void calcularSalario();
}
