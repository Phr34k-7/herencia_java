public class Estudiante extends Persona{

    // Atributos de estudoante.
    private String matricula;
    private double promedio;
    private String carrera;
    private int cuatri;
    private char grupo;

    // Constructor vacio.
    public Estudiante(){
        // Llamamos al constructor vacio de 'Persona'.
        super();
    }

    public Estudiante(String nombre, String aPaterno, String aMaterno, String matricula){
        super(nombre, aPaterno, aMaterno);
        this.matricula = matricula;
    }

    // getters y setters
    public String getMatricula(){
        return matricula;
    }
    public double getPromedio(){
        return promedio;
    }
    public String getCarrera(){
        return carrera;
    }
    private int getCatri(){
        return cuatri;
    }
    public char getGrupo(){
        return grupo;
    }

    public void setMatricula(String matricula){
        this matricula = matricula;
    }
    public void setPromedio(double promedio){
        this.promedio = promedio;
    }
    public void setPromedio(String carrera){
        this.carrera = carrera;
    }
    public void setCuatri(int cuatri){
        this.cuatri = cuatri;
    }
    public void setGrupo(char grupo){
        this.grupo = grupo;
    }

    @override
    public String toString(){
        return super.toString() + "Estudiante [matricula=" + matricula
        + "promedio +", cuuatri=" + cuatri +", grupo="+ grupo]"
    }
}
