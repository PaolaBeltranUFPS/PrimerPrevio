public class DocenteCatedra extends Docente
{
    private String categoria;
    private int horasTrabajadas;
    private double salario;
    private int periodoAcademico;
    private int cursosActualizacion;
    private int trabajoEscrito;

    public DocenteCatedra(){

    }

    public DocenteCatedra(String nombre, double salario, int experiencia, String categoria, int horasTrabajadas){
        super(nombre, experiencia);
        this.categoria = categoria;
        this.horasTrabajadas = horasTrabajadas;
        this.salario = salario;
    }

    public String getCategoria(){
        return categoria;
    }

    public int getHorasTrabajadas(){
        return horasTrabajadas;
    }

    public double getSalario(){
        return salario;
    }

    public int getPeriodoAcademico(){
        return periodoAcademico;
    }

    public int getCursosActualizacion(){
        return cursosActualizacion;
    }

    public int getTrabajoEscrito(){
        return trabajoEscrito;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public void setHorasTrabajadas(int horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void setPeriodoAcademico(int periodoAcademico){
        this.periodoAcademico = periodoAcademico;
    }

    public void setCursosActualizacion(int cursosActualizacion){
        this.cursosActualizacion = cursosActualizacion;
    }

    public void setTrabajoEscrito(int trabajoEscrito){
        this.trabajoEscrito = trabajoEscrito;
    }

    @Override
    public void calcularSalario(){

        if(categoria.equals("auxiliar")){
            salario = horasTrabajadas * 40000;
        } else if(categoria.equals("asistente")){
            salario = horasTrabajadas * 45000;
        } else if(categoria.equals("asociado")){
            salario = horasTrabajadas * 50000;
        } else if(categoria.equals("titular")){
            salario = horasTrabajadas * 55000;
        }

        System.out.println("El salario mensual del docente catedra es: " + salario);
    }

    public void validarCategoria() {
        if (experiencia >= 8 && cursosActualizacion >= 1 && trabajoEscrito >= 2) {
            categoria = "Titular";
        } else if (experiencia >= 6 && cursosActualizacion >= 1 && trabajoEscrito >= 1) {
            categoria = "Asociado";
        } else if (experiencia >= 4 && cursosActualizacion >= 1 && trabajoEscrito >= 1) {
            categoria = "Asistente";
        } else if (periodoAcademico >= 2) {
            categoria = "Auxiliar";
        } else {
            categoria = "Sin categoría";
        }

        System.out.println("La categoria del docente catedra es " + categoria + " y es valida.");
    }
}
