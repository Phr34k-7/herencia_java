public class TestingErencia{
    
    public static void main(String[] args){
        // Asignar valores de las propiedades de 'unapersona'.
        Persona = unaPersona = new Persona("Torcuato", "Apolinar", "Perez");
        unaPersona.setDomicilio("Barranca del muerto S/N Huamantla");
        unaPersona.setEdad(30);
        unaPersona.setGenero('H');
        // unaPersona.setCuatri(3); 'unaPersona' no puede acceder a los metodos de la clase hija.
        
        Estudiante unEstudiante = new Estudiante("Filomena", "Rodriguez", "Lopez", matricula("2025IRD020");
        // Asignar valores a las propiedades de 'unEstudiante'.
        unEstudiante.setCarrera("TIAIRD");
        unEstudiante.setCuatri(3);
        unEstudiante.setGrupo('A');
        unEstudiante.setPromedio(8.9);
        // Asignar valores de las propiedades que 'unEstudiante' hereda de 'persona'
        unEstudiante.setEdad(20);
        unEstudiante.setDomicilio("Avenida Siempre Viva #4 Springfield");
        unEstudiante.setGenero('F');

        System.out.println("Informacion de unapersona");
        System.out.println(unapersona.toString());
        System.out.println("Informacion de unEstudiante");
        System.out.println(unEstudiante.toString());

        // Usamos los constructores vacios
        Persona otraPersona = new Persona();
        Estudiante otroEstudiante = new Estudiante();
        System.out.println("Informacion de otraPersona");
        System.out.println(otraPersona.toString());
        System.out.println("Informacion de otroEstudiante");
        System.out.println(otroEstudiante.toString());
    }
}
