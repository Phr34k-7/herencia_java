public class Persona {
    // Atributos
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private int edad;
    private char genero; // Asumo 'genero' (gender)
    private String domicilio;

    // Constructor vacío (opcional, pero útil)
    public Persona() {
    }

    // Constructor con todos los atributos
    public Persona(String nombre, String aPaterno, String aMaterno, int edad, char genero, String domicilio) {
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.edad = edad;
        this.genero = genero;
        this.domicilio = domicilio;
    }

    // Métodos Getters y Setters para cada atributo

    // Getter para nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para aPaterno
    public String getaPaterno() {
        return aPaterno;
    }

    // Setter para aPaterno
    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    // Getter para aMaterno
    public String getaMaterno() {
        return aMaterno;
    }

    // Setter para aMaterno
    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    // Getter para edad
    public int getEdad() {
        return edad;
    }

    // Setter para edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Getter para genero
    public char getGenero() {
        return genero;
    }

    // Setter para genero
    public void setGenero(char genero) {
        this.genero = genero;
    }

    // Getter para domicilio
    public String getDomicilio() {
        return domicilio;
    }

    // Setter para domicilio
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    // Opcional: Método toString() para una fácil representación del objeto
    @Override
    public String toString() {
        return "Persona{" +
               "nombre='" + nombre + '\'' +
               ", aPaterno='" + aPaterno + '\'' +
               ", aMaterno='" + aMaterno + '\'' +
               ", edad=" + edad +
               ", genero=" + genero +
               ", domicilio='" + domicilio + '\'' +
               '}';
    }
}
