public class PersonaPrivada {
    private String nombre;
    private int edad;
    private Double altura;

    // Constructor
    public PersonaPrivada(String nombre, int edad, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public void mostrarDatos(){
        System.out.println("Datos\nNombre: " + nombre + "\nEdad: " + edad + "\nAltura: " + altura);
    }

    public void esMayorDeEdad(){
        if (edad >= 18){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
    }
}
